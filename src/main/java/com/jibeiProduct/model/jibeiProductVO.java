package com.jibeiProduct.model;

import java.sql.Timestamp;

public class jibeiProductVO implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer jibeiProduct_id;
	private Integer drink_id;
	private Integer jibeiProduct_price;
	private String jibeiProduct_des;
	private Integer jibeiProduct_amount;
	private Boolean jibeiProduct_status;
	private Timestamp jibeiProduct_updateTime;
	private Timestamp jibeiProduct_createTime;
	private Integer member_id;
	public Integer getJibeiProduct_id() {
		return jibeiProduct_id;
	}
	public void setJibeiProduct_id(Integer jibeiProduct_id) {
		this.jibeiProduct_id = jibeiProduct_id;
	}
	public Integer getDrink_id() {
		return drink_id;
	}
	public void setDrink_id(Integer drink_id) {
		this.drink_id = drink_id;
	}
	public Integer getJibeiProduct_price() {
		return jibeiProduct_price;
	}
	public void setJibeiProduct_price(Integer jibeiProduct_price) {
		this.jibeiProduct_price = jibeiProduct_price;
	}
	public String getJibeiProduct_des() {
		return jibeiProduct_des;
	}
	public void setJibeiProduct_des(String jibeiProduct_des) {
		this.jibeiProduct_des = jibeiProduct_des;
	}
	public Integer getJibeiProduct_amount() {
		return jibeiProduct_amount;
	}
	public void setJibeiProduct_amount(Integer jibeiProduct_amount) {
		this.jibeiProduct_amount = jibeiProduct_amount;
	}
	public Boolean getJibeiProduct_status() {
		return jibeiProduct_status;
	}
	public void setJibeiProduct_status(Boolean jibeiProduct_status) {
		this.jibeiProduct_status = jibeiProduct_status;
	}
	public Timestamp getJibeiProduct_updateTime() {
		return jibeiProduct_updateTime;
	}
	public void setJibeiProduct_updateTime(Timestamp jibeiProduct_updateTime) {
		this.jibeiProduct_updateTime = jibeiProduct_updateTime;
	}
	public Timestamp getJibeiProduct_createTime() {
		return jibeiProduct_createTime;
	}
	public void setJibeiProduct_createTime(Timestamp jibeiProduct_createTime) {
		this.jibeiProduct_createTime = jibeiProduct_createTime;
	}
	public Integer getMember_id() {
		return member_id;
	}
	public void setMember_id(Integer member_id) {
		this.member_id = member_id;
	}
	public jibeiProductVO(Integer jibeiProduct_id, Integer drink_id, Integer jibeiProduct_price,
			String jibeiProduct_des, Integer jibeiProduct_amount, Boolean jibeiProduct_status,
			Timestamp jibeiProduct_updateTime, Timestamp jibeiProduct_createTime, Integer member_id) {
		super();
		this.jibeiProduct_id = jibeiProduct_id;
		this.drink_id = drink_id;
		this.jibeiProduct_price = jibeiProduct_price;
		this.jibeiProduct_des = jibeiProduct_des;
		this.jibeiProduct_amount = jibeiProduct_amount;
		this.jibeiProduct_status = jibeiProduct_status;
		this.jibeiProduct_updateTime = jibeiProduct_updateTime;
		this.jibeiProduct_createTime = jibeiProduct_createTime;
		this.member_id = member_id;
	}
	public jibeiProductVO() {
		super();
	}
	
	
}
