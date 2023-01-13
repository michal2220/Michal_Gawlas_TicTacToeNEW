package com.tictactoe;

public class WinningChecker {

    SimpleText simpleText = new SimpleText();
    private boolean isTie = false;
    private boolean winningCheck =false;
    private boolean winner=false;


    public void winningCheck(InputArraySize inputArraySize, CreatingArrays creatingArrays){

        int arraySize = inputArraySize.getArraySize();

        if (arraySize==3){
            winningCheckForThree(creatingArrays);
            if(winningCheck){
                System.out.println("Winner");
                winner=true;
            }
        } if (arraySize==10){
            winningCheckForTen(creatingArrays);
            if(winningCheck){
                System.out.println("Winner");
                winner=true;
            }
        }
    }

    public boolean isWinner() {
        return winner;
    }

    public void winningCheckForThree(CreatingArrays creatingArrays){

        String[][] bigArray = creatingArrays.getBigArray();
        String[] insideArray;

        for (int i = 0; i < bigArray.length; i++) {
            insideArray = bigArray[i];
            for (int j = 0; j < insideArray.length; j++) {

                if(j==1){

                    if (!insideArray[j].equals(" ")&&
                            bigArray[i][j].equals(bigArray[i][j - 1]) &&
                            bigArray[i][j].equals(bigArray[i][j + 1])){

                        winningCheck =true;

                    }
                }

                if(i==1){

                    if (!insideArray[j].equals(" ")&&
                            bigArray[i][j].equals(bigArray[i - 1][j]) &&
                            bigArray[i][j].equals(bigArray[i + 1][j])){

                        winningCheck =true;

                    }
                }

                if(i==1 && j==1){

                    if (!insideArray[j].equals(" ")&&
                            bigArray[i][j].equals(bigArray[i - 1][j - 1]) &&
                            bigArray[i][j].equals(bigArray[i + 1][j + 1])){

                        winningCheck =true;

                    } if (!insideArray[j].equals(" ")&&
                            bigArray[i][j].equals(bigArray[i + 1][j - 1]) &&
                            bigArray[i][j].equals(bigArray[i - 1][j + 1])){

                        winningCheck =true;

                    }
                }
            }
        }

    }

    public void winningCheckForTen(CreatingArrays creatingArrays){

        String[][] bigArray = creatingArrays.getBigArray();
        String[] insideArray;

        for (int i = 0; i < bigArray.length; i++) {
            insideArray = bigArray[i];
            for (int j = 0; j < insideArray.length; j++) {

                if(j>=2&&j<=7){

                    if (!insideArray[j].equals(" ")&&
                            bigArray[i][j].equals(bigArray[i][j - 2]) &&
                            bigArray[i][j].equals(bigArray[i][j - 1]) &&
                            bigArray[i][j].equals(bigArray[i][j + 1]) &&
                            bigArray[i][j].equals(bigArray[i][j + 2])){

                        winningCheck =true;

                    }
                }
                if(i>=2&&i<=7){

                    if (!insideArray[j].equals(" ")&&
                            bigArray[i][j].equals(bigArray[i - 2][j]) &&
                            bigArray[i][j].equals(bigArray[i - 1][j]) &&
                            bigArray[i][j].equals(bigArray[i + 1][j]) &&
                            bigArray[i][j].equals(bigArray[i + 2][j])){

                        winningCheck =true;

                    }
                }
                if(j>=2 && j<=7 && i>=2 && i<=7){

                    if (!insideArray[j].equals(" ")&&
                            bigArray[i][j].equals(bigArray[i - 2][j - 2]) &&
                            bigArray[i][j].equals(bigArray[i - 1][j - 1]) &&
                            bigArray[i][j].equals(bigArray[i + 1][j + 1]) &&
                            bigArray[i][j].equals(bigArray[i + 2][j + 2])){

                        winningCheck =true;

                    }
                }
            }
        }
    }

    public boolean checkingForTie(CreatingArrays creatingArrays){

        String[][] bigArray = creatingArrays.getBigArray();

        boolean isEverythingOccupied=true;


        for (int i = 0; i<bigArray.length; i++ ){
            for(int j = 0; j < bigArray[i].length; j++){

                if(bigArray[i][j].equals(" ")){
                    isEverythingOccupied=false;
                }
            }
        }

        if (isEverythingOccupied && !winner){
            isTie=true;
            simpleText.tieInfo();
        }

        return isTie;
    }

    public boolean getTie() {
        return isTie;
    }

    public boolean isWinningCheck() {
        return winningCheck;
    }
}
