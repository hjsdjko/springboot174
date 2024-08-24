package com.cl.dao;

import com.cl.entity.ChanpinxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.ChanpinxinxiView;


/**
 * 产品信息
 * 
 * @author 
 * @email 
 * @date 2024-03-12 19:19:13
 */
public interface ChanpinxinxiDao extends BaseMapper<ChanpinxinxiEntity> {
	
	List<ChanpinxinxiView> selectListView(@Param("ew") Wrapper<ChanpinxinxiEntity> wrapper);

	List<ChanpinxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<ChanpinxinxiEntity> wrapper);
	
	ChanpinxinxiView selectView(@Param("ew") Wrapper<ChanpinxinxiEntity> wrapper);
	

}
