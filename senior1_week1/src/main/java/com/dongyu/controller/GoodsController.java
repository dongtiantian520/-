/**
 * 
 */
package com.dongyu.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.taglibs.standard.lang.jstl.test.beans.PublicBean1;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.baomidou.mybatisplus.core.injector.methods.Delete;
import com.dongyu.pojo.Goods;
import com.dongyu.service.GoodsService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

/**
 * @作者  董宇
 *
 * @时间 :2019年10月9日
 */
@Controller
public class GoodsController {
	@Resource
	GoodsService Service;
	
	
//	列表展示 + 区间 + 模糊 + 分页
	@RequestMapping("list")
	public String selectAll(Model model,Goods goods 
			,@RequestParam(defaultValue="1")Integer capge
			,@RequestParam(defaultValue="5")Integer pageSize
			){
//		创建一个hasmap集合
		Map<String,Object> map = new HashMap<>();
//		开启分页插件
		PageHelper.startPage(capge, pageSize);
//		执行查询语句
		List<Map<String, Object>> list = Service.selectGoods(map);
//		创建pageinfor
		PageInfo<Map<String, Object>> page = new PageInfo<>(list);
//		将对象存入到model里面
		model.addAttribute("list",list);
		model.addAttribute("page",page);
		model.addAttribute("map",map);
		return "list";
	}
	
	
//	添加
	@RequestMapping("toadd.do")
	public String toadd(){
//		为了安全,进行添加的方法
		return "add";
	}
	@RequestMapping("add.do")
	public String add(Goods goods){
//		执行添加方法 ,返回值是一个 int 类型
		int i = Service.addGoods(goods);
		return "redirect:list.do";
	}
	
	
//	批量删除
	@RequestMapping("deleteAll")
	@ResponseBody
	public Boolean deleteAll(Integer pids){
//		创建一个删除方法
		Boolean is = Service.deleteAll(pids);
		return is;
	}
//	创建一个分支
	
	

}
