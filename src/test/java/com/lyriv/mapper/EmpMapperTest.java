package com.lyriv.mapper;

import com.lyriv.pojo.Emp;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

@SpringBootTest
public class EmpMapperTest {
    @Autowired
    private EmpMapper empMapper;
    @Test
    public void EmpTest(){
        List<Emp> EmpFind = empMapper.findBycondition1(null,"1",null,null);
        System.out.println(EmpFind);
        System.out.println(EmpFind);
        System.out.println(EmpFind);
    }

    @Test
    public void updata1(){
        Emp emp = new Emp();
        emp.setId(17);
        emp.setName("dwm");
        emp.setGender((short) 1);
        emp.setUpdateTime(LocalDateTime.now());
        empMapper.upDate(emp);
    }

    @Test
    public void del(){
        List<Integer> ids= Arrays.asList(2,3,17);
        empMapper.del(ids);
        System.out.println("删除成功");
    }
}