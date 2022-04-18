package com.teampj.physicheck.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class DoctorController {
	
	private static final Logger logger = LoggerFactory.getLogger(AdminController.class);
	
	@RequestMapping("doctor_main")
	public String doctor_main(HttpServletRequest req, Model model) {
		logger.info("[url ==> doctor_main]C_con");
		
		return "doctor/common/main";
	}
}
