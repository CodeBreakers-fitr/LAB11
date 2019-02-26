package by.bntu.fitr.povt.codebreakers.lab11.controller;

import by.bntu.fitr.povt.codebreakers.lab11.model.logic.ArrayWorker;
import by.bntu.fitr.povt.codebreakers.lab11.util.ArrayInitializer;
import by.bntu.fitr.povt.codebreakers.lab11.view.Printer;
import java.util.Arrays;

public class Lab11 {

    public static void main(String[] args) {
        int size = 10;
        int [] array = new int[size];
        ArrayInitializer.rndInit(array, -10, 10);
        int max = ArrayWorker.findsMaxModuleNumber(array);
        int sum = ArrayWorker.finsSumOfElementsAfterFirstPositiveNumber(array);
        double result = ArrayWorker.сalculateSumBetweenFirstAndLastNegativeElements(array);
        double sumOfOddElements = ArrayWorker.calculateSumOfOddElements(array);
        Printer.print("\nArray: " + Arrays.toString(array));
        Printer.print("\nMaximum number of array under the module: |" + max +"|");
        Printer.print("\nThe sum of the elements of the array after the first positive number: " + sum);
        Printer.print("\nCalculate Sum Between First And Last Negative Elements: " 
                + result);
         Printer.print("\nSum Of Odd Elements: " + sumOfOddElements);
        

    }

}
