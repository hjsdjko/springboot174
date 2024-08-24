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

import com.cl.entity.FuwuxinxiEntity;
import com.cl.entity.view.FuwuxinxiView;

import com.cl.service.FuwuxinxiService;
import com.cl.service.TokenService;
import com.cl.utils.PageUtils;
import com.cl.utils.R;
import com.cl.utils.MPUtil;
import com.cl.utils.CommonUtil;
import java.io.IOException;

/**
 * 服务信息
 * 后端接口
 * @author 
 * @email 
 * @date 2024-03-12 19:19:13
 */
@RestController
@RequestMapping("/fuwuxinxi")
public class FuwuxinxiController {
    @Autowired
    private FuwuxinxiService fuwuxinxiService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,FuwuxinxiEntity fuwuxinxi,
		HttpServletRequest request){
        EntityWrapper<FuwuxinxiEntity> ew = new EntityWrapper<FuwuxinxiEntity>();

		PageUtils page = fuwuxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, fuwuxinxi), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,FuwuxinxiEntity fuwuxinxi, 
		HttpServletRequest request){
        EntityWrapper<FuwuxinxiEntity> ew = new EntityWrapper<FuwuxinxiEntity>();

		PageUtils page = fuwuxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, fuwuxinxi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( FuwuxinxiEntity fuwuxinxi){
       	EntityWrapper<FuwuxinxiEntity> ew = new EntityWrapper<FuwuxinxiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( fuwuxinxi, "fuwuxinxi")); 
        return R.ok().put("data", fuwuxinxiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(FuwuxinxiEntity fuwuxinxi){
        EntityWrapper< FuwuxinxiEntity> ew = new EntityWrapper< FuwuxinxiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( fuwuxinxi, "fuwuxinxi")); 
		FuwuxinxiView fuwuxinxiView =  fuwuxinxiService.selectView(ew);
		return R.ok("查询服务信息成功").put("data", fuwuxinxiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        FuwuxinxiEntity fuwuxinxi = fuwuxinxiService.selectById(id);
		fuwuxinxi = fuwuxinxiService.selectView(new EntityWrapper<FuwuxinxiEntity>().eq("id", id));
        return R.ok().put("data", fuwuxinxi);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        FuwuxinxiEntity fuwuxinxi = fuwuxinxiService.selectById(id);
		fuwuxinxi = fuwuxinxiService.selectView(new EntityWrapper<FuwuxinxiEntity>().eq("id", id));
        return R.ok().put("data", fuwuxinxi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody FuwuxinxiEntity fuwuxinxi, HttpServletRequest request){
    	fuwuxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(fuwuxinxi);
        fuwuxinxiService.insert(fuwuxinxi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody FuwuxinxiEntity fuwuxinxi, HttpServletRequest request){
    	fuwuxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(fuwuxinxi);
        fuwuxinxiService.insert(fuwuxinxi);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody FuwuxinxiEntity fuwuxinxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(fuwuxinxi);
        fuwuxinxiService.updateById(fuwuxinxi);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        fuwuxinxiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	








}
