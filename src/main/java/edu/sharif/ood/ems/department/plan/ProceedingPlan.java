/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.sharif.ood.ems.department.plan;

import edu.sharif.ood.ems.department.Employee;
import edu.sharif.ood.ems.department.Responsibility;
import edu.sharif.ood.ems.department.plan.Goal.Target;
import java.util.Date;

/**
 *
 * @author fatemehzahra
 */
public class ProceedingPlan {
  
    private Target target;
    private String docNumber;
    private Employee creator;
    private Date createDate;
    private Responsibility[] responsibilities;
    private String targetStatu;
}
