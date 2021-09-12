package cn.itcast.spring.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;

//账户操作持久层
//技术方案：jdbctempate
@Repository
public class AccountDaoImpl extends JdbcDaoSupport implements IAccountDao {
	@Autowired
	public void setSuperDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}
	//（存入）转入
	public void in(String name,Double money){
		String sql="update t_account set money = money+ ? where name = ?";

		super.getJdbcTemplate().update(sql, money,name);
	}
	
	//（取出）转出
	public void out(String name,Double money){
		String sql="update t_account set money = money- ? where name = ?";

		super.getJdbcTemplate().update(sql, money,name);
	}
}