package BehavioralPattern.CommandPattern;

public class ActionSave implements ActionListenerCommand {

	private Document doc;
	public ActionSave(Document doc) {
		this.doc=doc;
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		doc.save();
	}
}
