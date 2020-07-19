package me.generics;

public class TestTwo<T, U> {
  T obj1;
  U obj2;
  TestTwo(T obj1, U obj2){
    this.obj1 = obj1;
    this.obj2 = obj2;
  }
  public void print(){
    System.out.print(obj1);
    System.out.print(obj2);
  }

  public static void main(String[] args) {
    TestTwo <String, Integer> obj = new TestTwo<String, Integer>("GfG", 15);
    obj.print();
  }
}
