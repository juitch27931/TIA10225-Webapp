package com.reply.model;

import java.sql.Timestamp;

public class ReplyVO implements java.io.Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer reply_id;
	private Integer customer_id;
	private String reply_subject;
	private String reply_message;
	private Timestamp reply_time;
	private Integer member_id;
	
	public Integer getReply_id() {
		return reply_id;
	}
	public void setReply_id(Integer reply_id) {
		this.reply_id = reply_id;
	}
	public Integer getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(Integer customer_id) {
		this.customer_id = customer_id;
	}
	public String getReply_subject() {
		return reply_subject;
	}
	public void setReply_subject(String reply_subject) {
		this.reply_subject = reply_subject;
	}
	public String getReply_message() {
		return reply_message;
	}
	public void setReply_message(String reply_message) {
		this.reply_message = reply_message;
	}
	public Timestamp getReply_time() {
		return reply_time;
	}
	public void setReply_time(Timestamp reply_time) {
		this.reply_time = reply_time;
	}
	public Integer getMember_id() {
		return member_id;
	}
	public void setMember_id(Integer member_id) {
		this.member_id = member_id;
	}
	public ReplyVO(Integer reply_id, Integer customer_id, String reply_subject, String reply_message,
			Timestamp reply_time, Integer member_id) {
		super();
		this.reply_id = reply_id;
		this.customer_id = customer_id;
		this.reply_subject = reply_subject;
		this.reply_message = reply_message;
		this.reply_time = reply_time;
		this.member_id = member_id;
	}
	public ReplyVO() {
		super();
	}

}
