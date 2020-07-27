package Session9.Week9;

import static org.junit.Assert.*;

import org.junit.Test;

public class Stringclasstestcases
{
	//Yesu Prabhu and Mary Matha and Joseph
	@Test
	public void test1()
	{
		Stringclass stringclass = new Stringclass();
		String actual = stringclass.method("ABCD");
		assertEquals("BCD",actual);
	}
	@Test
	public void test2() 
	{
		Stringclass stringclass = new Stringclass();
		String actual = stringclass.method("AACD");
		assertEquals("CD",actual);
	}
	@Test
	public void test3()
	{
		Stringclass stringclass = new Stringclass();
		String actual = stringclass.method("BACD");
		assertEquals("BCD",actual);
	}
	@Test
	public void test4() 
	{
		Stringclass stringclass = new Stringclass();
		String actual = stringclass.method("BBAA");
		assertEquals("BBAA",actual);
	}
	@Test
	public void test5()
	{
		Stringclass stringclass = new Stringclass();
		String actual = stringclass.method("AABAA");
		assertEquals("BAA",actual);
	}
	@Test
	public void test6() 
	{
		Stringclass stringclass = new Stringclass();
		String actual = stringclass.method("");
		assertEquals("",actual);
	}
	@Test
	public void test7() 
	{
		Stringclass stringclass = new Stringclass();
		String actual = stringclass.method("A");
		assertEquals("",actual);
	}
	@Test
	public void test8() 
	{
		Stringclass stringclass = new Stringclass();
		String actual = stringclass.method("B");
		assertEquals("B",actual);
	}
	@Test
	public void test9() 
	{
		Stringclass stringclass = new Stringclass();
		String actual = stringclass.method("AB");
		assertEquals("B",actual);
	}
	@Test
	public void test10()
	{
		Stringclass stringclass = new Stringclass();
		String actual = stringclass.method("BA");
		assertEquals("B",actual);
	}
	@Test
	public void test11() 
	{
		Stringclass stringclass = new Stringclass();
		String actual = stringclass.method("AA");
		assertEquals("",actual);
	}
	@Test
	public void test12() 
	{
		Stringclass stringclass = new Stringclass();
		String actual = stringclass.method("BB");
		assertEquals("BB",actual);
	}
}
