package me.generics;

public class TestThree {
  // A Generic method example
  static <T> void genericDisplay (T element){
    System.out.println(element.getClass().getName() + " = " + element);
  }

  public static void main(String[] args) {
    genericDisplay(11);
    genericDisplay("GeekForGeeks");
    genericDisplay(1.0);
  }
}
