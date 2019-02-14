public class Human {
    // thuoc tinh
    public String name;
    public int age;
    public String phone;

    //ham tao
    public Human() {
        this.name = "No name";
        this.age = 10;
        this.phone = "0123456789";
    }

    public Human(String name, int age, String phone) {
        this.name = name;
        this.age = age;
        this.phone = phone;
    }

    // phuong thuc
    public void eat() {
        System.out.println("Eating..");
    }

    public void sleep(int duration) {
        System.out.println("Sleeping in " + duration + " hours...");
    }
}
