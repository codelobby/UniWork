package Week5Code.src.interfacesPlus;// Fig. 10.8: BasePlusCommissionEmployee.java
// BasePlusCommissionEmployee class extends CommissionEmployee.

public class BasePlusCommissionEmployee extends CommissionEmployee { //note extends CommissionEmployee which extends Employee
	private double baseSalary; // base salary per week

	// six-argument constructor
	public BasePlusCommissionEmployee(String first, String last, String ssn, double sales, double rate, double baseSalary) {
		super(first, last, ssn, sales, rate);
		setBaseSalary(baseSalary); // validate and store base salary
	}

	// baseSalary accessor and mutator
	public void setBaseSalary(double salary) {
		if (salary >= 0.0)
			baseSalary = salary;
		else
			throw new IllegalArgumentException("Base salary must be >= 0.0");
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	// KEEP INHERITED INTERFACE PROMISE (NO OVERRIDE AS getPaymentAmount() STUB NOT IN EMPLOYEE)
	// note call to super class's getPaymentAmount which is efficient since we can't access private inst vars in subclass
	public double getPaymentAmount() {
		return getBaseSalary() + super.getPaymentAmount();
	}

	
	// return String representation of BasePlusCommissionEmployee object
	@Override
	public String toString() {
		return String.format("%s %s; %s: $%,.2f", "base-salaried", super.toString(), "base salary", getBaseSalary());
	}
}

