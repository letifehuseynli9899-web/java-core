package StaticAndInstanceTasks;

public class Library {
//Tapşırıq class adı: LibraryTask
//Kitabxana sistemi yaradın. Book adlı class-da:
//• title, author (instance dəyişənlər, String)
//• bookCount (static int, başlanğıc dəyəri 0)
//• LIBRARY_NAME (static final String, dəyəri &quot;Mərkəzi itabxana&quot;)
//Tələblər:
//• Constructor: title və author-u mənimsətsin, hər çağırışda bookCount-u 1 artırsın
//• İnstance metod showInfo(): kitabın title, author və kitabxana adını çap etsin (this açar
//sözündən istifadə edin)
//• Static metod libraryReport(): LIBRARY_NAME və bookCount dəyərlərini çap etsin
//• Main metodunda 4 fərqli Book obyekti yaradın
//• Hər obyekt üçün showInfo()-nu çağırın
//• Sonda Book.libraryReport()-u çağırın
    String title;
    String author;
    static int bookCount=0;
    static final String libraryName="Merkezi Kitabxana";

    public Library(String title,String author){
        this.author=author;
        this.title=title;
        bookCount++;
    }
    public void showInfo(){
        System.out.println(title);
        System.out.println(author);
        System.out.println(libraryName);
    }
    public static void libraryReport(){
        System.out.println(libraryName);
        System.out.println(bookCount);
    }
}
