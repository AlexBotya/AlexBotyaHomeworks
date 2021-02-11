package lesson5;

public class worker {
    public String name;
    public String post;
    public String email;
    public String mobile;
    public int salary;
    public int age;

    public worker (String name, String post, String email, String mobile, int salary, int age){
        this.name = name;
        this.post = post;
        this.email = email;
        this.mobile = mobile;
        this.salary = salary;
        this.age = age;
    }
    public void workerDataPrint(){
        System.out.printf("Имя: %s%n Должность: %s%n email: %s%n телефон: %s%n оклад: %s%n возраст: %s%n",
                name, post,email, mobile, salary, age);
    }
}
