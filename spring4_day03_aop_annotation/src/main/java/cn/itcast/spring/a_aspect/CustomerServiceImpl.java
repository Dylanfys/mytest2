package cn.itcast.spring.a_aspect;

import org.springframework.stereotype.Service;

@Service()
public class CustomerServiceImpl implements CustomerService {

	public void save() {
		System.out.println("客户保存了。。。。。");
		
	}

	public int find() {
		System.out.println("客户查询数量了。。。。。");
		return 100;
	}

}