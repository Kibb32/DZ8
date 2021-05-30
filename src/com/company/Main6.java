package com.company;

import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        int salary;
        int sum = 0;
        int i;
        int j;
        int quarter=0;

        for (i = 1; i <= 12; i++) {
            for (j = 1; j <= 3; j++) {
                System.out.print("Зарплата сот рутника " + i + " за "+j+" месяц: ");
                salary = input.nextInt();
                sum+=salary;
            }
            System.out.println("Сумма за квартал = "+quarter);
            }
        System.out.println("Общая сумма выплат = "+sum);
        }
    }

