package com.company;

import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        for (int i=5; i<=9; i++){
            for (int j=9;j>=i; j--){
                System.out.printf("%-4d",i);
            }
            System.out.println();
        }
    }
}
