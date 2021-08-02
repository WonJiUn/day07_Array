package day07_Array;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex04_List {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		ArrayList arr = new ArrayList();
		int num;
		String addNum, printNum;
		//첫번째 글자가 대문자로 된 자료형을 사용한 변수는 변수뒤에 .을 붙이면 기능이 있다
		//(Scanner, String, ArrayList 등)
		
		System.out.println("만들 공간의 개수 입력");
		num = input.nextInt();
		for(int i = 0; i<num; i++) {
			System.out.println("추가할 수 입력");
			addNum = input.next();
			arr.add(addNum);
		}
		System.out.println("---- 저장 값 출력 ----");
		for(int i = 0;i<arr.size(); i++) {
			//System.out.println(arr.get(i));
			Object obj = arr.get(i);
			String s = (String)obj;			//서로 타입이 다르므로 형변환해서 저장
			//String ss = (String)arr.get(i);
			System.out.println(s);
		}
		
		
		
	}
}
