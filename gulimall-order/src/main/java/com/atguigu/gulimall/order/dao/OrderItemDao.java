package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author lili
 * @email lili@gmail.com
 * @date 2024-08-22 15:50:27
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
