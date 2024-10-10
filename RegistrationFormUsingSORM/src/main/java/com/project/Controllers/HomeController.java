package com.project.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.project.Entity.*;
import com.project.Service.*;

@Controller
public class HomeController {
	@Autowired(required=true)
	private UserService userService;

	@RequestMapping("/home")
	public String home() {
		return "home";
	}

	@RequestMapping("/register")
	public String signup() {
		return "Register";
	}

	@RequestMapping(path = "/createUser", method = RequestMethod.POST)
	public String registerUser(@ModelAttribute User user, @RequestParam("img") String img, Model m) {

		user.setImage(img);
		userService.registerUser(user);

		m.addAttribute("user", user);

		/* return "redirect:/register"; */
		return "success";
	}
}
