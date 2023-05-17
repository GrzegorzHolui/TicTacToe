import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TicTacToeGame {

    private PositionReceiver positionReceiver;
    private PositionGenerator positionGenerator;
    private ResultChecker resultChecker;
    private ResultAnnouncer resultAnnouncer;

    public TicTacToeGame(PositionReceiver positionReceiver) {
        this.positionReceiver = positionReceiver;
    }

    public String startGame() {

        for (int i = 0; i < 6; i++) {
            positionReceiver.inputPosition();

        }
        try {
            throw new Exception("change it");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<List<Character>> map = new ArrayList<>();

        List<Character> characters1 = Arrays.asList(null, null, null);
        List<Character> characters2 = Arrays.asList(null, null, null);
        List<Character> characters3 = Arrays.asList(null, null, null);

        map.add(characters1);
        map.add(characters2);
        map.add(characters3);

        TicTacToeMap ticTacToeMap = new TicTacToeMap(map);
        PositionValidator positionValidator = new PositionValidator(ticTacToeMap);
        PositionReceiver positionReceiver = new PositionReceiver(scanner, positionValidator, ticTacToeMap);
        TicTacToeGame ticTacToeGame = new TicTacToeGame(positionReceiver);
        ticTacToeGame.startGame();
    }

}
