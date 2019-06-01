package com.example.SpringBoot.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.example.SpringBoot.entity.MemberDto;

@Repository
@Mapper
public interface MemberMapper {

	
	public List<Map<String, Object>> getMember(); //List 목록
	
}
