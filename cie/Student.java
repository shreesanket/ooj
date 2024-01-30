package cie;
import java.util.Scanner;
public class Student{
    public int sem;
   public String usn,name; 
   Scanner sc=new Scanner(System.in);
   public void setStudentDetails(){
    System.out.println("Enter your Name :");
    name=sc.nextLine();
    System.out.println("Enter your USN :");
    usn=sc.nextLine();
    System.out.println("Enter your Sem :");
    sem=sc.nextInt();
   }

   public void getDetails(){
    System.out.println("Name :"+name);
    System.out.println("USN :"+usn);
    System.out.println("sem :"+sem);
   }
   

}
