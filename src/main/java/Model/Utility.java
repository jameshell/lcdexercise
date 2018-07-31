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
public class Utility {
    public int columnSize(int userInput){
       int size = userInput + 2;
        return size;
    }
    public int rowSize(int userInput){
        int size = (userInput * 2) + 3;
        return size;
    }
}
