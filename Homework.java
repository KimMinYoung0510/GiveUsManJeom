import java.util.Scanner;
import java.util.Vector;

class MemoManager extends Memo_manager{
	public static void start(Vector v) {
		 while (true) {
	          System.out.println("\n===<Memo List>===");
	          
	          if (v.size() == 0) {
	             System.out.println("-����� �޸� ����-");
	          }
	          
	          for (int i = 0; i < v.size(); i++) {
	          Object obj = v.get(i);
	          String str = (String)obj;
	          System.out.print((i+1));
	          System.out.println(": " + str);
	          }
	          System.out.println("=================");
	          System.out.println("==<�޸� ���� �޴�>==");
	          System.out.println("1.�޸� ����");
	          System.out.println("2.�޸� ������Ʈ");
	          System.out.println("3.�޸� ����");
	          System.out.println("4.�ڷΰ���");
	          System.out.println("==============");
	          System.out.print("�Է�: ");
	          
	          Scanner sc = new Scanner(System.in);
	          int selection = sc.nextInt();
	       
	          if (selection == 1) {
	        	  MemoManager ob1 = new MemoManager();
	        	  ob1.addmemo(v);
	          }
	          
	          else if (selection == 2) {
	        	  MemoManager ob2 = new MemoManager();
	        	  ob2.updatememo(v); 

	          }
	       
	          else if (selection == 3) {
	        	  MemoManager ob3 = new MemoManager();
	        	  ob3.deletememo(v);
	          
	          }
	          
	          else if (selection == 4) {
	        	  System.out.println("����ȭ������ ���ư��ϴ�.");
	        	  break;
	          }
	    
	          else {
	          System.out.println("�ٽ� �Է��ϼ���.");
	          }
		 }//while
	}
	
	public void addmemo(Vector v) {
		 System.out.println("�߰��� �޸𳻿��� �Է��ϼ���.");
         System.out.print("�Է�: ");
		 Scanner sc1 = new Scanner(System.in);
         String memo = sc1.nextLine();
         //String memo1=sc1.ne
         v.add(memo);
		
	}
	
	public static void updatememo(Vector v) {
		int number;
		
		while(true) {
			if (v.size() == 0) {
				 System.out.println("����� �޸� ���� �޸� ���� ����� ������ �� �����ϴ�.\n�޸���� �޴�ȭ������ ���ư��ϴ�.");
				 break;
			 } 
        	 
			System.out.println("������ �޸� ��ȣ�� �Է��ϼ���.");
			System.out.print("�Է�: ");
			Scanner sc2 = new Scanner(System.in);
			number = sc2.nextInt();
        
			if (number > v.size() || number == 0 || number < 0) {
				System.out.println("������ �ش� �޸� �����ϴ�.\n<MemoList>�� �ִ� �޸��ȣ�� �Է��ϼ���.");
			}
			
			else {
				Object obj = v.get(number-1);
				String str = (String)obj;
				System.out.print(number);
				System.out.println(": " + str);
				v.remove(number-1);
				System.out.println("���ϴ� �������� �޸� �����ϼ���.");
				System.out.print("�Է�: ");
				Scanner sc2_1 = new Scanner(System.in);
				String memo = sc2_1.nextLine();
				v.add(number-1, memo);
				break;
			}
		}
	}
	
	public static void deletememo(Vector v) {
		int number;
		String YesOrNo;
		while (true) {
			if (v.size() == 0) {
				System.out.println("����� �޸� ����  �޸� ���� ����� ������ �� �����ϴ�.\n�޸���� �޴�ȭ������ ���ư��ϴ�.");
 				break;
 			} 
          
			System.out.println("������ ���ϴ� �ش� �޸��� ��ȣ�� �Է��ϼ���.");
			Scanner sc3 = new Scanner(System.in);
			number = sc3.nextInt();
          
			if (number > v.size() || number == 0 || number < 0) {
				System.out.println("�ش� �޸� �����ϴ�. ��ȿ�� �޸� ��ȣ �ٽ� �Է��ϼ���.");
				//break;//
			}
			
			else {
				while (true) {
				
				System.out.print("���� �ش� �޸� �����Ͻðڽ��ϱ�?(Y/N): ");
				Scanner sc4 = new Scanner(System.in);
				YesOrNo = sc4.nextLine();
				if (true == !(YesOrNo.equals("Y") || YesOrNo.equals("y") || YesOrNo.equals("N") || YesOrNo.equals("n")))
					System.out.println("'Y' �Ǵ�'N'���� ����� �ٽ� �Է��ϼ���.");
				else
					break;
				}
				
				if (YesOrNo.equals("Y") || YesOrNo.equals("y")) {
	
					v.remove(number-1);
					System.out.println("�ش� �޸� �����Ͽ����ϴ�.");
					System.out.println("�޸���� �޴�ȭ������ ���ư��ϴ�.");
				}
				
				else if (YesOrNo.equals("N") || YesOrNo.equals("n")) {
					System.out.println("�ش� �޸� �������� �ʾҽ��ϴ�.");
					System.out.println("�޸���� �޴�ȭ������ ���ư��ϴ�.");
				}
				
			break;
			}
        }//while
	} 
}

public class Memo_manager {
	public static void main(String[] args) {
      // TODO Auto-generated method stub
		Vector v = new Vector();
		while(true) {
			System.out.println("1.�޸�, 2.����, 3.����� 4.����");
			Scanner sc = new Scanner(System.in);
			int selection = sc.nextInt();
      
			if(selection == 4) break;
      
			if (selection == 1) {
				MemoManager ob = new MemoManager();
				ob.start(v);
			}  
		}
	}
}