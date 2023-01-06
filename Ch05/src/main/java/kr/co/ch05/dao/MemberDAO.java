package kr.co.ch05.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.ch05.VO.MemberVO;

@Repository
public class MemberDAO {
	
	@Autowired
	private SqlSessionTemplate mybatis;
	
	// create
	public void insertMember(MemberVO vo) {
		mybatis.insert("member.insertMember", vo);
	}
	
	// read
	public MemberVO selectMember(String uid) {
		return mybatis.selectOne("member.selectMember", uid);
	}
	public List<MemberVO> selectMembers() {
		return mybatis.selectList("member.selectMembers");
	}
	
	// upload
	public void updateMember(MemberVO vo) {
		mybatis.update("member.updateMember", vo);
	}
	
	// delete
	public void deleteMember(String uid) {
		mybatis.delete("member.deleteMember", uid);
	}
}
