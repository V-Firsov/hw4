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
        int age = 19;
        if (age >= 18) {
            System.out.println("Ты достиг совершеннолетия");
        } else {
            System.out.println("Ты не достиг совершенноелтия");
        }
    }
    public static void task2() {
        System.out.println("Задача 2");
        int temperature = 0;
        if (temperature >= 5) {
            System.out.println("Можно идти без шапки");
        } else {
            System.out.println("Нужнно надеть шапку");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int speed = 80;
        if (speed >= 60) {
            System.out.println("Придется заплатить штраф");
        } else {
            System.out.println("Можно ездить спокойно");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int age = 17;
        if (age < 7 || age <= 18) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить на работу");
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        int age = 13;
        if (age <= 5 || age <14) {
            System.out.println("Если возраст ребенка равен " + age + ", то он может кататься только в сопровождении взрослого");
        } else {
            System.out.println("Если ребенка равен " + age + ", то он может кататься без сопровождения взрослого");
        }

    }

    public static void task6() {
        System.out.println("Задача 6");
        int sitPassengers = 60;
        boolean sitPlaces = sitPassengers < 60;
        if (sitPlaces) {
            System.out.println("Еслии пассажиров " + sitPassengers + ", то в вагне есть сидячие места");
        } else {
            System.out.println("Если пассажиров " + sitPassengers + ", то сидячих мест нет");


        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        int one = 17;
        int two = 40;
        int three = 70;
        if (one > two && one > three) {
            System.out.println("one больше two и three");
        }
        if (two > one && two > three) {
            System.out.println("two больше one и three");
        }
        if (three > one && three > two) {
            System.out.println("three больше one и two");
        } else {
            System.out.println("three меньше one и two");
        }
    }


}