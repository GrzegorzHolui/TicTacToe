import Map.CharacterAdder;
import Map.MapDrawer;
import PositionGenerator.Generated;
import PositionReciver.Inputer;
import PositionReciver.PositionReceiver;
import ResultAnnouncer.ResultAnnouncer;
import ResultChecker.ResultChecker;

import java.util.List;


public class TicTacToeGame {

    private Inputer positionReceiver;
    private CharacterAdder characterAdder;
    private MapDrawer mapDrawer;
    private Generated positionGenerator;
    private ResultChecker resultChecker;
    private ResultAnnouncer resultAnnouncer;

    public TicTacToeGame(Inputer positionReceiver, CharacterAdder characterAdder) {
        this.positionReceiver = positionReceiver;
        this.characterAdder = characterAdder;
    }

    public String startGame() {
        for (int i = 0; i < 6; i++) {
            List<Integer> resultPositions = positionReceiver.inputPosition();
            char whichChar = 'O';
            characterAdder.addCharAtPosition(resultPositions, whichChar);
            List<Integer> positionsOfGenerator = positionGenerator.generatePosition();
            whichChar = 'X';
            characterAdder.addCharAtPosition(positionsOfGenerator, whichChar);
            mapDrawer.drawMap();
        }
        try {
            throw new Exception("change it");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }


}
