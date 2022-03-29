package com.mh.minghao.service;

import com.mh.minghao.entity.Reward;
import com.mh.minghao.util.OrderUtil;
import com.mh.minghao.util.PageUtil;

import java.util.List;

public interface RewardService {
    boolean add(Reward reward);

    boolean update(Reward reward);

    boolean deleteList(Integer[] reward_id_list);

    List<Reward> getList(Reward reward, Byte[] reward_isEnabled_array, OrderUtil orderUtil, PageUtil pageUtil);

    List<Reward> getListByUserId(Integer user_id);

    Reward get(Integer reward_id);

    Integer getTotal(Reward reward, Byte[] reward_isEnabled_array);
}
