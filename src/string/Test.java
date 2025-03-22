package string;

public class Test {
    public static void main(String[] args) {
        Strings s = new Strings();
        s.allSubString("abc");
        s.reverse1("hello");
        System.out.println(s.reverse2("world"));
        System.out.println(s.isPalindrome("racecar"));
        System.out.println(s.reverseWords("the sky is blue"));
    }
}
