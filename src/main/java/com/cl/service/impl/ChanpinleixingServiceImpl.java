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


import com.cl.dao.ChanpinleixingDao;
import com.cl.entity.ChanpinleixingEntity;
import com.cl.service.ChanpinleixingService;
import com.cl.entity.view.ChanpinleixingView;

@Service("chanpinleixingService")
public class ChanpinleixingServiceImpl extends ServiceImpl<ChanpinleixingDao, ChanpinleixingEntity> implements ChanpinleixingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ChanpinleixingEntity> page = this.selectPage(
                new Query<ChanpinleixingEntity>(params).getPage(),
                new EntityWrapper<ChanpinleixingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ChanpinleixingEntity> wrapper) {
		  Page<ChanpinleixingView> page =new Query<ChanpinleixingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<ChanpinleixingView> selectListView(Wrapper<ChanpinleixingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ChanpinleixingView selectView(Wrapper<ChanpinleixingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
