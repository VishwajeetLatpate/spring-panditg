package com.panditg.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.panditg.demo.entities.Client;
import com.panditg.demo.service.ClientService;

@CrossOrigin
@RestController
public class ClientController {
       
	
	@Autowired
	private ClientService clientservice;
	
	
	@GetMapping("/get-client")
	public List<Client> getClient(){
		
		return this.clientservice.getClient();
		
		}
	
	@PostMapping("/registerclient")
	public  Client addClient(@RequestBody Client client) {
		
		return this.clientservice.addClient(client);
	}
	
	@PostMapping("/login")
	public Client loginClient(@RequestBody Client client) throws Exception{
		String tempEmailId=client.getEmailId();
		String tempPass=client.getPassword();
		Client cliObj=null;
		if(tempEmailId !=null && tempPass != null) {
		 cliObj = clientservice.fetchClientByEmailIdAndPassword(tempEmailId, tempPass);

		}
		if(cliObj ==null) {
			throw new Exception("Bad credintials");
		}
		 return cliObj;
	}
	
	
}
