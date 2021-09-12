package cn.itcast.spring.e_xmlpropertydi;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Service
public class Car {
    private Integer id;
    private String name;
    private Double price;
}
