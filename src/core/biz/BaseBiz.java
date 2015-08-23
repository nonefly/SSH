package core.biz;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import core.dao.Dao;

/**
 * 基本业务
 * @author nonefly
 * @param <T> 对象类型
 * 2015-8-18
 */
public class BaseBiz<T> implements Biz<T> {
	
	protected Dao<T> dao;

	public List<T> query(String hql){
		return this.dao.query(hql);
	}
	
	public List<T> getAll() {
		return this.dao.getAll();
	}

	public T getById(int id) {
		return this.dao.getById(id);
	}

	public void save(T entity) {
		this.dao.save(entity);
	}

	public void update(T entity) {
		this.dao.update(entity);
	}

	public void delete(int id) {
		this.delete(id);
	}
	
	public void delete(T entity) {
		this.delete(entity);
	}
	
}
