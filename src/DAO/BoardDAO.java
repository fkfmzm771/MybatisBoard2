package DAO;

import VO.Board;
import VO.Member;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.ArrayList;

public class BoardDAO {
	
	private SqlSessionFactory factory = MybatisConfig.getSqlSessionFactory();
	
	public boolean insertMember(Member m) {
		SqlSession session = factory.openSession();
		Mapper mapper = session.getMapper(Mapper.class);
		
		int result = mapper.insertMember(m);
		
		
		if(result == 1) {
			session.commit();
			return true;
		}else {
			return false;
		}
	}//BoardDAO
	
	public Member loginMember(Member m) {
		Member result = null;
		
		SqlSession session = factory.openSession();
		Mapper mapper = session.getMapper(Mapper.class);
		
		result = mapper.loginMember(m);
		
		return result;
	}
	
	public void insertBoard(Board b) {
		SqlSession session = factory.openSession();
		Mapper mapper = session.getMapper(Mapper.class);
		
		mapper.insertBoard(b);
		
			session.commit();
		
	}
	
	public ArrayList<Board> selectAllBoard(){
		ArrayList<Board> bList = new ArrayList<>();
		
		SqlSession session = factory.openSession();
		Mapper mapper = session.getMapper(Mapper.class);
		
		bList = mapper.selectAllBoard();
		
		return bList;
	}
	
}
