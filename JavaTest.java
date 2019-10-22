package Test2_Junit4;

import junit.framework.*;
//继承TestCase类
public class JavaTest extends TestCase {
   protected int value1, value2;

   // assigning the values
   protected void setUp(){
      value1=9;
      value2=3;
   }

   // test method to add two values
   public void testAdd(){
      double result= value1 + value2;
      assertTrue(result == 12);
   }
   public void testSub(){
	      double result= value1 - value2;
	      assertTrue(result == 6);
	   }
}