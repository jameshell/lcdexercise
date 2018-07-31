/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Jaime Alonso
 */
public class HorizontalModule {

    private final int size;
    private final int input;

    public HorizontalModule(int size, int input) {
        this.size = size;
        this.input = input;
    }

    //Builds the whole top of the LCD 
    public String upperPart(Utility util) {
        String inputStrng = Integer.toString(input);
        String wholeUpperPart="";
        
        for(int i=0; i<inputStrng.length();i++){
        wholeUpperPart+=charUpperPartInterpreter(inputStrng.charAt(i), util);    
        }
        return wholeUpperPart;
    }
    
    /*Depending on the char, the interpreter method decides
      whether it needs to create a line or a space for the given char.
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
    
    //This method creates lines
    private String lineMaker(int size) {
        String line = "";
        for (int i = 0; i < size; i++) {
             line += "-";
        }
        return line;
    }
    
    //This method creates the spaces
    private String spaceMaker(int size) {
        String space = "";
        for (int i = 0; i < size; i++) {
             space += " ";
        }
        return space;
    }

}
