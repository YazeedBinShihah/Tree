package tree;
public class Tree {
  public static int  Sum(TNode<Integer> root){
      if(root == null)
          return 0;
         
      
      return (int)(root.getItem()+Sum(root.getLeft()))+Sum(root.getRight());
  }
  static int count=0;
  static int count(TNode<Integer> root){
      if(root == null)
          return 0;
      count(root.getLeft());
      count(root.getRight());
      count++;
       return count;
      
  }
  static int getparent(TNode<Integer> root){
      if(root == null)
          return 0;
      if(root.getLeft() == null && root.getRight() == null)
          return 0;
      return 1+getparent(root.getLeft())+getparent(root.getRight());
  }
  static int x=0;
  static int leafNode(TNode<Integer> root){
      if(root == null )
          return 0;
      if(root.getLeft() == null && root.getRight()== null)
      return x++;
      leafNode(root.getLeft());
      leafNode(root.getRight());
      return x;
  }
 static int min=Integer.MAX_VALUE;
  public static int min(TNode<Integer> root){
      if(root == null)
          return 0;
        if(root.getItem() <min)
            min=root.getItem();
          
      min(root.getLeft());
      min(root.getRight());
      return min;
  }
 static String path=" " ;
  public static void path(TNode<Integer> root,String p){
      
      if(root != null){
          path+=root.getItem()+" ";
          if(root.getLeft() == null && root.getRight() == null)
              System.out.println(path);
           path(root.getLeft(),path);
      path(root.getRight(),path);
      }
     
      
  }
public static void print( TNode<Integer> root){
    
    if(root != null){
        System.out.print(root.getItem()+" ");
        print(root.getLeft());
        print(root.getRight());
        
    }
    
   
}
public static void nospling(TNode<Integer> root){
    if(root != null){
        if(root.getLeft()!= null && root.getRight() == null)
            System.out.println(root.getLeft().getItem());
        if(root.getLeft()== null && root.getRight() != null)
            System.out.println(root.getRight().getItem());
    
    
    
    nospling(root.getLeft());
    
    nospling(root.getRight());
    }
}
        static int cou2nt=0;

public static <E> int occ(TNode<E> root , E num){    
    if(root == null)
        return 0;
     
    if(root.getItem() == num)
        count++;
    occ(root.getLeft(),num);
    occ(root.getRight(),num);
    
    return count;
}
     
    public static void main(String[] args) {
     TNode root = new TNode();
     TNode L = new TNode();
     TNode R = new TNode();
     TNode LL = new TNode();
     TNode RR = new TNode();
     root.setItem(1);
     L.setItem(2);
     root.setLeft(L);
     R.setItem(3);
     root.setRight(R);
     LL.setItem(4);
     L.setLeft(LL);
      RR.setItem(4);
     R.setLeft(LL);
//     print(root);
   System.out.println(NonLeaf(root));
    }
  static  int counter=0;
    static int NonLeaf(TNode<Integer> root){
        if(root == null)
            return 0;
        if(root.getRight()!= null || root.getLeft() != null)
             counter++; 
        NonLeaf(root.getLeft());
        NonLeaf(root.getRight());
        return counter;
    }
    
    
    
    
    static void isPareant(TNode<Integer> root, int n){
        if(root == null)
            return ;
       if(root.getLeft()!= null && (int)root.getLeft().getItem()==n||root.getRight()!= null && (int)root.getRight().getItem()==n)
            System.out.print(root.getItem());
        isPareant(root.getLeft(),n);
        isPareant(root.getRight(),n);
        
       
    }
    
