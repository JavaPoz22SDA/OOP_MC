import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Employee e = new Employee("Zosia", "Kot", Sex.K,555,5000,25,1,true);
        Employee e1 = new Employee("Adam", "Kot", Sex.M,512,1000,30,0,true);
        Employee e2 = new Employee("Jan", "Kowalczyk", Sex.M,555,5000,40,2,true);
        Employee e3 = new Employee("Anna", "Zuch", Sex.K,514,3000,36,0,false);
        ListofEmployee listofEmployee = new ListofEmployee();
        listofEmployee.add(e);
        listofEmployee.add(e1);
        listofEmployee.add(e2);
        listofEmployee.add(e3);

        Engine engine = new Engine();
        engine.start(listofEmployee);

    }
}
