public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        employees[0] = new Employee("Franklin Delano Roosevelt", "Constructions", 125000);
        employees[1] = new Employee("Joe Biden", "Master of Sport", 35000);
        employees[2] = new Employee("Donald Trump", "Sales man", 55000);
        employees[3] = new Employee("Harry S. Truman", "High School Teacher", 60000);
        employees[4] = new Employee("Abraham Lincoln", "Mechanic", 110000);
        employees[5] = new Employee("George Washington", "Physiologist", 90000);
        employees[6] = new Employee("Alexandr Hamilton", "Analytic", 150000);
        employees[7] = new Employee("Thomas Jefferson", "Boxer", 30000);
        employees[8] = new Employee("Tim Sullivan", "Doctor", 200000);
        employees[9] = new Employee("Teodor Roosevelt", "Babysitter", 40000);
    }

    public static int countSalary(Employee[] employees) {
        int total = 0;
        for (Employee employee : employees) {
            total += employee.getSalary();
        }
        return total;
    }

    public static void printWorkers(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }
    }

    public static void printWorkersNames(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println("Name of the worker with id " + employee.getId() + " is " + employee.getFullName());
        }
    }

    public static int findAverageSalary(Employee[] employees) {
        return countSalary(employees) / employees.length;
    }

    public static int findIdOfTheLowestSalary(Employee[] employees) {
        int lowest = Integer.MAX_VALUE; int temporary = 0; int result = 0;
        for (Employee employee : employees) {
            if (employee.getSalary() < lowest) {
                lowest = employee.getSalary();
                result = employee.getId();
            }
        }
        return result;
    }

    public static int findIdOfTheHighestSalary(Employee[] employees) {
        int biggest = Integer.MIN_VALUE; int result = 0;
        for (Employee employee : employees) {
            if (employee.getSalary() > biggest) {
                biggest = employee.getSalary();
                result = employee.getId();
            }
        }
        return result;
    }

}