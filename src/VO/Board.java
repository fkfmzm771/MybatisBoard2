package VO;

public class Board {

	private String boardSeq;// 게시물 일련번호
	private String id;// 게시자
	private String boardTitle;// 게시물 제목
	private String boardContent;// 게시물 내용
	private String date;// 등록일
	private int hitCount;// 조회수

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
		return "게시물 번호=" + boardSeq + ", 게시자=" + id + ", 제목=" + boardTitle + ", 내용=" + boardContent + ", 등록일=" + date
				+ ", 조회수=" + hitCount + "]";
	}

}
