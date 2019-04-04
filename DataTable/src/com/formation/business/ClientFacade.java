package com.formation.business;

import java.util.List;

import com.formation.bean.Client;

public interface ClientFacade {
		
	public Client createClient(Client client);
	public List<Client> findClients();
	public void delete(Client client);
}
