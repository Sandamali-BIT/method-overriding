public class centralBank {
    int getLoanInterest(){
        return 5;
    }
}
class peoplesBank extends centralBank{
    int getLoanInterest(){
        return 6;
    }
}
class Boc extends centralBank{
    int getLoanInterest(){
        return 7;
    }
}
class Nsb extends centralBank{
    int getLoanInterest(){
        return 8;
    }
}
class testOverride{
    public static void main(String[] args) {
        peoplesBank p = new peoplesBank();
        Boc b = new Boc();
        Nsb n = new Nsb();
        System.out.println(p.getLoanInterest());
        System.out.println(b.getLoanInterest());
        System.out.println(n.getLoanInterest());
    }
}
