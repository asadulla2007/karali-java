package com.company;

import java.util.Scanner;

import static java.lang.System.in;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner scanner = new Scanner(in);
        System.out.println("Calculator");

        int num1 = scanner.nextInt();
        scanner = new Scanner(in);
        String str = scanner.nextLine();
        int num2 = scanner.nextInt();
        int res = 0;

        switch ( str){

            case "+"->{

                res = num1+num2;
                System.out.println(num1+" + "+num2+" = "+res);
            }
            case "-"->{

                res = num1-num2;
                System.out.println(num1+" - "+num2+" = "+res);
            }
            case "*"->{

                res = num1*num2;
                System.out.println(num1+" * "+num2+" = "+res);
            }
            case "/"->{

                res = num1/num2;
                System.out.println(num1+" / "+num2+" = "+res);
            }
        }

    }
}
