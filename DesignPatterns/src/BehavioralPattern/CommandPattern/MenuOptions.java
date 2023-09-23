package BehavioralPattern.CommandPattern;

public class MenuOptions {

	private ActionListenerCommand openCommand;
	private ActionListenerCommand saveCommand;
	
	public void clickOpen() {
		openCommand.execute();
	}
	public void clickSave() {
		saveCommand.execute();
	}
	public MenuOptions(ActionListenerCommand openCommand,ActionListenerCommand saveCommand) {
		this.openCommand=openCommand;
		this.saveCommand=saveCommand;
	}
}
