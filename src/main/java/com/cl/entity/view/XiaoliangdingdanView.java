package com.cl.entity.view;

import com.cl.entity.XiaoliangdingdanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.cl.utils.EncryptUtil;
 

/**
 * 销量订单
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-03-12 19:19:13
 */
@TableName("xiaoliangdingdan")
public class XiaoliangdingdanView  extends XiaoliangdingdanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XiaoliangdingdanView(){
	}
 
 	public XiaoliangdingdanView(XiaoliangdingdanEntity xiaoliangdingdanEntity){
 	try {
			BeanUtils.copyProperties(this, xiaoliangdingdanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
