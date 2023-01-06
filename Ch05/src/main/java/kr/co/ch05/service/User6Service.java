package kr.co.ch05.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.ch05.VO.User6VO;
import kr.co.ch05.dao.User6DAO;

@Service
public class User6Service {
	
	@Autowired
	private User6DAO dao;
	
	// create
	public void insertUser6(User6VO vo) {
		dao.insertUser6(vo);
	}
	
	// read
	public User6VO selectUser6(String uid) {
		return dao.selectUser6(uid);
	}
	public List<User6VO> selectUser6s() {
		return dao.selectUser6s();
	}
	
	// upload
	public void updateUser6(User6VO vo) {
		dao.updateUser6(vo);
	}
	
	// delete
	public void deleteUser6(String uid) {
		dao.deleteUser6(uid);
	}
}
