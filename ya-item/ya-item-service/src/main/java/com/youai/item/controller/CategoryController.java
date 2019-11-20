package com.youai.item.controller;

import com.youai.item.pojo.Category;
import com.youai.item.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author: HuYi.Zhang
 * @create: 2018-05-28 10:01
 **/
@RestController
@RequestMapping("category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping("list")
    public ResponseEntity<List<Category>> queryCategoryByPid(@RequestParam("pid") Long pid) {
        List<Category> list = this.categoryService.queryCategoryByPid(pid);
        if (list == null) {
            // 没找到，返回404
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
        // 找到返回200
        return ResponseEntity.ok(list);
    }

}
