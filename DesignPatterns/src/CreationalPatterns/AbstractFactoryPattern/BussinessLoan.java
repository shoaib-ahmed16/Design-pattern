package CreationalPatterns.AbstractFactoryPattern;

public class BussinessLoan extends Loan {

	@Override
	public void getInterestRate(double r) {
		rate =r;
	}

}
