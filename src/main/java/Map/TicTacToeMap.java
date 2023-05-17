package Map;

import java.util.List;

public class TicTacToeMap {
    private List<List<Character>> map;

    public TicTacToeMap(List<List<Character>> map) {
        this.map = map;
    }

    public List<List<Character>> getMap() {
        return map;
    }
}
