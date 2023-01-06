package kr.co.ch05.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.ch05.VO.MemberVO;
import kr.co.ch05.dao.MemberDAO;

@Service
public class MemberService {
	
	@Autowired
	private MemberDAO dao;
	
	// service
	
	// create
	public void insertMember(MemberVO vo) {
		dao.insertMember(vo);
	}
	
	// read
	public MemberVO selectMember(String uid) {
		return dao.selectMember(uid);
	}
	public List<MemberVO> selectMembers() {
		return dao.selectMembers();
	}
	
	// upload
	public void updateMember(MemberVO vo) {
		dao.updateMember(vo);
	}
	
	// delete
	public void deleteMember(String uid) {
		dao.deleteMember(uid);
	}
}
