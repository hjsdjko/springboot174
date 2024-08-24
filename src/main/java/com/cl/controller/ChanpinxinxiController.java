package com.cl.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.cl.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.cl.annotation.IgnoreAuth;

import com.cl.entity.ChanpinxinxiEntity;
import com.cl.entity.view.ChanpinxinxiView;

import com.cl.service.ChanpinxinxiService;
import com.cl.service.TokenService;
import com.cl.utils.PageUtils;
import com.cl.utils.R;
import com.cl.utils.MPUtil;
import com.cl.utils.CommonUtil;
import java.io.IOException;

/**
 * 产品信息
 * 后端接口
 * @author 
 * @email 
 * @date 2024-03-12 19:19:13
 */
@RestController
@RequestMapping("/chanpinxinxi")
public class ChanpinxinxiController {
    @Autowired
    private ChanpinxinxiService chanpinxinxiService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ChanpinxinxiEntity chanpinxinxi,
		HttpServletRequest request){
        EntityWrapper<ChanpinxinxiEntity> ew = new EntityWrapper<ChanpinxinxiEntity>();

		PageUtils page = chanpinxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, chanpinxinxi), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ChanpinxinxiEntity chanpinxinxi, 
		HttpServletRequest request){
        EntityWrapper<ChanpinxinxiEntity> ew = new EntityWrapper<ChanpinxinxiEntity>();

		PageUtils page = chanpinxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, chanpinxinxi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ChanpinxinxiEntity chanpinxinxi){
       	EntityWrapper<ChanpinxinxiEntity> ew = new EntityWrapper<ChanpinxinxiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( chanpinxinxi, "chanpinxinxi")); 
        return R.ok().put("data", chanpinxinxiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ChanpinxinxiEntity chanpinxinxi){
        EntityWrapper< ChanpinxinxiEntity> ew = new EntityWrapper< ChanpinxinxiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( chanpinxinxi, "chanpinxinxi")); 
		ChanpinxinxiView chanpinxinxiView =  chanpinxinxiService.selectView(ew);
		return R.ok("查询产品信息成功").put("data", chanpinxinxiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ChanpinxinxiEntity chanpinxinxi = chanpinxinxiService.selectById(id);
		chanpinxinxi = chanpinxinxiService.selectView(new EntityWrapper<ChanpinxinxiEntity>().eq("id", id));
        return R.ok().put("data", chanpinxinxi);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ChanpinxinxiEntity chanpinxinxi = chanpinxinxiService.selectById(id);
		chanpinxinxi = chanpinxinxiService.selectView(new EntityWrapper<ChanpinxinxiEntity>().eq("id", id));
        return R.ok().put("data", chanpinxinxi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ChanpinxinxiEntity chanpinxinxi, HttpServletRequest request){
    	chanpinxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(chanpinxinxi);
        chanpinxinxiService.insert(chanpinxinxi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ChanpinxinxiEntity chanpinxinxi, HttpServletRequest request){
    	chanpinxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(chanpinxinxi);
        chanpinxinxiService.insert(chanpinxinxi);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody ChanpinxinxiEntity chanpinxinxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(chanpinxinxi);
        chanpinxinxiService.updateById(chanpinxinxi);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        chanpinxinxiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	








}
