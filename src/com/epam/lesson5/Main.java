package com.epam.lesson5;

import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static int[] sumArrays(int[] arr1, int[] arr2) {
        int sum[] = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            sum[i] = arr1[i] + arr2[i];
        }
        return sum;
    }

    public static int[] filterArray(int[] arr, String key) {
        int filter[] = new int[arr.length];
        int count = 0;
        switch (key) {
            case "positive": {
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] > 0) {
                        filter[count] = arr[i];
                        count++;
                    }
                }
                break;
            }
            case "negative": {
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] < 0) {
                        filter[count] = arr[i];
                        count++;
                    }
                }
                break;
            }
        }
        filter = Arrays.copyOf(filter, count);
        return filter;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//      ********** TASK #1 **********
        System.out.println("********** TASK #1 **********");
        System.out.print("Enter array length:->");
        int arrayLength = input.nextInt();
        System.out.println();
        int[] array1 = new int[arrayLength];
        int[] array2 = new int[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            array1[i] = (int) (Math.random() * 100 - 50);
            array2[i] = (int) (Math.random() * 100 - 50);
        }

        System.out.println("Source array #1:");
        for (int elem : array1) {
            System.out.print(elem + " ");
        }
        System.out.println();

        System.out.println("Source array #2:");
        for (int elem : array2) {
            System.out.print(elem + " ");
        }
        System.out.println();

        int[] sum = sumArrays(array1, array2);
        System.out.println("Sum of arrays:");
        for (int elem : sum) {
            System.out.print(elem + " ");
        }
        System.out.println();

//      ********** TASK #2 **********
        System.out.println("********** TASK #2 **********");
        System.out.print("Enter array length:->");
        arrayLength = input.nextInt();
        System.out.println();
        int[] array = new int[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            array[i] = (int) (Math.random() * 100 - 50);
        }
        System.out.println("Source array:");
        for (int elem : array) {
            System.out.print(elem + " ");
        }
        System.out.println();

        int[] arrayPositive = filterArray(array, "positive");
        int[] arrayNegative = filterArray(array, "negative");

        System.out.println("Positive array:");
        for (int elem : arrayPositive) {
            System.out.print(elem + " ");
        }
        System.out.println();

        System.out.println("Negative array:");
        for (int elem : arrayNegative) {
            System.out.print(elem + " ");
        }
        System.out.println();

    }
}

