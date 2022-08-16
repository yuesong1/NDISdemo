package com.ndis.demo.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.ndis.demo.domain.Form;

public interface iFormService extends IService<Form> {

    IPage<Form> getPage(int currentPage, int pageSize);

}
