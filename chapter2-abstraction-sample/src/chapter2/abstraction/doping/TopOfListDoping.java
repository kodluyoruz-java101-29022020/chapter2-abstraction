package chapter2.abstraction.doping;

public class TopOfListDoping extends Doping {
	
	
	public TopOfListDoping() {
		super();
	}
	
	public TopOfListDoping(double price, double[] taxes) {
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
		
		return super.price * 0.20;
	}

	private double calculateTaxes() {
		
		double totalTax = 0;
		
		for(double tax : super.taxes) {
			tax += tax * 0.1;
			totalTax += tax;
		}
		
		return totalTax;
	}
}
