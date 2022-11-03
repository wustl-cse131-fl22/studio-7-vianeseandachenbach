package studio7;

public class Rectangle {
	
	private int length; 
	private int width; 
	
	public Rectangle() {
		this.length = 0; 
		this.width = 0; 
	}
	
	public Rectangle(int initLength, int initWidth) {
		this.length = initLength;
		this.width = initWidth; 
	}
	
	public int getArea() {
		return this.length * this.width; 
	}
	
	public boolean isSquare() {
		if (this.length == this.width) {
			return true; 
		}
		
		return false; 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r1 = new Rectangle(1, 2); 
		Rectangle r2 = new Rectangle(2, 2); 
		
		System.out.println(r2.isSquare()); 
		
		if (r1.getArea() > r2.getArea()) {
			System.out.println("r1 has the greater area"); 
		}
		else {
			System.out.println("r2 has the greater area"); 
		}

	}

}
