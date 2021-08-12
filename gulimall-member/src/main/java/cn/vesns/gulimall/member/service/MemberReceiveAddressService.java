package cn.vesns.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import cn.vesns.common.utils.PageUtils;
import cn.vesns.gulimall.member.entity.MemberReceiveAddressEntity;

import java.util.Map;

/**
 * ??Ա?ջ???ַ
 *
 * @author vesns
 * @email w865047755@gmail.com
 * @date 2021-08-12 09:08:40
 */
public interface MemberReceiveAddressService extends IService<MemberReceiveAddressEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

