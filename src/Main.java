public class Main {
    public static void main(String[] args) {
    task1();
    }
    public static void task1 () {
        System.out.println("Задача 1");
        int age = 18;
        System.out.println("Если возраст человека равен " + age + ", то");
        if (age >= 18) {
            System.out.println("он совершеннолетний");
        } else {
            System.out.println("он не достиг совершеннолетия, нужно немного подождать");
        }

    }
}