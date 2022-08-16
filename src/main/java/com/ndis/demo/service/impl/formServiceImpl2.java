package com.ndis.demo.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ndis.demo.domain.Form;
import com.ndis.demo.domain.dao.FormDao;
import com.ndis.demo.service.iFormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class formServiceImpl2 extends ServiceImpl<FormDao, Form> implements iFormService {

    @Autowired
    private FormDao formDao;
    @Override
    public IPage<Form> getPage(int currentPage, int pageSize) {
        IPage page=new Page(currentPage, pageSize);
        formDao.selectPage(page,null);
        return page;
    }
}
