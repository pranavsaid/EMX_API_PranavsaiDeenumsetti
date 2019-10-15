package com.example.demo.util;

import java.util.LinkedHashMap;

public class AppUtil {
	private AppUtil(){
		
	}
	
	public static String getResponseText(String request) {
		LinkedHashMap<String, String> resumeResponse = new LinkedHashMap<>();
		String puzzleResponse = " ABCD \nA=<<< \nB>=>< \nC><=< \nD>>>=";
				resumeResponse.put("Ping" , "OK");
				resumeResponse.put("Puzzle" , puzzleResponse);
				resumeResponse.put("Position" , "Software Engineer with Fullstack, Backend, Data or Frontend experience - ID# 2018-2462");
				resumeResponse.put("Source" , "https://github.com/pranavsaid/EMX_API_PranavsaiDeenumsetti.git");
				resumeResponse.put("Name" , "Pranav sai Deenumsetti");
				resumeResponse.put("Resume" , "https://drive.google.com/file/d/1DDbPhII9addr3FQ0KsPrcTCCZfblKh8A/view?usp=sharing");
				resumeResponse.put("Referrer" , "Employee Referral: Rakesh Balakrishnan");
				resumeResponse.put("Years" , "3");
				resumeResponse.put("Phone" , "+1 (312) 863-0332");
				resumeResponse.put("Degree" , " Masters Degree. Major - Computer Science: August 2016 – May 2018 Illinois Institute of Technology, Chicago, Illinois");
				resumeResponse.put("Email Address" , "pdeenumsetti@hawk.iit.edu");
				resumeResponse.put("Status" , "Yes! I am currently on H1b Visa.");

		return resumeResponse.get(request) == null ? "OK" : resumeResponse.get(request);
	}
		
}