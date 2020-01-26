package com.epam.additional;

import java.util.Scanner;

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
            if (elem > number){
                count ++;
            };
        }
        return count;
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

    }
}
