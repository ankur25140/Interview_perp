package array;

public class InterLeaver {

    /**
     * Returns a list containing all possible interleavings of two strings.
     * The order of the characters within the strings is preserved.
     */
    public static String s1 = "abc";
    public static String s2 = "12";

    public static void interleave(int i, int j, String s) {

        if (i == s1.length() && j == s2.length()) {
            System.out.println("" + s);
        }

        if (i != s1.length()) {
            interleave(i + 1, j, s + s1.charAt(i));
        }

        if (j != s2.length()) {
            interleave(i, j + 1, s + s2.charAt(j));
        }

    }//Method ends here

    /**
     * Prints some example interleavings to stdout.
     */
    public static void main(String[] args) {

        interleave(0, 0, "");
    }//Method ends here
}//C