package chapter2.abstraction.doping;

public class UptoDateDoping extends Doping {

	public UptoDateDoping() {
		super();
	}
	
	public UptoDateDoping(double price, double[] taxes) {
		super(price, taxes);
	}
	
	
	@Override
	public double calculate() {
		
		double totalPrice = super.price;
		
		totalPrice += this.calculateProfit();
		totalPrice += this.calculateTaxes();
		
		return totalPrice;
	}
	
	
	private double calculateProfit() {
		
		double profit = super.price * 0.10;
		return profit;
	}
	
	private double calculateTaxes() {
		
		double totalTax = 0;
		
		for(double tax : super.taxes) {
			totalTax += tax;
		}
		
		return totalTax;
	}

}
