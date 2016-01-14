package ru.spb.herzen.ivt3;

import org.kohsuke.randname.RandomNameGenerator;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        String[] name = new String[15];
        RandomNameGenerator rnd = new RandomNameGenerator();
        for (int i = 0; i < 15; i++) {
            name[i] = rnd.next();
            System.out.println("Hello, " + name[i]);
        }

        Arrays.sort(name);
        for (int i = 0; i < 15; i++) {
            System.out.println("Hello, " + name[i]);
        }

        for (int i = 2; i < 5; i++) {
            System.out.println("Hello, " + name[i]);
        }

        System.out.println("///////////////");

        for (int i = 0; i < 15; i++) {
            name[i] = name[i].toUpperCase();
            System.out.println("Hello, " + name[i]);
        }

        {
            int[] rand = new int[30];
            for (int i = 0; i < 30; i++) {
                rand[i] = 1 + (int) (Math.random() * 100);
            }
            int even = 0;
            for (int a : rand) {
                if (a % 2 == 0)
                    even++;
                System.out.println("Rand Num: " + a);
            }
            System.out.println("Even numbers: " + even);
        }

        String name2 = "Lyudmila";
        char[] char_array = name2.toCharArray();
        Arrays.sort(char_array);
        for(char a : char_array){
            System.out.println(a);
        }


        int a = 0;
        char[] symbols = {'e', 'y', 'u', 'i', 'o', 'a'};
        for (char i: char_array) {
            for(char j: symbols) {
                if(i==j) {
                    a++;
                }
            }
        }
        System.out.print(a);


        int[] rand2= new int[30];
        for (int i = 0; i < 30; i++) {
            rand2[i] = 1 + (int) (Math.random() * 100);
        }
        int max = rand2[0];
        int min = rand2[0];
        for(int i = 0; i != rand2.length; i ++){
            if(rand2[i] > max){
                max = rand2[i];
            }
            if(rand2[i] < min){
                min = rand2[i];
            }
        }
        System.out.println("Минимальный элемент: " + min + " Максимальный элемент: " + max);
    }
}