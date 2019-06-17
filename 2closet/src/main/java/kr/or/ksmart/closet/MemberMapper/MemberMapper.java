package kr.or.ksmart.closet.MemberMapper;

import org.apache.ibatis.annotations.Mapper;

import kr.or.ksmart.closet.vo.Member;

@Mapper
public interface MemberMapper {
	// memberList 출력하기
	public Member selectMemberList();

}
