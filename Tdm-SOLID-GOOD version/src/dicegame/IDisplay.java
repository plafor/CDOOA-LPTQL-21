package dicegame;

public interface IDisplay {

	public void displayEntryText(int numFaces);

	public void displayPlayAgainText();

	public void displaySuccessText();

	public void displayDiceValue(int diceRollValue);

}