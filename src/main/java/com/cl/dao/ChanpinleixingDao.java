package com.cl.dao;

import com.cl.entity.ChanpinleixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.ChanpinleixingView;


/**
 * 产品类型
 * 
 * @author 
 * @email 
 * @date 2024-03-12 19:19:13
 */
public interface ChanpinleixingDao extends BaseMapper<ChanpinleixingEntity> {
	
	List<ChanpinleixingView> selectListView(@Param("ew") Wrapper<ChanpinleixingEntity> wrapper);

	List<ChanpinleixingView> selectListView(Pagination page,@Param("ew") Wrapper<ChanpinleixingEntity> wrapper);
	
	ChanpinleixingView selectView(@Param("ew") Wrapper<ChanpinleixingEntity> wrapper);
	

}
