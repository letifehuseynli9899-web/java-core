package StaticAndInstanceTasks;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Book {
    public static void main(String[] args) {
        BookTask s1=new BookTask("Salam",400);
        BookTask s2=new BookTask("Sagol",300);
        System.out.println("title "+ s1.title);
        System.out.println("pageCount " + s1.pageCount);
        System.out.println("title " +s2.title);
        System.out.println("pageCount " +s2.pageCount);
    }
}