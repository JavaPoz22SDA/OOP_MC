import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CustomerService {
    Scanner scanner = new Scanner(System.in);

    public Employee addEmployee() {
        String name = checkDataString("Podaj imię pracownika.");
        String surname = checkDataString("Podaj nazwisko pracownika.");
        Sex sex = checkSex("Podaj płeć pracownika. K - kobieta, M - mężczyzna.");
        int numberOfDivision = checkDataInt("Podaj numer działu pracownika.");
        float salary = checkDataFloat("Podaj wysokość pensji pracownika.");
        int age = checkDataInt("Podaj wiek pracownika.");
        int kids = checkDataInt("Podaj ile dzieci ma pracownik.");
        boolean maritalStatus = checkDataBoolean("Podaj stan cywilny pracownika. 1 - mężatka/żonaty, 0 - w przeciwnym razie.");
        return new Employee(name, surname, sex, numberOfDivision, salary, age, kids, maritalStatus);
    }

    public String checkDataString(String statement) {
        boolean flag = false;
        String name = "";
        while (!flag) {
            System.out.println(statement);
            String choice = scanner.nextLine().trim().toLowerCase();
            if (!choice.matches("[a-złąęćśżźó]+")) {
                System.out.println("Wprowadzono błędne dane.");
            } else {
                flag = true;
                name = choice.substring(0, 1).toUpperCase() + choice.substring(1).toLowerCase();
            }
        }
        return name;
    }

    public Sex checkSex(String statement) {
        boolean flag = false;
        Sex sex = Sex.M;
        while (!flag) {
            System.out.println(statement);
            String choice = scanner.nextLine().trim();
            if (!choice.matches("[mMkK]")) {
                System.out.println("Wprowadzono błędne dane. Wybierz K lub M");
            } else {
                flag = true;
                choice = choice.toUpperCase();
                if (choice.equals("K")) {
                    sex = Sex.K;
                }
            }
        }
        return sex;
    }

    public int checkDataInt(String statement) {
        boolean flag = false;
        int number = 0;
        while (!flag) {
            System.out.println(statement);
            String choice = scanner.nextLine().trim();
            if (!choice.matches("[0-9]+")) {
                System.out.println("Wprowadzono błędne dane.");
            } else {
                flag = true;
                number = Integer.parseInt(choice);
            }
        }
        return number;
    }

    public float checkDataFloat(String statement) {
        boolean flag = false;
        float number = 0;
        while (!flag) {
            System.out.println(statement);
            String choice = scanner.nextLine().trim();
            if (!choice.matches("^[0-9]+$|^[0-9]+\\.[0-9][0-9]?$")) {
                System.out.println("Wprowadzono błędne dane.");
            } else {
                flag = true;
                number = Float.parseFloat(choice);
            }
        }
        return number;
    }

    public boolean checkDataBoolean(String statement) {
        boolean flag = false;
        boolean number = false;
        while (!flag) {
            System.out.println(statement);
            String choice = scanner.nextLine().trim();
            if (!choice.matches("[01]")) {
                System.out.println("Wprowadzono błędne dane.");
            } else {
                flag = true;
                if (choice.equals(1)) {
                    number = true;
                }
            }
        }
        return number;
    }

    public void eksportToFile(Employee employee) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(employee.getSurname()).append(employee.getName()).append(employee.getSex()).append(employee.getNumberOfDivision())
                .append(employee.getAge()).append(employee.getKids());
        String filePath = stringBuilder.toString();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(employee.toString());
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Employee employeeChoice(ListofEmployee listofEmployee) {
        System.out.println(listofEmployee.toString());
        boolean flag = false;
        Employee employee = null;
        while (!flag) {
            int number = scanner.nextInt();
            if (number < 1 || number > listofEmployee.getNumberOfEmployee()) {
                System.out.println("Nie ma pracownika o takim numerze. Podaj poprawny numer.");
            } else {
                employee = listofEmployee.getListOfEmployee()[number - 1];
                flag = true;
            }
        }
        return employee;
    }
}