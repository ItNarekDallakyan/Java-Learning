package oop.interfacee.loto;

import java.util.Scanner;

public class Games {
    private int enter_num1;
    private int enter_num2;
    private int money;
    private int count;
    private int countOfmoney;
    private int countInputNumber;
    private int tiv;
    Scanner in = new Scanner(System.in);
    Random_Number random_number = new Random_Number();

    void client_choice() {
        for (; ; ) {
            count++;
            aghyusak();
            System.out.println("Yntreq aghyusakic 2 tiv");
            input_money(check_number(enter_num1), check_number(enter_num2));
            countOfmoney = 0;
            yes_no();
        }
    }

    void aghyusak() {
        System.out.println("\t--------------------------------------");
        for (int i = 0; i < 80; i += 10) {
            for (int j = 1; j < 11; j++) {
                System.out.print("\t" + (j + i));
            }
            System.out.println();
        }
        System.out.println("\t--------------------------------------");
    }

    int check_number(int enter_num) {
        tiv++;
        for (int i = 0; i < 5; i++) {
            System.out.println("Mutqagreq " + tiv + " tivy");
            enter_num = in.nextInt();
            if (enter_num < 1 || enter_num > 80) {
                countInputNumber++;
                System.out.println("Ynterq tivy aghyusakic !!!");
                if (countInputNumber == 5) {
                    System.out.println("Duq " + countInputNumber + " angam skhal eq mutqagrel tivy !!!");
                    System.exit(0);
                }
            } else {
                break;
            }
        }
        if (tiv == 2) {
            tiv = 0;
        }
        countInputNumber = 0;
        return enter_num;
    }

    void yes_no() {
        System.out.println("\nSharunakum eq khaghy ? \ntype: Yes or No");
        String yes_no = in.next();
        if (yes_no.contains("No") || yes_no.contains("no")) {
            System.out.println("Dzer mnacord gumarn e: " + Random_Number.client_money + " AMD");
            System.exit(0);
        }
    }

    void input_money(int enter_num1, int enter_num2) {
        for (int i = 0; i < 5; i++) {
            System.out.println("Mutqagreq gumary ");
            money = in.nextInt();
            if (money >= 1000 && money <= 100000) {
                random_number.randomNumber(enter_num1, enter_num2, money, count);
                break;
            } else {
                countOfmoney++;
                System.out.println("Mutqagreq 1000 -ic voch pakas ev 100000 ic voch avel gumar !!!");
                if (countOfmoney == 5) {
                    System.out.println("Duq " + countOfmoney + " angam skhal eq mutqagrel gumary !!!");
                    System.exit(0);
                }
            }

        }
    }
}
