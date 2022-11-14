public class Main {
    public static void main(String[] args) {

// Задание 3.1.
        int SkyManAge = 102;
        if (SkyManAge >= 2 && SkyManAge <= 6) {
            System.out.println("Если возраст человека " + SkyManAge + ", то ему только в дет.сад");
        } else {
            if (SkyManAge >= 7 && SkyManAge < 18) {
                System.out.println("Если возраст человека " + SkyManAge + ", то школа - второй дом");
            } else {
                if (SkyManAge >= 18 && SkyManAge <= 24) {
                    System.out.println("Если возраст человека " + SkyManAge + ", то Универ - последний рывок");
                } else {
                    if (SkyManAge > 24) {
                        System.out.println("Если возраст человека " + SkyManAge + ", то... работа, пенсия, Рай не Земной !!!");
                    } else {
                        System.out.println("Ещё малыш...");
                    }
                }
            }
        }
        System.out.println("---------------------------");

// Задание 3.2.
        int ChildAge = 14;
        if (ChildAge < 5) {
            System.out.println(ChildAge + " год(а). Ребёнок может только смотреть на карусель.");
        } else {
            if (ChildAge >= 5 && ChildAge < 14) {
                System.out.println(ChildAge + " лет. Ребёнок может прокатиться на аттракционе, но только в сопровождении взрослого.");
            } else {
                System.out.println(ChildAge + " лет. Ребёнок подрос - катайся сам дитятитко :)))");
            }
        }
        System.out.println("---------------------------");

// Задание 3.3.
        int one = 7;
        int two = 3;
        int three = 7;
        int Max = one;
        if (one == two && one == three) {
            System.out.println("Все три числа равны. Max = " + Max);
        }
        if (one == two && one > three) {
            System.out.println("Max число 1 и 2 - " + Max);
        } else { if (one == two && one < three)
            System.out.println("Max число 3 - " + Max);
        }
        if (one == three && one > two) {
            System.out.println("Max число 1 и 3 - " + Max);
        } else { if (one == three && one < two)
            System.out.println("Max число 2 - " + Max);
        }
        if (two == three && two > one) {
            Max = two;
            System.out.println("Max число 2 и 3 - " + Max);
        } else { if (two == three && two <one)
            System.out.println("Max число 1 - " + Max);
        }
        if (one > two && one > three) {
            System.out.println("Max число 1 - " + Max);
        } else {
            if (one > two && one < three) {
                Max = three;
                System.out.println("Max число 3 - " + Max);
            }
        }
        if (two > one && two > three) {
            Max = two;
            System.out.println("Max число 2 - " + Max);
        } else { if (two > one && two < three) {
            Max = three;
            System.out.println("Max число 3 - " + Max);
        }
        }
        System.out.println("---------------------------");
    }
}