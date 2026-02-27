public class GradeSwitch {
    public static void main(String[] args) {
        int marks = 85;
        char grade;

        if (marks >= 90) grade = 'A';
        else if (marks >= 75) grade = 'B';
        else if (marks >= 60) grade = 'C';
        else if (marks >= 40) grade = 'D';
        else grade = 'F';

        switch (grade) {
            case 'A': System.out.println("Excellent"); break;
            case 'B': System.out.println("Good"); break;
            case 'C': System.out.println("Average"); break;
            case 'D': System.out.println("Pass"); break;
            default: System.out.println("Fail");
        }
    }
}
