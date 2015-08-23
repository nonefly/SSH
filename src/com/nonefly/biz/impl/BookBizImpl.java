package com.nonefly.biz.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.nonefly.bean.BookInfo;
import com.nonefly.biz.BookBiz;
import com.nonefly.dao.BookDao;

import core.biz.BaseBiz;

@Service
public class BookBizImpl extends BaseBiz<BookInfo> implements BookBiz{
	private BookDao bookDao;

	@Resource
	public void setRoleAuthorityDao(BookDao bookDao) {
		this.bookDao = bookDao;
		this.dao = bookDao;
	}
}
