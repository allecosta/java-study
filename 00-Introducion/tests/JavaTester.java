package tests;

import java.util.Scanner;

public class JavaTester {

    public static void main(String[] args) {
        String a, b;

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o valor para variavel A: ");
        a = scan.nextLine();

        System.out.println("Informe o valor para variavel B: ");
        b = scan.nextLine();

        System.out.println("O valor informado para variavel A foi " + a);
        System.out.println("O valor informado para variavel B foi " + b);

        scan.close();
    }
}
