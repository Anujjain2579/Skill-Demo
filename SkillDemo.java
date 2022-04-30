public class SkillDemo {
    // Method
     public static String palindrome(String input) {
        String output = input;
            for ( int j = input.length() -1 ; j > -1; j--) {
                output += String.valueOf(input.charAt(j));
            }
            return output;
    }
}
