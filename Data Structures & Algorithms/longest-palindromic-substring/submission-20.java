class Solution {
 private  String expandAroundCenter(int start, int end, String input) {
        int len = input.length();
        int maxCount = 1;
        int finalStart = 0;
        int finalEnd = 0;
        char[] arr = input.toCharArray();
        // ababd
        // 1 b
        // start = 0; end = 2
        // currCount = 3 > maxCount = 1 -> maxCount = 3
        // finish

        // 2 a
        // start 1; end = 3
        while (start >= 0 && start < len && end >= 0 && end < len) {
            if (arr[start] != arr[end]) break;
            int currCount = end - start + 1;
            if (currCount > maxCount) {
                maxCount = currCount;
                finalStart = start;
                finalEnd = end;
            }
            start--;
            end++;
        }
        return input.substring(finalStart, finalEnd + 1);
    }

    public  String longestPalindrome(String s) {

        int n = s.length();

        if (n == 0) return "";
        if (n == 1) return s;

        String maxPalindrome = "";
        String currMaxPalindrome = "";
        //1 через два указателя смотреть где будет палиндром
        // 2 Для поиска палиндрома нужно два случая
        // 2.1 оба указателя начинаются в одном месте
        // 2.2 один указатель начинается в месте i, а другой в i+1


        for (int i = 0; i < n; i++) {
            String case1 = expandAroundCenter(i, i, s);

            String case2 = expandAroundCenter(i, i + 1, s);

            if (case1.length() > case2.length()) {
                currMaxPalindrome = case1;
            } else {
                currMaxPalindrome = case2;
            }
            if (currMaxPalindrome.length() > maxPalindrome.length()) {
                maxPalindrome = currMaxPalindrome;
            }
        }

        return maxPalindrome;
    }
}
