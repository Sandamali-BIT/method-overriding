public class Employee {
    int age;
    String name;
    Employee(int age, String name){
        this.age=age;
        this.name=name;
    }
}
class Developer extends Employee{
    Double salary;
    Developer(int age, String name,Double salary) {
        super(age, name);
        this.salary=salary;
    }
    void getOutput(){
        System.out.println(age+" "+name+" "+salary);
    }
}
class TestE{
    public static void main(String[] args) {
        Developer d = new Developer(26,"Sandamali",25000.00);
        d.getOutput();
    }
}
