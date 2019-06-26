package anotherExperiments.SOLID.ISP.isp_solution;

public interface OrderService {

    Order createOrder();

    Order amendOrder();

    boolean cancelOrder(int orderId);

    Order submitOrder(int orederId);

    Order getOrder(int orderId);
}
