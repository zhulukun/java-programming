import java.util.EmptyStackException;
import java.util.Vector;



public class GenericStack<T> extends Vector<T>{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 空构造方法
	 */
   public  GenericStack()
	{
		
	}
   
   /**
    * 获取栈顶的元素，不删除
    * peek()
    */
     public T peek()
     {
    	 int len=size();
    	 if(len==0)
    	 {
             throw new EmptyStackException();
    	 }
    	 return elementAt(len-1);
     }
   
   /**
    * pop()
    */
     public synchronized T pop()
     {
    	
    	 T obj=peek();
    	 removeElementAt(size()-1);
    	 return obj;
     }
   /**
    * push
    */
     public synchronized T push(T t)
     {
    	 addElement(t);
    	 return t;
     }
   /**
    * isEmpty()
    * 
    */
     public boolean  isEmpty() {
		return size()==0;
	}
     /**
      * search
      * @param o
      * @return
      */
     public synchronized int search(Object o) {
         int i = lastIndexOf(o);

         if (i >= 0) {
             return size() - i;
         }
         return -1;
     }
}
