package cn.vesns.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import cn.vesns.common.utils.PageUtils;
import cn.vesns.gulimall.coupon.entity.HomeSubjectSpuEntity;

import java.util.Map;

/**
 * ר????Ʒ
 *
 * @author vesns
 * @email w865047755@gmail.com
 * @date 2021-08-12 08:43:58
 */
public interface HomeSubjectSpuService extends IService<HomeSubjectSpuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

