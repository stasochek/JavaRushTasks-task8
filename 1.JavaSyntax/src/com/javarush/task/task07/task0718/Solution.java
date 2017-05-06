package com.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Проверка на упорядоченность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        list.add(0, reader.readLine());
        for (int i = 1; i < 10; i++)
        {
            list.add(i, reader.readLine());
            if (list.get(i-1).length() > list.get(i).length()) System.out.println(i);
        }
    }
}