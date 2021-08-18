public class Main {
    public static void main(String[] args){
        StudentProfile studentOne = new StudentProfile("Bin","Vin",
                2025,4.5,"Computer Science",30);
        StudentProfile studentTwo = new StudentProfile("Vin", "Od",
                2025,4.5,"Management",35);

        System.out.println("Student " + studentOne.firstName + "'s expected graduation year : "
                + studentOne.expectedGradYear);
        studentOne.incrementExpectedGradYear();
        System.out.println("Student " + studentOne.firstName + "'s updated expected graduation year : "
                + studentOne.expectedGradYear);

        System.out.println("Student " + studentTwo.firstName + "'s expected graduation year : "
                + studentTwo.expectedGradYear);
        studentTwo.incrementExpectedGradYear();
        System.out.println("Student " + studentTwo.firstName + "'s updated expected graduation year : "
                + studentTwo.expectedGradYear);

    }
}
