package com.javarush.task.task19.task1924;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Замена чисел
C:\DevInfo\test.txt
*/

public class Solution {
    public static Map<Integer, String> map = new HashMap<Integer, String>();

    static {
        map.put(0, "ноль");
        map.put(1, "один");
        map.put(2, "два");
        map.put(3, "три");
        map.put(4, "четыре");
        map.put(5, "пять");
        map.put(6, "шесть");
        map.put(7, "семь");
        map.put(8, "восемь");
        map.put(9, "девять");
        map.put(10, "десять");
        map.put(11, "одиннадцать");
        map.put(12, "двенадцать");
    }

    public static void main(String[] args) throws IOException {

        BufferedReader fileNameReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = fileNameReader.readLine();
        fileNameReader.close();

        try (BufferedReader fileContentReader = new BufferedReader(new FileReader(fileName))) {
            while (fileContentReader.ready()) {
                List<String> fileStrings = Arrays.asList(fileContentReader.readLine().split(" "));
                for (String s : fileStrings) {
                    for (Map.Entry<Integer, String> mapEntry : map.entrySet()) {
                        if (s.equals(mapEntry.getKey().toString())) s = mapEntry.getValue();
                    }
                    System.out.print(s + " ");
                }
                System.out.println();
            }
        }
    }
}