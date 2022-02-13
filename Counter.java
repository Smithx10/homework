package classAssignments;


/**
 *
 * @author AL
 */
public class Counter {
    public static void main(String[] args)
    {
        System.out.println("Add Main func so this goes vroom vroom");  
    }
 
    private int num;
    
    
    public Counter(){
        num = 0;
    }

    public Counter(int n){
        num = n;
    }
  
    public int getNum(){
        return num;
    }
   
    public void setNum(int n){
        num = n;
    }
    
    public String toString(){
        return "" + num;
    }
    
    public boolean equals(Object c){
        Counter cou = (Counter)c;
        return getNum() == cou.getNum();
      
    }
}
