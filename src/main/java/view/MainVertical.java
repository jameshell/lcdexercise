/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import model.Utility;

/**
 *
 * @author james
 */
public class MainVertical {
    public static void main(String[] args) {
        Utility util = new Utility();
        System.out.println(segmentMaker(util,1,2,12345));
        //charUpperPartInterpreter('6',util, 3)); WORKING
        //lineMaker(5,3) WORKING;
        //letterRepeater("2",3); WORKING
    }
    
    /*
    Segment maker cases:
    1.) for Upper part creation
    2.) for Bottom part creation
     */
    public static String segmentMaker(Utility util, int operation, int size, int input) {
        String inputStrng = Integer.toString(input);
        int length = inputStrng.length();
        String wholeSegment = "";
        int rowSize = util.rowSize(input);
        int verticalSegmentSize = (rowSize - 3) / 2;

        switch (operation) {
            case 1:
               // for (int j = 0; j < verticalSegmentSize; j++) {
                    for (int i = 0; i < length; i++) {
                        wholeSegment += charUpperPartInterpreter(inputStrng.charAt(i), util, size);
                    }
                //}

            case 2:
                for (int j = 0; j < verticalSegmentSize; j++) {
                    for (int i = 0; i < length; i++) {
                        wholeSegment += charBottomPartInterpreter(inputStrng.charAt(i), util, size);
                    }
                }
        }

        return wholeSegment;
    }

    /*
    Decides what case of the linemaker method is needed for the Upper part.
     */
    public static String charUpperPartInterpreter(char charInput, Utility util, int size) {
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
    public static String charBottomPartInterpreter(char charInput, Utility util, int size) {
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
