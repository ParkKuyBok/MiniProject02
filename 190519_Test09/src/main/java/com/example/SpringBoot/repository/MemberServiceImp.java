package com.example.SpringBoot.repository;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SpringBoot.mapper.MemberMapper;

@Service
public class MemberServiceImp implements MemberService {

	private MemberMapper mmapper;
	
	@Autowired
	MemberServiceImp(MemberMapper mmapper){
		this.mmapper = mmapper;
	}
	
	@Override
	public List<Map<String, Object>> getMember() {
		return mmapper.getMember();
	}

}
