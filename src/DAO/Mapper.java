package DAO;

import java.util.ArrayList;

import VO.*;

public interface Mapper {

    int insertMember(Member m);//ȸ������

    Member loginMember(Member m);//ȸ�� �α���

    void insertBoard(Board b);//�Խù� ���

    ArrayList<Board> selectAllBoard();

}
