package com.kbk.service.Impl;

import com.kbk.dao.ExcellentStudentMapper;
import com.kbk.model.ExcellentStudent;
import com.kbk.service.ExcellentStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 *
 * @Description
 * @Author 况博凯
 * @Date 2021/02/26 10:14
 * @Version 1.0
 *
 */
@Service
public class ExcellentStudentServiceImpl implements ExcellentStudentService {
    @Autowired
    ExcellentStudentMapper excellentStudentMapper;

    @Override
    public List<ExcellentStudent> selectAll(){
        return excellentStudentMapper.selectAll();
    }

}
