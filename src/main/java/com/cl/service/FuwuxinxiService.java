package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.FuwuxinxiEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.FuwuxinxiView;


/**
 * 服务信息
 *
 * @author 
 * @email 
 * @date 2024-03-12 19:19:13
 */
public interface FuwuxinxiService extends IService<FuwuxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FuwuxinxiView> selectListView(Wrapper<FuwuxinxiEntity> wrapper);
   	
   	FuwuxinxiView selectView(@Param("ew") Wrapper<FuwuxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FuwuxinxiEntity> wrapper);
   	

}

