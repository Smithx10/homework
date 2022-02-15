public class Counter {
    // Privates are attr's on the class / type that are used only in the clas
    
    // count is a attribute associated with all counters.  Each counter will store its count here.
    private int count;

    // The Counter() function is our constructor.  It is what is called to "construct" an instance of the Counter Class.
    public Counter(){
        count = 0;
    }
    
    // The PrintCount() function is used to print out the current count.
    public void PrintCount(){
        System.out.println("Current Value: " + count);  
    }
}
