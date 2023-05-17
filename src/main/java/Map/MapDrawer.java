package Map;

public class MapDrawer {

    private TicTacToeMap ticTacToeMap;

    public MapDrawer(TicTacToeMap ticTacToeMap) {
        this.ticTacToeMap = ticTacToeMap;
    }

    public void drawMap() {
        try {
            throw new Exception("Map draw nothing");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
