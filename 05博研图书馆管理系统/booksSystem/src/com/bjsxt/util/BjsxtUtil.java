package com.bjsxt.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

public class BjsxtUtil {

	public static void main(String[] args) {
		createuuid();
	}
	
	//获取当前时间--字符串格式-yyyy-MM-dd
	public static String nowdatestr(){
		//规范日期格式
		//SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
		//获取当前时间
		//Date date = new Date();
		//转换成字符串格式
		//String strdate = sf.format(date);
		//return strdate;
		return  new SimpleDateFormat("yyyy-MM-dd").format(new Date());
	}
	
	//获取当前时间--时间格式-yyyy-MM-dd
	public static Date nowdate(){
		//规范日期格式
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
		//获取当前时间
		Date date = new Date();
		//转换成字符串格式
		String strdate = sf.format(date);
		Date newdate = null;
		try {
			//将字符串再次转化为日期格式
			newdate = sf.parse(strdate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return  newdate;
	}
	
	//获取当前时间--时间格式-yyyy-MM-dd
	public static Date nowdate2(String strdate){
		//规范日期格式
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
		Date newdate = null;
		try {
			//将字符串再次转化为日期格式
			newdate = sf.parse(strdate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return  newdate;
	}
	
	
	
	//创建uuid
	public static String createuuid(){
		//System.out.println("BjsxtUtil.createuuid(uuid):"+uuid);
		return UUID.randomUUID().toString().replace("-", "");
	}
}
