package StaticAndInstanceTasks;

public class Student {
    //Tapşırıq class adı: StudentTask
    //Student adlı bir class yaradın. Constructor yazmayın. Aşağıdaki instance dəyişənləri əlavə edin:
    //• name (String tipi)
    //• groupNumber (String tipi)
    //Tələblər:
    //• Main metodunda obyekt yaradın
    //• Dəyərləri obyekt vasitəsilə təyin edin: student.name = &quot;...&quot;;
    //• printInfo() adlı instance metodu yazın və çağırın
    //• Şərh sətirində bu üsulu Tapşırıq 3-dəki this üsulu ilə müqayisə edin
    String name;
    String groupnumber;
    public void printinfo(){
        System.out.println("name "+name);
        System.out.println("groupnumber "+groupnumber);
    }
}
