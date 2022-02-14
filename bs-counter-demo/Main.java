public class Main {
    public static void main(String[] args) {
      // We construct a Counter by calling new on our public Constructor "Counter()"
      Counter c1 = new Counter();


      c1.AddOne();
      c1.MutateCount("up", 1337);
      c1.PrintCount();

      String currentCount = c1.toString();
        System.out.println("rawr: "+ currentCount);



      // Call PrintCount to see where we are.
      //CounterOne.PrintCount();
      //CounterOne.SubOne();
      //CounterOne.PrintCount();
      //CounterOne.AddOne();
      //CounterOne.AddByAddorator(42);
      //CounterOne.PrintCount();
    }
}
