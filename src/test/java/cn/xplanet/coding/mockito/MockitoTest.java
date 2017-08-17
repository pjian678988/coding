package cn.xplanet.coding.mockito;
//Let's import Mockito statically so that the code looks clearer
import static org.mockito.Mockito.*;

import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

public class MockitoTest {

	/** 
	 * 描述该方法的功能及算法流程
	 *
	 * @autor: Administrator  2015-1-24 下午3:24:23
	 * @param args    
	 * @return void 
	 */
	public static void main(String[] args) {

		//You can mock concrete classes, not only interfaces
		LinkedList mockedList = mock(LinkedList.class);

		//stubbing
		when(mockedList.get(0)).thenReturn("first");
		when(mockedList.get(1)).thenThrow(new RuntimeException());

		//following prints "first"
		System.out.println(mockedList.get(0));

		//following throws runtime exception
		System.out.println(mockedList.get(1));

		//following prints "null" because get(999) was not stubbed
		System.out.println(mockedList.get(999));

		//Although it is possible to verify a stubbed invocation, usually it's just redundant
		//If your code cares what get(0) returns then something else breaks (often before even verify() gets executed).
		//If your code doesn't care what get(0) returns then it should not be stubbed. Not convinced? See here.
		verify(mockedList).get(0);

	}
	
	@Test
	public void test01(){

		//mock creation
		List mockedList = mock(List.class);

		//using mock object
		mockedList.add("one");
		mockedList.clear();

		//verification
		verify(mockedList).add("one");
		verify(mockedList).clear();

	}
	
	@Test
	public void test02(){

		//You can mock concrete classes, not only interfaces
		LinkedList mockedList = mock(LinkedList.class);

		//stubbing
		when(mockedList.get(0)).thenReturn("first");
		when(mockedList.get(1)).thenThrow(new RuntimeException());

		//following prints "first"
		System.out.println(mockedList.get(0));

		//following throws runtime exception
		System.out.println(mockedList.get(1));

		//following prints "null" because get(999) was not stubbed
		System.out.println(mockedList.get(999));

		//Although it is possible to verify a stubbed invocation, usually it's just redundant
		//If your code cares what get(0) returns then something else breaks (often before even verify() gets executed).
		//If your code doesn't care what get(0) returns then it should not be stubbed. Not convinced? See here.
		verify(mockedList).get(0);

	}

}
