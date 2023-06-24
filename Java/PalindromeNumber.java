public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        StringBuilder i = new StringBuilder();
        String t1 = String.valueOf(x);
        String t2;
        i.append(t1);
        i.reverse();
        t2 = i.toString();
        if (t1.equals(t2))
            return true;
        else
            return false;
    }
}