import Map.CharacterAdder;
import Map.TicTacToeMap;
import PositionReciver.Inputer;
import PositionReciver.PositionReceiver;
import PositionReciver.PositionValidator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
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
        Inputer positionReceiver = new PositionReceiver(scanner, positionValidator, ticTacToeMap);
        CharacterAdder characterAdder = new CharacterAdder(ticTacToeMap);
        TicTacToeGame ticTacToeGame = new TicTacToeGame(positionReceiver, characterAdder);
        ticTacToeGame.startGame();
    }
}
