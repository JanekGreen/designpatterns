package avoidnestedifs;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //avoid nested ifs, watch out on order of statements

    }
    boolean isUserEligibleForDiscountBad(User user) {
        LocalDate currentDate = LocalDate.now();
        int currentYear = currentDate.getYear();
        int subscriptionPeriodInYears = currentYear - user.yearOfJoining();
        if (currentDate.isLeapYear()) {
            if (subscriptionPeriodInYears > 2) {
                if(user.premiumPlan()){
                    //additional calculations
                }
            }
        }
        return true;
    }
    boolean isUserEligibleForDiscountBetter(User user) {
        if(!user.premiumPlan()){
            return false;
        }
        LocalDate currentDate = LocalDate.now();
        if(!currentDate.isLeapYear()){
            return false;
        }
        int currentYear = currentDate.getYear();
        int subscriptionPeriodInYears = currentYear - user.yearOfJoining();
        if (subscriptionPeriodInYears > 2) {
            //additional calculations
        }
        return true;
    }

}
