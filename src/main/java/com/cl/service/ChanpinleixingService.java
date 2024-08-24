package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.ChanpinleixingEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.ChanpinleixingView;


/**
 * 产品类型
 *
 * @author 
 * @email 
 * @date 2024-03-12 19:19:13
 */
public interface ChanpinleixingService extends IService<ChanpinleixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ChanpinleixingView> selectListView(Wrapper<ChanpinleixingEntity> wrapper);
   	
   	ChanpinleixingView selectView(@Param("ew") Wrapper<ChanpinleixingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ChanpinleixingEntity> wrapper);
   	

}

