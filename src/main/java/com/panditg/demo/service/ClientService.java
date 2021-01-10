package com.panditg.demo.service;

import java.util.List;

import com.panditg.demo.entities.Client;

public interface ClientService {
	public List<Client> getClient();
	public Client addClient(Client client);
	
	public Client fetchClientByEmailIdAndPassword(String mailId,String password);

}
