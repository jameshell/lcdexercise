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
public class HorizontalModule {

    private int size;
    private int input;

    public HorizontalModule(int size, int input) {
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

    //Builds the whole horizontal top/mid/bot of the LCD 
    public String segmentMaker(Utility util, int location) {
        String inputStrng = Integer.toString(input);
        int length = inputStrng.length();
        String wholeSegment = "";
            //TOP
        if (location == 1) {
            for (int i = 0; i < length; i++) {
                wholeSegment += charUpperPartInterpreter(inputStrng.charAt(i), util);
            }
            //MIDDLE
        } else if (location == 2) {
            for (int i = 0; i < length; i++) {
                wholeSegment += charMiddlePartInterpreter(inputStrng.charAt(i), util);
            }
            //BOTTOM
        } else if (location == 3) {
            for (int i = 0; i < length; i++) {
                wholeSegment += charBottomPartInterpreter(inputStrng.charAt(i), util);
            }
        }

        return wholeSegment;
    }

    /*Depending on the char, the interpreter methods(Upper/Middle/Bottom) decide
      whether it needs to create a line or a space for the given char on horizontal top/mid/bottom.
     */
    private String charUpperPartInterpreter(char charInput, Utility util) {
        String result;
        int numColumns = util.columnSize(size);
        if (charInput != '1' && charInput != '4') {
            result = lineMaker(numColumns);
        } else {
            result = spaceMaker(numColumns);
        }
        return result;
    }

    private String charMiddlePartInterpreter(char charInput, Utility util) {
        String result;
        int numColumns = util.columnSize(size);
        if (charInput != '1' && charInput != '7' && charInput != '0') {
            result = lineMaker(numColumns);
        } else {
            result = spaceMaker(numColumns);
        }
        return result;
    }

    private String charBottomPartInterpreter(char charInput, Utility util) {
        String result;
        int numColumns = util.columnSize(size);
        if (charInput != '1' && charInput != '7' && charInput != '0' && charInput != '9' && charInput != '4') {
            result = lineMaker(numColumns);
        } else {
            result = spaceMaker(numColumns);
        }
        return result;
    }

    //This method creates lines
    private String lineMaker(int size) {
        String line = "";
        for (int i = 0; i < size; i++) {
            line += "_";
        }
        return line+" ";
    }

    //This method creates the spaces
    private String spaceMaker(int size) {
        String space = "";
        for (int i = 0; i < size; i++) {
            space += " ";
        }
        return space+" ";
    }

}
