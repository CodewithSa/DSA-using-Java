package string;

public class Strings {
    public void allSubString(String str) {
        for(int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                System.out.println(str.substring(i, j));
            }
        }
    }

    private void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Reverse a String - Method 1
    public void reverse1(String str) {
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            ans.insert(0, str.charAt(i));
        }
        System.out.println(ans);
    }

    // Reverse a String - Method 2
    public String reverse2(String str) {
        if (str == null || str.isEmpty()) return "";
        char[] ans = str.toCharArray();
        int start = 0, end = ans.length - 1;
        while (start < end) { 
            swap(ans, start++, end--);
        }
        return new String(ans);
    }

    public boolean isPalindrome(String str) {
        int start = 0;
        int end = str.length() - 1;

        while (start <= end) {
            if (str.charAt(start) != str.charAt(end))
                return false;

            start++;
            end--;
        }

        return true;
    }

    // Leetcode Problem - 151
    public String reverseWords(String str) {
        String[] arr = str.split(" ");
        StringBuilder ans = new StringBuilder();

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i].isEmpty()) continue;
            if (ans.length() == 0)
                ans.append(arr[i]);
            else {
                ans.append(" ");
                ans.append(arr[i]);
            }
        }

        return ans.toString();
    }




}
