package day07_Array;

import java.util.ArrayList;

public class Ex03_List {
	public static void main(String[] args) {
		
		/*
		 List
		 - ArrayList
		 - LinkedList
		 - Stack... 등이 있다.
		 
		 ArrayList(자료형)
		 - 데이터에 대한 순서가 있다. index로 접근 가능하다
		 - 중복된 데이터를 저장할 수 있다
		 - 배열과는 다르게 서로 다른 자료형도 넣을 수 있다.
		 - 가변의 크기를 갖는다.
		 */
		
		ArrayList arr = new ArrayList();
		
		arr.add("123");		//0번째에 들어감
		arr.add("456");		//1번째에 들어감
		
		System.out.println(arr.get(0));		//get을 통해 0번째 값을 얻어옴
		System.out.println(arr.get(1));
		
		System.out.println(arr.size());		//현재 저장된 크기
		
		System.out.println(arr.contains("123"));	//내가 원하는 값이 있습니까? 있으면 true
		System.out.println(arr);
		
		//System.out.println(arr.remove("123"));	//해당하는 값 삭제
		System.out.println(arr.remove(1));		//456 삭제
		System.out.println(arr);
		
		arr.clear();	//전체내용 삭제
		System.out.println("삭제 후 arr : " + arr);
		
		
	}
}
