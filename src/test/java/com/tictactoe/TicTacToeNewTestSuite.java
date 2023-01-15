package com.tictactoe;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.InputMismatchException;
import java.util.Objects;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class TicTacToeNewTestSuite {


    @Nested
    @DisplayName("Test for WinningCheck")
    class TestWinningCheck {


        WinningChecker winningChecker = new WinningChecker();
        CreatingArrays creatingArraysMock = mock(CreatingArrays.class);


        @Nested
        @DisplayName("Test for WinningCheck for X")
        class TestWinningCheckForX {
            @Test
            void testWinningXInFirstRow() {


                //Given
                String[][] bigArray = new String[3][3];
                bigArray[0][0] = "x";
                bigArray[1][0] = "x";
                bigArray[2][0] = "x";
                bigArray[0][1] = " ";
                bigArray[1][1] = " ";
                bigArray[2][1] = " ";
                bigArray[0][2] = " ";
                bigArray[1][2] = " ";
                bigArray[2][2] = " ";

                when(creatingArraysMock.getBigArray()).thenReturn(bigArray);

                //When
                winningChecker.winningCheckForThree(creatingArraysMock);
                boolean checker = winningChecker.isWinningCheck();

                //Then

                Assertions.assertTrue(checker);

            }

            @Test
            void testWinningXInSecondRow() {

                //Given
                String[][] bigArray = new String[3][3];
                bigArray[0][0] = " ";
                bigArray[1][0] = " ";
                bigArray[2][0] = " ";
                bigArray[0][1] = "x";
                bigArray[1][1] = "x";
                bigArray[2][1] = "x";
                bigArray[0][2] = " ";
                bigArray[1][2] = " ";
                bigArray[2][2] = " ";
                when(creatingArraysMock.getBigArray()).thenReturn(bigArray);
                //When
                winningChecker.winningCheckForThree(creatingArraysMock);
                boolean checker = winningChecker.isWinningCheck();
                //Then
                Assertions.assertTrue(checker);

            }

            @Test
            void testWinningXInThirdRow() {

                //Given
                String[][] bigArray = new String[3][3];
                bigArray[0][0] = " ";
                bigArray[1][0] = " ";
                bigArray[2][0] = " ";
                bigArray[0][1] = " ";
                bigArray[1][1] = " ";
                bigArray[2][1] = " ";
                bigArray[0][2] = "x";
                bigArray[1][2] = "x";
                bigArray[2][2] = "x";
                when(creatingArraysMock.getBigArray()).thenReturn(bigArray);
                //When
                winningChecker.winningCheckForThree(creatingArraysMock);
                boolean checker = winningChecker.isWinningCheck();
                //Then
                Assertions.assertTrue(checker);

            }


            @Test
            void testWinningXInFirstColumn() {

                //Given
                String[][] bigArray = new String[3][3];
                bigArray[0][0] = "x";
                bigArray[1][0] = " ";
                bigArray[2][0] = " ";
                bigArray[0][1] = "x";
                bigArray[1][1] = " ";
                bigArray[2][1] = " ";
                bigArray[0][2] = "x";
                bigArray[1][2] = " ";
                bigArray[2][2] = " ";
                when(creatingArraysMock.getBigArray()).thenReturn(bigArray);
                //When
                winningChecker.winningCheckForThree(creatingArraysMock);
                boolean checker = winningChecker.isWinningCheck();
                //Then
                Assertions.assertTrue(checker);

            }

            @Test
            void testWinningXInSecondColumn() {

                //Given
                String[][] bigArray = new String[3][3];
                bigArray[0][0] = " ";
                bigArray[1][0] = "x";
                bigArray[2][0] = " ";
                bigArray[0][1] = " ";
                bigArray[1][1] = "x";
                bigArray[2][1] = " ";
                bigArray[0][2] = " ";
                bigArray[1][2] = "x";
                bigArray[2][2] = " ";
                when(creatingArraysMock.getBigArray()).thenReturn(bigArray);
                //When
                winningChecker.winningCheckForThree(creatingArraysMock);
                boolean checker = winningChecker.isWinningCheck();
                //Then
                Assertions.assertTrue(checker);

            }

            @Test
            void testWinningXInThirdColumn() {

                //Given
                String[][] bigArray = new String[3][3];
                bigArray[0][0] = " ";
                bigArray[1][0] = " ";
                bigArray[2][0] = "x";
                bigArray[0][1] = " ";
                bigArray[1][1] = " ";
                bigArray[2][1] = "x";
                bigArray[0][2] = " ";
                bigArray[1][2] = " ";
                bigArray[2][2] = "x";
                when(creatingArraysMock.getBigArray()).thenReturn(bigArray);
                //When
                winningChecker.winningCheckForThree(creatingArraysMock);
                boolean checker = winningChecker.isWinningCheck();
                //Then
                Assertions.assertTrue(checker);

            }

            @Test
            void testWinningXInDiagonallyOne() {

                //Given
                String[][] bigArray = new String[3][3];
                bigArray[0][0] = "x";
                bigArray[1][0] = " ";
                bigArray[2][0] = " ";
                bigArray[0][1] = " ";
                bigArray[1][1] = "x";
                bigArray[2][1] = " ";
                bigArray[0][2] = " ";
                bigArray[1][2] = " ";
                bigArray[2][2] = "x";
                when(creatingArraysMock.getBigArray()).thenReturn(bigArray);
                //When
                winningChecker.winningCheckForThree(creatingArraysMock);
                boolean checker = winningChecker.isWinningCheck();
                //Then
                Assertions.assertTrue(checker);

            }

            @Test
            void testWinningXInDiagonallyTwo() {

                //Given
                String[][] bigArray = new String[3][3];
                bigArray[0][0] = " ";
                bigArray[1][0] = " ";
                bigArray[2][0] = "x";
                bigArray[0][1] = " ";
                bigArray[1][1] = "x";
                bigArray[2][1] = " ";
                bigArray[0][2] = "x";
                bigArray[1][2] = " ";
                bigArray[2][2] = " ";
                when(creatingArraysMock.getBigArray()).thenReturn(bigArray);
                //When
                winningChecker.winningCheckForThree(creatingArraysMock);
                boolean checker = winningChecker.isWinningCheck();
                //Then
                Assertions.assertTrue(checker);

            }
        }

        @Nested
        @DisplayName("Test for WinningCheck for O")
        class TestWinningCheckForO {

            @Test
            void testWinningOInFirstRow() {


                //Given
                String[][] bigArray = new String[3][3];
                bigArray[0][0] = "o";
                bigArray[1][0] = "o";
                bigArray[2][0] = "o";
                bigArray[0][1] = " ";
                bigArray[1][1] = " ";
                bigArray[2][1] = " ";
                bigArray[0][2] = " ";
                bigArray[1][2] = " ";
                bigArray[2][2] = " ";

                when(creatingArraysMock.getBigArray()).thenReturn(bigArray);

                //When
                winningChecker.winningCheckForThree(creatingArraysMock);
                boolean checker = winningChecker.isWinningCheck();

                //Then

                Assertions.assertTrue(checker);

            }

            @Test
            void testWinningOInSecondRow() {

                //Given
                String[][] bigArray = new String[3][3];
                bigArray[0][0] = " ";
                bigArray[1][0] = " ";
                bigArray[2][0] = " ";
                bigArray[0][1] = "o";
                bigArray[1][1] = "o";
                bigArray[2][1] = "o";
                bigArray[0][2] = " ";
                bigArray[1][2] = " ";
                bigArray[2][2] = " ";
                when(creatingArraysMock.getBigArray()).thenReturn(bigArray);
                //When
                winningChecker.winningCheckForThree(creatingArraysMock);
                boolean checker = winningChecker.isWinningCheck();
                //Then
                Assertions.assertTrue(checker);

            }

            @Test
            void testWinningOInThirdRow() {

                //Given
                String[][] bigArray = new String[3][3];
                bigArray[0][0] = " ";
                bigArray[1][0] = " ";
                bigArray[2][0] = " ";
                bigArray[0][1] = " ";
                bigArray[1][1] = " ";
                bigArray[2][1] = " ";
                bigArray[0][2] = "o";
                bigArray[1][2] = "o";
                bigArray[2][2] = "o";
                when(creatingArraysMock.getBigArray()).thenReturn(bigArray);
                //When
                winningChecker.winningCheckForThree(creatingArraysMock);
                boolean checker = winningChecker.isWinningCheck();
                //Then
                Assertions.assertTrue(checker);

            }

            @Test
            void testWinningOInFirstColumn() {

                //Given
                String[][] bigArray = new String[3][3];
                bigArray[0][0] = "o";
                bigArray[1][0] = " ";
                bigArray[2][0] = " ";
                bigArray[0][1] = "o";
                bigArray[1][1] = " ";
                bigArray[2][1] = " ";
                bigArray[0][2] = "o";
                bigArray[1][2] = " ";
                bigArray[2][2] = " ";
                when(creatingArraysMock.getBigArray()).thenReturn(bigArray);
                //When
                winningChecker.winningCheckForThree(creatingArraysMock);
                boolean checker = winningChecker.isWinningCheck();
                //Then
                Assertions.assertTrue(checker);

            }

            @Test
            void testWinningOInSecondColumn() {

                //Given
                String[][] bigArray = new String[3][3];
                bigArray[0][0] = " ";
                bigArray[1][0] = "o";
                bigArray[2][0] = " ";
                bigArray[0][1] = " ";
                bigArray[1][1] = "o";
                bigArray[2][1] = " ";
                bigArray[0][2] = " ";
                bigArray[1][2] = "o";
                bigArray[2][2] = " ";
                when(creatingArraysMock.getBigArray()).thenReturn(bigArray);
                //When
                winningChecker.winningCheckForThree(creatingArraysMock);
                boolean checker = winningChecker.isWinningCheck();
                //Then
                Assertions.assertTrue(checker);

            }

            @Test
            void testWinningOInThirdColumn() {

                //Given
                String[][] bigArray = new String[3][3];
                bigArray[0][0] = " ";
                bigArray[1][0] = " ";
                bigArray[2][0] = "o";
                bigArray[0][1] = " ";
                bigArray[1][1] = " ";
                bigArray[2][1] = "o";
                bigArray[0][2] = " ";
                bigArray[1][2] = " ";
                bigArray[2][2] = "o";
                when(creatingArraysMock.getBigArray()).thenReturn(bigArray);
                //When
                winningChecker.winningCheckForThree(creatingArraysMock);
                boolean checker = winningChecker.isWinningCheck();
                //Then
                Assertions.assertTrue(checker);

            }

            @Test
            void testWinningOInDiagonallyOne() {

                //Given
                String[][] bigArray = new String[3][3];
                bigArray[0][0] = "o";
                bigArray[1][0] = " ";
                bigArray[2][0] = " ";
                bigArray[0][1] = " ";
                bigArray[1][1] = "o";
                bigArray[2][1] = " ";
                bigArray[0][2] = " ";
                bigArray[1][2] = " ";
                bigArray[2][2] = "o";
                when(creatingArraysMock.getBigArray()).thenReturn(bigArray);
                //When
                winningChecker.winningCheckForThree(creatingArraysMock);
                boolean checker = winningChecker.isWinningCheck();
                //Then
                Assertions.assertTrue(checker);

            }

            @Test
            void testWinningOInDiagonallyTwo() {

                //Given
                String[][] bigArray = new String[3][3];
                bigArray[0][0] = " ";
                bigArray[1][0] = " ";
                bigArray[2][0] = "o";
                bigArray[0][1] = " ";
                bigArray[1][1] = "o";
                bigArray[2][1] = " ";
                bigArray[0][2] = "o";
                bigArray[1][2] = " ";
                bigArray[2][2] = " ";
                when(creatingArraysMock.getBigArray()).thenReturn(bigArray);
                //When
                winningChecker.winningCheckForThree(creatingArraysMock);
                boolean checker = winningChecker.isWinningCheck();
                //Then
                Assertions.assertTrue(checker);

            }
        }

        @Nested
        @DisplayName("Test for WinningCheck for TIE")
        class TestWinningCheckForTIE {
            @Test
            void testTie() {

                //Given
                String[][] bigArray = new String[3][3];
                bigArray[0][0] = "x";
                bigArray[1][0] = "x";
                bigArray[2][0] = "x";
                bigArray[0][1] = "o";
                bigArray[1][1] = "o";
                bigArray[2][1] = "x";
                bigArray[0][2] = "x";
                bigArray[1][2] = "x";
                bigArray[2][2] = "o";
                when(creatingArraysMock.getBigArray()).thenReturn(bigArray);

                //When
                winningChecker.checkingForTie(creatingArraysMock);
                boolean checker = winningChecker.getTie();
                //Then
                Assertions.assertTrue(checker);

            }
        }
    }

    @Nested
    @DisplayName("Test for Input")
    class TestInput {

        @Test
        void exceptionInInputDoesNotThrowTest() {
            //Given
            ForScanning forScanningMock = mock(ForScanning.class);

            InputArraySize inputArraySize = new InputArraySize();
            when(forScanningMock.scan()).thenReturn(3);
            inputArraySize.setForScanning(forScanningMock);

            //Then
            Assertions.assertDoesNotThrow(() -> inputArraySize.enterArraySize());
        }


        @Test
        void exceptionInInputDoesThrowsExceptionTest() {
            //Given
            ForScanning forScanningMock = mock(ForScanning.class);
            InputArraySize inputArraySize = new InputArraySize();

            when(forScanningMock.scan()).thenThrow(new IllegalArgumentException("a"));
            inputArraySize.setForScanning(forScanningMock);

            //Then
            Assertions.assertThrows(Exception.class, () -> inputArraySize.enterArraySize());

        }

        @Test
        void exceptionHorizontalNumberValueDoesNotThrowTest() {
            //Given
            ForScanning forScanningMock = mock(ForScanning.class);
            InputArraySize inputArraySizeMock = mock(InputArraySize.class);
            Input input = new Input();

            input.setForScanning(forScanningMock);
            when(inputArraySizeMock.getArraySize()).thenReturn(10);
            when(forScanningMock.scan()).thenReturn(2);

            //Then
            Assertions.assertDoesNotThrow(() -> input.verticalNumberValue(inputArraySizeMock));
        }

        @Test
        void exceptionHorizontalNumberValueThrowsTest() {
            //Given
            ForScanning forScanningMock = mock(ForScanning.class);
            InputArraySize inputArraySizeMock = mock(InputArraySize.class);
            Input input = new Input();

            input.setForScanning(forScanningMock);
            when(inputArraySizeMock.getArraySize()).thenReturn(10);
            when(forScanningMock.scan()).thenThrow(new IllegalArgumentException("a"));

            //Then
            Assertions.assertThrows(Exception.class, () -> input.verticalNumberValue(inputArraySizeMock));
        }


        @Test
        void exceptionVerticalNumberValueDoesNotThrowTest() {
            //Given


            ForScanning forScanningMock = mock(ForScanning.class);
            InputArraySize inputArraySizeMock = mock(InputArraySize.class);
            Input input = new Input();


            input.setForScanning(forScanningMock);
            when(inputArraySizeMock.getArraySize()).thenReturn(10);
            when(forScanningMock.scan()).thenReturn(2);
            //Then
            Assertions.assertDoesNotThrow(() -> input.horizontalNumberValue(inputArraySizeMock));
        }

        @Test
        void exceptionVerticalNumberValueThrowsTest() {
            //Given
            ForScanning forScanningMock = mock(ForScanning.class);
            InputArraySize inputArraySizeMock = mock(InputArraySize.class);
            Input input = new Input();

            input.setForScanning(forScanningMock);
            when(inputArraySizeMock.getArraySize()).thenReturn(10);
            when(forScanningMock.scan()).thenThrow(new IllegalArgumentException("a"));

            //Then
            Assertions.assertThrows(Exception.class, () -> input.horizontalNumberValue(inputArraySizeMock));
        }
    }
}

