package com.teachmeskills.hw.lesson_7.Task_1;

import java.util.Scanner;

public class ApplicationRunner {
    public static void main(String[] args) {
        System.out.println("Position codes:");
        System.out.println("1 - Worker");
        System.out.println("2 - Accountant");
        System.out.println("3 - Director");
        System.out.println("Enter the code of position: ");

        Scanner scanner = new Scanner(System.in);
        int position = scanner.nextInt();
        switch (position) {
            case 1: {
                Worker worker = new Worker();
                worker.jobName();
                break;
            }
            case 2: {
                Accountant accountant = new Accountant();
                accountant.jobName();
                break;
            }
            case 3: {
                Director director = new Director();
                director.jobName();
                break;
            }
            default:
                System.out.println("Invalid position");
        }
    }
}
