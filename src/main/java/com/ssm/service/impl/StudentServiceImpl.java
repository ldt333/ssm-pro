package com.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.mapper.StudentMapper;
import com.ssm.model.Student;
import com.ssm.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired 
    private StudentMapper studentMapper;
    
    /* (non-Javadoc)
     * @see com.ssm.service.impl.StudentService#listAll()
     */
    @Override
    public List<Student> listAll(){
        return studentMapper.listAll();
    }
}
