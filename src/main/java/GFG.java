public class GFG {
    static int nextIndex(String str, int start, char c)
    {
        for (int i = start; i < str.length(); i++) {
            if (str.charAt(i) == c)
                return i;
        }
        return -1;
    }
    static int countSubStrings(String str)
    {
        int i, n = str.length();
        int countX[] = new int[n];
 
        int count = 0;
        for (i = n - 1; i >= 0; i--) {
            if (str.charAt(i) == 'x')
                count++;
            countX[i] = count;
        }

        int nextIndexX = nextIndex(str, 0, 'x');
        int nextIndexY = nextIndex(str, 0, 'y');

        count = 0;
        while (nextIndexX != -1 && nextIndexY != -1) {
 
            // If 'y' appears before 'x'
            // it won't contribute to a valid sub-string
            if (nextIndexX > nextIndexY) {
 
                // Find next occurrence of 'y'
                nextIndexY = nextIndex(str, nextIndexY + 1, 'y');
                continue;
            }
            else {
                count += countX[nextIndexY];
 
                // Find next occurrence of 'x'
                nextIndexX = nextIndex(str, nextIndexX + 1, 'x');
            }
        }
 
        // Return the count
        return count;
    }
 
    // Driver code
    public static void main(String[] args)
    {
 
        String s = "xyyxx";
 
        System.out.println(countSubStrings(s));
    }
}