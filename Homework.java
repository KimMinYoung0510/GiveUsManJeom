
import java.util.Scanner;
import java.util.Vector;

class MemoManager {
}

public class Memo_manager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v = new Vector();
		
		while (true) {
			//System.out.println("\n--------------------");
			System.out.println("\n===<Memo List>===");
			if (v.size() == 0) {
				System.out.println("-����� �޸� ����-");
			}
			for (int i = 0; i < v.size(); i++) {
			Object obj = v.get(i);
			String str = (String)obj;
			System.out.print((i+1));
			System.out.println(": " + str);
			//System.out.println("===================");
			//System.out.println();
			}
			System.out.println("=================");
		//System.out.println("�޴��� �����ϼ���");
		
			System.out.println("1.�޸� ����");
		System.out.println("2.�޸� ������Ʈ");
		System.out.println("3.�޸� ����");
		System.out.println("4.�ڷΰ���");
		System.out.print("�Է�: ");
		Scanner sc = new Scanner(System.in);
		int selection = sc.nextInt();
		
		if (selection == 1) {
			System.out.println("�߰��� �޸𳻿��� �Է��ϼ���.");
			Scanner sc1 = new Scanner(System.in);
			String memo = sc1.nextLine();
			//String memo1=sc1.ne
			v.add(memo);
		}
			
		
		else if (selection == 2 && v.size() != 0) {
			int number;
			while(true) {
			System.out.println("������ �޸� ��ȣ�� �Է��ϼ���.");
			Scanner sc2 = new Scanner(System.in);
			number = sc2.nextInt();
			
			if (number > v.capacity()) {
				System.out.println("�ش� �޸� �����ϴ�.");
			}
			else break;
			}
			Object obj = v.get(number-1);
			String str = (String)obj;
			System.out.print(number);
			System.out.println(": " + str);
			v.remove(number-1);
			System.out.println("������ ������ �Է��ϼ���.");
			Scanner sc2_1 = new Scanner(System.in);
			String memo = sc2_1.nextLine();
			v.add(number-1, memo);
			

		}
		
		else if (selection == 3 && v.size() != 0) {
			int number;
			while (true) {
			System.out.println("������ ���ϴ� �ش� �޸��� ��ȣ�� �Է��ϼ���.");
			Scanner sc3 = new Scanner(System.in);
			number = sc3.nextInt();
			
			if (number > v.capacity()) {
				System.out.println("�ش� �޸� �����ϴ�.");
			}
			else 
				break;
			}
			v.remove(number-1);
			
		}
		else if (selection == 4) {
			System.out.println("����ȭ������ ���ư��ϴ�.");
			break;
		}
		
		else if (selection == 2 && v.size() == 0) {
			System.out.println("����� �޸� �����ϴ�.");
		}
		
		else if (selection == 3 && v.size() == 0) {
			System.out.println("����� �޸� �����ϴ�.");
		}
		else {
			System.out.println("�ٽ� �Է��ϼ���.");
		}
		
		
		
	}//while
}
}