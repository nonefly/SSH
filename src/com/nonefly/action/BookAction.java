package com.nonefly.action;

import java.util.Map;

import javax.annotation.Resource;

import org.apache.struts2.interceptor.SessionAware;
import org.springframework.stereotype.Controller;

import com.nonefly.bean.BookInfo;
import com.nonefly.biz.BookBiz;
import com.opensymphony.xwork2.ActionSupport;

@Controller
public class BookAction extends ActionSupport implements SessionAware{
	private Map<String, Object> session;
	
	
	@Resource
	private BookBiz bookBiz;

	public String getBook() {
		BookInfo book = bookBiz.getById(2);
		session.put("BOOK", book);
		return this.SUCCESS;
	}
	
	
	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
	
	
}
