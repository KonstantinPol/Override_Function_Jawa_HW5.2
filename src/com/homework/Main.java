package com.homework;

public class Main {

    public static void main(String[] args) {


        System.out.println("Average "+ findAverage(3,5,8) );

        System.out.println("Average "+ findAverage(3.6, 7.9, 10) );

        int[] intArray = {15,20,56,98,100};
        System.out.println("Average "+ findAverage(intArray));

        double[] doubleArray = {5.0, 12.6, 67.9, -13.6, -43.2};
        System.out.println("Average "+ findAverage(doubleArray));

    }
    // int
    static int findAverage(int a, int b, int c){

        int average = (a+b+c)/3;
       return average;
    };
    // double
    static double findAverage(double a, double b, double c){

        double average = (a+b+c)/3d;
        return average;
    };

    //int Array
    static int findAverage(int[] a){

        int average =0;
        for(int i=0; i<a.length; i++){
            average +=a[i];
        }
        return average/a.length;
    };

    //double Array
    static double findAverage(double[] a){

        double average =0;
        for(int i=0; i<a.length; i++){
            average +=a[i];
        }
        return average/a.length;
    };


}
