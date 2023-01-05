package kr.co.ch05.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.ch05.VO.User3VO;

@Repository
public class User3DAO {
	
	@Autowired
	private SqlSessionTemplate mybatis;
	
	// create
	public void insertUser3(User3VO vo) {
		mybatis.insert("user3.insertUser3", vo);
	}
	
	// read
	public User3VO selectUser3(String uid) {
		return mybatis.selectOne("user3.selectUser3", uid);
	}
	public List<User3VO> selectUser3s() {
		return mybatis.selectList("user3.selectUser3s");
	}
	
	// upload
	public void updateUser3(User3VO vo) {
		mybatis.update("user3.updateUser3", vo);
	}
	
	// delete
	public void deleteUser3(String uid) {
		mybatis.delete("user3.deleteUser3", uid);
	}
}
