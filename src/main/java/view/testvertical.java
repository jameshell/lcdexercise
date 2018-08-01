/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import model.HorizontalModule;
import model.Utility;
import model.VerticalModule;

/**
 *
 * @author Jaime Alonso
 */
public class testvertical {

    public static void main(String[] args) {
        Utility util = new Utility();
        int size = 4;
        int input =4;
        
        printVerticalUpperPart(util,size,input);
        printVerticalBottomPart(util,size,input);

        
//         System.out.println("COLUMNAS="+columnas);
//         System.out.println("SUBSTRING 1 ="+lineaCompleta.substring(0,columnas+1));
//         System.out.println("SUBSTRING 2 ="+lineaCompleta.substring(columnas+1,columnas+columnas+2));
//         System.out.println("SUBSTRING 3 ="+lineaCompleta.substring(columnas+columnas+2,columnas+columnas+columnas+3));
    }
    
    //Print Upper part
    public static void printVerticalUpperPart(Utility util, int size, int input){
        VerticalModule module = new VerticalModule(size,input);
        String lineaCompleta=module.segmentMaker(util, 1);
        int end = 0;
        int contador=0;
        int inicio=0;
        int colcont = 1;
        int columnas = util.columnSize(size)-1;
        System.out.println("LINEA COMPLETA -> "+lineaCompleta);
        while(contador<size){
             end =  end+columnas+colcont;
             System.out.println(lineaCompleta.substring(inicio, end));
             inicio = end;
             contador++;
         }
    }
    
    public static void printVerticalBottomPart(Utility util, int size, int input){
        VerticalModule module = new VerticalModule(size,input);
        String lineaCompleta=module.segmentMaker(util, 2);
        int end = 0;
        int contador=0;
        int inicio=0;
        int colcont = 1;
        int columnas = util.columnSize(size)-1;
        System.out.println("LINEA COMPLETA -> "+lineaCompleta);
        while(contador<size){
             end =  end+columnas+colcont;
             System.out.println(lineaCompleta.substring(inicio, end));
             inicio = end;
             contador++;
         }
    }
    
    public static void printHorizontalUpperPart(Utility util, int size, int input){
        HorizontalModule module = new HorizontalModule(size,input);
        String lineaCompleta=module.segmentMaker(util, 1);
        System.out.println(lineaCompleta);
    }
    
    public static void printHorizontalMiddlePart(Utility util, int size, int input){
        HorizontalModule module = new HorizontalModule(size,input);
        String lineaCompleta=module.segmentMaker(util, 2);
        System.out.println(lineaCompleta);
    }
        
    public static void printHorizontalBottomPart(Utility util, int size, int input){
        HorizontalModule module = new HorizontalModule(size,input);
        String lineaCompleta=module.segmentMaker(util, 3);
        System.out.println(lineaCompleta);
    }
}
