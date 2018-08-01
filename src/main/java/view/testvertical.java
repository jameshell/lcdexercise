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
        int size = 2;
        int input = 5;

        printHorizontalUpperPart(util, size, input);
        printVerticalUpperPart(util, size, input);
        printHorizontalMiddlePart(util, size, input);
        printVerticalBottomPart(util, size, input);
        printHorizontalBottomPart(util, size, input);

    }

    //Print Upper part
    public static void printVerticalUpperPart(Utility util, int size, int input) {
        VerticalModule module = new VerticalModule(size, input);
        String lineaCompleta = module.segmentMaker(util, 1);
        int end = 0;
        int contador = 0;
        int inicio = 0;
        int colcont = 1;
        int divisions = (lineaCompleta.length()/size)-1;

          while(contador<lineaCompleta.length()){
              if(end+divisions+colcont>lineaCompleta.length()){
                  System.out.println(lineaCompleta.substring(inicio));
                  break;
              } else{
                  end = end + divisions + colcont;
              System.out.println(lineaCompleta.substring(inicio, end));
              inicio = end;
              }
              contador++;
          }
        
//        while (contador < size) {
//            end = end + columnas + colcont;
//            System.out.println(lineaCompleta.substring(inicio, end));
//            inicio = end;
//            contador++;
//        }
        
    }

    public static void printVerticalBottomPart(Utility util, int size, int input) {
        VerticalModule module = new VerticalModule(size, input);
        String lineaCompleta = module.segmentMaker(util, 2);
        int end = 0;
        int contador = 0;
        int inicio = 0;
        int colcont = 1;
        int columnas = util.columnSize(size) - 1;
        int divisions = (lineaCompleta.length()/size)-1;
        
        while(contador<lineaCompleta.length()){
              if(end+divisions+colcont>lineaCompleta.length()){
                  System.out.println(lineaCompleta.substring(inicio));
                  break;
              } else{
                  end = end + divisions + colcont;
              System.out.println(lineaCompleta.substring(inicio, end));
              inicio = end;
              contador++;
              }
              
          }
    }

    public static void printHorizontalUpperPart(Utility util, int size, int input) {
        HorizontalModule module = new HorizontalModule(size, input);
        String lineaCompleta = module.segmentMaker(util, 1);
        System.out.println(lineaCompleta);
    }

    public static void printHorizontalMiddlePart(Utility util, int size, int input) {
        HorizontalModule module = new HorizontalModule(size, input);
        String lineaCompleta = module.segmentMaker(util, 2);
        System.out.println(lineaCompleta);
    }

    public static void printHorizontalBottomPart(Utility util, int size, int input) {
        HorizontalModule module = new HorizontalModule(size, input);
        String lineaCompleta = module.segmentMaker(util, 3);
        System.out.println(lineaCompleta);
    }
}
