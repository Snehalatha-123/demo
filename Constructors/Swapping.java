package Constructors;

import java.util.Scanner;

public class Swapping {
       void Swap() {
    	   int a=19;
    	   int b=30;
    	   int c=93;
    	  a=a+b+c;
    	  b=a-b-c;
    	  c=a-b-c;
    	  a=a-b-c;
    	  System.out.println("a value " +a);
    	  System.out.println("b value " +b);
    	  System.out.println("c value " +c);
       }
  public static void main(String[] args) {
     Swapping A = new Swapping();
     A.Swap();
    	   }
       }