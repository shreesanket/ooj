public class StringMain{
    public static void main(String[] args) {
        //constructors
        String s =new String(); // without parameters
        String s2 = new String("Hello Java"); 
        System.out.println("S2= "+s2);
        char mychars[]={'j','a','v','a'};
        String s3= new String(mychars); // passing character arrays
        System.out.println("S3= "+s3);
        String s4 =new String(mychars,0,2); //passing character array with start index and end index
        System.out.println("S4= "+s4);
        byte b[]={65,66,67,68};
        String s5=new String(b);
        System.out.println("S5= "+s5);

        // String lenth , String literal , string concat
        String name="shree sanketh Kulkarni"; // string literal
        System.out.println("displaying string length ");
        System.out.println("length= "+name.length()); // displaying length 
        System.out.println("displaying concatination of string");
        String branch="Computer science engineering";
        String details=name+branch; 
        System.out.println("Concatenated strings =   "+details); 
    }
} 
