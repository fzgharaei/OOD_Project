/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.sharif.ood.ems.department;

import java.util.HashMap;

/**
 *
 * @author fatemehzahra
 */
public class EmployeeCatagory {
    
    
    private HashMap<Employee, String> employeeMap;

    public EmployeeCatagory() {
        employeeMap = new HashMap();
    }
    
    public void addEmp(String id, String psw, String name, Job j){
        
        employeeMap.put(new Employee(id, name, j), psw);
    }
    
    public boolean empExist(String un, String psw){
        return true;
    }
    
}
