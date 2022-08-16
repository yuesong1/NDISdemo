package com.ndis.demo.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ndis.demo.domain.Form;
import com.ndis.demo.domain.dao.FormDao;
import com.ndis.demo.service.FormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FormServiceImpl implements FormService {

    @Autowired
    private FormDao formDao;
    @Override
    public Boolean save(Form form) {

        return formDao.insert(form)>0;
    }

    @Override
    public Boolean update(Form form) {
        return formDao.updateById(form)>0;
    }

    @Override
    public Boolean delete(Integer id) {
        return formDao.deleteById(id)>0;
    }

    @Override
    public Form getById(Integer id) {
        return formDao.selectById(id);
    }

    @Override
    public List<Form> getAll() {
        return formDao.selectList(null);
    }

    @Override
    public IPage<Form> getPage(int currentPage, int pageSize) {
        IPage page=new Page(currentPage,pageSize);
        return formDao.selectPage(page,null);
    }
}
