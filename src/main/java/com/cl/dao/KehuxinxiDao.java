package com.cl.dao;

import com.cl.entity.KehuxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.KehuxinxiView;


/**
 * 客户信息
 * 
 * @author 
 * @email 
 * @date 2024-03-12 19:19:13
 */
public interface KehuxinxiDao extends BaseMapper<KehuxinxiEntity> {
	
	List<KehuxinxiView> selectListView(@Param("ew") Wrapper<KehuxinxiEntity> wrapper);

	List<KehuxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<KehuxinxiEntity> wrapper);
	
	KehuxinxiView selectView(@Param("ew") Wrapper<KehuxinxiEntity> wrapper);
	

}
