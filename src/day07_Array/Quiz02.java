package day07_Array;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int arr[] = new int[] {10,54,13,17,25,30};
		String odd_even = null;
		System.out.print("¦��, Ȧ�� �Է� : ");
		odd_even = input.next();
		
		if(odd_even.equals("¦��")) {
			for(int i = 0; i<arr.length;i++) {
				if(arr[i]%2 == 0) {
					System.out.println(odd_even + " : " + arr[i]);
				}
			}
		}
		else if(odd_even.equals("Ȧ��")) {
			for(int i = 0; i<arr.length; i++) {
				if(arr[i]%2 == 1) {
					System.out.println(odd_even + " : " + arr[i]);
				}
			}
		}
		else {
			System.out.println("�߸��� �� �Է�");
		}
	
		
		
		
		
		
		
	}
}
