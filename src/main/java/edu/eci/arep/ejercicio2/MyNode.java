package edu.eci.arep.ejercicio2;

public class MyNode<E> {
    
    private E value = null;
    private MyNode<E> nextNode = null;

    public MyNode(E value){
        this.value = value;
        this.nextNode = null;
    }

    public E getValue() {
        return value;
    }

    public void setValue(E value) {
        this.value = value;
    }

    public MyNode<E> getNextNode() {
        return nextNode;
    }

    public void setNextNode(MyNode<E> nextNode) {
        this.nextNode = nextNode;
    }

}
