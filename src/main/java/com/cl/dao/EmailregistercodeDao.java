package com.cl.dao;

import com.cl.entity.EmailregistercodeEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.EmailregistercodeView;


/**
 * 邮箱验证码
 * 
 * @author 
 * @email 
 * @date 2024-03-12 19:19:13
 */
public interface EmailregistercodeDao extends BaseMapper<EmailregistercodeEntity> {
	
	List<EmailregistercodeView> selectListView(@Param("ew") Wrapper<EmailregistercodeEntity> wrapper);

	List<EmailregistercodeView> selectListView(Pagination page,@Param("ew") Wrapper<EmailregistercodeEntity> wrapper);
	
	EmailregistercodeView selectView(@Param("ew") Wrapper<EmailregistercodeEntity> wrapper);
	

}
