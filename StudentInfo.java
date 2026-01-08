// Mini Project: Student Information & Marks Processing System
import java.util.Scanner;
public class StudentInfo {

    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            double tamil,eng,maths,sci,soc,total,average;


            System.out.print("Enter the Name of the Student: ");
            String name = scanner.nextLine();

             System.out.print("Enter the Roll number of the Student: ");
            int roll = scanner.nextInt();

            System.out.print("Enter the Age of the Student: ");
            int age = scanner.nextInt();

            System.out.print("Enter the Gender of the Student: ");
            char gender = scanner.next().charAt(0);

            scanner.nextLine();
    
            System.out.print("Enter the Department of the Student: ");
            String department = scanner.nextLine();

            System.out.println("Name: "+name);
            System.out.println("Roll: "+roll);
            System.out.println("Age: "+age);
            System.out.println("Gender: "+gender);
            System.out.println("Depart: "+department);

    
            System.out.print("Enter the number of Students: ");
            int numOfstuds = scanner.nextInt();

        

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

            if(total >= 50){
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

            scanner.close();

    }
}
