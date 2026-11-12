package tn.esprit.yomnazhaounia4cce10.Service;

import tn.esprit.yomnazhaounia4cce10.domain.Client;

import java.util.List;

public interface IClientService {
    Client create(Client client);
    Client findById(long id);
    List<Client> findAll();
    void deleteById(long id);
    Client update(long id, Client client);
}
