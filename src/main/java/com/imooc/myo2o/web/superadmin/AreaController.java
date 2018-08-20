package com.imooc.myo2o.web.superadmin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.imooc.myo2o.entity.Area;
import com.imooc.myo2o.service.AreaService;

@Controller
@RequestMapping("/superadmin")
public class AreaController {
	
	@Autowired
	AreaService areaService;
	
	@RequestMapping("/area")
	@ResponseBody
	public List<Area> getAreaList(){
		List<Area> list = areaService.getAreaList();
		return list;
	}
	
	@RequestMapping("/area")
	@ResponseBody
	public List<Area> getAreaList2(){
		List<Area> list = areaService.getAreaList();
		return list;
	}
}
