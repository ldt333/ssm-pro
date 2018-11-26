package com.ssm.service;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ssm.mapper.StudentMapper;
import com.ssm.model.Student;

import tk.mybatis.mapper.entity.Example;

@RunWith(SpringJUnit4ClassRunner.class) // 使用junit4进行测试
@ContextConfiguration(locations = { "classpath:applicationContext.xml" }) // 加载配置文件
public class StudentServiceTest {

    @Autowired
    private StudentMapper studentMapper;
    
    @Autowired
    private StudentService studentService;
    
    @Test
    public void testListAll(){
        PageHelper.startPage(1, 2);
        List<Student> stuList = studentService.listAll();
        PageInfo<Student> pageInfo = new PageInfo<>(stuList);
        List<Student> list = pageInfo.getList();
        for (Student student : list) {
            System.out.println(student);
        }
    }
    
    @Test
    public void testSelectByPrimaryKey(){
        Student student = studentMapper.selectByPrimaryKey("2");
        System.out.println(student);
    }
    
    @Test
    public void testSelectByExample(){
        Example example = new Example(Student.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andLike("name", "%b%");
        List<Student> studentList = studentMapper.selectByExample(example);
        System.out.println(studentList);
    }
}
