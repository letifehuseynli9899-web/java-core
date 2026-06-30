package StaticAndInstanceTasks;

public class EmployeeTask {
    public static void main(String[] args) {
    Employee s1=new Employee("Murad ",3000);
    Employee s2=new Employee("Gunay ",4000);
    Employee s3=new Employee("Aysel",5000);
    s1.showSalary();
    s2.showSalary();
    s3.showSalary();
    }
}
