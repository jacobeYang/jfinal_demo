package com.demo.common.utils;

import java.sql.Timestamp;

public class TimeUtil {

	public static Timestamp getStampTime(){
		Timestamp ts=new Timestamp(System.currentTimeMillis());
		return ts;
	}
}
