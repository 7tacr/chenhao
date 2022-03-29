package com.mh.minghao.entity;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * 订单组类
 *
 * @author 明昊
 * @implNote 该类用于辅助后台图表的生成，亦不属于实体类
 */
public class OrderGroup {
    private Date productOrder_pay_date/*订单组的支付日期*/;

    private Integer productOrder_count/*订单组的统计个数*/;

    private Byte productOrder_status/*订单组的订单状态*/;
    private String productOrder_type/*订单组的产品类型*/;
    private String productOrder_productName/*订单组的产品名称*/;

    public String getProductOrder_pay_date() {
        if (productOrder_pay_date != null) {
            SimpleDateFormat time = new SimpleDateFormat("MM/dd", Locale.UK);
            return time.format(productOrder_pay_date);
        }
        return null;
    }

    public void setProductOrder_pay_date(Date productOrder_pay_date) {
        this.productOrder_pay_date = productOrder_pay_date;
    }

    public Integer getProductOrder_count() {
        return productOrder_count;
    }

    public void setProductOrder_count(Integer productOrder_count) {
        this.productOrder_count = productOrder_count;
    }

    public Byte getProductOrder_status() {
        return productOrder_status;
    }

    public void setProductOrder_status(Byte productOrder_status) {
        this.productOrder_status = productOrder_status;
    }

    public String getProductOrder_type() {
        return productOrder_type;
    }

    public void setProductOrder_type(String productOrder_type) {
        this.productOrder_type = productOrder_type;
    }

    public String getProductOrder_productName() {
        return productOrder_productName;
    }

    public void setProductOrder_productName(String productOrder_productName) {
        this.productOrder_productName = productOrder_productName;
    }

    @Override
    public String toString() {
        return "OrderGroup{" +
                "productOrder_pay_date=" + productOrder_pay_date +
                ", productOrder_count=" + productOrder_count +
                ", productOrder_status=" + productOrder_status +
                ", productOrder_type='" + productOrder_type + '\'' +
                ", productOrder_productName='" + productOrder_productName + '\'' +
                '}';
    }
}
