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


import com.cl.dao.XiaoliangdingdanDao;
import com.cl.entity.XiaoliangdingdanEntity;
import com.cl.service.XiaoliangdingdanService;
import com.cl.entity.view.XiaoliangdingdanView;

@Service("xiaoliangdingdanService")
public class XiaoliangdingdanServiceImpl extends ServiceImpl<XiaoliangdingdanDao, XiaoliangdingdanEntity> implements XiaoliangdingdanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XiaoliangdingdanEntity> page = this.selectPage(
                new Query<XiaoliangdingdanEntity>(params).getPage(),
                new EntityWrapper<XiaoliangdingdanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XiaoliangdingdanEntity> wrapper) {
		  Page<XiaoliangdingdanView> page =new Query<XiaoliangdingdanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<XiaoliangdingdanView> selectListView(Wrapper<XiaoliangdingdanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XiaoliangdingdanView selectView(Wrapper<XiaoliangdingdanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<XiaoliangdingdanEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<XiaoliangdingdanEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<XiaoliangdingdanEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }




}
