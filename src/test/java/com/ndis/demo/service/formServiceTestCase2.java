package com.ndis.demo.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ndis.demo.domain.Form;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class formServiceTestCase2 {

    @Autowired
    private iFormService formService;

    @Test
    void testGetById(){
        System.out.println(formService.getById(4));
    }
    @Test
    void testDelete(){
        formService.removeById(1);
    }
    @Test
    void testGetAll(){
        formService.list();
    }

    @Test
    void testSave(){
        Form form1=new Form();
        form1.setName("test");
        formService.save(form1);
        //  }
    }
    @Test
    void testUpdate(){
        Form form=new Form();
        form.setId(18);
        form.setName("Test Interface2");
        formService.updateById(form);
    }
    @Test
    void testGetPage(){
        //page num, quantity
        IPage<Form> page=new Page<Form>(2,5);
        formService.page(page);
        System.out.println(page.getCurrent());
        System.out.println(page.getSize());
        System.out.println(page.getTotal());
        System.out.println(page.getPages());
        System.out.println(page.getRecords());

    }

}
