package VO;

public class Member {
	
	private String id;//ȸ�� ���̵�
	private String pw;//ȸ�� ��й�ȣ
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
		return "Member [���̵�=" + id + ", �н�����=" + pw + "]";
	}
	
	

}