package studio7;

public class Complex {
	
	private double real; 
	private double imaginary; 
	
	public Complex() {
		this.real = 0; 
		this.imaginary = 0; 
	}
	
	public Complex(double initReal, double initImaginary) {
		this.real = initReal; 
		this.imaginary = initImaginary; 
	}
	
	public Complex add(Complex otherComplex) {
		this.real += otherComplex.real; 
		this.imaginary += otherComplex.imaginary; 
		
		return this; 
	}
	
	public Complex multiply(Complex otherComplex) {
		Complex product = new Complex(); 
		product.real = ((this.real * otherComplex.real) - (this.imaginary * otherComplex.imaginary));
		product.imaginary = ((this.real * otherComplex.imaginary) + (this.imaginary * otherComplex.real));
		
		return product; 
	}
	
	public String toString() {
		return this.real + "+" + this.imaginary + "i"; 
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Complex c1 = new Complex(4, 5); 
		Complex c2 = new Complex(6, 10); 
		System.out.println(c1.multiply(c2)); 
	}

}
