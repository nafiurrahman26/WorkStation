abstract class Animal{
    abstract void walk();
    public void eat(){
        System.out.println("Hi");
    }
}
class Hours extends Animal{
    public void walk(){
        System.out.println("Walk on 4 legs");
    }
}
class Chicken extends Animal{
    public void walk(){
        System.out.println("Walk on 2 leg");
    }
}

public class OppsAnimal {
    public static void main(String[] args){
        Hours hours=new Hours();
        hours.eat();
    }
}
