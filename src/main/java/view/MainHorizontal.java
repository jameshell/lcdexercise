/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author james
 */
public class MainHorizontal {
    public static void main(String[] args) {
        System.out.println(lineMaker(3,3));
    }
    
    /*Makes the String for the lines
    Case 1.) Right line 
         2.) Left line 
         3.) Double line
    */
    public static String lineMaker(int size, int operation) {
        String line = "";
        switch (operation) {
            case 1:
                    line = line+"|"+letterRepeater(" ",size-1);
                    break;
            case 2: 
                    line = line+letterRepeater(" ",size-1)+"|";
                    break;
            case 3: 
                    line = line+"|"+letterRepeater(" ",size-2)+"|";
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
