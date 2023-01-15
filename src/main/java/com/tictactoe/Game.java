package com.tictactoe;

public class Game {

    public void gamePlay(CreatingArrays creatingArrays, Input input, SimpleText simpleText, WinningChecker winningChecker, InputArraySize inputArraySize) {


        String startingFigure = input.getStartingFigure();

            if (startingFigure.equals("x") || startingFigure.equals("X")) {
                while (!winningChecker.checkingForTie(creatingArrays) && !winningChecker.isWinner()) {

                    newMethodForX(creatingArrays, input, simpleText, winningChecker, inputArraySize);


                    newMethodForO(creatingArrays, input, simpleText, winningChecker, inputArraySize);
                }
            }

            if (startingFigure.equals("o") || startingFigure.equals("O")) {
                while (!winningChecker.checkingForTie(creatingArrays) && !winningChecker.isWinner()) {


                    newMethodForO(creatingArrays, input, simpleText, winningChecker, inputArraySize);


                    newMethodForX(creatingArrays, input, simpleText, winningChecker, inputArraySize);
                }
            }
        }

    public void gamePlayComputer(CreatingArrays creatingArrays, Input input, SimpleText simpleText, WinningChecker winningChecker, InputArraySize inputArraySize){


        String startingFigure = input.getStartingFigure();

        if(startingFigure.equals("x") || startingFigure.equals("X")){
            while (!winningChecker.checkingForTie(creatingArrays) && !winningChecker.isWinner()) {

                newMethodForX(creatingArrays, input, simpleText, winningChecker, inputArraySize);

                if (!winningChecker.isWinner()){
                    simpleText.printNextMoveO();
                    creatingArrays.payingAgainstComputerO();
                    winningChecker.winningCheck(inputArraySize, creatingArrays);
                    winningChecker.checkingForTie(creatingArrays);
                }
            }
        }

        if(startingFigure.equals("o") || startingFigure.equals("O")){
            while (!winningChecker.checkingForTie(creatingArrays) && !winningChecker.isWinner()) {


                newMethodForO(creatingArrays, input, simpleText, winningChecker, inputArraySize);

                if (!winningChecker.isWinner()){
                    simpleText.printNextMoveX();
                    creatingArrays.payingAgainstComputerX();
                    winningChecker.winningCheck(inputArraySize, creatingArrays);
                    winningChecker.checkingForTie(creatingArrays);
                }
            }
        }
    }

    private static void newMethodForO(CreatingArrays creatingArrays, Input input, SimpleText simpleText, WinningChecker winningChecker, InputArraySize inputArraySize) {
        boolean askUserForANumber = true;

        while (askUserForANumber) {
            try {
                if (!winningChecker.isWinner() && !winningChecker.getTie()) {
                    simpleText.printNextMoveO();
                    creatingArrays.printArrayO(input, simpleText, inputArraySize);
                    winningChecker.winningCheck(inputArraySize, creatingArrays);
                    winningChecker.checkingForTie(creatingArrays);
                    askUserForANumber =false;
                }
            } catch (Exception e) {
                System.out.println("Wrong data for O, exception: " + e);
                askUserForANumber =true;
            }
        }
    }

    private static void newMethodForX(CreatingArrays creatingArrays, Input input, SimpleText simpleText, WinningChecker winningChecker, InputArraySize inputArraySize) {
        boolean askUserForANumber = true;

        while (askUserForANumber) {
            try {
                if (!winningChecker.isWinner() && !winningChecker.getTie()) {
                    simpleText.printNextMoveX();
                    creatingArrays.printArrayX(input, simpleText, inputArraySize);
                    winningChecker.winningCheck(inputArraySize, creatingArrays);
                    winningChecker.checkingForTie(creatingArrays);
                    askUserForANumber=false;
                }
            } catch (Exception e) {
                System.out.println("Wrong data for X, exception: " + e);
                askUserForANumber = true;
            }
        }
    }
}
