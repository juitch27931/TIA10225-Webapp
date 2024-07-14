package com.product.model;

import java.sql.Timestamp;

public class productVO implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer product_id;
	private String product_name;
	private Integer product_discountPrice;
	private Integer product_dprice;
	private String product_des;
	private Integer product_inv;
	private Boolean product_status;
	private String product_tag;
	private byte[] product_pic;
	private Timestamp product_updateTime;
	private Timestamp product_createTime;
	private Integer member_id;
	
	public Integer getProduct_id() {
		return product_id;
	}
	public void setProduct_id(Integer product_id) {
		this.product_id = product_id;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public Integer getProduct_discountPrice() {
		return product_discountPrice;
	}
	public void setProduct_discountPrice(Integer product_discountPrice) {
		this.product_discountPrice = product_discountPrice;
	}
	public Integer getProduct_dprice() {
		return product_dprice;
	}
	public void setProduct_dprice(Integer product_dprice) {
		this.product_dprice = product_dprice;
	}
	public String getProduct_des() {
		return product_des;
	}
	public void setProduct_des(String product_des) {
		this.product_des = product_des;
	}
	public Integer getProduct_inv() {
		return product_inv;
	}
	public void setProduct_inv(Integer product_inv) {
		this.product_inv = product_inv;
	}
	public Boolean getProduct_status() {
		return product_status;
	}
	public void setProduct_status(Boolean product_status) {
		this.product_status = product_status;
	}
	public String getProduct_tag() {
		return product_tag;
	}
	public void setProduct_tag(String product_tag) {
		this.product_tag = product_tag;
	}
	public byte[] getProduct_pic() {
		return product_pic;
	}
	public void setProduct_pic(byte[] product_pic) {
		this.product_pic = product_pic;
	}
	public Timestamp getProduct_updateTime() {
		return product_updateTime;
	}
	public void setProduct_updateTime(Timestamp product_updateTime) {
		this.product_updateTime = product_updateTime;
	}
	public Timestamp getProduct_createTime() {
		return product_createTime;
	}
	public void setProduct_createTime(Timestamp product_createTime) {
		this.product_createTime = product_createTime;
	}
	public Integer getMember_id() {
		return member_id;
	}
	public void setMember_id(Integer member_id) {
		this.member_id = member_id;
	}
	public productVO(Integer product_id, String product_name, Integer product_discountPrice, Integer product_dprice,
			String product_des, Integer product_inv, Boolean product_status, String product_tag, byte[] product_pic,
			Timestamp product_updateTime, Timestamp product_createTime, Integer member_id) {
		super();
		this.product_id = product_id;
		this.product_name = product_name;
		this.product_discountPrice = product_discountPrice;
		this.product_dprice = product_dprice;
		this.product_des = product_des;
		this.product_inv = product_inv;
		this.product_status = product_status;
		this.product_tag = product_tag;
		this.product_pic = product_pic;
		this.product_updateTime = product_updateTime;
		this.product_createTime = product_createTime;
		this.member_id = member_id;
	}
	public productVO() {
		super();
	}

	
}
