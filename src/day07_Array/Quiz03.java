package day07_Array;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz03 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList name = new ArrayList();
		ArrayList telephone_number = new ArrayList();
		
		
		for(;;) {
			System.out.println("1. 연락처 등록");
			System.out.println("2. 연락처 보기");
			System.out.println("3. 연락처 삭제");
			System.out.println("4. 모든 연락처 보기");
			System.out.println("5. 종료");
			System.out.print(">>> ");
			int select = sc.nextInt();
			
			switch(select) {
			case 1 :
				System.out.print("이름 입력 : ");
				String inputName = sc.next();
				if(name.contains(inputName) == true) {
					System.out.println("이름이 존재합니다");
					break;
				}else {
				name.add(inputName);
				}
				System.out.print("연락처 입력 : ");
				int inputNumber = sc.nextInt();
				telephone_number.add(inputNumber);
				
				break;
				
			case 2 : 
				System.out.print("찾을 이름 입력 : ");
				inputName = sc.next();
				if(name.indexOf(inputName) == -1) {
					System.out.println(inputName + "님은 목록에 없습니다");
				}else {
					System.out.println(name.get(name.indexOf(inputName)) + " : " + telephone_number.get(name.indexOf(inputName)));
				}
				
				break;
				
			case 3 : 
				System.out.print("삭제할 이름 입력 : ");
				inputName = sc.next();
				int i = name.indexOf(inputName);
				if(i == -1) {
					System.out.println(inputName + "님은 목록에 없습니다");
				}else {
					System.out.println(inputName + "님이 삭제되었습니다");
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
				
			default : System.out.println("1~5를 입력해주세요");
			}
		}
		
		
		
		
		
		
		
	}
}
