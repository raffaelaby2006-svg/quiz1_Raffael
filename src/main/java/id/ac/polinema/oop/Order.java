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
    public void getCustomer(){
        
    }
    public void addItem(){

    }
    public void getItemCount(){

    }
    public void getTotal(){

    }
    public void getFinalTotal(){

    }
}
