package core.dao;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 * 
 * @author nonefly
 * @param <T> 对象类型
 * 2015-8-18
 */
public class BaseDao<T> implements Dao<T> {
	
	private Session session;
	private SessionFactory sessionFactory;
	protected Class<T> entityClass;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	@Resource
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public BaseDao(Class<T> entityClass) {
		this.entityClass = entityClass;
	}
	
	public Session getSession() {
		return session == null ? sessionFactory.openSession() : session;
	}

	public List<T> query(String hql){
		Session session = this.getSession();
		Query query = session.createQuery(hql);
		@SuppressWarnings("unchecked")
		List<T> list = query.list();
		return list;
	}
	
	public List<T> getAll() {
		return query("from "+entityClass.getName());
	}

	public T getById(int id) {
		@SuppressWarnings("unchecked")
		T T = (T) this.getSession().get(entityClass,id);
		return T;
	}

	public void save(T entity) {
		Session session = this.getSession();
		Transaction ts = session.beginTransaction();
		try {
			session.save(entity);
			ts.commit();
		} catch (Exception e) {
			e.printStackTrace();
			ts.rollback();
		} 
	}

	public void update(T T) {
		Session session = this.getSession();
		Transaction ts = session.beginTransaction();
		try {
			session.update(T);
			ts.commit();
		} catch (Exception e) {
			e.printStackTrace();
			ts.rollback();
		}
	}

	public void delete(int id) {
		this.delete(this.getById(id));
	}
	@Override
	public void delete(T entity) {
		Session session = this.getSession();
		Transaction ts = session.beginTransaction();
		try {
			session.delete(entity);
			ts.commit();
		} catch (Exception e) {
			e.printStackTrace();
			ts.rollback();
		}
	}
	
}
