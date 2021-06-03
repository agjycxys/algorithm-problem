package leetcode;

import java.util.Scanner;

/**
 * 给定一个字符串，你需要反转字符串中每个单词的字符顺序，同时仍保留空格和单词的初始顺序。
 */
public class LC557 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            System.out.println(reverseWords(scanner.nextLine()));
        }
    }


    public static String reverseWords(String s) {
        String[] strAfterSplit = s.split(" ");
        String reverseWords = "";
        for (int i = 0; i < strAfterSplit.length; i++) {
            String str = strAfterSplit[i];
            String reverseStr = "";
            for (int j = str.length() - 1; j >= 0; j--) {
                char c = str.charAt(j);
                reverseStr += c;
            }
            reverseWords += reverseStr + " ";
        }
        return reverseWords.trim();
    }
}
