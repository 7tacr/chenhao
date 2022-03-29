package com.mh.minghao.service.impl;

import com.mh.minghao.dao.ProductOrderMapper;
import com.mh.minghao.entity.OrderGroup;
import com.mh.minghao.entity.ProductOrder;
import com.mh.minghao.service.ProductOrderService;
import com.mh.minghao.util.OrderUtil;
import com.mh.minghao.util.PageUtil;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Service("productOrderService")
public class ProductOrderServiceImpl implements ProductOrderService {
    private ProductOrderMapper productOrderMapper;

    @Resource(name = "productOrderMapper")
    public void setProductOrderMapper(ProductOrderMapper productOrderMapper) {
        this.productOrderMapper = productOrderMapper;
    }

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    @Override
    public boolean add(ProductOrder productOrder) {
        return productOrderMapper.insertOne(productOrder) > 0;
    }

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    @Override
    public boolean update(ProductOrder productOrder) {
        return productOrderMapper.updateOne(productOrder) > 0;
    }

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    @Override
    public boolean deleteList(Integer[] productOrder_id_list) {
        return productOrderMapper.deleteList(productOrder_id_list) > 0;
    }

    @Override
    public List<ProductOrder> getList(ProductOrder productOrder, Byte[] productOrder_status_array, OrderUtil orderUtil, PageUtil pageUtil) {
        return productOrderMapper.select(productOrder, productOrder_status_array, orderUtil, pageUtil);
    }

    @Override
    public List<OrderGroup> getTotalByDate(Date beginDate, Date endDate) {
        return productOrderMapper.getTotalByDate(beginDate, endDate);
    }

    @Override
    public List<OrderGroup> getStatusByDate(Date beginDate, Date endDate) {
        return productOrderMapper.getStatusByDate(beginDate, endDate);
    }

    @Override
    public ProductOrder get(Integer productOrder_id) {
        return productOrderMapper.selectOne(productOrder_id);
    }

    @Override
    public ProductOrder getByCode(String productOrder_code) {
        return productOrderMapper.selectByCode(productOrder_code);
    }

    @Override
    public Integer getTotal(ProductOrder productOrder, Byte[] productOrder_status_array) {
        return productOrderMapper.selectTotal(productOrder, productOrder_status_array);
    }

    @Override
    public List<OrderGroup> getTypeGroupByDate(Date beginDate, Date endDate) {
        return productOrderMapper.getTypeGroupByDate(beginDate, endDate);
    }

    @Override
    public List<OrderGroup> getProduceRank(Date beginDate, Date endDate) {
        return productOrderMapper.getProduceRank(beginDate, endDate);
    }
}
