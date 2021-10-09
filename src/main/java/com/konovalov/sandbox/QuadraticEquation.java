package com.konovalov.sandbox;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Scanner;

import static java.lang.System.in;
/*
Домашка - решить квадратное уровнение используя исключительно BigDecimal и BigInteger созданные классы
 */
public class QuadraticEquation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(in);

        System.out.println("Please enter values for next equation ax^2+bx+c");

        System.out.println("Please enter a");
        //double a = scanner.nextDouble();
        BigDecimal a = scanner.nextBigDecimal();

        System.out.println("Please enter b");
        //double b = scanner.nextDouble();
        BigDecimal b = scanner.nextBigDecimal();

        System.out.println("Please enter c");
        //double c = scanner.nextDouble();
        BigDecimal c = scanner.nextBigDecimal();

        //double d = b * b - 4 * a * c;
        BigDecimal discriminant = (b.multiply(b)).subtract((BigDecimal.valueOf(4)).multiply(a).multiply(c));
        System.out.println("discriminant is" + discriminant);

//        if (discriminant > 0) {
        if (discriminant.compareTo(BigDecimal.ZERO) > 0) {
//            //double x1 = (-b - Math.sqrt(discriminant)) / (2 * a);
//            //double x2 = (-b + Math.sqrt(discriminant)) / (2 * a);
            BigDecimal x1 = (b.negate().subtract(discriminant.sqrt(MathContext.DECIMAL32))).divide((BigDecimal.valueOf(2).multiply(a)));
            BigDecimal x2 = (b.negate().add(discriminant.sqrt(MathContext.DECIMAL32))).divide((BigDecimal.valueOf(2).multiply(a)));
            System.out.println("Корни уравнения: x1 = " + x1 + ", x2 = " + x2);
//        } else if (discriminant == 0) {
        } else if (discriminant.compareTo(BigDecimal.ZERO) == 0) {
//            double x;
//            x = -b / (2 * a);
//            System.out.println("Уравнение имеет единственный корень: x = " + x);
            BigDecimal x = b.negate().divide(BigDecimal.valueOf(2).multiply(a));
            System.out.println("Уравнение имеет единственный корень: x = " + x);
        } else {
            System.out.println("Уравнение не имеет действительных корней");
//        } else {
//            System.out.println("Уравнение не имеет действительных корней");
        }
    }
}
