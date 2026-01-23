// Mini Project: Student Information & Marks Processing System
import java.util.Scanner;

class Student{

            String name , department;
            int roll , age , numOfSubjects;
            double tamil,eng,maths,sci,soc,total,average;
            char gender;
            String[] subjects;

        // Getting the Basic Informations of the student
        public static void getStudentsBasicInfo(Scanner scanner , Student objStudent){

             System.out.print("Enter the Name of the Student: ");
             objStudent.name = scanner.nextLine();

             System.out.print("Enter the Roll number of the Student: ");
             objStudent.roll = scanner.nextInt();

             scanner.nextLine();

             System.out.print("Enter the Age of the Student: ");
             objStudent.age = scanner.nextInt();

             scanner.nextLine();

             System.out.print("Enter the Gender of the Student: ");
             objStudent.gender = scanner.next().charAt(0);

             scanner.nextLine();
    
             System.out.print("Enter the Department of the Student: ");
             objStudent.department = scanner.nextLine();

        }

        //Printing the Student Information
        static void printStudentsBasicInfo(Student objStudent){

            System.out.println("Name: "+objStudent.name);
            System.out.println("Roll: "+objStudent.roll);
            System.out.println("Age: "+objStudent.age);
            System.out.println("Gender: "+objStudent.gender);
            System.out.println("Depart: "+objStudent.department);
    
    }

    // Getting the Subjects
   static void getSubjects(Scanner scanner , Student objStudent){

        System.out.print("Enter the number of Subjects: ");
        objStudent.numOfSubjects = scanner.nextInt();

        scanner.nextLine();  

        objStudent.subjects = new String[objStudent.numOfSubjects];
        
        for(int i = 0; i < objStudent.numOfSubjects; i++){

            System.out.print("Enter the Subject: ");
            objStudent.subjects[i] = scanner.nextLine();    
        }
        
        //Printing the Subjects
        System.out.println("The Subjects are: ");
        for(String sub : objStudent.subjects){

            System.out.println(sub);
        }
    } 
    void getMarks(Scanner scanner,Student objStudent)  {
        for(int i = 0; i < objStudent.numOfSubjects;i++){
            
        }
    } 
}
public class StudentInfo {
    public static void main(String[] args) {

           Scanner scanner = new Scanner(System.in);
           
           Student stu1 = new Student();

           Student.getStudentsBasicInfo(scanner,stu1);
           Student.printStudentsBasicInfo(stu1);
           Student.getSubjects(scanner, stu1);
            
            System.out.print("Enter the Email Id of the Student: ");
            String email = scanner.next();

            System.out.print("Enter the Mobile of the Student: ");
            int mobileNum = scanner.nextInt();

            scanner.nextLine();

            System.out.print("Enter the City name of the Student: ");
            String city = scanner.nextLine();

            System.out.println("Email of the Student: "+email);
            System.out.println("Mobile Number of the Student: "+mobileNum);
            System.out.println("City: "+city);
            

            scanner.close();
    }
}
