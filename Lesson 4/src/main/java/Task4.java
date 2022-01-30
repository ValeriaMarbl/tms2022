import java.util.Random;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        taskOne();
        taskTwo();
        taskThree();
        taskFour();
        printArray();
        System.out.println(operation(1));
        System.out.println(operation(0));
        System.out.println(calculateCountOfOddElementsInMatrix(new int[]{1, 2, 3, 4, 5, 6}));
        countDevs(103);
        countDevs(11);
        foobar(6);
        foobar(10);
        foobar(15);
        printPrimeNumbers();

        () {
            Random random = new Random();
            int rand = random.nextInt(8);
            switch (rand) {
                case 1:
                    System.out.println("Понедельник");
                    break;
                case 2:
                    System.out.println("Вторник");
                    break;
                case 3:
                    System.out.println("Среда");
                    break;
                case 4:
                    System.out.println("Четверг");
                    break;
                case 5:
                    System.out.println("Пятница");
                    break;
                case 6:
                    System.out.println("Выходной");
                    break;
                case 7:
                    System.out.println("Выходной");
                    break;
                default:
                    System.out.println("default");
            }
        }
//1) Задача на оператор switch!
//        Рандомно генерируется число От 1 до 7.
//        Если число равно 1, выводим на консоль “Понедельник”, 2 –”Вторник” и так далее.
//        Если 6 или 7 – “Выходной”.

        private static int taskTwo() {
            int sum = 1;
            for (int i = 0; i > 24; i = i + 3) {
                sum = sum * 2;
            }
        }
//2) Одноклеточная амеба каждые 3 часа делится на 2 клетки. Определить,
//         сколько амеб будет через 3, 6, 9, 12,..., 24 часа


//3) В переменную записываем число.
//        Надо вывести на экран сколько в этом числе цифр и положительное оно или отрицательное.
//        Например, Введите число: 5
//        "5 - это положительное число, количество цифр = 1"
          private static void taskFour() {
            System.out.println("Введите месяц рождения");
            Scanner scannerMonth = new Scanner(System.in);
            System.out.println("Введите день рождения");
            Scanner scannerDay = new Scanner(System.in);
            switch (scannerMonth.nextInt()) {
                case 1 :
                    if (scannerDay.nextInt() <= 20) {
                        System.out.println("Овен");
                    } else {
                        System.out.println("Телец");
                    }
                    break;
                case 2 :
                    if (scannerDay.nextInt() <= 21) {
                        System.out.println("Телец");
                    } else {
                        System.out.println("Близнецы");
                    }
                    break;
                case 3 :
                    if (scannerDay.nextInt() <= 21) {
                    System.out.println("Близнецы");
                } else {
                    System.out.println("Рак");
                }
                    break;
                case 4 :
                    if (scannerDay.nextInt() <= 22) {
                        System.out.println("Рак");
                    } else {
                        System.out.println("Лев");
                    }
                    break;
                case 5 :
                    if (scannerDay.nextInt() <= 21) {
                        System.out.println("Лев");
                    } else {
                        System.out.println("Дева");
                    }
                    break;
                case 6 :
                    if (scannerDay.nextInt() <= 23) {
                        System.out.println("Дева");
                    } else {
                        System.out.println("Весы");
                    }
                    break;
                case 7 :
                    if (scannerDay.nextInt() <= 23) {
                        System.out.println("Весы");
                    } else {
                        System.out.println("Скорпион");
                    }
                    break;
                case 8 :
                    if (scannerDay.nextInt() <= 24) {
                        System.out.println("Скорпион");
                    } else {
                        System.out.println("Стрелец");
                    }
                    break;
                case 9 :
                    if (scannerDay.nextInt() <= 22) {
                        System.out.println("Стрелец");
                    } else {
                        System.out.println("Козерог");
                    }
                    break;
                case 10 :
                    if (scannerDay.nextInt() <= 23) {
                        System.out.println("Козерог");
                    } else {
                        System.out.println("Водолей");
                    }
                    break;
                case 11 :
                    if (scannerDay.nextInt() <= 23) {
                        System.out.println("Водолей");
                    } else {
                        System.out.println("Рыбы");
                    } break;
                case 12 :
                    if (scannerDay.nextInt() <= 20) {
                        System.out.println("Рыбы");
                    } else {
                        System.out.println("Овен");
                    }
                    break;
                default: System.out.println("default");
            }

        }

    }


    /**
     * Необходимо прочитать с консоли значение числа типа int,
     * сделать проверку что если пользователь ввел не положительное число,
     * то вывести ошибку и отправить пользователя вводить заново новое число!
     * далее создать одномерный массив типа int размера прочитанного с консоли
     * далее заполнить массив случайными значениями
     * далее вывести массив на консоль
     */
    private static void printArray() {
        // тут пишем логику
    }

    /**
     * Метод должен выполнять некоторую операцию с int "number" в зависимости от некоторых условий:
     * - if number положительное число, то необходимо number увеличить на 1
     * - if number отрицательное - уменьшить на 2
     * - if number равно 0 , то замените значение number на 10
     * вернуть number после выполнения операций
     */
    public static int operation(int number) {
        if (number > 0) {
            return number + 1;
        } else if (number < 0) {
            return number - 2;
        } else {
            return 10;
        }
    }

    /**
     * На вход приходит массив целых чисел типа int
     * Необходимо найти количество нечетных элементов в массиве и вернуть значение в метод main,
     * в котором это значение распечатается на консоль.
     */
    public static int calculateCountOfOddElementsInMatrix(int[] ints) {

    }

    /**
     * На вход приходит число.
     * Вывести в консоль фразу из разряда "_COUNT_ программистов",
     * заменить _COUNT_ на число которое пришло на вход в метод и заменить окончание в слове "программистов" на
     * уместное с точки зрения русского языка.
     * Пример: 1 программист, 42 программиста, 50 программистов
     *
     * @param count - количество программистов
     */
    public static void countDevs(int count) {
        // тут пишем логику
    }

    /**
     * Метод должен выводить разные строки в консоли в зависимости от некоторых условий:
     * - если остаток от деления на 3 равен нулю - выведите "foo" (example of number - 6)
     * - если остаток от деления на 5 равен нулю - вывести "bar" (example of number - 10)
     * - если остаток от деления на 3 и 5 равен нулю 0 ,то вывести "foobar" (example of number - 15)
     */
    public static void foobar(int number) {
        if ((number % 3 == 0) & (number % 5 == 0)){
            System.out.println("foobar");
        } else if (number % 3 == 0) {
            System.out.println("foo");
        } else if (number % 5 == 0) {
            System.out.println("bar");
        }
    }

    /**
     * Задача со звездочкой!
     * Метод должен печатать все простые числа <1000
     * что такое просто число (https://www.webmath.ru/poleznoe/formules_18_5.php)
     */
    public static void printPrimeNumbers() {
        // тут пишем логику
    }
}