public class Main {
    public static void main(String[] args) {
    task1();
    task2();
    task3();
    task4();
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

        public static void task2 () {
            System.out.println("Задача 2");
            int temperature = 5;
            System.out.println("На улице " + temperature + " градусов,");
            if (temperature <= 5) {
                System.out.println("нужно надеть шапку");
            } else {
                System.out.println("можно идти без шапки");
            }
        }
        public static void task3() {
            System.out.println("Задача 3");
            int speed = 14;
            System.out.println("Если скорость " + speed + ", то");
            if (speed <= 60) {
                System.out.println("можно ездить спокойно");
            } else {
                System.out.println("придётся заплатить штраф");
            }
        }
        public static void task4() {
        System.out.println("Задание 4");

    }
}