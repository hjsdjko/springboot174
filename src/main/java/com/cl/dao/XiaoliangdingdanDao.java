package com.cl.dao;

import com.cl.entity.XiaoliangdingdanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.XiaoliangdingdanView;


/**
 * 销量订单
 * 
 * @author 
 * @email 
 * @date 2024-03-12 19:19:13
 */
public interface XiaoliangdingdanDao extends BaseMapper<XiaoliangdingdanEntity> {
	
	List<XiaoliangdingdanView> selectListView(@Param("ew") Wrapper<XiaoliangdingdanEntity> wrapper);

	List<XiaoliangdingdanView> selectListView(Pagination page,@Param("ew") Wrapper<XiaoliangdingdanEntity> wrapper);
	
	XiaoliangdingdanView selectView(@Param("ew") Wrapper<XiaoliangdingdanEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<XiaoliangdingdanEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<XiaoliangdingdanEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<XiaoliangdingdanEntity> wrapper);



}
