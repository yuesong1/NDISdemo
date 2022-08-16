package com.ndis.demo.controller;

import com.ndis.demo.controller.utils.R;
import com.ndis.demo.domain.Form;
import com.ndis.demo.service.iFormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/forms")
public class formController2 {

    @Autowired
    private iFormService iformService;

    @GetMapping
    public R getAll(){
        return new R(true,iformService.list());
    }

    @PostMapping
    public R save(@RequestBody Form form){

        return new R(iformService.save(form));

    }

    @PutMapping
    public R update(@RequestBody Form form){
        return new R(iformService.updateById(form));
    }

    @DeleteMapping("{id}")
    public R delete(@PathVariable Integer id){
        return new R(iformService.removeById(id));
    }

    //http:localhost/forms/2
    @GetMapping("{id}")
    public R getById(@PathVariable Integer id){
        return new R(true,iformService.getById(id));
    }

    @GetMapping("{currentPage}/{pageSize}")
    public R getPage(@PathVariable int currentPage,@PathVariable int pageSize){
        return new R(true,iformService.getPage(currentPage,pageSize));
    }
}
