package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.EmailregistercodeEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.EmailregistercodeView;


/**
 * 邮箱验证码
 *
 * @author 
 * @email 
 * @date 2024-03-12 19:19:13
 */
public interface EmailregistercodeService extends IService<EmailregistercodeEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<EmailregistercodeView> selectListView(Wrapper<EmailregistercodeEntity> wrapper);
   	
   	EmailregistercodeView selectView(@Param("ew") Wrapper<EmailregistercodeEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<EmailregistercodeEntity> wrapper);
   	

}

