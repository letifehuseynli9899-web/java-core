package StaticAndInstanceTasks;

public class Weather {
//Tapşırıq class adı: WeatherTask
//Weather adlı bir class yaradın:
//• city (instance dəyişən, String)
//Tələblər:
//• calculateTemperature() adlı metod yazın
//• Metodun daxilində local dəyişən temperature elan edin
//• Metod daxilində həm city (instance), həm temperature (local) dəyişənini çap edin
    String city;

    public void calculateTemperature(){
        int temperature=28;
        System.out.println(city);
        System.out.println(temperature);
    }
}
