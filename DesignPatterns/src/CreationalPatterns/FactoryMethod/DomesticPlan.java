package CreationalPatterns.FactoryMethod;

public class DomesticPlan extends Plan {

	@Override
	void getRate() {
		// TODO Auto-generated method stub
		 rate=3.50;
	}

	@Override
	void fixedAmountRate() {
		// TODO Auto-generated method stub
		fixedAmount=250;
	}

}
