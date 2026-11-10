import java.util.Scanner;
class Student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String studentname, studentClass, place;
        int age;
        System.out.println("Enter Student Name:");
        studentname =sc.nextLine();
        System.out.println("Enter Age:");
        age=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter student class:");
        studentClass =sc.nextLine();
        System.out.println("Enter Student Place:");
        place=sc.nextLine();
        System.out.println("Student Details");
        System.out.println("Name:"+studentname);
        System.out.println("Age:"+age);
        System.out.println("Class:"+studentClass);
        System.out.println("Place:"+place);
    }
}
    
