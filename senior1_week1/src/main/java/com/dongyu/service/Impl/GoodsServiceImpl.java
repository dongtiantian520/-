/**
 * 
 */
package com.dongyu.service.Impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dongyu.mapper.GoodsMapperDao;
import com.dongyu.pojo.Goods;
import com.dongyu.service.GoodsService;

/**
 * @作者  董宇
 *
 * @时间 :2019年10月9日
 */
@Service
public class GoodsServiceImpl implements GoodsService {
	@Resource GoodsMapperDao dao;

	/* (non-Javadoc)
	 * @see com.dongyu.service.GoodsService#selectGoods(java.util.Map)
	 */
	@Override
	public List<Map<String, Object>> selectGoods(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return dao.selectGoods(map);
	}

	/* (non-Javadoc)
	 * @see com.dongyu.service.GoodsService#addGoods(com.dongyu.pojo.Goods)
	 */
	@Override
	public int addGoods(Goods goods) {
		// TODO Auto-generated method stub
		return dao.addGoods(goods);
	}

	/* (non-Javadoc)
	 * @see com.dongyu.service.GoodsService#deleteAll(java.lang.Integer)
	 */
	@Override
	public Boolean deleteAll(Integer pids) {
		// TODO Auto-generated method stub
		return dao.deleteAll(pids);
	}

}
