package com.imooc.myo2o.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imooc.myo2o.dao.AreaDao;
import com.imooc.myo2o.entity.Area;
import com.imooc.myo2o.service.AreaService;

@Service
public class AreaServiceImpl implements AreaService{
	
	@Autowired
	AreaDao areaDao;
	@Override
	public List<Area> getAreaList() {
		List<Area> list = areaDao.queryArea();
		return list;
	}

}
