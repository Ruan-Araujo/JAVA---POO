package com.company;

public class FuncaoRetorno {
    public static boolean eDivisivel(int num1, int num2){
        return (num1 % num2 == 0);
    }

    public static void main(String[] args) {
        System.out.println(eDivisivel(3, 2));
    }
}


