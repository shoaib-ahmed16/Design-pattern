package CreationalPatterns.FactoryMethod;

public class InstitutionalPlan extends Plan {


	@Override
	void getRate() {
		// TODO Auto-generated method stub
		 rate=5.50;  
	}
	@Override
	void fixedAmountRate() {
		fixedAmount=750;
	}

}
