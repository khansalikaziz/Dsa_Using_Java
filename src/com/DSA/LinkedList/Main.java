package com.DSA.LinkedList;

public class Main {
    public static void main(String[] args) {
        customLinkedList cl=new customLinkedList();
        cl.insertAtFirst(45);
        cl.insertAtFirst(56);
        cl.insertAtFirst(34);
        cl.insertLast(89);
        cl.insertMiddle(1,69);
        cl.insertMiddle(3,35);
        cl.insertLast(23);

        cl.display();




    }
}
