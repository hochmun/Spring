package kr.co.ch05.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.ch05.VO.User6VO;

@Repository
public class User6DAO {
	
	@Autowired
	private SqlSessionTemplate mybatis;
	
	// create
	public void insertUser6(User6VO vo) {
		mybatis.insert("user6.insertUser6", vo);
	}
	
	// read
	public User6VO selectUser6(String uid) {
		return mybatis.selectOne("user6.selectUser6", uid);
	}
	public List<User6VO> selectUser6s() {
		return mybatis.selectList("user6.selectUser6s");
	}
	
	// upload
	public void updateUser6(User6VO vo) {
		mybatis.update("user6.updateUser6", vo);
	}
	
	// delete
	public void deleteUser6(String uid) {
		mybatis.delete("user6.deleteUser6", uid);
	}
	
}
