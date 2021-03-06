package com.kbk.controller;


import com.kbk.model.ExcellentStudent;
import com.kbk.model.Profession;
import com.kbk.service.Impl.ExcellentStudentServiceImpl;
import com.kbk.service.Impl.ProfessionServiceImpl;
import com.kbk.util.WebUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

/**
 *
 * @Description
 * @Author 况博凯
 * @Date 2021/02/26 10:14
 * @Version 1.0
 *
 */

@Controller
public class StudentController {
    @Autowired
    ExcellentStudentServiceImpl excellentStudentService;
    @Autowired
    ProfessionServiceImpl professionService;

    @RequestMapping(value = "/excellentStudent", method = RequestMethod.GET)
    public String excellentStudent(Map<String,Object> map){
        List<ExcellentStudent> studentList = excellentStudentService.selectAll();
        map.put("Exs",studentList);
        return "excellentStudent";
    }


    @RequestMapping(value = "/u/profession", method = RequestMethod.GET)
    public String profession(Map<String,Object> map, HttpServletRequest request){
        String IP = WebUtil.getIpAddress(request);

        List<Profession> professionList = professionService.selectAll();
        map.put("pro",professionList);
        return "profession";
    }
}
