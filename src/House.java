public class House {
    House(){
        System.out.println("All family members in the home.");
    }
}
class Room extends House{
    Room(){
        super();
        System.out.println("Son in the room.");
    }

    public static void main(String[] args) {
        Room r = new Room();
    }
}

