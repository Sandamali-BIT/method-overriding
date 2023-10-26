public class Student {
    void write(){
        System.out.println("Students are writing by using blue pen.");
    }
}
class Teacher extends Student{
    @Override
    void write() {
        System.out.println("Teachers are writing by using red pen.");
    }
   public static void main(String[] args) {
       Teacher t = new Teacher();
       t.write();
   }
}

