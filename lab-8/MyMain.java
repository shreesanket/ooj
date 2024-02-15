class Bmsce extends Thread{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("Bmsce"); 
            try{
                this.sleep(10000);
            }
           catch(InterruptedException e){System.out.println(e);}    
           System.out.println(i);    
        }
    }
}
class Cse extends Thread{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("CSE"); 
            try{
                this.sleep(2000);
            }
           catch(InterruptedException e)
           {System.out.println(e);}    
              
        }
    }
}



public class MyMain{
public static void main(String[] args) {
    Bmsce obj1 = new Bmsce();
    Cse obj2 = new Cse();
    obj1.start();
    obj2.start();
    
}
}