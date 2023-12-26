import java.util.*;
 class Subject{
    int subjectMarks;
    int credits;
    int grade;
}

class Student{
    Subject subject[];
    String name;
    String usn;
    double SGPA;
    Scanner sc=new Scanner(System.in);

 Student(){
int i;
subject = new Subject[8];
for(i=0;i<8;i++)
subject[i] = new Subject();
}

public void getStudentDetails(){
    System.out.println("enter your name");
    name=sc.nextLine();
    System.out.println("usn");
    usn=sc.nextLine();
 }  


public void getMarks(){
    for(int i=0;i<8;i++){
        System.out.println("enter the marks for"+(i+1)+"subject");
        subject[i].subjectMarks=sc.nextInt();
        System.out.println("enter the credits of"+(i+1)+"subject:");
        subject[i].credits=sc.nextInt();
        subject[i].grade=(subject[i].subjectMarks/10)+1;
        if(subject[i].grade==11){
            subject[i].grade=10;
        }
        if(subject[i].grade<4){
            subject[i].grade=0;
        }
    }
}

public void computeSGPA(){
    int effectiveScore=0;
    int total=0;
    float SGPA=0;
    for(int i=0;i<8;i++){
        effectiveScore+=(subject[i].credits*subject[i].grade);
        total+=subject[i].credits;
       
    }
     System.out.println("effective score:"+effectiveScore);
        System.out.println("total credits:"+total);
        SGPA=effectiveScore/total;
        System.out.println("SGPA;"+SGPA);
}
}

class javaMain{
    public static void main(String args[]){
        Student s=new Student();
        s.getStudentDetails();
        s.getMarks();
        s.computeSGPA();
        System.out.println("name:"+s.name);
        System.out.println("usn:"+s.usn);
    }
}