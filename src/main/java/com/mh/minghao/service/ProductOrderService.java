package com.mh.minghao.service;

import com.mh.minghao.entity.OrderGroup;
import com.mh.minghao.entity.ProductOrder;
import com.mh.minghao.util.OrderUtil;
import com.mh.minghao.util.PageUtil;

import java.util.Date;
import java.util.List;

public interface ProductOrderService {
    boolean add(ProductOrder productOrder);

    boolean update(ProductOrder productOrder);

    boolean deleteList(Integer[] productOrder_id_list);

    List<ProductOrder> getList(ProductOrder productOrder, Byte[] productOrder_status_array, OrderUtil orderUtil, PageUtil pageUtil);

    List<OrderGroup> getTotalByDate(Date beginDate, Date endDate);

    List<OrderGroup> getStatusByDate(Date beginDate, Date endDate);

    ProductOrder get(Integer productOrder_id);

    ProductOrder getByCode(String productOrder_code);

    Integer getTotal(ProductOrder productOrder, Byte[] productOrder_status_array);

    List<OrderGroup> getTypeGroupByDate(Date beginDate, Date endDate);

    List<OrderGroup> getProduceRank(Date beginDate, Date endDate);
}
