/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.sharif.ood.ems.department;

import java.util.Date;

/**
 *
 * @author fatemehzahra
 */
public class Responsibility {
    
    
    private String DocNumber;
    private String Name;
    private String Description;
    private String Progress;
    private Date StartDate;
    private Date FinishDate;
    private Date DueDate;
    
    
    private void createRes(){}
    private void updateProgress(double prec){
        Progress = Double.toString(prec);
    }
    private void deleteRes(){}
    
    private String getProgress(){
        return Progress;
    }
}
