abstract class Bird{
    abstract void fly();
    abstract void makeSound();
}

class Eagle extends Bird{
    void fly(){
        System.out.println("Eagle soars high in the sky.");
    }
    void makeSound(){
        System.out.println("Eagle makes screeching sound. " );
    }
}

class Hawk extends Bird{
    void fly(){
        System.out.println("Hawk glides  in the air.");
    }
    void makeSound(){
        System.out.println("Hawk emits a distinct cry " );
    }
}

class BirdMain{
    public static void main(String[] args) {
        Eagle e=new Eagle();
        e.fly();
        e.makeSound();
        Hawk h=new Hawk();
        h.fly();
        h.makeSound();

    }
}

