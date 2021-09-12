package cn.itcast.spring.a_ioc;

import org.springframework.stereotype.Repository;

@Repository
public class CustomerDao {
	
	public void save(){
		System.out.println("CustomerDao层被调用了");
	}

}