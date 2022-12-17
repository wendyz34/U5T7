public class Student {
    private String name;
    private int pointsEarned;
    private static int totalPointsEarned = 0;
    private static int greatestPoint = 0;
    public Student(String student){
        this.name = student;
        pointsEarned = 0;
    }
    public static int getGreatestPoints() {
    return greatestPoint;
    }
    public static int getTotalPointsEarned(){
        return totalPointsEarned;
    }

    public void addPoints(int points){
        pointsEarned+=points;
        totalPointsEarned+=points;
        if (greatestPoint<pointsEarned){
            greatestPoint = pointsEarned;
        }
    }
    public String studentInfo(){
        String studentInfo = "Student: " +name +"\n";
        studentInfo += "Points: "+ pointsEarned;
        return studentInfo;
    }

}
