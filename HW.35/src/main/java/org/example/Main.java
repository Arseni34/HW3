package org.example;

import java.util.HashMap;
public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        HashMap<String, Boolean> hashMap1 = new HashMap<>();
        String [] arrayList = {"a", "b", "a", "c", "b"};

        for (String word : arrayList){
            if (hashMap1.containsKey(word)){
                hashMap1.put(word, true);
            }
            hashMap1.putIfAbsent(word,false);
        }
        System.out.println(hashMap1);

        System.out.println("Task 2");
        HashMap<String, String> hashMap2 = new HashMap<>();
        String [] arrayList2 = {"man", "moon", "good", "night"};

        for (String word : arrayList2){
                hashMap2.put(word.substring(0,1), word.substring(word.length()-1));
        }
        System.out.println(hashMap2);

    }
}