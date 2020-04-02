package model.entities;

public class PessoaFisica extends TaxPayer {
	
	private double healthExpenditures;
	
	public PessoaFisica(double healthExpenditures) {
		super();
		this.healthExpenditures = healthExpenditures;
	}

	public PessoaFisica(String name, double anualIncome, double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}

	
	public double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public final double tax() {
		
		double tax = 0;
		
		//Acrescentando as taxas
		if(anualIncome<20000) 
			tax = anualIncome*0.15;
		else
			tax = anualIncome*0.25;
		
		//Custo de saude
		if(healthExpenditures>0)
			tax += healthExpenditures*.5;
			
		return tax;
					
	}
}
