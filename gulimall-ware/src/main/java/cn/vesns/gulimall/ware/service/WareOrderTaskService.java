package cn.vesns.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import cn.vesns.common.utils.PageUtils;
import cn.vesns.gulimall.ware.entity.WareOrderTaskEntity;

import java.util.Map;

/**
 * ???湤?
 *
 * @author vesns
 * @email w865047755@gmail.com
 * @date 2021-08-12 09:29:14
 */
public interface WareOrderTaskService extends IService<WareOrderTaskEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

