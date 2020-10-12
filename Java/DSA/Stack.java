package com.MyClass;

import java.util.Arrays;
import java.util.Iterator;

public class Stack {
    private int Size, Top, Value;
    int[] Items;

    public Stack(){
        Top = -1;
        Size = 5;
        Items = new int[Size];
    }

    public Stack(int size){
        Top = -1;
        Size = size;
        Items = new int[Size];
    }

    public Boolean Push(int value){
        if (isFull()){
            System.out.println("Stack is full");
            return false;
        }else{
            System.out.println("inserting " + value + " into the stack");
            Items[++Top] = value;
            return true;
        }
    }

    public int Pop(){
        if (isEmpty()){
            System.out.println("the Stack is Empty");
            return 0;
        }else{
            System.out.println("removing " + Items[Top] + " out of the stack");
            return Items[Top--]; //to return the pooped out item
        }
    }

    public int Peak(){
        if (isEmpty()){
            System.out.println("the stack is empty");
            return 0;
        }else{
            return Items[Top];
        }
    }

    public void PrintStack() {
        System.out.print("[");
        for (int i = Top; i >= 0; i--){
            System.out.print(Items[i]);
            if (i != 0) System.out.print(", ");
        }
        System.out.println("]");
    }

    public boolean isEmpty(){
        return Top < 0;
    }
    public boolean isFull(){
        return Top >= (Size-1);
    }
}
