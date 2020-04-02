package model.entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import model.enums.StatusPedido;

public class Order {
	
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private Date moment;
	private StatusPedido status;
	
	private Client client;
	private List<OrderItem> orderItens = new ArrayList<>();
	
	public Order() {}
	
	public Order(Date moment, StatusPedido status, Client client) {
		
		this.moment = moment;
		this.status = status;
		this.client = client;
		
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public StatusPedido getStatus() {
		return status;
	}

	public void setStatus(StatusPedido status) {
		this.status = status;
	}
	
	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	//Métodos
	public void addItem(OrderItem item) {
		orderItens.add(item);
	}
	
	public void removeItem(OrderItem item) {
		orderItens.remove(item);
	}
	
	public double total() {
		
		double sum = 0;
		
		for(OrderItem oI:orderItens) 
		{
			sum += oI.subTotal();
		}
		
		return sum;
		
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Order moment: ");
		sb.append(sdf.format(moment) + "\n");
		sb.append("Order status: ");
		sb.append(status + "\n");
		sb.append("Client: ");
		sb.append(client + "\n");
		sb.append("Order items:\n");
		for (OrderItem item : orderItens) {
			sb.append(item + "\n");
		}
		sb.append("Total price: $");
		sb.append(String.format("%.2f", total()));
		return sb.toString();
	}
	
	
	
	
	
}
