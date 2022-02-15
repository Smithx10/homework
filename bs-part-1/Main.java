public class Main {
    // the main() function is where our program starts.
    public static void main(String[] args) {

      // Construct a counter and store it in the variable "c1"
      Counter c1 = new Counter("Foo");
      // Call the PrintCount function / method from the counter class of the instance c1.
      c1.PrintCount();

      // Construct a counter and store it in the variable "c2"
      // c2 Methods will only effect c3s Counter values.  Because its mapped into it's own space in memory.
      Counter c2 = new Counter("Bar");
      c2.AddOne();
      c2.AddOne();
      c2.AddOne();
      c2.AddOne();
      c2.PrintCount();

      // Construct a counter and store it in the variable "c3"
      // c3 Methods will only effect c3s Counter values.  Because its mapped into it's own space in memory.
      Counter c3 = new Counter("Baz");
      c3.AddOne();
      c3.PrintCount();
    }
}
