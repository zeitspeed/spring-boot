package com.lyriv.mapper;

import com.lyriv.pojo.Emp;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface EmpMapper {
    List<Emp> findBycondition1(String name,String gender,String begin,String end);
    void upDate(Emp emp);

    void del(List<Integer> ids);
}
