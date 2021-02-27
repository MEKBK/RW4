package com.kbk.dao;

import com.kbk.model.Profession;
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
public interface ProfessionMapper {
    /**
     * 查找Profession列表
     * @param
     * @return Banner
     */

    List<Profession> selectAll();
}