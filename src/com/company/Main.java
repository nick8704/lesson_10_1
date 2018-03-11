package com.company;

import com.company.array.ArrayFormat;
import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int[] randomArray = new int[20];
        Random random = new Random();
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = random.nextInt(21);
        }
        System.out.println(Arrays.toString(ArrayFormat.sorting(randomArray)));
    }
}