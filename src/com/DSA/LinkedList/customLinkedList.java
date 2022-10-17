package com.DSA.LinkedList;

public class customLinkedList {
    private Node head;
    private Node tail;

    private int size;

    public  customLinkedList(){
        this.size=0;
    }

    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value=value;
        }

        public Node(int value,Node next){
            this.value=value;
            this.next=next;
        }
    }
    //Display LinkedList
    public void display(){
        Node temp=head;
        while (temp != null){
            System.out.print(temp.value+" -> ");
            temp=temp.next;
        }
        System.out.println("Null");
    }

    //Insert At Fisrt Position

    public void insertAtFirst(int val){
        Node node=new Node(val); //creating new node
        node.next=head;          // making new node to point on the previous head node
        head=node;

        if (tail==null){
            tail=head;
        }
        size++;
    }

    //Insert last

    public void insertLast(int val){
        size++;
        if(tail==null){
            insertAtFirst(val);
            return;
        }
        Node node=new Node(val);
        tail.next=node;
        node.next=null;
        tail=node;
    }

    //Insert Middle

    public void insertMiddle(int ind,int val){
       Node temp=head;
       int count=0;
       while (temp != null){

           if (count==ind){

               Node node=new Node(val);
               Node cur=temp.next;
               temp.next=node;
               node.next=cur;
               size++;
               break;
           }
           temp=temp.next;
           count++;
       }
        System.out.println("Index Out of bound");
    }
}
