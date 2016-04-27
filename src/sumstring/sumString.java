package sumstring;

/**
 * Created by clouway on 26.04.16.
 */
public class sumString {
  public void sum(String a, String b) {
    try {
      int x = Integer.parseInt(a);
      int y = Integer.parseInt(b);
      int sum = x + y;
      System.out.println("The sum of number is:" + sum);
    } catch (NumberFormatException e) {
      System.out.println("Invalid format!!! Please insert integers!");
    } catch (Exception e) {
      System.out.println("Error");
    } finally {
      System.out.println("The end try-catch blocs");
    }

  }


}
