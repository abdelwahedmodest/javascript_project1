public class BMICalculator {


	//declare  variables
	double  weight ;
	double height ;
	double BMI  ;

	public  BMICalculator(double w, double h) {
		height = w ;
		weight = h ;
	}

	public double calculateBMI() {
		return weight / (height*height) ;

	} 


	//this  is our main method
	         public static void main(String[] args) {
			 BMICalculator calculator = new  BMICalculator(60, 1.70 ) ;
			 double bmi = calculator.calculateBMI() ;

			 // print BMI  to screen 
			 System.out.println("your BMI  is " + bmi + "." ) ;


		 }

        } 

