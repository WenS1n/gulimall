package cn.vesns.gulimall.coupon.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * ??Ʒ???ݼ۸
 * 
 * @author vesns
 * @email w865047755@gmail.com
 * @date 2021-08-12 08:43:58
 */
@Data
@TableName("sms_sku_ladder")
public class SkuLadderEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * spu_id
	 */
	private Long skuId;
	/**
	 * ?????
	 */
	private Integer fullCount;
	/**
	 * ?????
	 */
	private BigDecimal discount;
	/**
	 * ?ۺ
	 */
	private BigDecimal price;
	/**
	 * ?Ƿ??????????Ż?[0-???ɵ??ӣ?1-?ɵ???]
	 */
	private Integer addOther;

}