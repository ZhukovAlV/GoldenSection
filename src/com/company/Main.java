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
        System.out.print("Максимум фунции равен ");
        System.out.println(findMin(a, b, EPSILON));

        System.out.print("Минимум фунции равен ");
        System.out.println(findMin(a, b, EPSILON));
    }

    // Здесь прописываем нашу функцию
    private static double f(double x){
        return Math.pow(x, 3) + 2 * Math.pow(x, 2) + 1;
    }

    // Находим минимум функции
    private static double findMin(double a, double b, double e){
        double x1, x2;
        while (true){
            x1 = b - (b - a) / PHI;
            x2 = a + (b - a) / PHI;
            if (f(x1) >= f(x2))
                a = x1;
            else
                b = x2;
            if (Math.abs(b - a) < e)
                break;
        }
        return (a + b) / 2;
    }

    // Находим максимум функции
    private static double findMax(double a, double b, double e){
        double x1, x2;
        while (true){
            x1 = b - (b - a) / PHI;
            x2 = a + (b - a) / PHI;
            if (f(x1) <= f(x2))
                a = x1;
            else
                b = x2;
            if (Math.abs(b - a) < e)
                break;
        }
        return (a + b) / 2;
    }
}