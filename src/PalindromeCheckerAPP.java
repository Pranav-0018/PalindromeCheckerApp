/*
     * @Author Pranav
     * @version 1.0
     *  Use Case 1 :
     * PalindromeCheckerApp
     * Starting The System and Initialize the System
     */
   import java.util.*;

public class PalindromeCheckerAPP{
        public static void main(String[] args){
            System.out.println("Welcome to Palindrome Checker Mangement System");
            System.out.println("Version : 1.0");
            System.out.println("System Initialized Successfully.");
            String input = "refer";

            Deque<Character> deque = new ArrayDeque<>();

            for (char c : input.toCharArray()) {
                deque.addLast(c);
            }

            boolean isPalindrome = true;

            while (deque.size() > 1) {
                char first = deque.removeFirst();
                char last = deque.removeLast();
                if (first != last) {
                    isPalindrome = false;
                    break;
                }
            }

            System.out.println("Input : " + input);
            System.out.println("Is Palindrome? : " + isPalindrome);



                }
            }



