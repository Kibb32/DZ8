package com.company;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        for (int i=5; i>=1; i--){
            for (int j=1;j<=i; j++){
                System.out.printf("%-4d",1);
            }
            System.out.println();
        }
    }
}
