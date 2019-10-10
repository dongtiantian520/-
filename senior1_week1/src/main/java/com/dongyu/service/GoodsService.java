/**
 * 
 */
package com.dongyu.service;

import java.util.List;
import java.util.Map;

import com.dongyu.pojo.Goods;

/**
 * @作者  董宇
 *
 * @时间 :2019年10月9日
 */
public interface GoodsService {

	/**
	 * @param map
	 * @return
	 */
	List<Map<String, Object>> selectGoods(Map<String, Object> map);

	/**
	 * @param goods
	 * @return
	 */
	int addGoods(Goods goods);

	/**
	 * @param pids
	 * @return
	 */
	Boolean deleteAll(Integer pids);

}
