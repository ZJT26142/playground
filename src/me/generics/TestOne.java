package me.generics;

public class TestOne<T> {
  // An object of type T is declared
  T obj;
  TestOne(T obj){
    this.obj = obj; // constructor
  }
  public T getObject(){
    return this.obj;
  }
  public static void main (String[] args){
    // instance of Integer type
    TestOne<Integer> iObj = new TestOne<Integer>(15);
    System.out.println(iObj.getObject());
    // instance of String type
    TestOne<String> sObj = new TestOne<String>("GeeksForGeeks");
    System.out.println(sObj.getObject());
  }
}
