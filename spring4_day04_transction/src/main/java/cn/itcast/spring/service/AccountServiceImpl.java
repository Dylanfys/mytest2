package cn.itcast.spring.service;

import cn.itcast.spring.dao.IAccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("accountService")
@Transactional
public class AccountServiceImpl implements IAccountService{
	
	@Autowired
	private IAccountDao accountDao;

	//转账操作的业务逻辑
	public void transfer(String outName,String inName,Double money){
		//调用dao层
		//先取出
		accountDao.out(outName, money);
//
		//再转入
		accountDao.in(inName, money);
	}
	@Transactional(readOnly = true)
	public void t1() {
		int i = 1 / 0;
		System.out.println("覆盖全局事务");
	}

}