package com.reply.model;

import java.util.List;

public interface ReplyDAO_interface {
    public void insert(ReplyVO ReplyVO);
	public List<ReplyVO> getByCustomer(Integer customer_id);
}
