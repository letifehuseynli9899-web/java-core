package StaticAndInstanceTasks;

public class Company {
//Tapşırıq class adı: CompanyTask
//Company adlı bir class yaradın:
//• employeeName (instance dəyişən, String)
//• officeName (static dəyişən, başlanğıc dəyəri &quot;Bakı&quot;)
//• employeeCount (static int, başlanğıc dəyəri 0)
//Tələblər:
//• Constructor: employeeName-i mənimsətsin və hər çağırışda employeeCount-u 1 artırsın
//• showInfo() adlı instance metodu: employeeName və officeName-i birgə çap etsin
//• officeInfo() adlı static metod: officeName və employeeCount-u birgə çap etsin
//• 5 Company obyekti yaradın, hər biri üçün showInfo()-nu çağırın
//• Sonda Company.officeInfo()-nu bir dəfə çağırın
    String employeeName;
    static String officialName="Baki";
    static int employeeCount=0;

    public Company(String employeeName) {
        this.employeeName=employeeName;
        employeeCount++;
    }
    public void showInfo(){
        System.out.println(employeeName);
        System.out.println(officialName);
    }
    public static void officeInfo(){                                //static ne ucundu?
        System.out.println(officialName);
        System.out.println(employeeCount);
    }
}
