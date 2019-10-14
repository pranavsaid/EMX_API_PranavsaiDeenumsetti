package com.example.demo;

import java.util.List;
import java.util.stream.Collectors;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("api")
public class APIController {
	private final Logger logger = LoggerFactory.getLogger(APIController.class);
	
	@RequestMapping(value="resume", method=RequestMethod.GET)
	public String foo(HttpServletRequest req) {
		List<String> parameters = req.getParameterMap().keySet().stream()
				.map(i -> i + "=" + (req.getParameterMap().get(i))[0]).collect(Collectors.toList());
		String error = "No Result Found for the search request: " + parameters;
		System.out.println("The Error is:"+error);
	    return "OK";
	}
}