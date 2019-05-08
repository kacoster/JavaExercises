/*
 *A recursive version of the Palindrome question 
 */
package testdomeexercises;

/*
 * @author kudat
 */
public class Palindrome {
    public static boolean isPalindrome(String word) {
      
        if(word.length() == 0 || word.length() == 1)
        {
            return true;
        }
        if(Character.toLowerCase(word.charAt(0)) == Character.toLowerCase(word.charAt(word.length()-1)))
        {
            return (isPalindrome(word.substring(1,word.length()-1)));
        }
        
        return false;
    }
    
    public static void main(String[] args) {
        System.out.println(Palindrome.isPalindrome("Deleveled"));
    }
}


