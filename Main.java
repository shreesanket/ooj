import java.util.Scanner;
class Book{
    String name,author;
    int price,num_pages;
    Book(String name,String author,int price,int num_pages){
        this.name=name;
        this.author=author;
        this.price=price;
        this.num_pages=num_pages;
    }
    public String toPrintString(){
        String name,author,price,num_of_pages;
        name="name:"+this.name+"\n";
        author="author:"+this.author+"\n";
        price="price:"+this.price+"\n";
        num_of_pages="no of pages:"+this.num_pages+"\n";
        return name+author+price+num_of_pages;
    }
}

class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        String name,author;
        int price,num_pages;
        int num;
        System.out.println("enter the no of books:\n");
        num=s.nextInt();
        Book b[];
        b=new Book[num];
        for(int i=0;i<num;i++){
            System.out.println("enter the name of book:\n");
            name=s.next();
            System.out.println("enter the author of book:\n");
            author=s.next();
            System.out.println("enter the price of book:\n");
            price=s.nextInt();
            System.out.println("enter the no of pages of book:\n");
            num_pages=s.nextInt();
            b[i]=new Book(name,author,price,num_pages);
            System.out.println("NAME:SHREE SANKET"+" 1"+"USN:1BM22CS261");

        }

        for(int i=0;i<num;i++){
               System.out.println(b[i].toPrintString());
        }
    }
}