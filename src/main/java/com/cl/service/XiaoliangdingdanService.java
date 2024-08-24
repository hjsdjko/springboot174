package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.XiaoliangdingdanEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.XiaoliangdingdanView;


/**
 * 销量订单
 *
 * @author 
 * @email 
 * @date 2024-03-12 19:19:13
 */
public interface XiaoliangdingdanService extends IService<XiaoliangdingdanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XiaoliangdingdanView> selectListView(Wrapper<XiaoliangdingdanEntity> wrapper);
   	
   	XiaoliangdingdanView selectView(@Param("ew") Wrapper<XiaoliangdingdanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XiaoliangdingdanEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<XiaoliangdingdanEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<XiaoliangdingdanEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<XiaoliangdingdanEntity> wrapper);



}

