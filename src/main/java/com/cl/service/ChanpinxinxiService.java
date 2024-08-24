package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.ChanpinxinxiEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.ChanpinxinxiView;


/**
 * 产品信息
 *
 * @author 
 * @email 
 * @date 2024-03-12 19:19:13
 */
public interface ChanpinxinxiService extends IService<ChanpinxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ChanpinxinxiView> selectListView(Wrapper<ChanpinxinxiEntity> wrapper);
   	
   	ChanpinxinxiView selectView(@Param("ew") Wrapper<ChanpinxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ChanpinxinxiEntity> wrapper);
   	

}

