package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.FuwuleixingEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.FuwuleixingView;


/**
 * 服务类型
 *
 * @author 
 * @email 
 * @date 2024-03-12 19:19:13
 */
public interface FuwuleixingService extends IService<FuwuleixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FuwuleixingView> selectListView(Wrapper<FuwuleixingEntity> wrapper);
   	
   	FuwuleixingView selectView(@Param("ew") Wrapper<FuwuleixingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FuwuleixingEntity> wrapper);
   	

}

