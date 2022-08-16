package com.ndis.demo.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.ndis.demo.domain.Form;
import com.ndis.demo.service.iFormService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@RestController
@RequestMapping("/forms")
public class formController {

    @Autowired
    private iFormService iformService;

    @GetMapping
    public List<Form> getAll(){
        return iformService.list();
    }

    @PostMapping
    public Boolean save(@RequestBody Form form){
        return iformService.save(form);
    }

    @PutMapping
    public Boolean update(@RequestBody Form form){
        return iformService.updateById(form);
    }

    @DeleteMapping("{id}")
    public Boolean delete(@PathVariable Integer id){
        return iformService.removeById(id);
    }

    //http:localhost/forms/2
    @GetMapping("{id}")
    public Form getById(@PathVariable Integer id){
        return iformService.getById(id);
    }

    @GetMapping("{currentPage}/{pageSize}")
    public IPage<Form> getPage(@PathVariable int currentPage,@PathVariable int pageSize){
        return iformService.getPage(currentPage,pageSize);
    }
}
