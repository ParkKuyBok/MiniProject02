package com.example.SpringBoot.Controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.SpringBoot.repository.MemberService;

@Controller
@RequestMapping("/member")
public class MemberController {

	private MemberService mservice;
	
	@Autowired
	MemberController(MemberService mservice){
		this.mservice = mservice;
	}
	
	@GetMapping("/testlist")
	@ResponseBody
	public List<Map<String, Object>> getMember() {
		return mservice.getMember();
	}
	
}
