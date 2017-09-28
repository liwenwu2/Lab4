/*
 * The following code needs a lot of TLC. So give it some!
 *
 * 1. Fix all checkstyle errors
 * 2. Determine what it does (it's going to be tough before you finish #1)
 * 3. Improve the name of the methods and variables
 * 4. Add comments and Javadoc comments where needed
 * 5. Remove unnecessary comments as appropriate
 */
/** the javadoc of public class ReclamationProject.
 *
 */

public class ReclamationProject {
    /** a function gaining the common part of two strings.
     * @param a the first string.
     * @param b the second string.
     * @return the common part.
     */

    public static String doit(final String a, final String b) {
        String lager;
        String smaller;
        String output = " ";
        if (a.length() > b.length()) {
            lager = a;
            smaller = b;
        } else {
            lager = b;
            smaller = a;
        }
        if (a.equals(b)) {
            return a;
        }
        /*
         * For loop with i
         */
        for (int i = 0; i < smaller.length(); i++) {
            for (int j = smaller.length() - i; j > 0; j--) {
                for (int k = 0; k < lager.length() - j; k++) {
                     if (smaller.regionMatches(i, lager, k, j) && j > output.length()) {
                         output = smaller.substring(i, i + j);
                     }
                }
            }
        }
        return output;
    }
}
