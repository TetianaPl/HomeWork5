package com.epam.additional;

import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static float arrayAverage(float[] arr) {
        float sum = 0;
        for (float elem : arr) {
            sum += elem;
        }
        return sum / arr.length;
    }

    public static int exceedsValue(float[] arr, float number) {
        int count = 0;
        for (float elem : arr) {
            if (elem > number) {
                count++;
            }
            ;
        }
        return count;
    }

    public static int[] linkArrays(int[] arr1, int[] arr2) {
        int length1 = arr1.length;
        int length2 = arr2.length;
        int[] link = new int[length1 + length2];
        for (int i = 0; i < length1; i++) {
            link[i] = arr1[i];
        }
        for (int i = 0; i < length2; i++) {
            link[length1 + i] = arr2[i];
        }
        return link;
    }

    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int elem : arr) {
            if (min > elem) {
                min = elem;
            }
        }
        return min;
    }

    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int elem : arr) {
            if (max < elem) {
                max = elem;
            }
        }
        return max;
    }

    public static int[] compress(int[] arr, int number) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                count++;
                if (count > 1) {
                    for (int j = i; j < arr.length - count + 1; j++) {
                        arr[j] = arr[j + 1];
                    }
                }
            }
        }
        arr = Arrays.copyOf(arr, arr.length - count + 1);
        return arr;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //      ********** TASK I **********
        System.out.println("********** TASK I **********");
        System.out.print("Enter array length:->");
        int arrayLength = input.nextInt();
        System.out.println();
        float[] array = new float[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            array[i] = (float) (Math.random() * 100 - 50);
        }

        System.out.println("Source array:");
        for (float elem : array) {
            System.out.print(elem + " ");
        }
        System.out.println();

        float average = arrayAverage(array);
        System.out.println("Average of array: " + average);

        int exceedsAverage = exceedsValue(array, average);
        System.out.println("Exceeds average of array: " + exceedsAverage + " elements");

        //      ********** TASK II **********
        System.out.println('\n' + "********** TASK II **********");
        System.out.print('\n' + "Enter array 1 length:->");
        int array1Length = input.nextInt();
        System.out.println();
        int[] array1 = new int[array1Length];

        for (int i = 0; i < array1Length; i++) {
            array1[i] = (int) (Math.random() * 100 - 50);
        }

        System.out.println("Source array #1:");
        for (int elem : array1) {
            System.out.print(elem + " ");
        }
        System.out.println();

        System.out.print('\n' + "Enter array 2 length:->");
        int array2Length = input.nextInt();
        System.out.println();
        int[] array2 = new int[array2Length];

        for (int i = 0; i < array2Length; i++) {
            array2[i] = (int) (Math.random() * 100 - 50);
        }

        System.out.println("Source array #2:");
        for (int elem : array2) {
            System.out.print(elem + " ");
        }
        System.out.println();

        int[] concatenation = linkArrays(array1, array2);
        System.out.println('\n' + "Concatenation of arrays:");
        for (int elem : concatenation) {
            System.out.print(elem + " ");
        }
        System.out.println();

        //      ********** TASK III **********
        System.out.println('\n' + "********** TASK III **********");
        System.out.print('\n' + "Enter array length:->");
        arrayLength = input.nextInt();
        System.out.println();
        int[] array3 = new int[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            array3[i] = (int) (Math.random() * 100 - 50);
        }

        System.out.println("Source array:");
        for (int elem : array3) {
            System.out.print(elem + " ");
        }
        System.out.println();
        int min = findMin(array3);
        int max = findMax(array3);
        System.out.println("Min = " + min + ", max = " + max);

        array3 = compress(array3, min);
        array3 = compress(array3, max);

        System.out.println("Compressed array:");
        for (int elem : array3) {
            System.out.print(elem + " ");
        }
    }
}
