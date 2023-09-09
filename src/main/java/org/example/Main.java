package org.example;

public class Main {
    public static void main(String[] args) {

        double a[] = {1.5,2.8,5.6,2.4,8.9,4.1,7.1};
        double b[] = {5.2,4.8,4.9,7.8,9.1,1.1,5.4};

        double res [] = new double[7];

        for (int i = 0; i < res.length; i++){
            res[i] = a[i] * b[i];
        }

        for (int i = 0; i < res.length; i++){
            System.out.println(" Result array " + i + " : " + res[i]);
        }






    }
}