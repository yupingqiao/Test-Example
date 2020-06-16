package com.example;

import java.util.ArrayList;

public class WorkDFS {

    public static boolean isContains(String word){
        String dictionary[] = {"i","like","sam","sung","samsung","mobile","ice","cream","man","go","mango"};
        int n = dictionary.length;
        for (int i = 0; i < n; i++){
            if (dictionary[i].equals(word)){
                return true;
            }
        }
        return false;
    }

    public static void wordBreak(String str){
        ArrayList<String> arr = new ArrayList<String>();
        wordBreakUtil(str, arr);
    }
    public static void wordBreakUtil(String str,ArrayList<String> arr){
       int len = str.length();
       if(len == 0){
           System.out.println(arr);
           return;
       }
       //DFS
       for(int i = 1; i <= len; i++){
           String subStr = str.substring(0, i);
           if(isContains(subStr)){
               arr.add(subStr);
               wordBreakUtil(str.substring(i), arr);
               arr.remove(arr.size()-1);
           }
       }
    }

    public static void main(String[] args) {


        String str = "ilikesamsungmobile";

        WorkDFS.wordBreak(str);
    }
}
