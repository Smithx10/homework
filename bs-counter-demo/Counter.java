public class Counter {
    // Privates are attr's on the class / type that are used only in the clas
    // count is where we are at in the count
    private int count;
    // name is what we name our Counter
    //private String name;

    // Constructor
    public Counter(){
        count = 0;
    }

    // Bump the Count 1
    public void AddOne(){
      count = count + 1;
    }

    // Bump the Count by param
    public void AddByAddorator(int addorator){
      count = count + addorator;
    }

    // Sub the Count by param
    public void SubBySubtrominator(int subtrominator){
      if (count - subtrominator < 0) {
        // Sad Place
        System.out.println("Can't go Lower than 0 bro.");
        // Probably should return an error
        return;
      }
      count = count - subtrominator;
    }

    // Bump the Count by param
    public void MutateCount(String direction, int number){
      // toLower the direction so our switch can match
      switch (direction) {
        case "up":
          System.out.println("Brah..... why....");
          AddByAddorator(number);
          return;
          // Logic for Addition
        case "down":
          SubBySubtrominator(number);
          return;
          // Logic for Subtraction
        default: 
        System.out.println("Brah..... gotta be up or down");
      }
    }

    // Sub the Count 1
    public void SubOne(){
      if (count - 1 < 0) {
        // Sad Place
        System.out.println("Can't go Lower than 0 bro.");
        // Probably should return an error
        return;
      }

      // Happy Path
      count = count - 1;
    }
    
    public void PrintCount(){
        System.out.println("Current Value: " + count);  
    }

    public String toString(){
      return Integer.toString(count);
    }

}
