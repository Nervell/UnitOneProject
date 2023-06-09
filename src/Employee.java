public class Employee {
    private String fullName;
    private String sectionOfWork;
    private int salary;

    private int id;
    private static int counter = 0;

    public Employee(String fullName, String sectionOfWork, int salary) {
        this.fullName = fullName;
        this.sectionOfWork = sectionOfWork;
        this.salary = salary;
        this.id = counter;
        counter++;
    }

    public void setId(int id) {
        this.id = id;
    }


    public void setSectionOfWork(String sectionOfWork) {
        this.sectionOfWork = sectionOfWork;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getFullName() {
        return fullName;
    }

    public int getId() {
        return id;
    }

    public String getSectionOfWork() {
        return sectionOfWork;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fullName='" + fullName + '\'' +
                ", sectionOfWork='" + sectionOfWork + '\'' +
                ", salary=" + salary +
                ", id=" + id +
                '}';
    }
}
