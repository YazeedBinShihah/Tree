package tree;
public class BSTNode<K  ,T> {
    private K key;
    private T data;
    private BSTNode<K,T> lift;
    private BSTNode<K,T> right;
    
public BSTNode(){
    lift=right=null;
}

    public BSTNode(K key, T data) {
        this.key = key;
        this.data = data;
        lift=right=null;
    }

    public BSTNode(K key, T data, BSTNode<K, T> lift, BSTNode<K, T> right) {
        this.key = key;
        this.data = data;
        this.lift = lift;
        this.right = right;
    }
    

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public BSTNode<K, T> getLift() {
        return lift;
    }

    public void setLift(BSTNode<K, T> lift) {
        this.lift = lift;
    }

    public BSTNode<K, T> getRight() {
        return right;
    }

    public void setRight(BSTNode<K, T> right) {
        this.right = right;
    }
    public boolean isleaf(){
        return (right == null && lift == null);
    }

}
