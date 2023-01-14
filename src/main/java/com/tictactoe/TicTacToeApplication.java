package com.tictactoe;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TicTacToeApplication {

    public static void main(String[] args) {


        CreatingArrays creatingArrays = new CreatingArrays();
        InputArraySize inputArraySize = new InputArraySize();
        Input input = new Input();
        Game game = new Game();
        WinningChecker winningChecker = new WinningChecker();
        SimpleText simpleText = new SimpleText();


        String opponent = input.computerOrPerson();
        if (opponent.equals("computer") || opponent.equals("COMPUTER")) {

            try {
                inputArraySize.enterArraySize();
            } catch (Exception e) {
                inputArraySize.wrongInputForArray();
            }

            creatingArrays.createArray(inputArraySize);
            input.whichStartingFigure();
            game.gamePlayComputer(creatingArrays, input, simpleText, winningChecker, inputArraySize);
        }

        if (opponent.equals("person") || opponent.equals("PERSON")) {

            try {
                inputArraySize.enterArraySize();
            } catch (Exception e) {
                inputArraySize.wrongInputForArray();
            }

            creatingArrays.createArray(inputArraySize);
            input.whichStartingFigure();
            game.gamePlay(creatingArrays, input, simpleText, winningChecker, inputArraySize);
        }
    }
}
