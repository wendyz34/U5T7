public class EmployeeRunner {
    public static void main(String[]args){
        //1
        Employee employee1 = new Employee("Jim", "Mason");
        employee1.employeeInfo();
        employee1.classInfo();
        //2
       System.out.println(employee1.mostRecentID());
        employee1.totalEmployee();
        //3
        Employee employee2 = new Employee("Amy", "Adams");
        employee2.employeeInfo();
        employee2.classInfo();
        //4
        Employee employee3 = new Employee("Bob", "Ross");
        Employee employee4 = new Employee("Cindy", "Nox");
        employee3.employeeInfo();
        employee4.classInfo();
        //5
        employee3.employeeInfo();
        employee4.employeeInfo();
        //6
        employee1.mostRecentID();
        employee1.totalEmployee();


    }
}
