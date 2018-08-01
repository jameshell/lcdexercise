/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Jaime Alonso
 */
public class VerticalModule {

    private int size;
    private int input;

    public VerticalModule(int size, int input) {
        this.size = size;
        this.input = input;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getInput() {
        return input;
    }

    public void setInput(int input) {
        this.input = input;
    }

    /*
    Segment maker cases:
    1.) for Upper part creation
    2.) for Bottom part creation
     */
    public String segmentMaker(Utility util, int operation) {
        String inputStrng = Integer.toString(input);
        int length = inputStrng.length();
        String wholeSegment = "";
        int rowSize = util.rowSize(input);

        switch (operation) {
            case 1:
                for (int j = 0; j < size; j++) {
                    for (int i = 0; i < length; i++) {
                        wholeSegment += charUpperPartInterpreter(inputStrng.charAt(i), util);
                    }
                }
                break;

            case 2:
                for (int j = 0; j < size; j++) {
                    for (int i = 0; i < length; i++) {
                        wholeSegment += charBottomPartInterpreter(inputStrng.charAt(i), util);
                    }
                }
                break;
        }

        return wholeSegment;
    }

    /*
    Decides what case of the lineMaker() method is needed for the Upper part.
    Only for one Number in the size wanted!
     */
    private String charUpperPartInterpreter(char charInput, Utility util) {
        String result;
        int numColumns = util.columnSize(size);
        switch (charInput) {
            case '2':
            case '3':
            case '7':
                result = lineMaker(numColumns, 2);
                break;
            case '1':
            case '5':
            case '6':
                result = lineMaker(numColumns, 1);
                break;
            default:
                result = lineMaker(numColumns, 3);
                break;
        }
        return result;
    }

    /*
    Decides what case of the linemaker method is needed for the Bottom part.
     */
    private String charBottomPartInterpreter(char charInput, Utility util) {
        String result;
        int numColumns = util.columnSize(size);
        switch (charInput) {
            case '3':
            case '4':
            case '7':
            case '9':
            case '5':
                result = lineMaker(numColumns, 2);
                break;
            case '1':
            case '2':
                result = lineMaker(numColumns, 1);
                break;
            default:
                result = lineMaker(numColumns, 3);
                break;
        }
        return result;
    }

    /*Makes each vertical line 
    Case 1.) Left line   -> |__
         2.) Right line  ->  __|
         3.) Double line -> |__|
     */
    public static String lineMaker(int size, int operation) {
        String line = "";
        switch (operation) {
            case 1:
                line = line + "|" + letterRepeater(" ", size - 1);
                break;
            case 2:
                line = line + letterRepeater(" ", size - 1) + "|";
                break;
            case 3:
                line = line + "|" + letterRepeater(" ", size - 2) + "|";
                break;
        }
        return line;
    }

    //To repeat Strings
    public static String letterRepeater(String letter, int numRepetitions) {
        String pattern = "";
        for (int i = 0; i < numRepetitions; i++) {
            pattern += letter;
        }
        return pattern;
    }
}
