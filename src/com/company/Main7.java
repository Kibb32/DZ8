package com.company;

import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        int salary;
        int sum = 0;
        int i;
        int j;
        int quarter=0;

        for (i = 1; i <= 12; i++) {
            System.out.print("Зарплата сотрудника " + i + " ");
            salary = input.nextInt();

            for (j = 1; j <= 3; j++) {
                System.out.println("Зарплата сотрудника " + i + " за "+j+" месяц: "+salary);
                sum+=salary;
                quarter=salary*3;
            }
            System.out.println("Сумма за квартал = "+quarter);
        }
        System.out.println("Общая сумма выплат = "+sum);
    }
}
