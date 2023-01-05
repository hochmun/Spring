package kr.co.ch05.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.ch05.VO.User4VO;
import kr.co.ch05.dao.User4DAO;

@Service
public class User4Service {
	
	@Autowired
	private User4DAO dao;
	
	// service
	
	// create
	public void insertUser4(User4VO vo) {
		dao.insertUser4(vo);
	}
	
	// read
	public User4VO selectUser4(String seq) {
		return dao.selectUser4(seq);
	}
	public List<User4VO> selectUser4s() {
		return dao.selectUser4s();
	}
	
	// upload
	public void updateUser4(User4VO vo) {
		dao.updateUser4(vo);
	}
	
	// delete
	public void deleteUser4(String seq) {
		dao.deleteUser4(seq);
	}
}
