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
    public String isNumberPalindrome(int number){
        int oldNumber = number;
        int reverseNumber = 0;
        int rem;
        while(number > 0)
        {
            rem = number % 10;
            reverseNumber =reverseNumber*10 +rem;
            number = number /10;
        }
        if(oldNumber == reverseNumber){
            return "Giver number is Palindrome Number !";
        }
        else {
            return "Giver number is Not Palindrome Number !";
    }
    }
}
