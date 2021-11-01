//Upcasting
public class Animal{
    void eat()
    {
        System.out.println("Animals eat");
    }
}
class Herbivores extends Animal{
    void eat()
    {
        System.out.println("Herbivores eat plants");
    }
}
class Omnivores extends Animal{
    void eat()
    {
        System.out.println("Omnivores eat both plants and meat");
    }
}
class Carnivores extends Animal{
    void eat()
    {
        System.out.println("Carnivores eat only meat");
    }
}
class Main{
    public static void main(String args[]){
        Animal A = new Animal();
        Animal h = new Herbivores();
        Animal o = new Omnivores();
        Animal c = new Carnivores();
        A.eat();
        h.eat();
        o.eat();
        c.eat();
    }
}