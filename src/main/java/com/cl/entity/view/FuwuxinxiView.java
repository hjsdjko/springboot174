package com.cl.entity.view;

import com.cl.entity.FuwuxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.cl.utils.EncryptUtil;
 

/**
 * 服务信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-03-12 19:19:13
 */
@TableName("fuwuxinxi")
public class FuwuxinxiView  extends FuwuxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public FuwuxinxiView(){
	}
 
 	public FuwuxinxiView(FuwuxinxiEntity fuwuxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, fuwuxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
