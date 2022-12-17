public class Employee {
    private String firstName;
    private String lastName;
    private int employeeID;
    private static int mostRecentID = 100;
    private static int totalEmployee = 0;

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        mostRecentID++;
        employeeID = mostRecentID;
        totalEmployee++;


    }

    public static int totalEmployee() {
        return totalEmployee;
    }

    public static int mostRecentID() {
        return mostRecentID;
    }

    public static String classInfo() {
        String str = "Most recent ID assigned: " + mostRecentID;
        str += "\nTotal employees hired: " + totalEmployee;
        return str;
    }

    public String getfullName() {
        return firstName + " " + lastName;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public String employeeInfo() {
        String s = "Employee's full name: " + getfullName();
        s += "\nEmployee's ID: " + employeeID;
        return s;
    }


}
