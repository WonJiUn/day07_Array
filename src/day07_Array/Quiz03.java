package day07_Array;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz03 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList name = new ArrayList();
		ArrayList telephone_number = new ArrayList();
		
		
		for(;;) {
			System.out.println("1. ����ó ���");
			System.out.println("2. ����ó ����");
			System.out.println("3. ����ó ����");
			System.out.println("4. ��� ����ó ����");
			System.out.println("5. ����");
			System.out.print(">>> ");
			int select = sc.nextInt();
			
			switch(select) {
			case 1 :
				System.out.print("�̸� �Է� : ");
				String inputName = sc.next();
				if(name.contains(inputName) == true) {
					System.out.println("�̸��� �����մϴ�");
					break;
				}else {
				name.add(inputName);
				}
				System.out.print("����ó �Է� : ");
				int inputNumber = sc.nextInt();
				telephone_number.add(inputNumber);
				
				break;
				
			case 2 : 
				System.out.print("ã�� �̸� �Է� : ");
				inputName = sc.next();
				if(name.indexOf(inputName) == -1) {
					System.out.println(inputName + "���� ��Ͽ� �����ϴ�");
				}else {
					System.out.println(name.get(name.indexOf(inputName)) + " : " + telephone_number.get(name.indexOf(inputName)));
				}
				
				break;
				
			case 3 : 
				System.out.print("������ �̸� �Է� : ");
				inputName = sc.next();
				int i = name.indexOf(inputName);
				if(i == -1) {
					System.out.println(inputName + "���� ��Ͽ� �����ϴ�");
				}else {
					System.out.println(inputName + "���� �����Ǿ����ϴ�");
					name.remove(i);
					telephone_number.remove(i);
				}
				
				break;
				
			case 4 : 
				for(i = 0; i<name.size(); i++) {
					System.out.println(name.get(i) + " : " + telephone_number.get(i));
				}
				
				break;
				
			case 5 : 
				System.exit(1);
				
			default : System.out.println("1~5�� �Է����ּ���");
			}
		}
		
		
		
		
		
		
		
	}
}
