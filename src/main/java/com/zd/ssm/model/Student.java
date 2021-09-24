package com.zd.ssm.model;
import lombok.*;
@Data
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Student {
    private Integer id;
    private String studentName;
    private Integer age;
    private char sex;
    private String addr;
    private String gradeId;
}
