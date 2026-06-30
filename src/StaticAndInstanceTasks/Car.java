package StaticAndInstanceTasks;

public class Car {
//    Tapşırıq class adı: CarTask
//    Car adlı bir class yaradın:
//            • licensePlate (instance dəyişən, String, hər maşının öz nömrəsi olur
//            • wheelCount (static dəyişən, başlanğıc dəyəri 4, bütün maşınlar üçün ortaq
//            Tələblər:
//            • 3 Car obyekti yaradın, hər birinə fərqli licensePlate verin
//            • Hər obyektin licensePlate dəyərini ayrıca çap edin
//            • wheelCount dəyərini Car.wheelCount ilə bir dəfə çap edin
    String licensePlate;
    static int wheelCount=4;
    public Car(String licensePlate){
        this.licensePlate=licensePlate;
    }

}
