public class Monkey {
    void climb(){
        System.out.println("Monkey is climbing on to a tree by using it's body strength.");
    }
}
class Man extends Monkey{
    void climb(){
        System.out.println("Man is climbing on to a tree by using a ladder");
    }
}
class Test{
    public static void main(String[] args) {
        Monkey monkey = new Monkey();
        Man man = new Man();
        monkey.climb();
        man.climb();
    }
}

