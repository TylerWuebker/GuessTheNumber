/**@author wuebk - Tyler Wuebker
 * Class : CIS175 Spring 2021
 * Apr 1, 2021
 */
package dmacc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import dmacc.model.Game;

/**
 * @author wuebk
 *
 */
@Controller
public class WebController {
	@GetMapping("/playgame")
	public String randomnumber(@RequestParam(name="choice", required=false) int theChoice, Model model) {
		if(theChoice == 0) {
			return "index";
		}
		
		Game theOutcome = new Game(theChoice);
		model.addAttribute("game", theOutcome);
		return "results";
	}
}
