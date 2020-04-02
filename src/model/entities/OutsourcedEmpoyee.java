package model.entities;

public class OutsourcedEmpoyee extends Employee {

	private double addtionalCharge;

	public OutsourcedEmpoyee() {
		super();
	}

	public OutsourcedEmpoyee(String name, Integer hours, double valuePerHour, double addtionalCharge) {
		super(name, hours, valuePerHour);
		this.addtionalCharge = addtionalCharge;
	}

	public double getAddtionalCharge() {
		return addtionalCharge;
	}

	public void setAddtionalCharge(double addtionalCharge) {
		this.addtionalCharge = addtionalCharge;
	}
	
	@Override
	public double payment() {
		return super.payment()+addtionalCharge*1.1;
	}

}
