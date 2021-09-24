package com.zd.ssm.mapper;
import com.zd.ssm.model.Student;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import java.util.List;
@Mapper
public interface StudentMapper {
    @Insert("insert into student(id,student_name,age,sex,addr,grade_id) values (#{id},#{studentName},#{age},#{sex},#{addr},#{gradeId})")
    void insert(Student student);
    @Select("select id,student_name as studentName,age,sex,addr,grade_id as gradeId from student")
    List<Student> allStudent();
}
