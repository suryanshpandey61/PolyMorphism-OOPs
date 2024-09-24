package polymorphism;

public class Test {
  public static void add(int x,int y) {
	  System.out.println("Int Int method");
  }
  public static void add(int x,double y) {
	  System.out.println("Int Double argument");
  }
  public static void add(double x,int y) {
	  System.out.println("Double Int argument");
  }
  public static void add(double x,double y) {
	  System.out.println("Double Double argument");
  }
}
