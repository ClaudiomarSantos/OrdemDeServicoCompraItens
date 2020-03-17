package entidades;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Order {

	private LocalDateTime moment;
	private OrderStatus status;
	private List<OrderItem> list = new ArrayList<>();

	public Order(LocalDateTime moment, OrderStatus status) {
		this.moment = moment;
		this.status = status;
	}

	public List<OrderItem> getList() {
		return list;
	}

	public void setList(List<OrderItem> list) {
		this.list = list;
	}

	public LocalDateTime getMoment() {
		return moment;
	}

	public void setMoment(LocalDateTime moment) {
		this.moment = moment;
	}

	public void addItem(OrderItem orderItem) {

		list.add(orderItem);

	}

	public void removeItem(int x) {
		list.remove(x);
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public void imprimirItems() {
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

	public double Total() {
		double soma = 0;
		for (int i = 0; i < list.size(); i++) {
			soma += list.get(i).subTotal();

		}
		return soma;
	}

	@Override
	public String toString() {
		return "order Sumary: " + "\n" + "order Moment: " + moment + "\n" + "order Status: " + status;
	}
}
