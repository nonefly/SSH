package core.dao;

import java.util.List;
/**
 * 基本数据库操作
 * 
 * @author nonefly
 * 
 * @param <T> 对象类型
 * 2015-8-18
 */
public interface Dao<T> {
		
	/**
	 * 查询列表
	 * 
	 * @return List 查询结果
	 */
	public List<T> getAll();
	
	/**
	 * 根据HQL查询条件查询
	 * 
	 * @param hql 查询语句
	 * 
	 * @return List 查询结果
	 */
	public List<T> query(String hql);
	
	/**
	 * 根据ID查询对象
	 * 
	 * @param id ID值
	 * 
	 * @return 查询结果
	 */
	public T getById(int id);

	/**
	 * 持久化对象
	 * 
	 * @param entity 待保存实体
	 */
	public void save(T entity);
	
	/**
	 * 根据给定的对象标识符更新对象实体
	 * 
	 * @param entity 对象实体
	 */
	public void update(T entity);
	
	/**
	 * 根据ID删除对象实体
	 * 
	 * @param id ID值
	 */
	public void delete(int id);
	
	/**
	 * 删除对象实体
	 * 
	 * @param entity 对象实体
	 */
	public void delete(T entity);
}
