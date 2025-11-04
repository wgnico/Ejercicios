package org.example.hackerearth;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class zoos {
//    You are required to enter a word that consists of
//    and
//    that denote the number of Zs and Os respectively. The input word is considered similar to word zoo if
//            .
//
//    Determine if the entered word is similar to word zoo.
//
//    For example, words such as zzoooo and zzzoooooo are similar to word zoo but not the words such as zzooo and zzzooooo.
//
//            Input format
//
//    First line: A word that starts with several Zs and continues by several Os.
//    Note: The maximum length of this word must be
//            .
//            Output format
//
//    Print Yes if the input word can be considered as the string zoo otherwise, print No.
//
//    Sample Input
//    zzzoooooo
//    Sample Output
//    Yes

    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name =  br.readLine();
        char[] nameArr = name.toCharArray();
        char zoo = name.charAt(0);
        int count = 1;

        for (int i = 1; i < nameArr.length; i++) {
            if (nameArr[i] == zoo) {
                count++;
            } else {
                break;
            }
        }
        if (name.substring(count).length()== 2 * count){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        };
    }





}
