package com.ndis.demo.dao;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ndis.demo.domain.Form;
import com.ndis.demo.domain.dao.FormDao;
import org.apache.logging.log4j.util.Strings;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class FormDaoTestCase {
    @Autowired
    private FormDao formDao;
    @Test
    void testGetById(){
        System.out.println(formDao.selectById(1));
    }
    @Test
    void testSave(){


       // for(int i=0;i<10;i++){

            Form form1=new Form();
            form1.setName("test");
            formDao.insert(form1);
      //  }
    }
    @Test
    void testGetPage(){
        //page num, quantity
        IPage page=new Page(2,5);
        formDao.selectPage(page,null);
        // current page index
        // page.getPages()
        // list of record
        // page.getRecords()
    }
    @Test
    void testGetBy(){
        QueryWrapper<Form> qw=new QueryWrapper<Form>();
        qw.like("name", '1');
        formDao.selectList(qw);
    }
    @Test
    void testGetByL(){
        String name="1";
        LambdaQueryWrapper<Form> lqw=new LambdaQueryWrapper<Form>();

        //lqw.like(name!=null,Form::getName, name);
        lqw.like(Strings.isNotEmpty(name),Form::getName, name);
        formDao.selectList(lqw);
        //select indside page
        //formDao.selectList(page,lqw);
    }
}
