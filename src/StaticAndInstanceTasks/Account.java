package StaticAndInstanceTasks;

public class Account {
    public static void main(String[] args) {
        AccountTask s1=new AccountTask();
        AccountTask s2=new AccountTask();
        AccountTask s3=new AccountTask();
        AccountTask s4=new AccountTask();

        System.out.println(AccountTask.accountCount);
    }
}
