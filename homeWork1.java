import java.util.Scanner;

public class homeWork1
{

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Запуск");
            System.out.println("1: greetings");
            System.out.println("2: checkSign");
            System.out.println("3: selectColor");
            System.out.println("4: compareNumbers");
            System.out.println("5: addOrSubtractAndPrint");
            System.out.println("0: Выход");
            int ch = scanner.nextInt();
            int input = 0;
            switch (ch) {
                case 1:
                    greetings();
                    break;
                case 2:
                    System.out.println("Выберите способ ввода: 0 - ручной ввод; 1 - случайные числа");
                    input = scanner.nextInt();
                    if (input == 0) {
                        System.out.println("Введите 3 числа");
                        int a = scanner.nextInt();
                        int b = scanner.nextInt();
                        int c = scanner.nextInt();
                        checkSign(a, b, c);
                    } else {
                        int a = (int) (Math.random() * 100);
                        int b = (int) (Math.random() * 100);
                        int c = (int) (Math.random() * 100);
                        System.out.println("Получены следующие случайные числа: " + a + " + " + b + " + " + c);
                        checkSign(a, b, c);
                    }

                    break;
                case 3:
                    System.out.println("Выберите способ ввода: 0 - ручной ввод; 1 - случайные числа");
                    input = scanner.nextInt();
                    if (input == 0) {
                        System.out.println("Введите число");
                        int data = scanner.nextInt();
                        selectColor(data);
                    } else {
                        int data = (int) (Math.random() * 100);
                        System.out.println("Получено следующее случайное число: " + data);
                        selectColor(data);
                    }
                    break;
                case 4:
                    System.out.println("Выберите способ ввода: 0 - ручной ввод; 1 - случайные числа");
                    input = scanner.nextInt();
                    if (input == 0) {
                        System.out.println("Введите 2 числа");
                        int n1 = scanner.nextInt();
                        int n2 = scanner.nextInt();
                        compareNumbers(n1, n2);
                    } else {
                        int n1 = (int) (Math.random() * 100);
                        int n2 = (int) (Math.random() * 100);
                        System.out.println("Получены следующие случайные числа: " + n1 + " + " + n2);
                        compareNumbers(n1, n2);
                    }
                    break;
                case 5:
                    System.out.println("Выберите способ ввода: 0 - ручной ввод; 1 - случайные числа");
                    input = scanner.nextInt();
                    if (input == 0) {
                        System.out.println("введите 2 числа");
                        int initValue = scanner.nextInt();
                        int delta = scanner.nextInt();

                        System.out.println("Введите true если прибавить, введите false если вычесть");
                        boolean increment = scanner.nextBoolean();
                        addOrSubstractAndPrint(initValue, delta, increment);
                    } else {
                        int initValue = (int) (Math.random() * 100);
                        int delta = (int) (Math.random() * 100);

                        System.out.println("Введите true если прибавить, введите false если вычесть");
                        boolean increment = scanner.nextBoolean();
                        addOrSubstractAndPrint(initValue, delta, increment);
                    }
                    break;
                case 0:
                    System.out.println("Завершение программы");
                    return;
            }
        }
    }
//        checkSign(2, 2, 3);
//        greetings();
//        selectColor(17);
//        compareNumbers(115, 114);
//        addOrSubstractAndPrint(2,3,true);

public static void greetings() {
    System.out.println("hello");
    System.out.println("World");
    System.out.println("from");
    System.out.println("Java");

}

public static void checkSign(int a, int b, int c)
{
    int s = a + b + c;
    if ((s % 2) == 0) {
        System.out.println(" число четное ");
        if (s >= 0) {
            System.out.println(" число положительное ");
        } else {
            System.out.println(" число отрицательное ");
        }
    } else {
        System.out.println("число нечетное");
        if (s >= 0) {
            System.out.println(" число положительное ");
        } else {
            System.out.println(" число отрицательное ");
        }
    }
}

public static void selectColor(int data)
{
    if (data <= 10) {
        System.out.println("Красный");
    } else if (data <= 20) {
        System.out.println("Желтый");
    } else {
        System.out.println("Красный");
    }
}

public static void compareNumbers(int a, int b)
{
    if (a >= b) {
        System.out.println(a + ">=" + b);
    } else {
        System.out.println(a + "<" + b);

    }
}

public static void addOrSubstractAndPrint(int initValue, int delta, boolean increment)
{
    if (increment) {
        System.out.println(initValue + " + " + delta + " = " + (initValue + delta));
    } else {
        System.out.println(initValue + " - " + delta + " = " + (initValue - delta));
    }
}
}