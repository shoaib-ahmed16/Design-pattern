package BehavioralPattern.CommandPattern;

public class ActionOpen implements ActionListenerCommand {

	private Document doc;
	public ActionOpen(Document doc) {
		this.doc =doc;
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		doc.open();
	}

}
