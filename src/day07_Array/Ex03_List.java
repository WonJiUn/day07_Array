package day07_Array;

import java.util.ArrayList;

public class Ex03_List {
	public static void main(String[] args) {
		
		/*
		 List
		 - ArrayList
		 - LinkedList
		 - Stack... ���� �ִ�.
		 
		 ArrayList(�ڷ���)
		 - �����Ϳ� ���� ������ �ִ�. index�� ���� �����ϴ�
		 - �ߺ��� �����͸� ������ �� �ִ�
		 - �迭���� �ٸ��� ���� �ٸ� �ڷ����� ���� �� �ִ�.
		 - ������ ũ�⸦ ���´�.
		 */
		
		ArrayList arr = new ArrayList();
		
		arr.add("123");		//0��°�� ��
		arr.add("456");		//1��°�� ��
		
		System.out.println(arr.get(0));		//get�� ���� 0��° ���� ����
		System.out.println(arr.get(1));
		
		System.out.println(arr.size());		//���� ����� ũ��
		
		System.out.println(arr.contains("123"));	//���� ���ϴ� ���� �ֽ��ϱ�? ������ true
		System.out.println(arr);
		
		//System.out.println(arr.remove("123"));	//�ش��ϴ� �� ����
		System.out.println(arr.remove(1));		//456 ����
		System.out.println(arr);
		
		arr.clear();	//��ü���� ����
		System.out.println("���� �� arr : " + arr);
		
		
	}
}
