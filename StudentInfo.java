// Mini Project: Student Information & Marks Processing System
import java.util.Scanner;

class Student{

            String name , department , email , city;
            long roll ,  mobileNum;  
            int age , numOfSubjects ;
            double total ,  average;
            char gender;
            String[] subjects;
            double subjectMarks[];

        // Getting the Basic Informations of the student
        public static void getStudentsBasicInfo(Scanner scanner , Student objStudent){

             System.out.print("Enter the Name of the Student: ");
             objStudent.name = scanner.nextLine();

             System.out.print("Enter the Roll number of the Student: ");
             objStudent.roll = scanner.nextLong();

             scanner.nextLine();

             System.out.print("Enter the Age of the Student: ");
             objStudent.age = scanner.nextInt();

             scanner.nextLine();

            System.out.print("Enter the Email Id of the Student: ");
            objStudent.email = scanner.next();

            scanner.nextLine();

            System.out.print("Enter the Mobile of the Student: ");
            objStudent.mobileNum = scanner.nextLong();

            scanner.nextLine();

            System.out.print("Enter the City name of the Student: ");
            objStudent.city = scanner.nextLine();

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
            System.out.println("Email of the Student: "+objStudent.email);
            System.out.println("Mobile Number of the Student: "+objStudent.mobileNum);
            System.out.println("City: "+objStudent.city);
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
    } 

    static void printSubjects(Student objStudent){

        //Printing the Subjects
        System.out.println("The Subjects are: ");
        for(String sub : objStudent.subjects){

            System.out.println(sub);
        }
         
    }
    static void getMarks(Scanner scanner,Student objStudent)  {

        objStudent.subjectMarks = new double[objStudent.numOfSubjects];

        for(int i = 0; i < objStudent.numOfSubjects;i++){
            System.out.print("Enter the marks for "+objStudent.subjects[i]+" :"); 
            objStudent.subjectMarks[i] = scanner.nextDouble();          
        }
    } 
    static void printMarks(Student objStudent){

        for(int i = 0; i < objStudent.numOfSubjects;i++){
            System.out.println("Marks scored in " + objStudent.subjects[i]+ " : "+objStudent.subjectMarks[i]);
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
           Student.printSubjects(stu1);
           Student.getMarks(scanner,stu1);
           Student.printMarks(stu1);
                   
            scanner.close();
    }
}
