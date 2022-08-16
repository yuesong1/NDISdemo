package com.ndis.demo.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.ndis.demo.domain.Form;

import java.util.List;

public interface FormService {
    Boolean save(Form form);
    Boolean update(Form form);
    Boolean delete(Integer id);
    Form getById(Integer id);
    List<Form> getAll();
    IPage<Form> getPage(int currentPage, int pageSize);

}
