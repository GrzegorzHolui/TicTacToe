import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PositionReceiver {

    private final Scanner scanner;
    private PositionValidator positionValidator;
    private TicTacToeMap ticTacToeMap;

    public PositionReceiver(Scanner scanner, PositionValidator positionValidator, TicTacToeMap ticTacToeMap) {
        this.scanner = scanner;
        this.positionValidator = positionValidator;
        this.ticTacToeMap = ticTacToeMap;
    }

    public boolean inputPosition() {
        List<Integer> resultPositions = new ArrayList<>();
        boolean whichPosition = false;
        while (resultPositions.size() < 2) {
            System.out.println("Gimme the position " + (!whichPosition ? "X" : "Y"));
            String currentLine = scanner.nextLine();
            boolean isNumberGood = positionValidator.validatePosition(resultPositions, currentLine);
            if (!isNumberGood) {
                whichPosition = false;
            } else {
                whichPosition = true;
            }
        }
        boolean isPositionGood = positionValidator.checkIfOnGivenPositionIsSomeChar(resultPositions);
        if (!isPositionGood) {
            System.out.println("This position has been chosen");
            inputPosition();
        }
        Integer positionY = resultPositions.get(0);
        Integer positionX = resultPositions.get(1);
        List<Character> row = ticTacToeMap.getMap().get(positionY);
        row.set(positionX, 'O');
        return true;
    }
}