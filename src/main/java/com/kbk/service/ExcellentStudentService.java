package com.kbk.service;

import com.kbk.model.ExcellentStudent;
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
public interface ExcellentStudentService {

    /**
     * 查找Profession列表
     *
     * @param
     * @return Banner
     */
    List<ExcellentStudent> selectAll();
}