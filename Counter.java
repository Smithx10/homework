package classAssignments;


/**
 *
 * @author AL
 */
public class Counter {
    // added by bs
    public static void main(String[] args)
    {
        System.out.println("Add Main func so this goes vroom vroom");  

        Counter counterOne = new Counter();
        Counter counterTwo = new Counter();

        counterOne.printNum();
        counterTwo.printNum();

        counterOne.subOne();
        counterOne.addOne();
        counterOne.printNum();
        counterOne.addOne();
        counterOne.printNum();
        counterOne.subOne();
        counterOne.printNum();

        counterTwo.addOne();
        counterTwo.printNum();
        counterTwo.addOne();
        counterTwo.printNum();
        counterTwo.addOne();
        counterTwo.printNum();
        counterTwo.addOne();
        counterTwo.printNum();
        counterTwo.addOne();
        counterTwo.printNum();

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

    // added by bs
    public void printNum(){
        System.out.println(num);  
    }

    public void addOne(){
      num = num + 1;
    }

    public void subOne(){
      if (num - 1 < 0) {
        System.out.println("Already at 0, cannot subtract 1");  
        // should return an error here
         return;
      }
      num = num - 1;
    }

    public boolean equals(Object c){
        Counter cou = (Counter)c;
        return getNum() == cou.getNum();
      
    }
}
