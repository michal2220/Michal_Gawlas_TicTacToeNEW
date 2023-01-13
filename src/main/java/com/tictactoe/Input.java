package com.tictactoe;

import java.util.Objects;
import java.util.Scanner;

public class Input {

    private  String startingFigure;
    SimpleText simpleText = new SimpleText();
    Scanner scan = new Scanner(System.in);
    ForScanning forScanning = new ForScanning();

    public void whichStartingFigure(){

        simpleText.startingWithXOrO();

        while (!scan.hasNext("[xoXO]")){
            simpleText.typeInCorrectXOrO();
            startingFigure=scan.next();
        }
        startingFigure=scan.next();

        if (startingFigure.equals("o") || startingFigure.equals("O")) {
            simpleText.startingWithO();
        }

        else if (startingFigure.equals("x") || startingFigure.equals("X")) {
            simpleText.startingWithX();
        }
    }

    public String getStartingFigure() {
        return startingFigure;
    }

    public String computerOrPerson(){
        simpleText.playingWithComputerOrPerson();
        String opponent = scan.nextLine();
        while (!opponent.equalsIgnoreCase("computer") && !opponent.equalsIgnoreCase("person")){
            simpleText.typeInCorrectStartinOpponent();
            opponent =scan.nextLine();
        }
        if (opponent.equalsIgnoreCase("computer")){
            simpleText.playingAgainstComputer();
        } if (opponent.equalsIgnoreCase("person")){
            simpleText.playingAgainstPerson();
        }
        return opponent;
    }
    public int horizontalNumberValue(InputArraySize inputArraySize) {

        int arraySize=inputArraySize.getArraySize();
        simpleText.horizontalPosition();
        inputArraySize.setForScanning(forScanning);
        int horizontal = forScanning.scan();

        while (horizontal >= arraySize || horizontal < 0) {
            simpleText.biggerThenAllowed();
            simpleText.horizontalPosition();
            horizontal = forScanning.scan();
        }

        return horizontal;
    }

    public int verticalNumberValue(InputArraySize inputArraySize) {

        int arraySize=inputArraySize.getArraySize();
        simpleText.verticalPosition();
        inputArraySize.setForScanning(forScanning);
        int vertical = forScanning.scan();

        while (vertical >= arraySize || vertical < 0) {
            simpleText.biggerThenAllowed();
            simpleText.verticalPosition();
            vertical = forScanning.scan();
        }
        return vertical;
    }

}
