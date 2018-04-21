/**
 * 
 */
package com.sy.romannums.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sy.romannums.service.RomanNumsService;

/**
 * 
 * @author sinan.yumak
 *
 */
@RestController
public class RomanNumsController {

	@Autowired
	private RomanNumsService romanNumsService;
	
	
	@RequestMapping( value = "/romannums", method = RequestMethod.GET )
    public String toRomanNum( @RequestParam("number") Integer number ) {
		
		return romanNumsService.toRomanNumber( number );
    }
	
	
}
