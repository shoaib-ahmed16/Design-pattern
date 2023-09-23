package CreationalPatterns.FactoryMethod;

public class CommercialPlan extends Plan{

	@Override
	void getRate() {
		// TODO Auto-generated method stub
		 rate=7.50;  
	}

	@Override
	void fixedAmountRate() {
		// TODO Auto-generated method stub
		fixedAmount=1500;
	}

}
