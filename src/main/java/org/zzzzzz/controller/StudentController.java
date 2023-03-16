package org.zzzzzz.controller;

import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.zzzzzz.annotation.MyOnCondition;
import org.zzzzzz.pojo.Student;

@Controller
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private Student student;

    @ResponseBody
    @RequestMapping("/showStudentInfo")
    public String getStudentInfo() {
        String jsonString = JSON.toJSONString(student);
        return jsonString;
    }

    @RequestMapping("/index")
    public String showIndex() {
        return "index";
    }

}
