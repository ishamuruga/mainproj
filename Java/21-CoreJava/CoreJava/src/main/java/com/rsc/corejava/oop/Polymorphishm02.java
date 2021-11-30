package com.rsc.corejava.oop;

public class Polymorphishm02 {
    public static void main(String[] args) {

        Parent a; 
  
        a = new subclass1(); 
        a.Print(); 
  
        a = new subclass2(); 
        a.Print(); 
    }
}

class Parent { 
  
    void Print() 
    { 
        System.out.println("parent class"); 
    } 
} 
  
class subclass1 extends Parent { 
  
    void Print() 
    { 
        System.out.println("subclass1"); 
    } 
} 
  
class subclass2 extends Parent { 
  
    void Print() 
    { 
        System.out.println("subclass2"); 
    } 
} 
  