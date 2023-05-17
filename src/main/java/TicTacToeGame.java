import Map.MapDrawer;
import PositionGenerator.PositionGenerator;
import PositionReciver.PositionReceiver;
import ResultAnnouncer.ResultAnnouncer;
import ResultChecker.ResultChecker;

public class TicTacToeGame {

    private PositionReceiver positionReceiver;
    private MapDrawer mapDrawer;
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


}
