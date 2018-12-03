package VO;

public class Member {
	
	private String id;//회원 아이디
	private String pw;//회원 비밀번호
	/**
	 * @param id
	 * @param pw
	 */
	public Member(String id, String pw) {
		super();
		this.id = id;
		this.pw = pw;
	}
	/**
	 * 
	 */
	public Member() {
		super();
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	
	@Override
	public String toString() {
		return "Member [아이디=" + id + ", 패스워드=" + pw + "]";
	}
	
	

}
