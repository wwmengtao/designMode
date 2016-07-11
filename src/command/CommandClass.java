package command;
import designmode.tools.ALog;

public class CommandClass {
	
	public static  interface Command {
		public void execute();
	}
	
	public static class Light{
		public void on(){
			ALog.Log("Light on!");
		}
		public void off(){
			ALog.Log("Light off!");
		}
	}
	
	public static class LightOnCommand implements Command{
		Light light;
		public LightOnCommand(Light light){
			this.light = light;
		}
		public void execute() {
			light.on();
		}
	}
	
	public static class LightOffCommand implements Command{
		Light light;
		public LightOffCommand(Light light){
			this.light = light;
		}
		public void execute() {
			light.off();
		}
	}
	
	public static class Door{
		public void open(){
			ALog.Log("Door open!");
		}
		public void close(){
			ALog.Log("Door close!");
		}
	}
	
	public static class DoorOpenCommand implements Command{
		Door door;
		public DoorOpenCommand(Door door){
			this.door = door;
		}

		public void execute() {
			door.open();
		}
	}
	
	public static class DoorCloseCommand implements Command{
		Door door;
		public DoorCloseCommand(Door door){
			this.door = door;
		}

		public void execute() {
			door.close();
		}
	}
	
	public static class NoCommand implements Command{
		public void execute() {

		}
	}
}
