package Study_2;

public class Lessen_1_6_9 {
    public static void main(String[] args) {
        System.out.println(isPalindrome("A palindrome is a word, number, phrase, or other sequence of characters which reads the same backward as forward, such as madam or racecar or the number 10801."));
    }


    public static boolean isPalindrome(String text) {
        String rep = text.toLowerCase().replaceAll("[^a-zA-Z0-9]","");
        String rev = new StringBuffer(rep).reverse().toString();
        return rev.equals(rep);
    }
}
