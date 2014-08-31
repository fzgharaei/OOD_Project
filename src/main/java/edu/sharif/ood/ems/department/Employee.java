/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.sharif.ood.ems.department;

/**
 *
 * @author fatemehzahra
 */
public class Employee {
    
    private Job job;
    private String name;
    private String employeeID;
   
    
    Employee(String id, String n, Job j){
        
        employeeID = id;
        name = n;
        job = j;
    }
    
    public String getId(){
        return employeeID;
    }
}
