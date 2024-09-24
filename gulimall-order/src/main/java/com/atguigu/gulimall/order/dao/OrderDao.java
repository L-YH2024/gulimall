package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author lili
 * @email lili@gmail.com
 * @date 2024-08-22 15:50:27
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
