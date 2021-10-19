package extendobj;

public class product {
   private String caption;
   private double price;
   private double discoundrate;
   private double rating;
public product() {
	super();
}
public product(String caption, double price, double discoundrate) {
	super();
	this.caption = caption;
	this.price = price;
	this.discoundrate = discoundrate;
}
public String getCaption() {
	return caption;
}
public void setCaption(String caption) {
	this.caption = caption;
}
public double getPrice() {
	return price*(100-this.discoundrate)/100;
}
public void setPrice(double price) {
	this.price = price;
}
public double getDiscoundrate() {
	return discoundrate;
}
public void setDiscoundrate(double discoundrate) {
	this.discoundrate = discoundrate;
}
   
}
