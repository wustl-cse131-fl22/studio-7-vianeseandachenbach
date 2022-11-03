package studio7;

public class HockeyPlayer {
	
	private String name; 
	private int number; 
	private int goals; 
	private int assists;
	private int points; 
	private int games; 
	
	public HockeyPlayer() {
		this.name = ""; 
		this.number = 0; 
	}
	
	public HockeyPlayer(String initName, int initNumber, int initGoals, int initAsissts, int initGames) {
		this.name = initName; 
		this.number = initNumber; 
		this.goals = initGoals; 
		this.assists = initAsissts; 
		this.games = initGames; 
	}
	
	public int getPoints() {
		return goals + assists; 
	}
	
	public String toString() {
		return name + ", " + number + ", " + goals + ", " + assists + ", " + games; 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HockeyPlayer h1 = new HockeyPlayer("Tank", 11, 40, 16, 2); 
		System.out.println(h1); 
		System.out.println(h1.getPoints()); 

	}

}
