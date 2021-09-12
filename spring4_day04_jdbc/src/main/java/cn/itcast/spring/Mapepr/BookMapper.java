package cn.itcast.spring.Mapepr;

import cn.itcast.spring.pojo.Book;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;


public class BookMapper extends JdbcDaoSupport {


    public void saveBook(Book book) {
        String sql = "insert into book values(null,?,?)";
        JdbcTemplate jdbcTemplate = this.getJdbcTemplate();
//        jdbcTemplate.execute("create table test004(id int,name varchar(20))");
        jdbcTemplate.update(sql, book.getName(), book.getPrice());

    }
}
