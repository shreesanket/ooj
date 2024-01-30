import java.util.Scanner;

class WrongAge extends Exception{
public WrongAge(String A){
    super(A);
}
}

class Father{
int fatherAge;
Scanner sc=new Scanner(System.in);
public void validAge() throws WrongAge{
System.out.print("Enter Fathers age:");
fatherAge=sc.nextInt();
if(fatherAge<=0){
    throw new WrongAge("Invalid fathers age, Age cannot be negative");
}
}
}

class Son extends Father{
int sonAge;
Scanner sc=new Scanner(System.in);
public void validAge() throws WrongAge{
    System.out.print("Enter sons age:");
    sonAge=sc.nextInt();
    super.validAge();
    if (sonAge>fatherAge) {
        throw new WrongAge("Sons age can't be greater than Fathers age");  
    }
    else if(sonAge==fatherAge){
        throw new WrongAge("sons age and fathers age cannot be same");  
    }
    else if(sonAge<0){
        throw new WrongAge("Invalid son age");
    }
}

}

public class MyMain{
    public static void main(String[] args) {
        Son obj = new Son();
        try{
            obj.validAge(); 
        }
        catch(WrongAge e){
            System.out.println("Exception "+e.getMessage());
        }
       
    }
}