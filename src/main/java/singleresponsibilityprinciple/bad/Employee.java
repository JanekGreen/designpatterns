package singleresponsibilityprinciple.bad;

import java.util.Date;

public class Employee {
    private String employeeId;
    private String name;
    private String address;
    private Date dateOfJoining;

    public boolean isPromotionDueThisYear() {
        //promotion logic implementation
        return true;
    }
    public Double calcIncomeTaxForCurrentYear() {

        return null;
    }

}