package cn.vesns.gulimall.ware.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * ?ֿ???Ϣ
 * 
 * @author vesns
 * @email w865047755@gmail.com
 * @date 2021-08-12 09:29:14
 */
@Data
@TableName("wms_ware_info")
public class WareInfoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * ?ֿ??
	 */
	private String name;
	/**
	 * ?ֿ???ַ
	 */
	private String address;
	/**
	 * ???????
	 */
	private String areacode;

}
