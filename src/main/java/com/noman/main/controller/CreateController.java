package com.noman.main.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.noman.main.model.Account;
import com.noman.main.services.AccountService;

@Controller
public class CreateController {

	@Autowired
	AccountService accountService;
	
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		StringTrimmerEditor ste = new StringTrimmerEditor(true);
		dataBinder.registerCustomEditor(String.class, ste);
	}
	
	
	@RequestMapping("/newAccount")
	public String newAccount(Model model) 
	{
		model.addAttribute("accountForm", new Account());
		return "account-form";
	}
	@RequestMapping("/showAccount")
	public String showAccount() {
		return "showAccount";
	}
	@RequestMapping(value ="/saveAccount", method=RequestMethod.POST)
	public String saveAccount(@Valid @ModelAttribute("accountForm") Account account, BindingResult result, Model model) {
		System.out.println(account.toString());
		if (result.hasErrors()) {
			return "account-form";}
			else {
		//	accountService.saveAccount(account);
			 model.addAttribute("account", account);
		
			return "showAccount";
					 }
			
			
		
			
	}
	/*@RequestMapping(value ="/saveAccount", method=RequestMethod.POST)
	public String saveAccount(Model model, HttpServletRequest request) {
		
		System.out.println("New Request came");
			int accountNumber =  Integer.parseInt(request.getParameter("accountNumber")); 
			String accountHolderName =  request.getParameter("accountHolderName"); 
			int accountBalance =  Integer.parseInt(request.getParameter("accountBalance")); 
			Account account = new Account(accountNumber,accountHolderName,accountBalance);
			model.addAttribute("account",account);

		
			return "showAccount";
	}*/
	/*@RequestMapping(value ="/saveAccount", method=RequestMethod.POST)
	public String saveAccount(Model model, 
			@RequestParam("accountNumber") String aN,
			@RequestParam("accountHolderName") String aHN,
			@RequestParam("accountBalance") String aB) {
		
		System.out.println("New Request came");
			int accountNumber =  Integer.parseInt(aN); 
			String accountHolderName =  aHN;
			int accountBalance =  Integer.parseInt(aB); 
			Account account = new Account(accountNumber,accountHolderName,accountBalance);
			model.addAttribute("account",account);
			System.out.println(account.toString());
		
			return "showAccount";
	}*/

	
}
