package cn.itcast.spring.service;

import cn.itcast.spring.proxy.ICustomerService;
import org.springframework.stereotype.Service;

//实现类
@Service
public class CustomerServiceImpl implements ICustomerService {

	public void save() {
		System.out.println("客户保存了。。。。。");
	}

	public int find() {
		System.out.println("客户查询数量了。。。。。");
		return 100;
	}
}