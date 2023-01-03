public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int age = 18;
        System.out.println("Если возраст человека равен " + age + ", то");
        if (age >= 18) {
            System.out.println("он совершеннолетний");
        } else {
            System.out.println("он не достиг совершеннолетия, нужно немного подождать");
        }
    }

    public static void task2() {
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
        if (speed <= 60) {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        } else {
            System.out.println("Если скорость " + speed + ", то придётся заплатить штраф");
        }
    }

    public static void task4() {
        System.out.println("Задание 4");
        int age = 24;
        System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить ");
        if (age >= 2 && age <= 6) {
            System.out.println("в детский сад");
        } else if (age >= 7 && age <= 18) {
            System.out.println("в школу");
        } else if (age >= 18 && age <= 24) {
            System.out.println("в университет ");
        } else if (age > 24) {
            System.out.println("на работу");
        }
    }

    public static void task5() {
        System.out.println("Задание 5");
        int kidAge = 13;
        System.out.println("Если возраст ребёнка равен " + kidAge + " то ему ");
        if (kidAge < 5) {
            System.out.println("нельзя кататься на аттракционе");
        } else if (kidAge >= 5 && kidAge < 14) {
            System.out.println("можно кататься на аттракционе в сопровождении взрослых");
        } else {
            System.out.println("можно кататься на аттракционе без сопровождения взрослых");
        }
    }

    public static void task6() {
        System.out.println("Задание 6");
        int totalCapacity = 102;
        int seatCapacity = 60;

        int currentPersons = 67;
        if (currentPersons >= seatCapacity) {
            System.out.println("Свободных мест нет");
        } else {
            System.out.println("Есть сидячие места");
        }
    }

    public static void task7() {
        System.out.println("Задание 7");
        int one = 1;
        int two = 2;
        int three = 3;

        if (one > two) {
            if (one > three) {
                System.out.println(one);
            } else {
                System.out.println(three);
            }
        } else {
            if (two > three) {
                System.out.println(two);

            } else {
                System.out.println(three);
            }
        }
    }
}