    static boolean isfound(TNode<Integer> root, int n){
        if(root == null )
            return false;
        if((Integer)root.getItem()== n)
            return true;
        
        
        return isfound(root.getLeft(),n) || isfound(root.getRight(),n);
    }
  static  boolean isSumTree(TNode<Integer> root){
      if(root == null)
          return true;
      if(root.isLeaf())
          return true;
      if(((int)Sum(root.getRight())+Sum(root.getLeft())) != root.getItem())
          return false;
      isSumTree(root.getLeft());
      isSumTree(root.getRight());
      
      return true;
  }   
  public static void isleafdelet(TNode<Integer> root){
      if(root==null)
          return;
      if(root.getLeft()!= null){
          if(root.getLeft().getLeft()== null && root.getLeft().getRight()==null)
              root.setLeft(null);
      }
      if(root.getRight()!= null){
          if(root.getRight().getLeft()== null && root.getRight().getRight()==null)
              root.setRight(null);
      }
      isleafdelet(root.getLeft());
      isleafdelet(root.getRight());
  }
  static int s;
  static int sumOdd(TNode<Integer> root){
      if(root == null)
          return 0;
      if(root.getItem() %2 != 0)
           s+=root.getItem(); 
      
    sumOdd(root.getLeft());
    sumOdd(root.getRight());
      return s; 
  }

  static int countEven(TNode<Integer> root){
      if(root == null)
          return 0 ;
      
      if((Integer)root.getItem()%2 == 0){
           s++;
      }
      
countEven(root.getLeft());
countEven(root.getRight());
      
      return s;
    
  }
  static boolean isInternal(TNode<Integer> root){
      if(root != null){
      if(root.getLeft() != null || root.getRight() != null)
          return true;
      }
      return false;
  }
  static boolean t=false;
  static boolean isPropreTree(TNode<Integer> root){
      if(root==null)
          return true;
      
         if((root.getLeft() == null && root.getRight() == null)|| (root.getLeft() != null && root.getRight() != null))
              return isPropreTree(root.getLeft()) &&isPropreTree(root.getRight());
                 
                  
          
                 
      
      return false;
     
  }
  static int max=Integer.MIN_VALUE;
  static int max(TNode<Integer> root){
      if(root == null)
          return 0;
      if(root.getItem()>max)
          max=root.getItem();
      
      max(root.getLeft());
      max(root.getLeft());
      return max;
  }
  public class student {
    int id;
    String name;
    double exam_marks;

    public student(int id, String name, double exam_marks) {
        this.id = id;
        this.name = name;
        this.exam_marks = exam_marks;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getExam_marks() {
        return exam_marks;
    }

    public void setExam_marks(double exam_marks) {
        this.exam_marks = exam_marks;
    }

    @Override
    public String toString() {
        return "student{" + "id=" + id + ", name=" + name + ", exam_marks=" + exam_marks + '}';
    }
    
}
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
public class BinaryTree <E>{
    private tree.TNode<E> root;
    private  int size;
    public BinaryTree(){
        root=null;
        size=0;
    } 

    public tree.TNode<E> getRoot() {
        return root;
    }

