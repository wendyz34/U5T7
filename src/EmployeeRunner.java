public class EmployeeRunner {
    public static void main(String[]args){
        //1
        Employee employee1 = new Employee("Jim", "Mason");
        System.out.println(employee1.employeeInfo());
        System.out.println(Employee.classInfo());
        //2
       System.out.println(Employee.mostRecentID());
        System.out.println(Employee.totalEmployee());
        //3
        Employee employee2 = new Employee("Amy", "Adams");
        System.out.println(employee2.employeeInfo());
        System.out.println(Employee.classInfo());
        //4
        Employee employee3 = new Employee("Bob", "Ross");
        Employee employee4 = new Employee("Cindy", "Nox");
        System.out.println(employee3.employeeInfo());
        System.out.println(employee4.classInfo());
        System.out.println(Employee.classInfo());
        //5
        System.out.println(employee1.employeeInfo());
        System.out.println(employee2.employeeInfo());
        //6
        System.out.println(Employee.mostRecentID());
        System.out.println(Employee.totalEmployee());


    }
}
