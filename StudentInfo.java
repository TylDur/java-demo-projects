// Mini Project: Student Information & Marks Processing System

import java.util.Scanner;

class Student{

            String name , department , email , city;
            long roll ,  mobileNum;  
            int age , numOfSubjects ;
            double total , average;
            char gender , grade;
        
            String[] subjects;
            double subjectMarks[];

        // Getting the Basic Informations of the student
         void getStudentsBasicInfo(Scanner scanner){

            System.out.print("Enter the Name of the Student: ");
            name = scanner.nextLine();

            System.out.print("Enter the Roll Number of the Student: ");
            roll = scanner.nextLong();

            scanner.nextLine();

            System.out.print("Enter the Age of the Student: ");
            age = scanner.nextInt();

            scanner.nextLine();

            System.out.print("Enter the Email Id of the Student: ");
            email = scanner.next();

            scanner.nextLine();

            System.out.print("Enter the Mobile Number of the Student: ");
            mobileNum = scanner.nextLong();

            scanner.nextLine();

            System.out.print("Enter the City Name of the Student: ");
            city = scanner.nextLine();

            System.out.print("Enter the Gender of the Student: ");
            gender = scanner.next().charAt(0);

            scanner.nextLine();
    
            System.out.print("Enter the Department of the Student: ");
            department = scanner.nextLine();

        }

        //Printing the Student Information
         void printStudentsBasicInfo(){

            System.out.println("Name: "+name);
            System.out.println("Roll Number: "+roll);
            System.out.println("Age: "+age);
            System.out.println("Email of the Student: "+email);
            System.out.println("Mobile Number of the Student: "+mobileNum);
            System.out.println("City: "+city);
            System.out.println("Gender: "+gender);
            System.out.println("Department: "+department);
    
        }

        // Getting the Subjects
        void getSubjects(Scanner scanner){

        System.out.print("Enter the number of Subjects: ");
        numOfSubjects = scanner.nextInt();

        scanner.nextLine();  

        subjects = new String[numOfSubjects];
        
        for(int i = 0; i < numOfSubjects; i++){

            System.out.print("Enter the Subject: ");
            subjects[i] = scanner.nextLine();    
         }       
      } 
        // Printing Subjects
        void printSubjects(){

        System.out.println("The Subjects are: ");
        for(String sub : subjects){

            System.out.println(sub);
        }
         
    }
        // Getting Marks 
        void getMarks(Scanner scanner)  {

        subjectMarks = new double[numOfSubjects];

        total = 0;

        for(int i = 0; i < numOfSubjects;i++){
            System.out.print("Enter the marks for "+subjects[i]+" :"); 
            subjectMarks[i] = scanner.nextDouble();      
            total += subjectMarks[i];
             

        }
        average = total / numOfSubjects;     
    }
        void calculateGrade(){
            
            if(average >= 90){
                grade = 'O';
            }
            else if(average >= 80){
                grade = 'A';
            }
            else if(average >= 70){
                grade = 'B';
            }
            else if(average >= 60){
                grade = 'C';
            }
            else if(average >= 50){
                grade = 'D';
            }
            else{
                grade = 'U';
            }

        }

        // Printing Marks
        void printMarks(){

        for(int i = 0; i < numOfSubjects;i++){
            System.out.println("Marks scored in " + subjects[i]+ " : "+subjectMarks[i]);
        }
        System.out.println("Total Marks Scored: "+total);
        System.out.printf("Average: %.2f%n",average);
        System.out.println("Grade: "+grade);

    }
        
        
    } 

public class StudentInfo {
    public static void main(String[] args) {

           Scanner scanner = new Scanner(System.in);
           
           Student student1 = new Student();

            student1.getStudentsBasicInfo(scanner);
            student1.printStudentsBasicInfo();
            student1.getSubjects(scanner);
            student1.printSubjects();
            student1.getMarks(scanner);
            student1.calculateGrade();
            student1.printMarks();
           
                   
            scanner.close();
    }
}
