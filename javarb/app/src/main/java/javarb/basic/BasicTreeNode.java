package javarb.basic;

import javarb.BinarySearchTreeNode;

public class BasicTreeNode<T extends Comparable<T>> implements BinarySearchTreeNode<T> {

    public BasicTreeNode<T> getLeft() {
        return left;
    }

    public void setLeft(BasicTreeNode<T> left) {
        this.left = left;
    }

    public BasicTreeNode<T> getRight() {
        return right;
    }

    public void setRight(BasicTreeNode<T> right) {
        this.right = right;
    }

    public T getKey() {
        return key;
    }

    public void setKey(T key) {
        this.key = key;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    private BasicTreeNode<T> left;
    private BasicTreeNode<T> right;
    private T key;
    private Object value;

}
