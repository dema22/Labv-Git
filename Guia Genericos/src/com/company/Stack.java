package com.company;

import java.util.ArrayList;
import java.util.List;

public class Stack<T> {
    // Attributes
    private Node base;

    // Methods
    public Stack() {
        this.base = null;
    }

    public void push (T data){
        // We create a new Node with the the new data.
        // We set its next node.
        // We update the base, this is key to always update the base, fundamental part of a stack.
        Node<T> newBase = new Node<>();
        newBase.setData(data);
        newBase.setNext(base);
        base = newBase;
    }

    public T pop (){
        T data = (T) base.getData();
        base = base.getNext();
        return data;
    }

    public int getSize(){
        int size = 0;
        Node<T> auxBase = base;

        while(auxBase != null){
            size++;
            auxBase = auxBase.getNext();
        }
        return size;
    }

    // It will iterate the linked list and will store all the information in an array list and return it.
    // We use an aux node variable so we dont lose the information when we finish the iteration.
    public List<T> getElements () {
        Node<T> auxBase = base;
        ArrayList<T> myArray = new ArrayList<>();

        while(auxBase != null){
            T element = (T) auxBase.getData();// Why i have to cast to T ?
            myArray.add(element);
            auxBase = auxBase.getNext();
        }
        return myArray;
    }
}
