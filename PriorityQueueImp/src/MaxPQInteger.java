import java.util.ArrayList;


public class MaxPQInteger {

  private ArrayList<Integer> list ;
  private int currentElement;
  
  public MaxPQ() {
    list=new ArrayList<Integer>(16);
    currentElement=0;
  }
  
  public Integer getMax(){  
    if(currentElement==0)
      return null ;
    return list.get(0);
  }
  
  public void insert(Integer ele) {
    list.add(currentElement,ele);
    currentElement++;
    int element = currentElement-1;
    swim(element);
  }
  
  public Integer delMax(){
      
    if(currentElement==0)
      return null ;
    
    currentElement--;
   Integer ele = list.get(0);
    
    exch(0,currentElement);
    list.set(currentElement,null);
    
    sink(0);
    
    return ele ;
  }

  
  private void sink(int i) {

    int totalElement = currentElement - 1;
    
    while(2*i+1 <=totalElement){
      
      int j =2*i+1;
      
      if(j < totalElement && less(j,j+1))
        j=j+1;
      
      if(!less(i,j))
        break ;
        
      exch(i,j);
        i=j;
      
    } 
  }

  private void swim(int i) {
  
      while(i > 0 && less(i%2==0?(i/2-1):((i+1)/2-1) , i)){
        exch(i,i%2==0?(i/2-1):((i+1)/2-1));     
        i=i%2==0?(i/2-1):((i+1)/2-1);
      }
  }

  private void exch(int child, int parent) {
  
    Integer temp =list.get(child);
    
    list.set(child, list.get(parent));
    list.set(parent,temp);
  }

  private boolean less(int child, int parent) {
    
    if(list.get(child).compareTo(list.get(parent))==-1)
      return true;
    
      return false;
  }
  
  public int size(){
    return currentElement;
  }
}
