package dicegame;

public abstract class Dice {

	private int numFaces;
	private int topValue;

	public Dice(int numFaces) {
		super();
		this.numFaces = numFaces;
		roll();
	}

	public int getNumFaces() {
		return numFaces;
	}
	
	public void roll() {
		topValue = ((int)(Math.random()* numFaces) + 1);
	}

	public int getTopValue() {
		return topValue;
	}
	
	
}
