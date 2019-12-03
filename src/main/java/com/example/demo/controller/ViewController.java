/*Copyright Information, This coded Section Was Originally desined by @UtshavTimsina
*/
/**
 * 
 */
package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.features.Calculator;

/**
 * @author utshav
 *
 */
@Controller
@RequestMapping("/")
public class ViewController{
	
	@GetMapping
	//@ResponseBody
	public String getDefaultView() {
		Calculator calc =new Calculator();
		return "A4" ;
	}
}
