package oop.interfacee.loto;

import java.util.Random;

public class Random_Number {
    static int client_money;
    private int mutq1;
    private int mutq2;
    private String letter;

    public void randomNumber(int num1, int num2, int money, int count) {
        boolean isnum1 = false;
        boolean isnum2 = false;
        mutq1 = num1;
        mutq2 = num2;
        int[] num_array = random();
        for (int i = 0; i < num_array.length; i++) {
            if (count <= 3) {
                num1 = num_array[0];
                num2 = num_array[11];
            } else if (count >= 4 && count <= 8) {
                if (num1 == num_array[i]) {
                    num1 = num_array[i] + 1;
                } else {
                    num1 = num_array[i] + 1;
                }
                if (num2 == num_array[i]) {
                    num2 = num_array[i] + 1;
                } else {
                    num2 = num_array[i] + 1;
                }
            }
            int index = 0;
            if (num1 == num_array[i]) {
                index = i;
                isnum1 = true;
            }
            if (num2 == num_array[i] && i != index) {
                isnum2 = true;
            }
        }
        winning_info(isnum1, isnum2, money);
        print_array(num_array, mutq1, mutq2, num1, num2, count);
    }

    private void winning_info(boolean isnum1, boolean isnum2, int money) {
        if (isnum1 && !isnum2 || !isnum1 && isnum2) {
            client_money = client_money + money;
            letter = "Tveric hamynknel e meky\nDzer gumarn e " + client_money + " AMD";
        } else if (isnum1 && isnum2) {
            client_money = client_money + calculate(money);
            letter = "Teghi e unecel 2 tveri hamynknum SHNORHAVORUM em !!!\nDzer gumarn e " + client_money + " AMD";
        } else {
            client_money = client_money - money;
            letter = "Vochmi tiv chi hamynkel\nDzer gumarn e " + client_money + " AMD";
        }
        System.out.println(letter);
    }

    private void print_array(int[] num_array, int mutq1, int mutq2, int num1, int num2, int count) {
        System.out.println("- Patahakan generacvac tvern en -");
        if (count <= 3) {
            System.out.print(" " + mutq1);
            for (int i = 2; i < num_array.length - 1; i++) {
                System.out.print(" " + num_array[i]);
            }
            System.out.print(" " + mutq2);
        } else if (count >= 4 && count <= 8) {
            System.out.print(" " + num1);
            System.out.print(" " + num2);
            for (int i = 2; i < num_array.length; i++) {
                System.out.print(" " + num_array[i]);
            }
        } else {
            for (int i = 0; i < num_array.length; i++) {
                System.out.print(" " + num_array[i]);
            }
        }
    }

    private int calculate(int money) {
        money = 10 * money;
        return money;
    }

    private int[] random() {
        int[] num_array = new int[12];
        Random rand = new Random();
        int number;
        for (int i = 0; i < num_array.length; i++) {
            number = rand.nextInt(80) + 1;
            num_array[i] = number;
        }
        return num_array;
    }
}