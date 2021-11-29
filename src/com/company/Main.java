package com.company;

public class Main {

    // Переменная фи для золотого сечения
    private final static double PHI = (1 + Math.sqrt(5)) / 2;

    // Переменная точности для золотого сечения
    private final static double EPSILON = 0.001;

    // Начало и конец отрезка
    private static int a = -2, b = 2;


    // Метод запуска определения минимум и максимум функции
    public static void main(String[] args) {
        String min = String.format("%.8f", findMin(a, b, EPSILON));
        System.out.println(min);

        String max = String.format("%.8f", findMax(a, b, EPSILON));
        System.out.println(max);
    }

    // Здесь прописываем нашу функцию
    private static double f(double x){
        return Math.pow(x, 3) + 2 * Math.pow(x, 2) + 1;
    }

    // Находим минимум функции
    private static double findMin(double a, double b, double e){
        System.out.println("Поиск минимума функции");
        int i = 1;
        double x1, x2;
        while (true){
            System.out.println("Шаг №" + i);

            System.out.println("Вычисляем 2 точки на интервале: " + String.format("%.8f", a) + " " + String.format("%.8f", b));
            x1 = b - (b - a) / PHI;
            System.out.println("x1 = " +  String.format("%.8f", x1));
            x2 = a + (b - a) / PHI;
            System.out.println("x2 = " +  String.format("%.8f", x2));

            System.out.println("Вычисляем значение функции в этих точках");
            System.out.println("f(x1) = " +  String.format("%.8f", f(x1)));
            System.out.println("f(x2) = " +  String.format("%.8f", f(x2)));
            if (f(x1) >= f(x2)) {
                System.out.println("f(x1) >= f(x2), поэтому точке а присваиваем значение " + String.format("%.8f", x1));
                a = x1;
            }
            else {
                System.out.println("f(x1) < f(x2), поэтому точке b присваиваем значение " + String.format("%.8f", x2));
                b = x2;
            }

            // Если между a и b разница меньше погрешности останавливаем программу
            if (Math.abs(b - a) < e) {
                System.out.println("Разница между а и б составляет меньше " + e);
                System.out.println("Выводим результат");
                break;
            }
            i++;
        }
        // Возвращаем результат как середину интервала [a,b]:
        return (a + b) / 2;
    }

    // Находим максимум функции
    private static double findMax(double a, double b, double e){
        System.out.println("Поиск максимума функции");
        int i = 1;
        double x1, x2;
        while (true){
            System.out.println("Шаг №" + i);

            System.out.println("Вычисляем 2 точки на интервале: " + String.format("%.8f", a) + " " + String.format("%.8f", b));
            x1 = b - (b - a) / PHI;
            System.out.println("x1 = " + String.format("%.8f", x1));
            x2 = a + (b - a) / PHI;
            System.out.println("x2 = " + String.format("%.8f", x2));

            System.out.println("Вычисляем значение функции в этих точках");
            System.out.println("f(x1) = " + String.format("%.8f", f(x1)));
            System.out.println("f(x2) = " + String.format("%.8f", f(x2)));
            if (f(x1) <= f(x2)) {
                System.out.println("f(x1) <= f(x2), поэтому точке а присваиваем значение " + String.format("%.8f", x1));
                a = x1;
            }
            else {
                System.out.println("f(x1) < f(x2), поэтому точке b присваиваем значение " + String.format("%.8f", x2));
                b = x2;
            }

            // Если между a и b разница меньше погрешности останавливаем программу
            if (Math.abs(b - a) < e) {
                System.out.println("Разница между а и б составляет меньше " + e);
                System.out.println("Выводим результат");
                break;
            }
            i++;
        }
        // Возвращаем результат как середину интервала [a,b]
        return (a + b) / 2;
    }
}
