package PositionReciver;

import Map.TicTacToeMap;

import java.util.List;
import java.util.Optional;

public class PositionValidator {

    private TicTacToeMap ticTacToeMap;

    public PositionValidator(TicTacToeMap ticTacToeMap) {
        this.ticTacToeMap = ticTacToeMap;
    }

    public boolean validatePosition(List<Integer> result, String currentLine) {
        Optional<Integer> numberFromUser = parseToNumber(currentLine);
        if (numberFromUser.isPresent()) {
            Integer currentPosition = numberFromUser.get();
            if (isPositionInRange(currentPosition)) {
                result.add(currentPosition);
                return true;
            } else {
                System.out.println("Number is out of scope");
                return false;
            }
        }
        return false;
    }

    public boolean checkIfOnGivenPositionIsSomeChar(List<Integer> positions) {
        List<List<Character>> map = ticTacToeMap.getMap();
        Integer positionY = positions.get(0);
        Integer positionX = positions.get(1);
        if (isCharOnPosition(positionY, positionX, map)) {
            return true;
        } else {
            return false;
        }
    }

    private boolean isPositionInRange(Integer currentPosition) {
        return currentPosition >= 0 && currentPosition <= 2;
    }

    private boolean isCharOnPosition(Integer positionY, Integer positionX, List<List<Character>> map) {
        if (null == map.get(positionY).get(positionX)) {
            return true;
        } else {
            return false;
        }
    }

    private Optional<Integer> parseToNumber(String currentValueInputByUser) {
        int numberFromUser;
        try {
            numberFromUser = Integer.parseInt(currentValueInputByUser);
        } catch (NumberFormatException exception) {
            System.out.println("Your number is not a number");
            return Optional.empty();
        }
        return Optional.of(numberFromUser);
    }
}
