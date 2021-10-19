package products;

import extendobj.product;

public class PrinterProduct extends product {

	private String paperinputcapacity;
	private String printtype;
	private int NumberOfCartridges;
	private boolean wifi;
	private double weight;
	private String bitvalue;

	public PrinterProduct() {
		super();
	}

	public PrinterProduct(String paperinputcapacity, String printtype, int numberOfCartridges, boolean wifi,
			double weight, String bitvalue) {
		super();
		this.paperinputcapacity = paperinputcapacity;
		this.printtype = printtype;
		NumberOfCartridges = numberOfCartridges;
		this.wifi = wifi;
		this.weight = weight;
		this.bitvalue = bitvalue;
	}

	public String getPaperinputcapacity() {
		return paperinputcapacity;
	}

	public void setPaperinputcapacity(String paperinputcapacity) {
		this.paperinputcapacity = paperinputcapacity;
	}

	public String getPrinttype() {
		return printtype;
	}

	public void setPrinttype(String printtype) {
		this.printtype = printtype;
	}

	public int getNumberOfCartridges() {
		return NumberOfCartridges;
	}

	public void setNumberOfCartridges(int numberOfCartridges) {
		NumberOfCartridges = numberOfCartridges;
	}

	public boolean isWifi() {
		return wifi;
	}

	public void setWifi(boolean wifi) {
		this.wifi = wifi;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getBitvalue() {
		return bitvalue;
	}

	public void setBitvalue(String bitvalue) {
		this.bitvalue = bitvalue;
	}
	public void showPrinter() {
		
		System.out.println("yazýcý modeli :"+this.getCaption());
		System.out.println("   fiyat : "+this.getPrice());
		System.out.println("indirim : %"+this.getDiscoundrate());
		
	}

}
