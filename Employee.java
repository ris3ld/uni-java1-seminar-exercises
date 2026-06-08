import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Employee {

    private String name;
    private int age;
    private double salary;

    Employee(String name, int age, double salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName(){
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

    @Override

    public String toString(){
        return name + " age: " + age + " and salary: " + salary;
    }

    private static void printEmp(ArrayList<Employee> x){
        for(Employee emp : x){
            System.out.println(emp);
        }
    }


    public static void main(String[] args){

        ArrayList<Employee> team = new ArrayList<>();
        team.add(new Employee("Sara",39,2800.0));
        team.add(new Employee("Ardit",19,4200.0));
        team.add(new Employee("Lena",24,2200.0));
        team.add(new Employee("Mark",30,3500.0));

        Employee[] newArr = {new Employee("Diana", 22,2000.0),new Employee("Tom",39, 4000.0)};

        System.out.println("The team size before new hires is: " + team.size());


        ArrayList<Employee> newhires = new ArrayList<>(Arrays.asList(newArr));
        team.addAll(newhires);

        System.out.println("The full team size now is: " + team.size());

        printEmp(team);

        System.out.println("================================== sorted a to Z");

        team.sort(Comparator.comparing(Employee::getName));
        printEmp(team);


        System.out.println("================================== sorted by age, youngest");

        team.sort(Comparator.comparing(Employee::getAge));
        printEmp(team);


        System.out.println("================================== sorted by salary, highest");

        team.sort(Comparator.comparing(Employee::getSalary).reversed());
        printEmp(team);


    }
}
