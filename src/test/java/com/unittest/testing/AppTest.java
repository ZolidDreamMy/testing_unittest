package com.unittest.testing;
import static org.hamcrest.CoreMatchers.both;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.everyItem;
import static org.hamcrest.CoreMatchers.hasItems;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import java.util.Arrays;
import org.junit.Before;
import org.junit.Test;
public class AppTest 
{
	Fahrenheit object;
	@Before

	
	public void newClassFahrenheit() {
		object = new Fahrenheit();
	}
	
	@Test
	public void testResult0Input0() {
		double input = 0 ;
		double expected = 0;
		object.input(input);
		double actual = object.getCelcius();
		assertEquals(expected, actual,2);
	}
	
	@Test
	public void testResult1000Input1000() {
		double input = -1000 ;
		double expected = -1000;
		object.input(input);
		double actual = object.getCelcius();
		assertEquals(expected, actual,2);
	}
	
	@Test
	public void testResultTrueInput0() {
		double input = -1000 ;
		boolean expected = true;
		boolean actual = object.isBound(input);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testResultTrueInput1000() {
		double input = 1000 ;
		boolean expected = true;
		boolean actual = object.isBound(input);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testResultTrueInputMinus1000() {
		double input = -1000 ;
		boolean expected = true;
		boolean actual = object.isBound(input);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testResultTrueInput2000() {
		double input = 2000 ;
		boolean expected = false;
		boolean actual = object.isBound(input);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testResultTrueInputMinus2000() {
		double input = -2000 ;
		boolean expected = false;
		boolean actual = object.isBound(input);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testResultTrueInput1010() {
		double input = 1010 ;
		boolean expected = false;
		boolean actual = object.isBound(input);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testResultTrueInputMinus1010() {
		double input = -1010 ;
		boolean expected = false;
		boolean actual = object.isBound(input);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testResultTrueInput1001() {
		double input = 1001 ;
		boolean expected = false;
		boolean actual = object.isBound(input);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testResultTrueInputMinus1001() {
		double input = -1001 ;
		boolean expected = false;
		boolean actual = object.isBound(input);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testResultTrueInput999() {
		double input = 999 ;
		boolean expected = true;
		boolean actual = object.isBound(input);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testResultTrueInputMinus999() {
		double input = -999 ;
		boolean expected = true;
		boolean actual = object.isBound(input);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testResultTrueInput501() {
		double input = 501 ;
		boolean expected = true;
		boolean actual = object.isBound(input);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testResultTrueInputMinus501() {
		double input = -501 ;
		boolean expected = true;
		boolean actual = object.isBound(input);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testResultTrueInput500() {
		double input = 500 ;
		boolean expected = true;
		boolean actual = object.isBound(input);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testResultTrueInputMinus500() {
		double input = -500 ;
		boolean expected = true;
		boolean actual = object.isBound(input);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testResultTrueInput499() {
		double input = 499 ;
		boolean expected = true;
		boolean actual = object.isBound(input);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testResultTrueInputMinus499() {
		double input = -499 ;
		boolean expected = true;
		boolean actual = object.isBound(input);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testResultTrueInput1() {
		double input = 1 ;
		boolean expected = true;
		boolean actual = object.isBound(input);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testResultTrueInputMinus1() {
		double input = -1 ;
		boolean expected = true;
		boolean actual = object.isBound(input);
		assertEquals(expected, actual);
	}
	
	/// fahrenheit homework ////
	@Test
	public void testResult32CalculateFromInput0() {
		double input = 0 ;
		double expected = 32.00;
		object.input(input);
		object.calculate();
		double actual = object.getFahrenheit();
		assertEquals(expected, actual, 2);
	}
	
	@Test
	public void testResult32CalculateFromInput1() {
		double input = 1 ;
		double expected = 33.8;
		object.input(input);
		object.calculate();
		double actual = object.getFahrenheit();
		assertEquals(expected, actual, 2);
	}
	
	@Test
	public void testResult32CalculateFromInputMinus1() {
		double input = -1 ;
		double expected = 30.2;
		object.input(input);
		object.calculate();
		double actual = object.getFahrenheit();
		assertEquals(expected, actual, 2);
	}
	
	@Test
	public void testResult32CalculateFromInput499() {
		double input = 499 ;
		double expected = 930.2;
		object.input(input);
		object.calculate();
		double actual = object.getFahrenheit();
		assertEquals(expected, actual, 2);
	}
	
	@Test
	public void testResult32CalculateFromInputMinus499() {
		double input = -499 ;
		double expected = -866.2;
		object.input(input);
		object.calculate();
		double actual = object.getFahrenheit();
		assertEquals(expected, actual, 2);
	}
	
	@Test
	public void testResult32CalculateFromInput500() {
		double input = 500 ;
		double expected = 932;
		object.input(input);
		object.calculate();
		double actual = object.getFahrenheit();
		assertEquals(expected, actual, 2);
	}
	
	@Test
	public void testResult32CalculateFromInputMinus500() {
		double input = -500 ;
		double expected = -868;
		object.input(input);
		object.calculate();
		double actual = object.getFahrenheit();
		assertEquals(expected, actual, 2);
	}
	
	@Test
	public void testResult32CalculateFromInput501() {
		double input = 501 ;
		double expected = 933.8;
		object.input(input);
		object.calculate();
		double actual = object.getFahrenheit();
		assertEquals(expected, actual, 2);
	}
	
	@Test
	public void testResult32CalculateFromInputMinus501() {
		double input = -501 ;
		double expected = -869.8;
		object.input(input);
		object.calculate();
		double actual = object.getFahrenheit();
		assertEquals(expected, actual, 2);
	}
	
	@Test
	public void testResult32CalculateFromInput999() {
		double input = 999 ;
		double expected = 1830.2;
		object.input(input);
		object.calculate();
		double actual = object.getFahrenheit();
		assertEquals(expected, actual, 2);
	}
	
	@Test
	public void testResult32CalculateFromInputMinus999() {
		double input = -999 ;
		double expected = -1766.2;
		object.input(input);
		object.calculate();
		double actual = object.getFahrenheit();
		assertEquals(expected, actual, 2);
	}
	
	@Test
	public void testResult32CalculateFromInput1000() {
		double input = 1000 ;
		double expected = 1832;
		object.input(input);
		object.calculate();
		double actual = object.getFahrenheit();
		assertEquals(expected, actual, 2);
	}
	
	@Test
	public void testResult32CalculateFromInputMinus1000() {
		double input = -1000 ;
		double expected = -1768;
		object.input(input);
		object.calculate();
		double actual = object.getFahrenheit();
		assertEquals(expected, actual, 2);
	}
	
	@Test
	public void testResult32CalculateFromInput1001() {
		double input = 1001 ;
		double expected = 1833.8;
		object.input(input);
		object.calculate();
		double actual = object.getFahrenheit();
		assertEquals(expected, actual, 2);
	}
	
	@Test
	public void testResult32CalculateFromInputMinus1001() {
		double input = -1001 ;
		double expected = -1769.8;
		object.input(input);
		object.calculate();
		double actual = object.getFahrenheit();
		assertEquals(expected, actual, 2);
	}
	
	@Test
	public void testResult32CalculateFromInput1010() {
		double input = 1010 ;
		double expected = 1850;
		object.input(input);
		object.calculate();
		double actual = object.getFahrenheit();
		assertEquals(expected, actual, 2);
	}
	
	@Test
	public void testResult32CalculateFromInputMinus1010() {
		double input = -1010 ;
		double expected = -1786;
		object.input(input);
		object.calculate();
		double actual = object.getFahrenheit();
		assertEquals(expected, actual, 2);
	}
	
	@Test
	public void testResult32CalculateFromInput2000() {
		double input = 2000 ;
		double expected = 3632;
		object.input(input);
		object.calculate();
		double actual = object.getFahrenheit();
		assertEquals(expected, actual, 2);
	}
	
	@Test
	public void testResult32CalculateFromInputMinus2000() {
		double input = -2000 ;
		double expected = -3568;
		object.input(input);
		object.calculate();
		double actual = object.getFahrenheit();
		assertEquals(expected, actual, 2);
	}
	
	@Test
	public void testResultMessageOutputFromInput0() {
		double input = 0 ;
		String expected = "0 celcius = 32.00 fahrenheit" ;
		object.input(input);
		object.calculate();
		String actual = object.toString();
		assertEquals(expected, actual);
	}

	@Test
	public void testResultMessageOutputFromInput1() {
		double input = 1 ;
		String expected = "1 celcius = 33.80 fahrenheit";
		object.input(input);
		object.calculate();
		String actual = object.toString();
		assertEquals(expected, actual);
	}
	
	@Test
	public void testResultMessageOutputFromInputMinus1() {
		double input = -1 ;
		String expected = "-1 celcius = 30.20 fahrenheit";
		object.input(input);
		object.calculate();
		String actual = object.toString();
		assertEquals(expected, actual);
	}
	

	@Test
	public void testResultMessageOutputFromInput499() {
		double input = 499 ;
		String expected = "499 celcius = 930.20 fahrenheit";
		object.input(input);
		object.calculate();
		String actual = object.toString();
		assertEquals(expected, actual);
	}
	
	@Test
	public void testResultMessageOutputFromInputMinus499() {
		double input = -499 ;
		String expected = "-499 celcius = -866.20 fahrenheit";
		object.input(input);
		object.calculate();
		String actual = object.toString();
		assertEquals(expected, actual);
	}
	
	@Test
	public void testResultMessageOutputeFromInput500() {
		double input = 500 ;
		String expected = "500 celcius = 932.00 fahrenheit";
		object.input(input);
		object.calculate();
		String actual = object.toString();
		assertEquals(expected, actual);
	}
	
	@Test
	public void testResultMessageOutputFromInputMinus500() {
		double input = -500 ;
		String expected = "-500 celcius = -868.00 fahrenheit";
		object.input(input);
		object.calculate();
		String actual = object.toString();
		assertEquals(expected, actual);
	}
	
	@Test
	public void testResultMessageOutputeFromInput501() {
		double input = 501 ;
		String expected = "501 celcius = 933.80 fahrenheit";
		object.input(input);
		object.calculate();
		String actual = object.toString();
		assertEquals(expected, actual);
	}
	
	@Test
	public void estResultMessageOutputFromInputMinus501() {
		double input = -501 ;
		String expected = "-501 celcius = -869.80 fahrenheit";
		object.input(input);
		object.calculate();
		String actual = object.toString();
		assertEquals(expected, actual);
	}
	
	@Test
	public void testResultMessageOutputeFromInput999() {
		double input = 999 ;
		String expected = "999 celcius = 1830.20 fahrenheit";
		object.input(input);
		object.calculate();
		String actual = object.toString();
		assertEquals(expected, actual);
	}
	
	@Test
	public void testResultMessageOutputFromInputMinus999() {
		double input = -999 ;
		String expected = "-999 celcius = -1766.20 fahrenheit";
		object.input(input);
		object.calculate();
		String actual = object.toString();
		assertEquals(expected, actual);
	}
	
	@Test
	public void testResultMessageOutputeFromInput1000() {
		double input = 1000 ;
		String expected = "1000 celcius = 1832.00 fahrenheit" ;
		object.input(input);
		object.calculate();
		String actual = object.toString();
		assertEquals(expected, actual);
	}
	
	@Test
	public void testResultMessageOutputFromInputMinus1000() {
		double input = -1000 ;
		String expected = "-1000 celcius = -1768.00 fahrenheit" ;
		object.input(input);
		object.calculate();
		String actual = object.toString();
		assertEquals(expected, actual);
	}
	
	@Test
	public void testResultMessageOutputeFromInput1001() {
		double input = 1001 ;
		String expected = "1001 celcius = 1833.80 fahrenheit" ;
		object.input(input);
		object.calculate();
		String actual = object.toString();
		assertEquals(expected, actual);
	}
	
	@Test
	public void testResultMessageOutputFromInputMinus1001() {
		double input = -1001 ;
		String expected = "-1001 celcius = -1769.80 fahrenheit" ;
		object.input(input);
		object.calculate();
		String actual = object.toString();
		assertEquals(expected, actual);
	}
	
	public void testResultMessageOutputeFromInput1010() {
		double input = 1010 ;
		String expected = "1010 celcius = 1850.00 fahrenheit" ;
		object.input(input);
		object.calculate();
		String actual = object.toString();
		assertEquals(expected, actual);
	}
	
	@Test
	public void testResultMessageOutputFromInputMinus1010() {
		double input = -1010 ;
		String expected = "-1010 celcius = -1786.00 fahrenheit" ;
		object.input(input);
		object.calculate();
		String actual = object.toString();
		assertEquals(expected, actual);
	}
	
	public void testResultMessageOutputeFromInput2000() {
		double input = 2000 ;
		String expected = "2000 celcius = 3632.00 fahrenheit" ;
		object.input(input);
		object.calculate();
		String actual = object.toString();
		assertEquals(expected, actual);
	}
	
	@Test
	public void testResultMessageOutputFromInputMinus2000() {
		double input = -2000 ;
		String expected = "-2000 celcius = -3568.00 fahrenheit" ;
		object.input(input);
		object.calculate();
		String actual = object.toString();
		assertEquals(expected, actual);
	}
		
}


