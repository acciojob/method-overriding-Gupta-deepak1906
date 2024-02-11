package com.driver;

public class Main {
    public static void main(String[] args) {
        B obj = new B();
        obj.meth();
    }

public static class A {
    public String meth(String c ){
     return  "Invoking method from class A";
    }


}
public static class B extend A{
    public static String meth(String c){
        return "Method is overridden in Extendend class B";
    }

}
  
}