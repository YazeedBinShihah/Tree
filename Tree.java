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
}
