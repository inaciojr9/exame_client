package br.com.inaciojr9.exames.jaxws.cliente;

import java.rmi.RemoteException;

import br.com.inaciojr9.exames.jaxws.Exame;
import br.com.inaciojr9.exames.jaxws.ExameWsProxy;

public class ExameWsCliente {

	public static void main(String[] args) throws RemoteException {

		ExameWsProxy service = new ExameWsProxy();

		Exame[] exames = service.getAll();
		System.out.println("Todos os exames...");
		for (Exame exame : exames) {
			System.out.println(exame.getNome());
		}
		System.out.println("------------------------------------------");
		
		int id = 1;
		Exame exame1 = service.getById(id);
		System.out.println("Exame com id "+id+": "+exame1.getNome());

	}

}
