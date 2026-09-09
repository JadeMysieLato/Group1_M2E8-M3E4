import java.util.Scanner;

public class CourseEnrollment {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String studentName;
        String subjectCode;
        String subjectTitle;
        int units;
        char section;

        System.out.print("Enter student name: ");
        studentName = input.nextLine();

        System.out.print("Enter subject code: ");
        subjectCode = input.nextLine();

        System.out.print("Enter subject title: ");
        subjectTitle = input.nextLine();

        System.out.print("Enter units: ");
        units = input.nextInt();

        System.out.print("Enter section: ");
        section = input.next().charAt(0);

        System.out.println("\nCourse Enrollment Record");
        System.out.println("Student Name: " + studentName);
        System.out.println("Subject Code: " + subjectCode);
        System.out.println("Subject Title: " + subjectTitle);
        System.out.println("Units: " + units);
        System.out.println("Section: " + section);

        input.close();
    }
}
