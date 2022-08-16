package com.ndis.demo.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.ndis.demo.domain.Form;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class formServiceTestCase {

    @Autowired
    private FormService formService;

    @Test
    void testGetById(){
        System.out.println(formService.getById(4));
    }
    @Test
    void testDelete(){
        formService.delete(1);
    }
    @Test
    void testGetAll(){
        formService.getAll();
    }

    @Test
    void testSave(){


        // for(int i=0;i<10;i++){

        Form form1=new Form();
        form1.setName("test");
        formService.save(form1);
        //  }
    }
    @Test
    void testGetPage(){
        //page num, quantity
        IPage page=formService.getPage(2,5);
        System.out.println(page.getCurrent());
        System.out.println(page.getSize());
        System.out.println(page.getTotal());
        System.out.println(page.getPages());
        System.out.println(page.getRecords());

    }

}
