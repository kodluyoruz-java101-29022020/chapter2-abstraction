package chapter2.abstraction.doping;

public abstract class Doping {

	protected double price;
	protected double[] taxes;
	
	protected Doping() {
		this.price = 0;
		this.taxes = new double[0];
	}
	
	protected Doping(double price, double[] taxes) {
		this.price = price;
		this.taxes = taxes;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public void setTaxes(double[] taxes) {
		this.taxes = taxes;
	}
	
	public double[] getTaxes() {
		return this.taxes;
	}
	
	public abstract double calculate();
}
