package com.example.SpringBoot.entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Data
@Alias("mdto")
public class MemberDto {

	private int no;
	private String id;
	private String pw;
	private String nick;
	private String birth;
	private String email;
	private String phone;
	private String post;
	private String addr1;
	private String addr2;
	private String rank;
	private int point;
	private String reg;
	private String account;
	
	public MemberDto() {
		
	}
	
	public void setResultSet(ResultSet rs) throws SQLException {
		setNo(rs.getInt("no"));
		setId(rs.getString("id"));
		setPw(rs.getString("pw"));
		setNick(rs.getString("nick"));
		setBirth(rs.getString("birth"));
		setEmail(rs.getString("email"));
		setPhone(rs.getString("phone"));
		setPost(rs.getString("post"));
		setAddr1(rs.getString("addr1"));
		setAddr2(rs.getString("addr2"));
		setRank(rs.getString("rank"));
		setPoint(rs.getInt("point"));
		setReg(rs.getString("reg"));
		setAccount(rs.getString("account"));
	}
}
