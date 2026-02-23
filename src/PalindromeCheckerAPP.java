/*
     * @Author Pranav
     * @version 1.0
     *  Use Case 1 :
     * PalindromeCheckerApp
     * Starting The System and Initialize the System
     */
    public class PalindromeCheckerAPP{
        public static void main(String[] args){
            System.out.println("Welcome to Palindrome Checker Mangement System");
            System.out.println("Version : 1.0");
            System.out.println("System Initialized Successfully.");
            String str = "madam";

            // Reverse string
            String rev = "";
            for (int i = str.length() - 1; i >= 0; i--) {
                rev = rev + str.charAt(i);
            }

            // Check palindrome
            if (str.equals(rev)) {
                System.out.println(str + " is a Palindrome");
            } else {
                System.out.println(str + " is not a Palindrome");
            }
        }
    }

