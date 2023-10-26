public class Ball {
    String color = "Pink";
}
class otherBall extends Ball{
    String color = "Red";
    void getColor(){
        System.out.println(color);
        System.out.println(super.color);
    }
}
class testB{
    public static void main(String[] args) {
        otherBall ob = new otherBall();
        ob.getColor();


    }
}
