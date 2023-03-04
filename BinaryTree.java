package tree;
public class BinaryTree <E>{
    private TNode<E> root;
    private  int size;
    public BinaryTree(){
        root=null;
        size=0;
    } 

    public TNode<E> getRoot() {
        return root;
    }

    public void setRoot(TNode<E> root) {
        this.root = root;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
     public TNode<E> addRoot(E o){
       TNode<E> n =new TNode<E>();
       n.setItem(o);
       if(root == null){
           root = n;
           size++;
           return n;
       }
       else
           return null;
           
     }
     public TNode<E> addLift(TNode<E> p,E o){
      TNode<E> n =new TNode<E>();
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
          public TNode<E> addRight(TNode<E> p,E o){
      TNode<E> n =new TNode<E>();
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
          
  public E set(TNode<E> p,E o){
      
      if(p != null){
          E n= p.getItem();
          p.setItem(o);
          return n;
      }
      else
          return null;
  }
  public boolean attach(TNode<E> p, BinaryTree<E>T1, BinaryTree<E>T2){
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
  public E getElement(TNode<E> p){
      if(p!= null){
          return p.getItem();
      }
      else
          return null;
  }
  public TNode<E> parent(TNode<E> p){
      if(p != null)
          return p.getParent();
      else
          return null;
  }
    public TNode<E> Lift(TNode<E> p){
      if(p != null)
          return p.getLeft();
      else
          return null;
  }
      public TNode<E> Right(TNode<E> p){
      if(p != null)
          return p.getRight();
      else
          return null;
  }
   public TNode<E> sibling(TNode<E> p ){   
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
   public TNode<E> root(TNode<E> p){
       if(p != null){
           TNode<E>n =p;
           while(n.getParent() != null){
               n=n.getParent();
           }
           return n;
       }else
           return null;
   }
   public boolean ixInternal(TNode<E> p){
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
      public boolean ixExternal(TNode<E> p){
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
         public boolean ixRoot(TNode<E> p){
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
         public int size(TNode<E> p){
             if(p == null)
                 return 0;
             return 1+size(p.getLeft())+size(p.getRight());
         }
   public boolean isEmpty(TNode<E> p){
       if(p==null)
           return true;
       else
           return false;
   }  
   public void preorder(TNode<E> p){
       if(p == null)
           return;
       System.out.print(p.getItem());
       System.out.print(" ");
       
       preorder(p.getLeft());
       preorder(p.getRight());
   }
     public void inorder(TNode<E> p){
       if(p == null)
           return;
       
       
       preorder(p.getLeft());
       System.out.print(p.getItem());
       System.out.print(" ");
       preorder(p.getRight());
   }
     public void postorder(TNode<E> p){
       if(p == null)
           return;
     
       
       preorder(p.getLeft());
       preorder(p.getRight());
       System.out.print(p.getItem());
       System.out.print(" ");
   } 
     public int SumOfTree(TNode<Integer> p){
         if(p == null)
             return 0;
         
         return (int)(p.getItem()+SumOfTree(p.getLeft())+SumOfTree(p.getRight()));
     }
   static int count=0;  
   public int countLeaf(TNode<E> p){
   if(p == null )
       return 0;
   if(p.getLeft()== null && p.getRight() == null){
       count++;
   }
   countLeaf(p.getLeft());
   countLeaf(p.getRight());
   return count;
   
   } 
      static int x=0;  
   public int countNumber(TNode<Integer> p , int n){
   if(p == null )
       return 0;
   if(p.getItem() == n){
       x++;
   }
   countNumber(p.getLeft(),n);
   countNumber(p.getRight(),n);
   return x;
   
   } 
    
}
