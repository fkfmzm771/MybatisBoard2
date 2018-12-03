package VO;

public class Board {

	private String boardSeq;// �Խù� �Ϸù�ȣ
	private String id;// �Խ���
	private String boardTitle;// �Խù� ����
	private String boardContent;// �Խù� ����
	private String date;// �����
	private int hitCount;// ��ȸ��

	/**
	 * @param boardseq
	 * @param id
	 * @param boardTitle
	 * @param boardContent
	 * @param date
	 * @param hitCount
	 */
	public Board(String boardSeq, String id, String boardTitle, String boardContent, String date, int hitCount) {
		super();
		this.boardSeq = boardSeq;
		this.id = id;
		this.boardTitle = boardTitle;
		this.boardContent = boardContent;
		this.date = date;
		this.hitCount = hitCount;
	}

	/**
	 * 
	 */
	public Board() {
		super();
	}

	public String getBoardSeq() {
		return boardSeq;
	}

	public void setBoardSeq(String boardSeq) {
		this.boardSeq = boardSeq;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getBoardTitle() {
		return boardTitle;
	}

	public void setBoardTitle(String boardTitle) {
		this.boardTitle = boardTitle;
	}

	public String getBoardContent() {
		return boardContent;
	}

	public void setBoardContent(String boardContent) {
		this.boardContent = boardContent;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getHitCount() {
		return hitCount;
	}

	public void setHitCount(int hitCount) {
		this.hitCount = hitCount;
	}

	@Override
	public String toString() {
		return "�Խù� ��ȣ=" + boardSeq + ", �Խ���=" + id + ", ����=" + boardTitle + ", ����=" + boardContent + ", �����=" + date
				+ ", ��ȸ��=" + hitCount + "]";
	}

}
