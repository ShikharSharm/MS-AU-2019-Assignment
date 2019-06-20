package au2019.assignments;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

class MessageUtil{
	   
	   MessageUtil messageUtil;
	   @Before
	   public void setUP() throws Exception{
		   String message = "Hello Shikhar";	
		   messageUtil = new MessageUtil(message);
	   }
	   
	   @After
	   public void tearDown() throws Exception{
		   System.gc();
	   }
	   @Test
	   public void testPrintMessage() {
		  String check = "Hi Shikhar";
	      assertEquals(check,messageUtil.printMessage());
	   }
}