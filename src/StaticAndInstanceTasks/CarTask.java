package StaticAndInstanceTasks;

public class CarTask {
    public static void main(String[] args) {
        Car s1=new Car("10-AA-111");
        Car s2=new Car("20-BB-222");
        Car s3=new Car("30-CC-333");

        System.out.println(s1.licensePlate);
        System.out.println(s2.licensePlate);
        System.out.println(s3.licensePlate);

        System.out.println(Car.wheelCount);
    }
}
