package project1.src;

class Employee {
    private int id;
    private String name;

    public Employee(int id, String name){
        this.id = id;
        this.name = name;

    }

    public String toString(){
        return ("ID : " + id + " - Full Name: " + name);
    } // enables you to identify your object by creating a string presentation of that

}

public class ToStringMethod {
    public static void main(String[] args) {
        Employee employee1 = new Employee(101, "Asmaa Lafe");
        System.out.println(employee1);
    }
    
}
