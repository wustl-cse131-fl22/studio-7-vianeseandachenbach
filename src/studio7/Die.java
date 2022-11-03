package studio7;

public class Die {
	
	private int sides; 
	
	public Die() {
		this.sides = 0; 
	}
	
	public Die(int initSides) {
		this.sides = initSides; 
	}
	
	public int throwDie() {
		return (int) (Math.random() * this.sides + 1); 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Die newDie = new Die(10); 
		

		System.out.println(newDie.throwDie()); 
	}

}
