package me.generics;
import java.util.*;

public class TestFour {

  public static void main(String[] args) {
    // Creating an ArrayList with String specified
    ArrayList <String> a1 = new ArrayList<String> ();
    a1.add("Sachin");
    a1.add("Rahul");
    String s1 = (String)a1.get(0);
    String s2 = (String)a1.get(1);
  }
}
