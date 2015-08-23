package com.nonefly.dao.impl;

import org.springframework.stereotype.Component;

import com.nonefly.bean.BookInfo;
import com.nonefly.dao.BookDao;

import core.dao.BaseDao;

@Component
public class BookDaoImpl extends BaseDao<BookInfo> implements BookDao {
	public BookDaoImpl() {
		super(BookInfo.class);
	}
}
