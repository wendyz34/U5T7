public class Employee {
    private String firstName;
    private String lastName;
    private int employeeID;
    private static int mostRecentID=100;
    private static int totalEmployee=0;
    public Employee(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.employeeID = employeeID;
         mostRecentID = employeeID++;
         employeeID = mostRecentID;
         totalEmployee++;


    }
    public static int totalEmployee(){
       return totalEmployee;
    }
    public static int mostRecentID(){
        return mostRecentID;
    }
    public String getfullName(){
        return firstName + " " + lastName;
    }
    public int getEmployeeID(){
        return employeeID;
    }
    public void employeeInfo(){
        System.out.println("Employee's full name: "+ getfullName());
        System.out.println("Employee's ID: " + employeeID);
    }
    public void classInfo(){
        System.out.println("Most recent ID assigned: " + mostRecentID);
        System.out.println("Total employees hired: " + totalEmployee);
    }

}
