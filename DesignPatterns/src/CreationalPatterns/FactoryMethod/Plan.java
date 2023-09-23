package CreationalPatterns.FactoryMethod;

public abstract class Plan {
	protected double rate;
	protected double fixedAmount;
	abstract void getRate();
	abstract void fixedAmountRate();
	
	public void calculateBill(int units) {
		System.out.println("Monthly Fixed Amount: "+this.fixedAmount);
		double amountByUnitConusme=units*this.rate;
		System.out.println("Calulated Amount by units consumed: "+amountByUnitConusme);
		System.out.println("Total Bill Balance: "+(amountByUnitConusme+fixedAmount));
	}
}
