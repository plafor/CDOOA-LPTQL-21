import dicegame.Dice;
import dicegame.DiceGame;
import dicegame.DiceWith8Faces;
import dicegame.IDiceGame;
import dicegame.IDisplay;
import dicegame.IInput;
import display.DisplayConsole;
import input.KeyboardInput;

public class DiceGameLauncher {

	public static void main(String[] args) {
		
		Dice aDice = new DiceWith8Faces();
		IDisplay display = new DisplayConsole();
		IInput input = new KeyboardInput();
		
		IDiceGame game = new DiceGame(display, input, aDice); 
		game.start();
	}

}
