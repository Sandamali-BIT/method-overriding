public class oldSchool {
    void learning(){
        System.out.println("1-11 grades");
    }
}
class modernSchool{
    void learning(){
        System.out.println("1-13 grades");
    }
}
class testSchool{
    public static void main(String[] args) {
        modernSchool ms = new modernSchool();
        ms.learning();
    }
}
