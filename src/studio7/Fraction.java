package studio7;

public class Fraction {
	
	private int numerator; 
	private int denominator; 
	
	public Fraction() {
		this.numerator = 0; 
		this.denominator = 0; 
	}
	
	public Fraction(int initNumerator, int initDenominator) {
		this.numerator = initNumerator; 
		this.denominator = initDenominator; 
	}
	
	public String toString() {
		return this.numerator + "/" + this.denominator; 
	}
	
	public Fraction addFraction(Fraction secondFraction) {
		Fraction resultFraction = new Fraction(); 
		int newNumerator1; 
		int newNumerator2; 
		
		newNumerator1 = this.numerator * secondFraction.denominator; 
		newNumerator2 = secondFraction.numerator * this.denominator; 
		
		resultFraction.numerator = newNumerator1 + newNumerator2; 
		resultFraction.denominator = this.denominator * secondFraction.denominator; 

		return resultFraction; 
	}
	
	public Fraction reciprocal() {
		int temp = this.numerator; 
		this.numerator = this.denominator; 
		this.denominator = temp; 
		return this; 
	}
	
	public Fraction simplify() {
		int largest; 
		if (this.numerator > this.denominator) {
			largest = this.numerator; 
		}
		else {
			largest = this.denominator; 
		}
		
		for (int i = largest; i > 0; i--) {
			if (this.numerator % i == 0 && this.denominator  % i == 0) {
				this.numerator /= i; 
				this.denominator /= i; 
				break; 
			}
		}
		
		return this; 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fraction f1 = new Fraction(5, 10); 
		Fraction f2 = new Fraction(1, 4); 
		System.out.println(f1.addFraction(f2)); 
		System.out.println(f1.reciprocal()); 
		System.out.println(f1.simplify()); 
	}

}
