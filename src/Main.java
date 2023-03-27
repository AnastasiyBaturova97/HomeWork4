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
    public static void task1 () {
        System.out.println("Задача 1");
        int age = 27;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " он совершеннолетний.");
        }

        if (age < 18) {
            System.out.println("Если возраст человека равен " + age + " он не достиг совершеннолетия, нужно немного подождать.");
        }
    }
    public static void task2 () {
        System.out.println("Задача 2");
        int degrees = 4;
        if (degrees >= 5) {
            System.out.println("На улице " + degrees + " градусов, можно идти без шапки");
        }

        if (degrees < 5) {
            System.out.println("На улице " + degrees + " градусов, нужно надеть шапку");
        }
    }
    public static void task3 () {
        System.out.println("Задача 3");
        int speed = 65;
        if (speed <= 60) {
            System.out.println("Если скорость " + speed + " км, то можно ездить спокойно");
        }

        if (speed > 60) {
            System.out.println("Если скорость " + speed + " км, то придется заплатить штраф");
        }

    }
    public static void task4 () {
        System.out.println("Задача 4");
        int people = 1;
        if ((people >= 2) && (people <= 6)){
            System.out.println( "Если возраст человека равен " + people + " лет, то ему нужно ходить в детский сад.");
        }
        if (people >= 7 && people <= 18){
            System.out.println("Если человеку" + people + " лет, то ему нужно ходить в школу");
        }
        if (people >= 18 && people <= 24){
            System.out.println("Если человеку больше" + people + " лет, то его место в университете");
        }
        if (people > 24){
            System.out.println( "А если человеку больше " + people + " то ему пора ходить на работу.");
        }
        else {
            System.out.println("Тебе " + people + " год, спи спокойно!");
        }

    }
    public static void task5 () {
        System.out.println("Задача 5");
        int kid = 15;
        if (kid<5){
            System.out.println( "Если возраст ребенка равен " + kid + ", то ему нельзя кататься на аттракционе");
        }
        if (kid>5 && kid<14){
            System.out.println( "Если возраст ребенка равен" + kid + "можно кататься на аттракционе в сопровождении, то ему");
        }
        if (kid >=14){
            System.out.println( "Если возраст ребенка равен " + kid + " то ему можно без сопровождения взрослого");
        }


    }
    public static void task6 () {
        System.out.println("Задача 6");
        int capacity = 102;
        if (capacity > 60) {
            if (capacity > 102) {
                System.out.println("Вагон заполнен");
            } else {
                capacity = capacity - 60;
                System.out.println(" В вагоне занято: 60 сидячих мест");
            }

        } else {
            capacity = 102 - capacity;
            System.out.println("Осталось мест");
        }
    }
    public static void task7 () {
        System.out.println("Задача 7");
        int one = 1;
        int two = 2;
        int three = 3;
        if (one <= two ) {

        }else  {
            if (one >= two) {
                System.out.println("ложь");
            }
        }
        if ( two <= three) {
            System.out.println("three боьше всего");
        }else {
            if (two >= three){
                System.out.println("ложь");
            }
        }

        }


    }

