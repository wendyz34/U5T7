public class Student {
    private String Student;
    private int points;
    private static int totalPointsEarned = 0;
    private static int greatestPoint = 0;
    public Student(String student){
        this.Student = Student;
        points = 0;
    }
    public Student(String Student, int points){
        this.Student = Student;
        points+=points;
    }
    public static int getGreatestPoints() {
    return greatestPoint;
    }
    public static int getTotalPointsEarned(){
        return totalPointsEarned;
    }

    public void addPoints(){
        greatestPoint+=points;
        totalPointsEarned+=points;
        if (greatestPoint<points){
            System.out.println(points);
        }
    }
    public void studentInfo(){
        System.out.println("Student: " + Student);
        System.out.println("Points"+ points);
        System.out.println("Total points:" + getTotalPointsEarned());
        System.out.println("Most points earned: " + getGreatestPoints());
    }

}
