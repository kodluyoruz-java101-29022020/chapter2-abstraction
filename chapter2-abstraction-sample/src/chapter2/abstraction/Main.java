package chapter2.abstraction;

import chapter2.abstraction.doping.Doping;
import chapter2.abstraction.doping.TopOfListDoping;
import chapter2.abstraction.doping.UptoDateDoping;

public class Main {

	public static void main(String[] args) {
		
		double[] taxes = { 5.4, 60.2, 12.5, 30 };
		
		// upcasting 
		Doping updatodate = new UptoDateDoping(10, taxes);
		Doping topofList= new TopOfListDoping(20, taxes);
		
		
		double priceOfUptodateDoping = updatodate.calculate();
		System.out.println(priceOfUptodateDoping);
		
		double priceOfTopofListoping =  topofList.calculate();
		System.out.println(priceOfTopofListoping);
	}

}
