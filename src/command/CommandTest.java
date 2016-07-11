package command;

import command.CommandClass.Command;
import command.CommandClass.Door;
import command.CommandClass.DoorCloseCommand;
import command.CommandClass.DoorOpenCommand;
import command.CommandClass.Light;
import command.CommandClass.LightOffCommand;
import command.CommandClass.LightOnCommand;
import command.CommandClass.NoCommand;

import designmode.tools.ALog;


public class CommandTest {
	//以下定义简单遥控器

	public class simpleRemoteControl{
		Command slot;
		public void setCommand(Command slot){
			this.slot = slot;
		}
		
		public void buttonWasPressed(){
			slot.execute();
		}
	}
	//以下定义复杂遥控器
	public class RemoteControl{
		Command [] onCommands;
		Command [] offCommands;
		
		public RemoteControl(){
			onCommands = new Command[7];
			offCommands = new Command[7];
			Command noCommand = new NoCommand();
			for(int i=0;i<onCommands.length;i++){
				onCommands[i]=noCommand;
			}
			for(int i=0;i<offCommands.length;i++){
				offCommands[i]=noCommand;
			}
		}
		
		public void setCommand(int slot, Command onCommand, Command offCommand){
			onCommands[slot] = onCommand;
			offCommands[slot] = offCommand;
		}
		public void onButtonWasPushed(int slot){
			onCommands[slot].execute();
		}
		public void offButtonWasPushed(int slot){
			offCommands[slot].execute();
		}
		
		public String toString(){
			StringBuffer strBu=new StringBuffer();
			strBu.append("\n-------Remote Control-------\n");
			for(int i=0;i<onCommands.length;i++){
				strBu.append("[slot "+i+"] "+onCommands[i].getClass().getName()+"    "
						+offCommands[i].getClass().getName()+"\n");
			}
			return strBu.toString();
		}
	}
	
	
	public static void main(String []args){
		new CommandTest();
	}
	
	public CommandTest(){
		//简单遥控器
		ALog.Log("SimpleRemoteControl");
		simpleRemoteControl msimpleRemoteControl = new simpleRemoteControl();
		Light mLight = new Light();
		Command mLightOnCommand = new LightOnCommand(mLight);
		msimpleRemoteControl.setCommand(mLightOnCommand);
		msimpleRemoteControl.buttonWasPressed();
		Door mDoor = new Door();
		Command mDoorOpenCommand = new DoorOpenCommand(mDoor);
		msimpleRemoteControl.setCommand(mDoorOpenCommand);
		msimpleRemoteControl.buttonWasPressed();		
		//复杂遥控器
		ALog.Log("RemoteControl");
		RemoteControl mRemoteControl = new RemoteControl();
		Command mLightOffCommand = new LightOffCommand(mLight);
		Command mDoorCloseCommand = new DoorCloseCommand(mDoor);
		mRemoteControl.setCommand(0, mLightOnCommand, mLightOffCommand);
		mRemoteControl.setCommand(1, mDoorOpenCommand, mDoorCloseCommand);
		ALog.Log(mRemoteControl);
		mRemoteControl.onButtonWasPushed(0);mRemoteControl.offButtonWasPushed(0);
		mRemoteControl.onButtonWasPushed(1);mRemoteControl.offButtonWasPushed(1);
	}
}
