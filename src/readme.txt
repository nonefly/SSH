�������̣����ݸ��˰��ã�����Ҫ����������ֻ�������Ƚ��߼�������������⣩
��Ŀ����

���õ�MyEclipse 10�� Ϊ������汾���� �����Լ�������Ŀ��Ȼ����������

1.�������ݿⴴ����һ��book��spl����Ŀ�У�
2.�������Ŀ�����·��  http://localhost:8080/ssh/book-getBook.action ���˿ںţ���Ŀurl���Ƹ��ݸ������ã�ע���ҵ���sshСд���Ҹ�����Ŀ�������ƣ�û�ĵĴ�дSSH��
����ʱ��ԭ��ֻ���� ����id��ѯ�ķ���

һ.dao��
   1. XxDao�̳�Dao(xx)
   2. XxDaoImpl�̳�BaseDao<xxInfo> implements xxDao
   3��/*���췽����*/
	public XxDaoImpl() {
		super(xxInfo.class);
	}	    
��.biz��
	 1. XxBiz extendx Biz<xxInfo>
	 2. XxBizImpl�̳�BaseBiz<xxInfo> implements XxBiz
	 3.  Springע��  xxDao ����[getter] setter����       setXxDao
	     public void setMailDao(XxDao xxDao) {
			this.xxDao = xxDao;
			this.dao = xxDao;
	     }
 
����action��
	XxAction �� Springע��  xxBiz 
 
	    �Ҵ��������Ŀ����΢�ӵ㶫����������������