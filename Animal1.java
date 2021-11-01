//Inheritance
public class Animal1{
    void eat()
    {
        System.out.println("Eating...");
    }
}
class Dog1 extends Animal{
    void bark()
    {
        System.out.println("Barking...");
    }
}
class BabyDog extends Dog1{
    void weep(){
        System.out.println("Weeping...");
    }
}
class TestInheritance2{
    public static void main(String args[]){
        BabyDog d=new BabyDog();
        d.weep();
        d.bark();
        d.eat();
    }
}