package DAO;

import java.util.ArrayList;

import VO.*;

public interface Mapper {

    int insertMember(Member m);//회원가입

    Member loginMember(Member m);//회원 로그인

    void insertBoard(Board b);//게시물 등록

    ArrayList<Board> selectAllBoard();

}
