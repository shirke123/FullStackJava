package ControlFlowStatment;

import java.util.Scanner;

public class ScannerSumOfArray {
    public static  void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        char ch;
        int sum = 0;
        int i;

        do {
            System.out.println("enter the value");
            i=scanner.nextInt();
            sum=sum+i;
            System.out.println("Do you want to continue");
            ch=scanner.next().charAt(0);
        }while (ch=='Y'||ch=='N');
        System.out.println("sum=>"+sum);
    }
}
