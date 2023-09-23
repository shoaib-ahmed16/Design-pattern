package CreationalPatterns.AbstractFactoryPattern;

public class BankNullPointerHandler extends RuntimeException {

	public BankNullPointerHandler() {
		
	}
	public BankNullPointerHandler(String message) {
		super(message);
	}
}
