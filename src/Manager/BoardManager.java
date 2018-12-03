package Manager;

import java.util.*;

import DAO.*;
import VO.*;

public class BoardManager {

    private ArrayList<Board> bList = new ArrayList<>();
    private BoardDAO dao = new BoardDAO();

    public boolean insertMember(Member m) {//회원 가입 메서드
        boolean result = false;

        result = dao.insertMember(m);

        return result;
    }

    public Member loginMember(Member m) {//회원 로그인 메서드
        Member result = null;

        result = dao.loginMember(m);

        return result;
    }

    public void insertBoard(Board b) {
        dao.insertBoard(b);
    }

    public ArrayList<Board> selectAllBoard() {
        bList = dao.selectAllBoard();

        return bList;
    }

}
