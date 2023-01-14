package com.tictactoe;

import java.util.Objects;

public class InputArraySize {

    private int arraySize;

    SimpleText simpleText = new SimpleText();
    ForScanning forScanning = new ForScanning();


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        InputArraySize that = (InputArraySize) o;

        return arraySize == that.arraySize;
    }

    @Override
    public int hashCode() {
        return arraySize;
    }

    public void setForScanning(ForScanning forScanning) {
        this.forScanning = forScanning;
    }

    public void enterArraySize() {

        simpleText.arraySizeRequest();
        arraySize = forScanning.scan();

        while (arraySize != 3 && arraySize != 10) {
            System.out.println("Let's stick to 3 or 10 for now");
            arraySize = forScanning.scan();
        }

    }

    public int getArraySize() {

        return arraySize;
    }

    public void wrongInputForArray(){
        System.out.println("""
                    It's either 3 or 10, if that's too hard
                    then size of 3x3 is more than enough for You ಠ_ಠ
                    """);
        arraySize=3;
    }

}
