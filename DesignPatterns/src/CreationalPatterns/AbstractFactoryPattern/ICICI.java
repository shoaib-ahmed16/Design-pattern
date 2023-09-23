package CreationalPatterns.AbstractFactoryPattern;

public class ICICI implements Bank {

	private final String BNAME;
	public ICICI() {
		BNAME="SBI Bank";
	}
	
	@Override
	public String getBankName() {
		// TODO Auto-generated method stub
		return BNAME;
	}

}
