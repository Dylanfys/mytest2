
package cn.itcast.spring.service;

import org.springframework.stereotype.Service;

//没@有接口的类
@Service
public class ProductService {
	public void save() {
		System.out.println("商品保存了。。。。。");
		
	}

	public int find() {
		System.out.println("商品查询数量了。。。。。");
		return 99;
	}

	public int eat(int a) {
		return a + 1;
	}
}