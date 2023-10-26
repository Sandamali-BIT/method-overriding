public class Cricket {
    void play(){
        System.out.println("Batting.");
    }
}
class sriLankanCricket extends Cricket{
    void practice(){
        System.out.println("Practicing.");
        super.play();
    }
    void bawl(){
        System.out.println("Bowling.");
        super.play();
    }
    void catches(){
        System.out.println("Catching.");
        super.play();
    }
}
class cricketTest{
    public static void main(String[] args) {
        sriLankanCricket slc = new sriLankanCricket();
        slc.catches();
        slc.practice();
        slc.bawl();
    }
}
