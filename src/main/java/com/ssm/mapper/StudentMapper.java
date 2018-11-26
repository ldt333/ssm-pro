package com.ssm.mapper;

import java.util.List;

import com.ssm.model.Student;

import tk.mybatis.mapper.common.Mapper;

public interface StudentMapper extends Mapper<Student>{

    List<Student> listAll();
}
