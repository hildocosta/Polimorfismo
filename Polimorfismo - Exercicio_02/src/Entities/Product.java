package Entities;

public class Product {
	
	private String name;
	private Double price;
	
	
	// Metodo construtor padrao
	public Product() {
		
	}
	
	
	// Metodo construtor com argumentos
	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}
	
	
	// Metodo Getters e Setters
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Double getPrice() {
		return price;
	}


	public void setPrice(Double price) {
		this.price = price;
	}
	
	
	// Metodo priceTag
	public String priceTag() {
		return name + " - R$ " + String.format("%.2f", price);
	}


	



}
