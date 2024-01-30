package see;
import cie.Internal;
import java.util.Scanner;
public class External extends Internal{
  public  int seeMarks[]=new int[5];
  public int finalMarks[]=new int[5];
  Scanner sc=new Scanner(System.in);
  public void setSEE(){
    for(int i=0;i<5;i++){
      System.out.println("Enter see marks of Subject "+(i+1));
      seeMarks[i]=sc.nextInt();
  }
  }

public void computeFinal(){
  for(int i=0;i<5;i++){
    finalMarks[i]=internalsMarks[i]+seeMarks[i]/2;
}

} 
public void displayMarks(){
  for(int i=0;i<5;i++){
    System.out.println("Subject "+(i+1)+" = "+finalMarks[i]);
}

}}
