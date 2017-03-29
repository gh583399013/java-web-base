package junit_test.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import junit_test.entity.Student;
import junit_test.service.TestService;

@Controller
@RequestMapping("/test")
public class TestController {
	@Autowired
	private TestService testService;
	
	@RequestMapping(value = "/test001",method = {RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public Map<String, Object> dealPost(HttpServletRequest requst,HttpServletResponse response){
		String test = testService.getStr("new 一个对象");
		System.out.println(test);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("test", test);
		return map;
	}
	
	@RequestMapping(value = "/test002",method = {RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public String dealPost1(HttpServletRequest requst,HttpServletResponse response){
		String test = testService.getStr("new 一个对象");
		System.out.println(test);
		return test;
	}

	@RequestMapping(value = "/test003",method = {RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public void login(HttpServletRequest requst,HttpServletResponse response,Student student){
		System.out.println("id = " + student.getId());
		System.out.println("name = " + student.getName());
	}
}
