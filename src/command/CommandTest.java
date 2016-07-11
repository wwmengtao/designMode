package command;

import designmode.tools.ALog;

public class CommandTest {
	public class Light{
		public void on(){
			ALog.Log("Light on!");
		}
	}
	
	public class LightOnCommand implements Command{
		Light light;
		public LightOnCommand(Light light){
			this.light = light;
		}
		public void execute() {
			light.on();
		}
	}
	
	public class Door{
		public void open(){
			ALog.Log("Door open!");
		}
	}
	
	public class DoorOpenCommand implements Command{
		
		Door door;
		
		public DoorOpenCommand(Door door){
			this.door = door;
		}
		
		@Override
		public void execute() {
			door.open();
		}

	}
	public class simpleRemoteControl{
		Command slot;
		public void setCommand(Command slot){
			this.slot = slot;
		}
		
		public void buttonWasPressed(){
			slot.execute();
		}
	}
	public static void main(String []args){
		new CommandTest();
	}
	
	public CommandTest(){
		simpleRemoteControl msimpleRemoteControl = new simpleRemoteControl();
		Command mLightOnCommand = new LightOnCommand(new Light());
		msimpleRemoteControl.setCommand(mLightOnCommand);
		msimpleRemoteControl.buttonWasPressed();
		Command mDoorOpenCommand = new DoorOpenCommand(new Door());
		msimpleRemoteControl.setCommand(mDoorOpenCommand);
		msimpleRemoteControl.buttonWasPressed();		
	}
}
