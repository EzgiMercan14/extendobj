package products;

import extendobj.product;

public class PhoneProduct extends product{
    private int batteryPower;
    private String cameraRezolution;
    private double selfieCameraRezolution;
    private int memorySize;
    private double screenSize;
    private int ramCapacity;
	public PhoneProduct() {
		super();
	}
	
	public PhoneProduct(int batteryPower, String cameraRezolution, double selfieCameraRezolution, int memorySize,
			double screenSize, int ramCapacity) {
		super();
		this.batteryPower = batteryPower;
		this.cameraRezolution = cameraRezolution;
		this.selfieCameraRezolution = selfieCameraRezolution;
		this.memorySize = memorySize;
		this.screenSize = screenSize;
		this.ramCapacity = ramCapacity;
	}

	public int getBatteryPower() {
		return batteryPower;
	}
	public void setBatteryPower(int batteryPower) {
		this.batteryPower = batteryPower;
	}
	public String getCameraRezolution() {
		return cameraRezolution;
	}
	public void setCameraRezolution(String cameraRezolution) {
		this.cameraRezolution = cameraRezolution;
	}
	public double getSelfieCameraRezolution() {
		return selfieCameraRezolution;
	}
	public void setSelfieCameraRezolution(double selfieCameraRezolution) {
		this.selfieCameraRezolution = selfieCameraRezolution;
	}
	public int getMemorySize() {
		return memorySize;
	}
	public void setMemorySize(int memorySize) {
		this.memorySize = memorySize;
	}

	public double getScreenSize() {
		return screenSize;
	}

	public void setScreenSize(double screenSize) {
		this.screenSize = screenSize;
	}

	public int getRamCapacity() {
		return ramCapacity;
	}

	public void setRamCapacity(int ramCapacity) {
		this.ramCapacity = ramCapacity;
	}
    public String writeMemoryCapacity() {
    	if(this.getMemorySize()>1000000) {
    		return(this.getMemorySize()/1000000)+"terabyte";
    	}
    	else if(this.getMemorySize()>1000) {
    	  return (this.getMemorySize()/1000)+"gigabyte";
    	}
    	else 
    		return this.getMemorySize()+"megabyte";
    }
    public void showPhone() {
    	System.out.println("telefon modeli : "+this.getCaption());
    	System.out.println("    fiyat : "+this.getPrice());
    	System.out.println("indirim : %"+this.getDiscoundrate());
    }
}
    
