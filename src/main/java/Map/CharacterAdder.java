package Map;

import java.util.List;

public class CharacterAdder {
    private TicTacToeMap ticTacToeMap;
    public CharacterAdder(TicTacToeMap ticTacToeMap) {
        this.ticTacToeMap = ticTacToeMap;
    }

    public void addCharAtPosition(List<Integer> resultPositions, char whichChar) {
        Integer positionY = resultPositions.get(0);
        Integer positionX = resultPositions.get(1);
        List<Character> row = ticTacToeMap.getMap().get(positionY);
        row.set(positionX, whichChar);
    }

}
