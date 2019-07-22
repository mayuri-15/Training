
public class PurchaseD {
	
	
private int item_code;
private int quantity;
private int cost;
private int amount;
public int getItem_code() {
	return item_code;
}
public void setItem_code(int item_code) {
	this.item_code = item_code;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public int getAmount() {
	return amount;
}
public void setAmount(int amount) {
	this.amount = amount;
}
public int getCost() {
	return cost;
}
public void setCost(int cost) {
	this.cost = cost;
}
public PurchaseD(){
	super();
}
public PurchaseD(int item_code, int quantity, int cost, int amount) {
	super();
	this.item_code = item_code;
	this.quantity = quantity;
	this.cost = cost;
	this.amount = amount;
}




}
