package cn.itcast.spring.config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfig {
    @Bean
    public DataSource setComboPooledDataSource11() {
        DataSource c3p0 = new ComboPooledDataSource("otherc3p0");
        return c3p0;

    }
    @Bean
    public JdbcTemplate jdbcTemplate() {
        return new JdbcTemplate(setComboPooledDataSource11());
    }
}
