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
			
			if(loginId==null) {//로그인을 하지 않은 경우
				memberMenu();
				choice = sc1.nextInt();
				
				switch(choice) {
				case 1://회원 로그인
					Member loginMember = bm.loginMember(makeMember());
					if(loginMember==null) {
						System.out.println("존재하지 않는 계정입니다.");
					}else {
						loginId=loginMember.getId();
						System.out.println("**********"+loginId + "님 접속을 환영합니다."+"**********");
					}
					break;
				case 2://회원 가입
//					bm.insertMember(makeMember());
					Member m = makeMember();
					if(bm.insertMember(m)) {
						loginId=m.getId();//로그인 시켜줌
						System.out.println("등록 성공");
					}else {
						System.out.println("등록 실패");
					}
					break;
				}//switch
				
			}else {//로그인을 한 경우
				boardMenu();
				choice = sc1.nextInt();
				
				switch(choice) {
				case 1://등록
					bm.insertBoard(makeBoard());
					System.out.println("게시물 등록 완료");
					break;
				case 2://수정
					break;
				case 3://삭제
					break;
				case 4://목록
					for(Board b:bm.selectAllBoard()) {
						System.out.println("일련번호 : "+b.getBoardSeq() + "제목 : " +b.getBoardTitle() + " , 등록일 : " + b.getDate());
					}
					break;
				case 5://상세
					detailBoard();
					break;
				case 6://종료
					flag=false;
					break;
				}
			}
		
		}//while
	}//BoardUI생성자
	
	public void memberMenu() {
		System.out.println("===============");
		System.out.println("1.회원로그인");
		System.out.println("2.회원가입");
		System.out.println("===============");
		System.out.print("선택 =>");
	}//memberMenu
	
	public void boardMenu() {//게시물 메뉴
		System.out.println("===============");
		System.out.println("1.게시물 등록");
		System.out.println("2.게시물 수정");
		System.out.println("3.게시물 삭제");
		System.out.println("4.게시물 목록보기");
		System.out.println("5.게시물 상세보기");
		System.out.println("6.종료");
		System.out.println("===============");
		System.out.print("선택 =>");
	}//boardMenu
	
	public Member makeMember() {//회원가입 메서드
		System.out.print("ID : ");
		String id = sc2.nextLine();
		System.out.print("PW : ");
		String pw = sc2.nextLine();
		return new Member(id,pw);
	}//makeMember
	
	public Board makeBoard() {//게시물 등록 메서드
		System.out.print("제목 입력 : ");
		String title = sc2.nextLine();
		System.out.print("내용 입력 : ");
		String content = sc2.nextLine();
		
		return new Board(null,loginId,title,content,null,0);
	}//makeBoard
	
	public void detailBoard() {
		System.out.print("게시물 일련번호 입력 : ");
		String seq = sc2.nextLine();
		for(Board b:bm.selectAllBoard()) {
			if(b.getBoardSeq().equals(seq)) {
				System.out.println("제목 : " + b.getBoardTitle());
				System.out.println("등록자 : " + b.getId());
				System.out.println("내용 : " + b.getBoardContent());
			}
		}
	}
	
	

}//class
