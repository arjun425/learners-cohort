package com.datastructures;

public class Node {
    private int data;
    private Node next;


    Node(int d) {
        data = d;
        next = null;
    }

    public void push (int data){
        Node newNode = new Node(data);
    }

    // new Node1 - next - null
    // New Node2 - next - 1
    // new Node 3 - next 2
     // Node 4 - next 3

    // 4 - 3 - 2 - 1
    // length
    // arr - length
    // arr [n] - 4


    //List<>

    // list.add - 4
    // list 3





}
