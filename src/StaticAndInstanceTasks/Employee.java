package StaticAndInstanceTasks;

public class Employee {
//    Tapşırıq class adı: EmployeeTask
//    Employee adlı bir class yaradın. Aşağıdaki instance dəyişənləri əlavə edin:
//            • name (String tipi)
//• salary (double tipi)
//    Tələblər:
//            • Constructor-da this.name və this.salary istifadə edərək dəyərləri mənimsədin
//
//• showSalary() adlı instance metodu yazın: this.salary dəyərini çap etsin
//• Üç Employee obyekti yaradın və metodu hər biri üçün çağırın
    String name;
    double salary;
    public Employee(String name,double salary){
        this.name=name;
        this.salary=salary;
    }

    public void showSalary(){
        System.out.println(this.salary);
    }
}
