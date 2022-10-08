package com.DSA.StringStringBuilder;

public class sb {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("");
        for (int i=0;i<26;i++){
            sb.append((char)('a'+i));
        }
        sb.reverse();
        System.out.println(sb);
    }
}
