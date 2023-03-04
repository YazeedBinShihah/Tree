package tree;
public class TNode <E>{
    private E item;
    private TNode left;
        private TNode right;
        private TNode<E> parent;

    public TNode() {
        left=right=parent=null;
        item=null;
        
    }

    public TNode<E> getParent() {
        return parent;
    }

    public void setParent(TNode<E> parent) {
        this.parent = parent;
    }
    

    public E getItem() {
        return item;
    }

    public void setItem(E item) {
        this.item = item;
    }

    public TNode getLeft() {
        return left;
    }

    public void setLeft(TNode left) {
        this.left = left;
    }

    public TNode getRight() {
        return right;
    }

    public void setRight(TNode right) {
        this.right = right;
    }
        
public boolean isLeaf(){
    return (left == null && right == null);
}
 
}
