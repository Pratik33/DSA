package com.practice.maths;

public class Maths {
    public int countDigits(int number)
    {
        int count = 0;
        while(number > 0){
            number = number /10;
            count++;
        }
        return count;
    }
}
