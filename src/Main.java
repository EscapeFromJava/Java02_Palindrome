public class Main {

    public static void main(String[] args) {
        System.out.println(IsPalindrome(12321)); // is palindrome
        System.out.println(IsPalindrome(12345)); // is not palindrome
    }

    public static boolean IsPalindrome(int number){
        return String.valueOf(number).equals(new StringBuilder(String.valueOf(number)).reverse().toString());
    }
}
