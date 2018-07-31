/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Utility;

/**
 *
 * @author Jaime Alonso
 */
public class Main {
    public static void main(String args[]){
        Utility util = new Utility();
         System.out.println(upperPart(util,12345,2));
    }
    
    
    //Builds the whole top of the LCD 
    public static String upperPart(Utility util, int input, int size) {
        String inputStrng = Integer.toString(input);
        String wholeUpperPart="";
        
        for(int i=0; i<inputStrng.length();i++){
        wholeUpperPart+=charUpperPartInterpreter(inputStrng.charAt(i), util, size)+" ";    
        }
        return wholeUpperPart;
    }
    
    /*Depending on the char, the interpreter method decides
      whether it needs to create a line or a space for the given char.
    */
    public static String charUpperPartInterpreter(char charInput, Utility util, int size) {
        String result;
        int numColumns = util.columnSize(size);
        if (charInput != '1' && charInput != '4') {
            result = lineMaker(numColumns);
        } else {
            result = spaceMaker(numColumns);
        }
        return result;
    }
    
    //This method creates lines
    public static String lineMaker(int size) {
        String line = "";
        for (int i = 0; i < size; i++) {
             line += "-";
        }
        return line;
    }
    
    //This method creates the spaces
    public static String spaceMaker(int size) {
        String space = "";
        for (int i = 0; i < size; i++) {
             space += " ";
        }
        return space;
    }
}
