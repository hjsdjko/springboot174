package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.KehuxinxiEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.KehuxinxiView;


/**
 * 客户信息
 *
 * @author 
 * @email 
 * @date 2024-03-12 19:19:13
 */
public interface KehuxinxiService extends IService<KehuxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<KehuxinxiView> selectListView(Wrapper<KehuxinxiEntity> wrapper);
   	
   	KehuxinxiView selectView(@Param("ew") Wrapper<KehuxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<KehuxinxiEntity> wrapper);
   	

}

