package com.practice;

import java.util.Scanner;

public class Unique
{
    public void magic(String str) {
        
        boolean isMagicStr = false;
        String t = str.toUpperCase();
        int len = t.length();
        
        for (int i = 0; i < len - 1; i++) {
            if (t.charAt(i) + 1 == t.charAt(i + 1)) {
                isMagicStr = true;
                break;
            }
        }

        if (isMagicStr)
            System.out.println("CHOOSEN");
        else
            System.out.println("NOT CHOOSEN");
    }
    
    public static void main(String args[]) {
        
        Scanner in = new Scanner(System.in);
        System.out.print("Enter word: ");
        String word = in.nextLine();
        
        Unique obj = new Unique();
        obj.magic(word);
    }
}