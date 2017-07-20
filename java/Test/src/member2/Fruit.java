package member2;

public enum Fruit {
	STROBERRY, APPLE, BANANA;
	private int price;
	private String color;
	
	 public void Fruit(int price, String color){
		this.price=price;
		this.color=color;
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
}
