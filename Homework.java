
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
				System.out.println("-저장된 메모 없음-");
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
		//System.out.println("메뉴를 선택하세요");
		
			System.out.println("1.메모 생성");
		System.out.println("2.메모 업데이트");
		System.out.println("3.메모 삭제");
		System.out.println("4.뒤로가기");
		System.out.print("입력: ");
		Scanner sc = new Scanner(System.in);
		int selection = sc.nextInt();
		
		if (selection == 1) {
			System.out.println("추가할 메모내용을 입력하세요.");
			Scanner sc1 = new Scanner(System.in);
			String memo = sc1.nextLine();
			//String memo1=sc1.ne
			v.add(memo);
		}
			
		
		else if (selection == 2 && v.size() != 0) {
			int number;
			while(true) {
			System.out.println("수정할 메모 번호를 입력하세요.");
			Scanner sc2 = new Scanner(System.in);
			number = sc2.nextInt();
			
			if (number > v.capacity()) {
				System.out.println("해당 메모가 없습니다.");
			}
			else break;
			}
			Object obj = v.get(number-1);
			String str = (String)obj;
			System.out.print(number);
			System.out.println(": " + str);
			v.remove(number-1);
			System.out.println("수정할 내용을 입력하세요.");
			Scanner sc2_1 = new Scanner(System.in);
			String memo = sc2_1.nextLine();
			v.add(number-1, memo);
			

		}
		
		else if (selection == 3 && v.size() != 0) {
			int number;
			while (true) {
			System.out.println("삭제를 원하는 해당 메모의 번호를 입력하세요.");
			Scanner sc3 = new Scanner(System.in);
			number = sc3.nextInt();
			
			if (number > v.capacity()) {
				System.out.println("해당 메모가 없습니다.");
			}
			else 
				break;
			}
			v.remove(number-1);
			
		}
		else if (selection == 4) {
			System.out.println("메인화면으로 돌아갑니다.");
			break;
		}
		
		else if (selection == 2 && v.size() == 0) {
			System.out.println("저장된 메모가 없습니다.");
		}
		
		else if (selection == 3 && v.size() == 0) {
			System.out.println("저장된 메모가 없습니다.");
		}
		else {
			System.out.println("다시 입력하세요.");
		}
		
		
		
	}//while
}
}