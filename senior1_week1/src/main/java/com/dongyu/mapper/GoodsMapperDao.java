/**
 * 
 */
package com.dongyu.mapper;

import java.util.List;
import java.util.Map;

import com.dongyu.pojo.Goods;

/**
 * @作者  董宇
 *
 * @时间 :2019年10月9日
 */

public interface GoodsMapperDao {
//	列表展示代码
	/**
	 * @param map
	 * @return
	 */
	List<Map<String, Object>> selectGoods(Map<String, Object> map);
	
	
	/**
	 * @param goods
	 * @return
	 */
//	添加方法
	int addGoods(Goods goods);
	
	
//	批量删除的方法
	
	/**
	 * @param pids
	 * @return
	 */
	Boolean deleteAll(Integer pids);

}
