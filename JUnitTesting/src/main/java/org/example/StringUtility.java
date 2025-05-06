package org.example;

public class StringUtility {
    public String reverse(String str){
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return sb.toString();
    }
    public boolean isPalindrome(String str){
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString().equals(str);
    }
    public String toUpperCase(String str){
        return str.toUpperCase();
    }
}
