package com.mh.minghao.service;

import com.mh.minghao.entity.Category;
import com.mh.minghao.util.PageUtil;

import java.util.List;

public interface CategoryService {
    boolean add(Category category);

    boolean update(Category category);

    List<Category> getList(String category_name, PageUtil pageUtil);

    Category get(Integer category_id);

    Integer getTotal(String category_name);
}
