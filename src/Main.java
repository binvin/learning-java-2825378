public class Main {
    public static double calcEmpSalary(int empHrsPerWeek, double empRatePerHour, double vacationDays){
        if (empHrsPerWeek < 0){
            System.out.println("Hours parameter is negative!");
            return 0;
        } else if (empRatePerHour < 0){
            System.out.println("Rate parameter is negative!");
            return 0;
        } else if (vacationDays < 0){
            System.out.println("Vacation parameter is negative!");
            return 0;
        }

        double empYearlySalary = (empHrsPerWeek * empRatePerHour * 52.1429)
                - (vacationDays * empHrsPerWeek/5 * empRatePerHour);
        return empYearlySalary;
    }
    public static void main(String[] args){
        int empHrsPerWeek = 40;
        double empRatePerHour = 70;
        double vacationDays = 0;
        double empGrossSalary = calcEmpSalary(empHrsPerWeek, empRatePerHour, vacationDays);
        System.out.println("Employee gross salary with " + empHrsPerWeek + " hrs, and rate $"
                + empRatePerHour + " , with " + vacationDays + " vacation days is : $"
                + empGrossSalary);

        empHrsPerWeek = 40;
        empRatePerHour = 70;
        vacationDays = 1;
        empGrossSalary = calcEmpSalary(empHrsPerWeek, empRatePerHour, vacationDays);
        System.out.println("Employee gross salary with " + empHrsPerWeek + " hrs, and rate $"
                + empRatePerHour + " , with " + vacationDays + " vacation days is : $"
                + empGrossSalary);

        empHrsPerWeek = 40;
        empRatePerHour = 70;
        vacationDays = -1;
        empGrossSalary = calcEmpSalary(empHrsPerWeek, empRatePerHour, vacationDays);
        if (empGrossSalary > 0) {
            System.out.println("Employee gross salary with " + empHrsPerWeek + " hrs, and rate $"
                    + empRatePerHour + " , with " + vacationDays + " vacation days is : $"
                    + empGrossSalary);
        } else {
            System.out.println("Error!!!");
        }
    }
}
