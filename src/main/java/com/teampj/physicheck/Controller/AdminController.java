package com.teampj.physicheck.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class AdminController {

	private static final Logger logger = LoggerFactory.getLogger(AdminController.class);
	
	@RequestMapping("admin_main")
	public String admin_main(HttpServletRequest req, Model model) {
		logger.info("[url ==> admin_main]C_con");
		
		return "admin/common/main";
	}
}
