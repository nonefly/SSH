package core.dao;

import java.util.List;
/**
 * �������ݿ����
 * 
 * @author nonefly
 * 
 * @param <T> ��������
 * 2015-8-18
 */
public interface Dao<T> {
		
	/**
	 * ��ѯ�б�
	 * 
	 * @return List ��ѯ���
	 */
	public List<T> getAll();
	
	/**
	 * ����HQL��ѯ������ѯ
	 * 
	 * @param hql ��ѯ���
	 * 
	 * @return List ��ѯ���
	 */
	public List<T> query(String hql);
	
	/**
	 * ����ID��ѯ����
	 * 
	 * @param id IDֵ
	 * 
	 * @return ��ѯ���
	 */
	public T getById(int id);

	/**
	 * �־û�����
	 * 
	 * @param entity ������ʵ��
	 */
	public void save(T entity);
	
	/**
	 * ���ݸ����Ķ����ʶ�����¶���ʵ��
	 * 
	 * @param entity ����ʵ��
	 */
	public void update(T entity);
	
	/**
	 * ����IDɾ������ʵ��
	 * 
	 * @param id IDֵ
	 */
	public void delete(int id);
	
	/**
	 * ɾ������ʵ��
	 * 
	 * @param entity ����ʵ��
	 */
	public void delete(T entity);
}
