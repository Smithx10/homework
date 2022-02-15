public class Counter {
    // Privates are attr's on the class / type that are used only in the clas
    
    // count is a attribute associated with all counters.  Each counter will store its count here.
    private int count;
    private String name;

    // The Counter() function is our constructor.  It is what is called to "construct" an instance of the Counter Class.
    public Counter(String n){
        count = 0;
        name = n;
    }
    

    public void AddOne(){
        count = count + 1;
    }

    // The PrintCount() function is used to print out the current count.
    public void PrintCount(){
        System.out.println("Counter: " + name + " Current Value: " + count);  
    }
}
