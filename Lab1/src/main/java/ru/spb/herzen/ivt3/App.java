package ru.spb.herzen.ivt3;

import org.kohsuke.randname.RandomNameGenerator;

import java.util.Arrays;

public class App
{
    public static void main( String[] args )
    {
        System.out.println("I'm Lyudmila");
        String[] name = new String[15];
        RandomNameGenerator rnd = new RandomNameGenerator();
        for (int i=0; i<15; i++){
            name[i]= rnd.next();
            System.out.println("Hello, "+name[i]);
        }
    }
}