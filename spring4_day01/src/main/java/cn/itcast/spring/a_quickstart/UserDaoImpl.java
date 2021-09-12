package cn.itcast.spring.a_quickstart;

public class UserDaoImpl implements IUserDao {
	//git注释
	@Override
	public void findByUsernameAndPassword() {
		System.out.println("UserDaoImpl-dao层被调用了");
	}

}