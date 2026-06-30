package StaticAndInstanceTasks;//• Main metodunda 4 fərqli Book obyekti yaradın
//• Hər obyekt üçün showInfo()-nu çağırın
//• Sonda Book.libraryReport()-u çağırın

public class LibraryTask {
    public static void main(String[] args) {
        Library b1 = new Library("1984", "George Orwell");
        Library b2 = new Library("Hamlet", "William Shakespeare");
        Library b3 = new Library("Don Kixot", "Miguel de Cervantes");
        Library b4 = new Library("Balaca Şahzadə", "Antoine de Saint-Exupéry");
        b1.showInfo();
        b2.showInfo();
        b3.showInfo();
        b4.showInfo();
        Library.libraryReport();
    }
}
