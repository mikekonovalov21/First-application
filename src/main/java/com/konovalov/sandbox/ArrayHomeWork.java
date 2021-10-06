package com.konovalov.sandbox;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

import java.util.Arrays;

public class ArrayHomeWork {
    public static final Logger LOGGER = (Logger) LogManager.getLogger(ArrayHomeWork.class);

    public static void main(String[] args) {

        int[] initialArray = new int[]{0, 1, 0, -1, 3, 9, 0, -10, 65};
        // System.out.println(Arrays.toString(initialArray));


    }

    /*
    Вывести элементы числового массива, которые больше, чем элементы, стоящие перед ними.
    Например, дан массив [3, 9, 8, 4, 5, 1]. Следует вывести числа 9 и 5, так как перед ними стоят
    соответственно числа 3 и 4, которые меньше их.
    */

    public int[] getMinMaxElements(int[] initialArray) {
        int minValue = initialArray[0];
        int maxValue = initialArray[0];
        int minInd = 0;
        int maxInd = 0;

        for (int i = 0; i < initialArray.length; i++) {
            if (initialArray[i] < minValue) {
                minValue = initialArray[i];
                minInd = i;
            }
        }
        System.out.println("Min is " + minValue);

        for (int j = 0; j < initialArray.length; j++) {
            if (initialArray[j] > maxValue) {
                maxValue = initialArray[j];
                maxInd = j;
            }
        }
        System.out.println("Max is " + maxValue);

        int temp = initialArray[minInd];
        initialArray[minInd] = initialArray[maxInd];
        initialArray[maxInd] = temp;

        int[] newArray = initialArray;
        System.out.println(Arrays.toString(newArray));
        return newArray;
    }

    /*
    Найти сумму тех элементов массива, которые одновременно имеют четные и отрицательные значения.
    Например, в массиве [3, -5, -2, 4, -8, 0] отрицательными четными элементами
    являются числа -2 и -8. Их сумма равна -10.
     */

    // возможно ли поставить условие сразу в each? иначе много результаов вместо одного
    public int getNegativePairedNumberSum(int[] initialArray) {
        int sum = 0;
        for (int num : initialArray) {
            if (num < 0 && num % 2 == 0) {
                sum += num;
                System.out.println(sum);
            }

        }
        return sum;
    }

    /*
    Вывести элементы числового массива, которые больше, чем элементы, стоящие перед ними.
    Например, дан массив [3, 9, 8, 4, 5, 1]. Следует вывести числа 9 и 5, так как перед ними
    стоят соответственно числа 3 и 4, которые меньше их.
     */
    public int getGreaterElements(int[] initialArray) {
        for (int i = 1; i < initialArray.length; i++) {
            if (initialArray[i] > initialArray[i - 1]) {
                System.out.println("greater value is " + initialArray[i]);
            }

        }
        return initialArray[i]; // нужно додумать что  и как  вернуть

    }

    /*
    Вывести массив на экран. Найти самую длинную последовательность чисел, упорядоченную по возрастанию.
     Вывести ее на экран. Если таких последовательностей несколько (самых длинных с одинаковой длиной),
     то вывести их все.
     */

    // не знаю пока как сделать


}

