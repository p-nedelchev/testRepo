package sumstring;
//dsakdhaskld  
public class Demo {
  public static void main(String[] args) {
       try {
            sumString sum = new sumString();
            String a = new String("15");
            String b = new String("20");
            sum.sum(a, b);
          } catch (NullPointerException e) {
            System.out.println("Error");
          }
      int a = 10;
      int b = 5;
      SumInteger s = new SumInteger();
      System.out.println(s.sum(a,b));
         }
}
