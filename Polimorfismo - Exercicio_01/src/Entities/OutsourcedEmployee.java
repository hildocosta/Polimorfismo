package Entities;

public class OutsourcedEmployee extends Employee {
	
	private Double additionalCharge;
	
	
	
	// Metodo construtor padrao
	public OutsourcedEmployee() {
		super();
		
	}
	

	// Metodo construtor da SuperClasse com argumentos 
	public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
		super(name, hours, valuePerHour);
		this.additionalCharge = additionalCharge;
	}


	
	// Metodo Getters e Setters
	public Double getAdditionalCharge() {
		return additionalCharge;
	}


	public void setAdditionalCharge(Double additionalCharge) {
		this.additionalCharge = additionalCharge;
	}
	
	
	// Metodo de pagamento para funcionario terceirizado
	// Sobreposicao de metodo 
	@Override
	public double payment() {
		return super.payment() + additionalCharge * 1.1;
	}
	
	
	
	
	

}
