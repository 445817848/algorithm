package javarb;

public interface BinarySearchTree<T extends Comparable<T>> {

    public BinarySearchTreeNode<T> get(T key);

    public BinarySearchTreeNode<T> put(T key, Object vaule);

    public void delete(T key);


}



