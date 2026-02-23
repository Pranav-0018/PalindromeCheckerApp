/*
     * @Author Pranav
     * @version 1.0
     *  Use Case 1 :
     * PalindromeCheckerApp
     * Starting The System and Initialize the System
     */
   import java.util.Scanner;
   import java.util.Stack;

public class PalindromeCheckerAPP{
        public static void main(String[] args){
            System.out.println("Welcome to Palindrome Checker Mangement System");
            System.out.println("Version : 1.0");
            System.out.println("System Initialized Successfully.");

            // Declare and initialize input string
            String input = "noon";

            // Create stack
            Stack<Character> stack = new Stack<>();

            // Push each character into stack
            for (char c : input.toCharArray()) {
                stack.push(c);
            }

            // Assume palindrome initially
            boolean isPalindrome = true;

            // Compare original string with stack pop
            for (char c : input.toCharArray()) {
                if (c != stack.pop()) {
                    isPalindrome = false;
                    break;
                }
            }

            // Print result
            System.out.println("Input : " + input);
            System.out.println("Is Palindrome? : " + isPalindrome);



        }
    }

