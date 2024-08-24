package com.cl.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.cl.utils.PageUtils;
import com.cl.utils.Query;


import com.cl.dao.EmailregistercodeDao;
import com.cl.entity.EmailregistercodeEntity;
import com.cl.service.EmailregistercodeService;
import com.cl.entity.view.EmailregistercodeView;

@Service("emailregistercodeService")
public class EmailregistercodeServiceImpl extends ServiceImpl<EmailregistercodeDao, EmailregistercodeEntity> implements EmailregistercodeService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<EmailregistercodeEntity> page = this.selectPage(
                new Query<EmailregistercodeEntity>(params).getPage(),
                new EntityWrapper<EmailregistercodeEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<EmailregistercodeEntity> wrapper) {
		  Page<EmailregistercodeView> page =new Query<EmailregistercodeView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<EmailregistercodeView> selectListView(Wrapper<EmailregistercodeEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public EmailregistercodeView selectView(Wrapper<EmailregistercodeEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
