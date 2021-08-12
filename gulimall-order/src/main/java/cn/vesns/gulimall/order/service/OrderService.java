package cn.vesns.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import cn.vesns.common.utils.PageUtils;
import cn.vesns.gulimall.order.entity.OrderEntity;

import java.util.Map;

/**
 * ????
 *
 * @author vesns
 * @email w865047755@gmail.com
 * @date 2021-08-12 09:21:12
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

