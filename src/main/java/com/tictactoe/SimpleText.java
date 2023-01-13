package com.tictactoe;

public class SimpleText {

    String text;


    public void playingWithComputerOrPerson(){
        System.out.println("Please select if You want to play with computer.\n" +
                "Type in 'computer' if You want to play against a computer opponent\n" +
                "Type in 'person' if You want to play against other player");
    }
    public void playingAgainstComputer() {
        System.out.println("Playing against computer");
    }
    public void playingAgainstPerson() {
        System.out.println("Playing against person");
    }
    public void typeInCorrectStartinOpponent(){
        System.out.println("Please type in 'computer' or 'person' ");
    }
    public void printNextMoveO() {
        System.out.println("Moves O");
    }
    public void printNextMoveX(){
        System.out.println("Moves X");
    }
    public void enterNumber(){
        System.out.println("Please enter a number!");
    }
    public void enterNumberNotHigerThen8(){
        System.out.println("Please enter a not higher then 8!");
    }
    public void alreadyTaken(){
        System.out.println("Already taken");
    }
    public void higherThen8(){
        System.out.println("Higher then 8!");
    }
    public void lowerThen0(){
        System.out.println("Lower then 0!");
    }
    public String winnerX(){

        text = "X IS WINNER!!";
        System.out.println(text);
        return text;
    }
    public void winnerO(){
        System.out.println("O IS WINNER!!");
    }









    public void startingWithXOrO(){
        System.out.println("Please select if You want to start with X or O");
    }
    public void typeInCorrectXOrO(){
        System.out.println("Please type in x or o or X or O!");
    }
    public void startingWithO(){
        System.out.println("o is starting");
    }
    public void startingWithX(){
        System.out.println("x is starting");
    }
    public void horizontalPosition(){
        System.out.println("Enter horizontal position");
    }
    public void verticalPosition(){
        System.out.println("Enter vertical position");
    }
    public void occupiedPosition(){
        System.out.println("\n !!! Position already occupied !!! \n");
    }
    public void arraySizeRequest(){
        System.out.println("Enter size of the field");
    }
    public void tieInfo (){
        System.out.println("TIE");
    }
    public void biggerThenAllowed(){
         System.out.println(" !!! Enter numbers from range !!! ");
     }


}
