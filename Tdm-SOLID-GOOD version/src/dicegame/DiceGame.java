package dicegame;

public class DiceGame implements IDiceGame{

	private Dice dice;
	private IInput input;
	private IDisplay display;
	
	public DiceGame(IDisplay display, IInput input, Dice aDice) {
		super();
		this.input = input;
		this.display = display;
		dice = aDice;   
	}

	@Override
	public void start() {
		do {
			playOneRound();
		} while (input.readChar() == 'y');
	}

	public void playOneRound() {
		display.displayEntryText(dice.getNumFaces());
		int userChoice =input.readInt();
		
		int diceRollValue = getRandomDiceValue();
		display.displayDiceValue(diceRollValue);
		
		if (userChoice == diceRollValue) {
			display.displaySuccessText();
		}
		display.displayPlayAgainText();
	}

	public int getRandomDiceValue() {
		dice.roll();
		return dice.getTopValue();
	}
}
