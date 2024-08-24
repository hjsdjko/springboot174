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


import com.cl.dao.KehuxinxiDao;
import com.cl.entity.KehuxinxiEntity;
import com.cl.service.KehuxinxiService;
import com.cl.entity.view.KehuxinxiView;

@Service("kehuxinxiService")
public class KehuxinxiServiceImpl extends ServiceImpl<KehuxinxiDao, KehuxinxiEntity> implements KehuxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<KehuxinxiEntity> page = this.selectPage(
                new Query<KehuxinxiEntity>(params).getPage(),
                new EntityWrapper<KehuxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<KehuxinxiEntity> wrapper) {
		  Page<KehuxinxiView> page =new Query<KehuxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<KehuxinxiView> selectListView(Wrapper<KehuxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public KehuxinxiView selectView(Wrapper<KehuxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
