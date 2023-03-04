package tree;
public class BSTree <K extends Comparable <K> , E >{
    private BSTNode <K,E> root;
    public void print(){
        print(root);
    } 
    
 private void print(BSTNode root){
     if(root == null)
         return;
     print(root.getLift());
     System.out.println(root.getRight());
     print(root.getRight());
     
 }
 public E search(K k){
     BSTNode <K,E> n = search(root,k);
     if(n == null)
         return null;
     else 
         return n.getData();
 }
 private BSTNode search(BSTNode <K,E> n , K key){
     if(root == null || root.getKey() == key)
         return root;
     if(root.getKey().compareTo(key) >0)
         return search(root.getLift(),key);
     
         return search(root.getRight(),key);
        }
 public void insert(K key , E data){
     root = insert(root , key , data);
 }
    private BSTNode<K,E> insert(BSTNode<K,E> rt , K key, E data){
        if(rt == null)
            return new BSTNode (key , data);
        
        if(key.compareTo(rt.getKey())<0)
            rt.setLift(insert(rt.getLift(), key ,data));
        else 
            rt.setRight(insert(rt.getRight(), key ,data));
          return rt;  
  
}
    public E findMax(){
        return findMax(root);
    }
    
      private E findMax(BSTNode<K,E> root){
      if(root==null)
          return null;
      if(root.getRight()==null)
          return (E)root.getKey();
      return findMax(root.getRight());
  }
       public E findMin(){
        return findMin(root);
    }
          private E findMin(BSTNode<K,E> root){
      if(root==null)
          return null;
      if(root.getLift()==null)
          return (E)root.getKey();
      return findMin(root.getLift());
  }
          public boolean BST(){
              return BST(root);
          }
 private boolean BST(BSTNode<K,E> root){
     if(root == null)
         return true;
if(root.getLift() != null && root.getLift().getKey().compareTo(root.getRight().getKey())>0)
         return false;
if(root.getRight()!= null && root.getRight().getKey().compareTo(root.getLift().getKey())<0)
    return false;

BST(root.getLift());
BST(root.getRight());
return true; 
 } 
 public String Combine_Name(){
     return CN_Helper(root);
 }
 String x="";
 private String CN_Helper(BSTNode<K,E> root){
     int key =40;
     student s;
             
     if(root == null)
         return null;
     s=(student)root.getData();
     if(s.getExam_marks() >= key)
         x+=" "+s.getName();
     
         CN_Helper(root.getLift());
         CN_Helper(root.getRight());
         return x;
     
 }
}