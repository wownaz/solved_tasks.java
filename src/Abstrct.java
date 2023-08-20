public class Abstrct {
    public static void main(String[]args) {
        Client client = new Client("Bob","Apple");
        client.display();
        Employee employee = new Employee("Alex","Google");
        employee.display();
    }

}
abstract class Person{
    private String name;
    public String getName(){
        return name;
    }
    public Person(String name){
        this.name = name;
    }
}
class Client extends Person{
    private String bank;
    public Client(String name, String company) {
        super(name);
        this.bank = company;
    }
    public void display(){
        System.out.printf("Client Name: %s \t Bank: %s \n", super.getName(), bank);
    }
}
class Employee extends Person{
    private String bank;
    public Employee(String name, String company) {
        super(name);
        this.bank = company;
    }
    public void display(){
        System.out.printf("Employee Name: %s \t Bank: %s \n", super.getName(), bank);
    }
}
