package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] nums = randIntArr(10);

    }

    public static int[] randIntArr(int count)
    {
        int[] nums = new int[count];
        for(int i = 0; i < count; i++)
        {
            nums[i] = (int) (Math.random()*10000);
        }
        return nums;
    }
}
