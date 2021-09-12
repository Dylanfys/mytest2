package cn.itcast.spring.proxy;

//接口（表示代理的目标接口）
public interface ICustomerService {
	//保存
	public void save();
	//查询
	public int find();
}