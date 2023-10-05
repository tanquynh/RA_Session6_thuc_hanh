package TH4;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        System.out.println("Nhập số a " );
        double a = scanner.nextDouble();
        System.out.println("Nhập số b") ;
        double b = scanner.nextDouble();

        calculator.setA(a);
        calculator.setB(b);
        System.out.println("Tổng 2 số là : " + calculator.add());
        System.out.println("Hiệu 2 số là : " + calculator.sub());
        System.out.println("Nhân 2 số là : " + calculator.mul());
        System.out.println("Chia 2 số là : " + calculator.div());
    }
}
