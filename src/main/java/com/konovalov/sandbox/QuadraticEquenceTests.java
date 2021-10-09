package com.konovalov.sandbox;

import java.math.BigDecimal;
import java.util.Scanner;

import static java.lang.System.in;
/*
В этом классе проверяю работу вычисления
 */
public class QuadraticEquenceTests {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(in);

        System.out.println("Please enter values for next equation ax^2+bx+c");

        System.out.println("Please enter a");
        double a = scanner.nextDouble();

        System.out.println("Please enter b");
        double b = scanner.nextDouble();

        System.out.println("Please enter c");
        double c = scanner.nextDouble();

        double discriminant = b * b - 4 * a * c;
        if (discriminant > 0) {
            double x1 = (-b - Math.sqrt(discriminant)) / (2 * a);
            double x2 = (-b + Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Корни уравнения: x1 = " + x1 + ", x2 = " + x2);
        } else if (discriminant == 0) {
            double x;
            x = -b / (2 * a);
            System.out.println("Уравнение имеет единственный корень: x = " + x);
        } else {
            System.out.println("Уравнение не имеет действительных корней");
        }
    }
}
