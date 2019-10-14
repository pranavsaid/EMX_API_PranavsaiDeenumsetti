package com.example.demo;

import java.util.List;
import java.util.stream.Collectors;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.util.AppUtil;


@RestController
@RequestMapping("api")
public class APIController {
	private final Logger logger = LoggerFactory.getLogger(APIController.class);
	
	@GetMapping(value="/")
	public String emptyRequest(HttpServletRequest req) {
		return "OK";
	}
	@GetMapping(value="resume/response")
	public String resumeResponse(HttpServletRequest req) {
		List<String> parameters = req.getParameterMap().keySet().stream()
				.map(i -> i + "=" + (req.getParameterMap().get(i))[0]).collect(Collectors.toList());
		String parameter = "The Request Parameters are: " + parameters;
		logger.debug(parameter);
		String response = req.getParameter("q") == null ? "OK":AppUtil.getResponseText(req.getParameter("q"));
	    return response;
	}
}