package javarb.basic;

import javarb.BinarySearchTree;
import javarb.BinarySearchTreeNode;

public class BasicTree<T extends Comparable<T>> implements BinarySearchTree<T> {
    // no need to repeat extends of the parent interface

    @Override
    public BasicTreeNode<T> get(T key) {
       BasicTreeNode<T> focus = root;
       final BasicTreeNode<T> found;

       while (focus != null) {

        int r = key.compareTo(focus.getKey());
        
        if (r == 0) {
            break;
        } else {
            if (r < 0) {
                focus = focus.getLeft();
            }
        }
      

       }
    

        
        return focus;
    }

    @Override
    public BasicTreeNode<T> put(T key, Object vaule) {

        final BasicTreeNode<T> node = new BasicTreeNode<>();
        if (root == null) {


            root = node;
        } else {

        }
        
        return node;
    }

    @Override
    public void delete(T key) {
        // TODO Auto-generated method stub
        
    }

    

    private BasicTreeNode<T> root;
}
