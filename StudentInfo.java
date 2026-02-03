// Mini Project: Student Information & Marks Processing System

import java.util.Scanner;

class Student{

            String name , department , email , city;
            long roll ,  mobileNum;  
            int age , numOfSubjects ;
            double total , average;
            char gender;
            char grade;
            String[] subjects;
            double subjectMarks[];

        // Getting the Basic Informations of the student
         void getStudentsBasicInfo(Scanner scanner , Student objStudent){

            System.out.print("Enter the Name of the Student: ");
            objStudent.name = scanner.nextLine();

            System.out.print("Enter the Roll Number of the Student: ");
            objStudent.roll = scanner.nextLong();

            scanner.nextLine();

            System.out.print("Enter the Age of the Student: ");
            objStudent.age = scanner.nextInt();

            scanner.nextLine();

            System.out.print("Enter the Email Id of the Student: ");
            objStudent.email = scanner.next();

            scanner.nextLine();

            System.out.print("Enter the Mobile Number of the Student: ");
            objStudent.mobileNum = scanner.nextLong();

            scanner.nextLine();

            System.out.print("Enter the City Name of the Student: ");
            objStudent.city = scanner.nextLine();

            System.out.print("Enter the Gender of the Student: ");
            objStudent.gender = scanner.next().charAt(0);

            scanner.nextLine();
    
            System.out.print("Enter the Department of the Student: ");
            objStudent.department = scanner.nextLine();

        }

        //Printing the Student Information
         void printStudentsBasicInfo(Student objStudent){

            System.out.println("Name: "+objStudent.name);
            System.out.println("Roll: "+objStudent.roll);
            System.out.println("Age: "+objStudent.age);
            System.out.println("Email of the Student: "+objStudent.email);
            System.out.println("Mobile Number of the Student: "+objStudent.mobileNum);
            System.out.println("City: "+objStudent.city);
            System.out.println("Gender: "+objStudent.gender);

            System.out.println("Department: "+objStudent.department);
    
        }

        // Getting the Subjects
        void getSubjects(Scanner scanner , Student objStudent){

        System.out.print("Enter the number of Subjects: ");
        objStudent.numOfSubjects = scanner.nextInt();

        scanner.nextLine();  

        objStudent.subjects = new String[objStudent.numOfSubjects];
        
        for(int i = 0; i < objStudent.numOfSubjects; i++){

            System.out.print("Enter the Subject: ");
            objStudent.subjects[i] = scanner.nextLine();    
         }       
      } 
        // Printing Subjects
        void printSubjects(Student objStudent){

        System.out.println("The Subjects are: ");
        for(String sub : objStudent.subjects){

            System.out.println(sub);
        }
         
    }
        // Getting Marks 
        void getMarks(Scanner scanner,Student objStudent)  {

        objStudent.subjectMarks = new double[objStudent.numOfSubjects];

        objStudent.total = 0;

        for(int i = 0; i < objStudent.numOfSubjects;i++){
            System.out.print("Enter the marks for "+objStudent.subjects[i]+" :"); 
            objStudent.subjectMarks[i] = scanner.nextDouble();      
            objStudent.total +=objStudent.subjectMarks[i];
             objStudent.average = objStudent.total / objStudent.numOfSubjects;     

        }
    }
        void calculateGrade(Student objStudent){
            
            if(objStudent.average >= 90){
                objStudent.grade = 'O';
            }
            else if(objStudent.average >= 80){
                objStudent.grade = 'A';
            }
            else if(objStudent.average >= 70){
                objStudent.grade = 'B';
            }
            else if(objStudent.average >= 60){
                objStudent.grade = 'C';
            }
            else if(objStudent.average >= 50){
                objStudent.grade = 'D';
            }
            else{
                objStudent.grade = 'U';
            }

        }

        // Printing Marks
        void printMarks(Student objStudent){

        for(int i = 0; i < objStudent.numOfSubjects;i++){
            System.out.println("Marks scored in " + objStudent.subjects[i]+ " : "+objStudent.subjectMarks[i]);
        }
        System.out.println("Total Marks Scored: "+objStudent.total);
        System.out.printf("Average: %.2f%n",objStudent.average);
        System.out.println("Grade: "+objStudent.grade);

    }
        
        
    } 

public class StudentInfo {
    public static void main(String[] args) {

           Scanner scanner = new Scanner(System.in);
           
           Student student1 = new Student();

        //    student1.getStudentsBasicInfo(scanner,student1);
        //    student1.printStudentsBasicInfo(student1);
           student1.getSubjects(scanner, student1);
           student1.printSubjects(student1);
           student1.getMarks(scanner,student1);
           student1.calculateGrade(student1);
           student1.printMarks(student1);
           
                   
            scanner.close();
    }
}
