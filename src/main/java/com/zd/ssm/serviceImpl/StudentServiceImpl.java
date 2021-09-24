package com.zd.ssm.serviceImpl;
import com.zd.ssm.mapper.StudentMapper;
import com.zd.ssm.model.Student;
import com.zd.ssm.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;

    public List<Student> allStudent(){
        return studentMapper.allStudent();
    }
}
