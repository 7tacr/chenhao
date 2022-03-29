package com.mh.minghao;

public enum OrderStatusEnum {
    forThePayment("待付款", 0, "forThePayment"),
    toSendTheGoods("待发货", 1, "toSendTheGoods"),
    toBeConfirmed("待确认", 2, "toBeConfirmed"),
    successfulDeal("订单成功", 3, "successfulDeal"),
    closeDeal("订单关闭", 4, "closeDeal"),
    ;
    public final String name;
    public final int status;
    public final String code;


    OrderStatusEnum(String name, int status, String code) {
        this.name = name;
        this.status = status;
        this.code = code;
    }

    public static OrderStatusEnum getByStatus(int status) {
        for (OrderStatusEnum value : OrderStatusEnum.values()) {
            if (value.status == status) {
                return value;
            }
        }
        throw new RuntimeException("不存在的枚举值[" + status + "]");
    }

}
