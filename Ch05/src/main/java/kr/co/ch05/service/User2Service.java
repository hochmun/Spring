package kr.co.ch05.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.ch05.VO.User2VO;
import kr.co.ch05.dao.User2DAO;

@Service
public class User2Service {
	
	@Autowired
	private User2DAO dao;
	
	//service
	
	// create
	public void insertUser2(User2VO vo) {
		dao.insertUser2(vo);
	}
	
	// read
	public User2VO selectUser2(String uid) {
		return dao.selectUser2(uid);
	}
	public List<User2VO> selectUser2s() {
		return dao.selectUser2s();
	}
	
	// upload
	public void updateUser2(User2VO vo) {
		dao.updateUser2(vo);
	}
	
	// delete
	public void deleteUser2(String uid) {
		dao.deleteUser2(uid);
	}
}
