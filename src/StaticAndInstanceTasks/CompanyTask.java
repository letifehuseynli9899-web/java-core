package StaticAndInstanceTasks;

public class CompanyTask {
    public static void main(String[] args) {
        Company s1=new Company("developer");
        Company s2=new Company("muellim");
        Company s3=new Company("hekim");
        Company s4=new Company("muhendis");
        Company s5=new Company("dekan");
        s1.showInfo();
        s2.showInfo();
        s3.showInfo();
        s4.showInfo();
        s5.showInfo();
        Company.officeInfo();


    }
}
