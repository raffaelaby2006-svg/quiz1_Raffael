package id.ac.polinema.oop;

public class Order {
    Customer customer;
    OrderItem[] items;
    int itemCount;

    public void Order(Customer customer, OrderItem[] items, int itemCount){
        this.customer = customer;
        this.items = items;
        this.itemCount = itemCount;
    }
    public void getCustomer(Customer Customer){
        customer = Customer;
    }
    public void addItem(MenuItem item, quantity int){
        
    }
    public void getItemCount(int ItemCount){
        itemCount = ItemCount;
    }
    public void getTotal(){

    }
    public void getFinalTotal(){

    }
}
