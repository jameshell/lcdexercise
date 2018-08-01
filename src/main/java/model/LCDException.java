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
public class LCDException extends Exception{
    public LCDException() {

    }
    public LCDException( String message ) {
        super( message );
    }

    public LCDException( Throwable cause ) {
        super( cause );
    }

    public LCDException( String message, Throwable cause ) {
        super( message, cause );
    }

    public LCDException( String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace ) {
        super( message, cause, enableSuppression, writableStackTrace );
    }
}
