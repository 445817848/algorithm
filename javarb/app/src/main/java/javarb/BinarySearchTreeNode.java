package javarb;

public interface BinarySearchTreeNode<T extends Comparable<T>> {
    
    public T getKey();

    public void setKey(T t);



    public Object getValue();
    public void  setValue(Object value);

}
