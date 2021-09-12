package cn.itcast.spring.test;

import cn.itcast.spring.Mapepr.BookMapper;
import cn.itcast.spring.pojo.Book;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class SpringTest {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Autowired
    private BookMapper bookMapper;

    @Test
    public void test(){
        Book book = new Book();
        book.setName("从入门到精通");
        book.setPrice(99d);
        System.out.println("book = " + book);
        bookMapper.saveBook(book);
    }
    @Test
    public void m1() {
        jdbcTemplate.execute("create table test002(id int,name varchar(20))");
    }
}
