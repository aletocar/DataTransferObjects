/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alejandrotocar
 */
package com.easytasks.dataTransferObjects;

public abstract class DataTransferObject {
    
    private String message;
    private boolean transferOk;
    
    public DataTransferObject(){
        transferOk = true;
        message = "";
    }
    public DataTransferObject(String message, boolean transferOk){
        this.message = message;
        this.transferOk = transferOk;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isTransferOk() {
        return transferOk;
    }

    public void setTransferOk(boolean transferOk) {
        this.transferOk = transferOk;
    }
    
    
    
}
