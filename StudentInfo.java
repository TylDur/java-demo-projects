// Mini Project: Student Information & Marks Processing System
import java.util.Scanner;
class Student{

            String name , department;
            int roll , age , numOfSubjects;
            char gender;

        public static void getStudentsBasicInfo(Scanner scanner , Student objStudent){

             System.out.print("Enter the Name of the Student: ");
             objStudent.name = scanner.nextLine();

             System.out.print("Enter the Roll number of the Student: ");
             objStudent.roll = scanner.nextInt();

             System.out.print("Enter the Age of the Student: ");
             objStudent.age = scanner.nextInt();

             System.out.print("Enter the Gender of the Student: ");
             objStudent.gender = scanner.next().charAt(0);

             scanner.nextLine();
    
             System.out.print("Enter the Department of the Student: ");
             objStudent.department = scanner.nextLine();
        }
        static void printStudentsBasicInfo(Student objStudent){

            System.out.println("Name: "+objStudent.name);
            System.out.println("Roll: "+objStudent.roll);
            System.out.println("Age: "+objStudent.age);
            System.out.println("Gender: "+objStudent.gender);
            System.out.println("Depart: "+objStudent.department);
    
    }
      
   static void setSubjects(Scanner scanner , Student objStudent){

        System.out.print("Enter the number of Subjects: ");
        objStudent.numOfSubjects = scanner.nextInt();

        scanner.nextLine();  

        String[] subjects = new String[objStudent.numOfSubjects];

        for(int i = 0; i < objStudent.numOfSubjects; i++){

            System.out.print("Enter the Subject: ");
            subjects[i] = scanner.nextLine();    
        }

        System.out.println("The Subjects are: ");

        for(String sub : subjects){
            System.out.println(sub);
        }
        
    }       

}
public class StudentInfo {
 
    public static void main(String[] args) {

           Scanner scanner = new Scanner(System.in);
           
           Student stu1 = new Student();
           //Student.getStudentsBasicInfo(scanner,stu1);
           //Student.printStudentsBasicInfo(stu1);
           Student.setSubjects(scanner, stu1);

           /* 
           double tamil,eng,maths,sci,soc,total,average;

            //System.out.print("Enter the number of Students: ");
            //int numOfstuds = scanner.nextInt();

            System.out.print("Enter the Mark Scored in Tamil: ");
            tamil = scanner.nextDouble();

            System.out.print("Enter the Mark Scored in English: ");
            eng = scanner.nextDouble();

            System.out.print("Enter the Mark Scored in Maths: ");
            maths = scanner.nextDouble();

            System.out.print("Enter the Mark Scored in Science: ");
            sci = scanner.nextDouble();

            System.out.print("Enter the Mark Scored in Social: ");
            soc = scanner.nextDouble();


            System.out.println("Mark Scored in Tamil: "+tamil);
            System.out.println("Mark Scored in English: "+eng);
            System.out.println("Mark Scored in Maths: "+maths);
            System.out.println("Mark Scored in Science: "+sci);
            System.out.println("Mark Scored in Social: "+soc);

            total = tamil+eng+maths+sci+soc;
            average = total / 5;

            System.out.println("Total Marks: "+total);
            System.out.println("Average: "+average);

            if(average >= 50){
                System.out.println("Pass");
            }
            else{
                System.out.println("Fail");
            }
            
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
            */

            scanner.close();
    }
}
