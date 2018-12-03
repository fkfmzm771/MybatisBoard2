package UI;

import java.util.*;

import Manager.*;
import VO.*;

public class BoardUI {
	
	private Scanner sc1 = new Scanner(System.in);
	private Scanner sc2 = new Scanner(System.in);
	private boolean flag = true;
	private int choice;
	private BoardManager bm = new BoardManager();
	private String loginId;
	
	public BoardUI() {
		
		while(flag) {
			
			if(loginId==null) {//�α����� ���� ���� ���
				memberMenu();
				choice = sc1.nextInt();
				
				switch(choice) {
				case 1://ȸ�� �α���
					Member loginMember = bm.loginMember(makeMember());
					if(loginMember==null) {
						System.out.println("�������� �ʴ� �����Դϴ�.");
					}else {
						loginId=loginMember.getId();
						System.out.println("**********"+loginId + "�� ������ ȯ���մϴ�."+"**********");
					}
					break;
				case 2://ȸ�� ����
//					bm.insertMember(makeMember());
					Member m = makeMember();
					if(bm.insertMember(m)) {
						loginId=m.getId();//�α��� ������
						System.out.println("��� ����");
					}else {
						System.out.println("��� ����");
					}
					break;
				}//switch
				
			}else {//�α����� �� ���
				boardMenu();
				choice = sc1.nextInt();
				
				switch(choice) {
				case 1://���
					bm.insertBoard(makeBoard());
					System.out.println("�Խù� ��� �Ϸ�");
					break;
				case 2://����
					break;
				case 3://����
					break;
				case 4://���
					for(Board b:bm.selectAllBoard()) {
						System.out.println("�Ϸù�ȣ : "+b.getBoardSeq() + "���� : " +b.getBoardTitle() + " , ����� : " + b.getDate());
					}
					break;
				case 5://��
					detailBoard();
					break;
				case 6://����
					flag=false;
					break;
				}
			}
		
		}//while
	}//BoardUI������
	
	public void memberMenu() {
		System.out.println("===============");
		System.out.println("1.ȸ���α���");
		System.out.println("2.ȸ������");
		System.out.println("===============");
		System.out.print("���� =>");
	}//memberMenu
	
	public void boardMenu() {//�Խù� �޴�
		System.out.println("===============");
		System.out.println("1.�Խù� ���");
		System.out.println("2.�Խù� ����");
		System.out.println("3.�Խù� ����");
		System.out.println("4.�Խù� ��Ϻ���");
		System.out.println("5.�Խù� �󼼺���");
		System.out.println("6.����");
		System.out.println("===============");
		System.out.print("���� =>");
	}//boardMenu
	
	public Member makeMember() {//ȸ������ �޼���
		System.out.print("ID : ");
		String id = sc2.nextLine();
		System.out.print("PW : ");
		String pw = sc2.nextLine();
		return new Member(id,pw);
	}//makeMember
	
	public Board makeBoard() {//�Խù� ��� �޼���
		System.out.print("���� �Է� : ");
		String title = sc2.nextLine();
		System.out.print("���� �Է� : ");
		String content = sc2.nextLine();
		
		return new Board(null,loginId,title,content,null,0);
	}//makeBoard
	
	public void detailBoard() {
		System.out.print("�Խù� �Ϸù�ȣ �Է� : ");
		String seq = sc2.nextLine();
		for(Board b:bm.selectAllBoard()) {
			if(b.getBoardSeq().equals(seq)) {
				System.out.println("���� : " + b.getBoardTitle());
				System.out.println("����� : " + b.getId());
				System.out.println("���� : " + b.getBoardContent());
			}
		}
	}
	
	

}//class
