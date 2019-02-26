package by.bntu.fitr.povt.codebreakers.lab11.model.logic;

import static java.lang.Math.abs;

public class ArrayWorker {

    public static int findsMaxModuleNumber(int[] array) {

        int max = 0;
        for (int i = 1; i < array.length; i++) {
            if (abs(max) < abs(array[i])) {
                max = array[i];
            }
        }
        return abs(max);
    }

    public static int finsSumOfElementsAfterFirstPositiveNumber(int[] array) {

        int sum = 0;
        int i = 0;
        while (i < array.length && array[i] <= 0) {
            ++i;
        }

        for (++i; i < 10; ++i) {
            sum += array[i];
        }
        return sum;
    }
     public static double сalculateSumBetweenFirstAndLastNegativeElements(int[] array) {
        int indexStart = 0, indexEnd = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                indexStart = i;
                break;
            }
        }

        for (int i = array.length - 1; i >= indexStart; i--) {
            if (array[i] < 0) {
                indexEnd = i;
                break;
            }
        }

        int sumBetweenFirstAndLastNegativeElements = 0;

        for (int i = indexStart + 1; i < indexEnd; i++) {
            sumBetweenFirstAndLastNegativeElements += array[i];
        }
        return sumBetweenFirstAndLastNegativeElements;
    }

    public static double calculateSumOfOddElements(int[] array) {
        int sumSumOfOddElements = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) {
                sumSumOfOddElements = sumSumOfOddElements + array[i];
            }

        }
        return sumSumOfOddElements;
    }
}
