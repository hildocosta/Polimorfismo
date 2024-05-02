package Entities;

public class ImportedProduct extends Product {
	
	private Double customsFee;
	
	
	// Metodo construtor padrao
	public ImportedProduct() {
		super();
	}



	// Metodo construtor com argumentos da Super Classe
	public ImportedProduct(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}


	
	// Metodo Getters e Setters
	public Double getCustomsFee() {
		return customsFee;
	}



	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}
	
	
	
	
    // Metodo priceTag Sobreposicao
	@Override
	public String priceTag() {
		return getName() 
				+ " $ " 
				+ String.format("%.2f", totalPrice())
				+ " (Customs fee: $ " 
				+ String.format("%.2f", customsFee)
				+ ")";
	}
	
	
	// Metodo totalPrice
	public Double totalPrice() {
		return getPrice() + customsFee;
	}

}
