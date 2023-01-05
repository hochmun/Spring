package kr.co.ch05.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.ch05.VO.User3VO;
import kr.co.ch05.dao.User3DAO;

@Service
public class User3Service {
	
	@Autowired
	private User3DAO dao;
	
	// service
	
	// create
	public void insertUser3(User3VO vo) {
		dao.insertUser3(vo);
	}
	
	// read
	public User3VO selectUser3(String uid) {
		return dao.selectUser3(uid);
	}
	public List<User3VO> selectUser3s() {
		return dao.selectUser3s();
	}
	
	// upload
	public void updateUser3(User3VO vo) {
		dao.updateUser3(vo);
	}
	
	// delete
	public void deleteUser3(String uid) {
		dao.deleteUser3(uid);
	}
}
