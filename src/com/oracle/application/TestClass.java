package com.oracle.application;


class Base{
  public short getValue(){ return 1; } //1
}

class Base2 extends TestClass{
  public byte getValue(){ return 2; } //2
  }
  
  public class TestClass{
   
  public static void main(String[] args){
        TestClass b = new Base2();
//        System.out.println(b.getValue()); //3 
        
        
        System.out.println("a"+'b'+63); 
        System.out.println("a"+63); 
        System.out.println('b'+new Integer(63)); 
        String s = 'b'+63+"a";
//        String s2 = 63 + new Integer(10);
        
   }
}