package edu.eci.arep.ejercicio2;

import java.util.Iterator;

public class MyIterator<E> implements Iterator<E>{

    private MyNode<E> nextNode = null;


    public MyIterator(MyNode<E> nextNode){
        this.nextNode = nextNode;
    }

    @Override
    public boolean hasNext() {
        // TODO Auto-generated method stub
        return nextNode != null;
    }

    @Override
    public E next() {
        MyNode<E> currentNext = nextNode;

        if(nextNode != null) nextNode = nextNode.getNextNode();
        
        return currentNext.getValue();
    }
    
}
