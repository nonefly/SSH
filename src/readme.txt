开发流程（根据个人爱好，不必要必须这样，只是这样比较逻辑上清晰，简单理解）
项目导入

我用的MyEclipse 10， 为了以免版本问题 建议自己创建项目，然后拷入代码调试

1.测试数据库创建了一张book表（spl在项目中）
2.部署好项目后访问路径  http://localhost:8080/ssh/book-getBook.action （端口号，项目url名称根据个人配置，注意我的是ssh小写，我改了项目访问名称，没改的大写SSH）
其中时间原因只做了 按照id查询的方法

一.dao层
   1. XxDao继承Dao(xx)
   2. XxDaoImpl继承BaseDao<xxInfo> implements xxDao
   3。/*构造方法中*/
	public XxDaoImpl() {
		super(xxInfo.class);
	}	    
二.biz层
	 1. XxBiz extendx Biz<xxInfo>
	 2. XxBizImpl继承BaseBiz<xxInfo> implements XxBiz
	 3.  Spring注入  xxDao 属性[getter] setter方法       setXxDao
	     public void setMailDao(XxDao xxDao) {
			this.xxDao = xxDao;
			this.dao = xxDao;
	     }
 
三。action层
	XxAction 中 Spring注入  xxBiz 
 
	    我打算这次项目中稍微加点东西，不包括课堂上