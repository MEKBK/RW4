package com.kbk.service.Impl;

import com.kbk.dao.ProfessionMapper;
import com.kbk.model.Profession;
import com.kbk.service.ProfessionService;
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
public class ProfessionServiceImpl implements ProfessionService {
    @Autowired
    ProfessionMapper professionMapper;

    @Override
    public List<Profession> selectAll(){
        return professionMapper.selectAll();
    }
}