    public void setRoot(tree.TNode<E> root) {
        this.root = root;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
     public tree.TNode<E> addRoot(E o){
       tree.TNode<E> n =new tree.TNode<E>();
       n.setItem(o);
       if(root == null){
           root = n;
           size++;
           return n;
       }
       else
           return null;
           
     }
     public tree.TNode<E> addLift(tree.TNode<E> p,E o){
      tree.TNode<E> n =new tree.TNode<E>();
       n.setItem(o);
       if(p == null && p.getLeft() != null)
           return null;
       else{
           p.setLeft(n);
           n.setParent(p);
           size++;
           return n;
           
       }
     }
          public tree.TNode<E> addRight(tree.TNode<E> p,E o){
      tree.TNode<E> n =new tree.TNode<E>();
       n.setItem(o);
       if(p == null && p.getRight()!= null)
           return null;
       else{
           p.setRight(n);
           n.setParent(p);
           size++;
           return n;
           
       }
     }
          
  public E set(tree.TNode<E> p,E o){
      
      if(p != null){
          E n= p.getItem();
          p.setItem(o);
          return n;
      }
      else
          return null;
  }
  public boolean attach(tree.TNode<E> p, BinaryTree<E>T1, BinaryTree<E>T2){
      if(p.getLeft()==null && p.getRight() == null){
          p.setLeft(T1.root);
          p.setRight(T2.root);
          size+=T1.size;
          size+=T2.size;
          T1.setRoot(null);
          T2.setRoot(null);
          return true;
      }
      else
          return false;
      
  }
  public E getElement(tree.TNode<E> p){
      if(p!= null){
          return p.getItem();
      }
      else
          return null;
  }
  public tree.TNode<E> parent(tree.TNode<E> p){
      if(p != null)
          return p.getParent();
      else
          return null;
  }
    public tree.TNode<E> Lift(tree.TNode<E> p){
      if(p != null)
          return p.getLeft();
      else
          return null;
  }
      public tree.TNode<E> Right(tree.TNode<E> p){
      if(p != null)
          return p.getRight();
      else
          return null;
  }
   public tree.TNode<E> sibling(tree.TNode<E> p ){   
       if(p != null){
           if(p.getParent().getLeft() == p)
               return p.getParent().getRight();
           if(p.getParent().getRight() == p)
               return p.getParent().getLeft();
           return null;
       }
       else{
           return null;
       }
}
   public tree.TNode<E> root(tree.TNode<E> p){
       if(p != null){
           tree.TNode<E>n =p;
           while(n.getParent() != null){
               n=n.getParent();
           }
           return n;
       }else
           return null;
   }
   public boolean ixInternal(tree.TNode<E> p){
       if(p != null){
           if(p.getLeft() != null || p.getRight() != null ){
               return true;
           }else{
                      return false;
       }
   }else{
           return false;
       }   
}
      public boolean ixExternal(tree.TNode<E> p){
       if(p != null){
           if(p.getLeft() == null && p.getRight() == null ){
               return true;
           }else{
                      return false;
       }
   }else{
           return false;
       }   
}
         public boolean ixRoot(tree.TNode<E> p){
       if(p != null){
           if(p.getParent() == null){
               return true;
           }
           else{
               return false;
           }
       }else{
           return false;
       }
            
}
         public int size(tree.TNode<E> p){
             if(p == null)
                 return 0;
             return 1+size(p.getLeft())+size(p.getRight());
         }
   public boolean isEmpty(tree.TNode<E> p){
       if(p==null)
           return true;
       else
           return false;
   }  
   public void preorder(tree.TNode<E> p){
       if(p == null)
           return;
       System.out.print(p.getItem());
       System.out.print(" ");
       
       preorder(p.getLeft());
       preorder(p.getRight());
   }
     public void inorder(tree.TNode<E> p){
       if(p == null)
           return;
       
       
       preorder(p.getLeft());
       System.out.print(p.getItem());
       System.out.print(" ");
       preorder(p.getRight());
   }
     public void postorder(tree.TNode<E> p){
       if(p == null)
           return;
     
       
       preorder(p.getLeft());
       preorder(p.getRight());
       System.out.print(p.getItem());
       System.out.print(" ");
   } 
     public int SumOfTree(tree.TNode<Integer> p){
         if(p == null)
             return 0;
         
         return (int)(p.getItem()+SumOfTree(p.getLeft())+SumOfTree(p.getRight()));
     }
   static int count=0;  
   public int countLeaf(tree.TNode<E> p){
   if(p == null )
       return 0;
   if(p.getLeft()== null && p.getRight() == null){
       count++;
   }
   countLeaf(p.getLeft());
   countLeaf(p.getRight());
   return count;
   
   } 
       int y=0;  
   public int countNumber(tree.TNode<Integer> p , int n){
   if(p == null )
       return 0;
   if(p.getItem() == n){
       y++;
   }
   countNumber(p.getLeft(),n);
   countNumber(p.getRight(),n);
   return y;
   
   } 
    
}
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


}
