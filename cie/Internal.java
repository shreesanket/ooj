package cie;
import java.util.Scanner;

public class Internal extends Student{
public int internalsMarks[]=new int[5];
Scanner sc=new Scanner(System.in);
public void setCIE(){
for(int i=0;i<5;i++){
    System.out.println("Enter cie marks of Subject "+(i+1));
    internalsMarks[i]=sc.nextInt();
}

}
}
