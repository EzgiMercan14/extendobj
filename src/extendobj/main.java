package extendobj;


import products.PhoneProduct;
import products.PrinterProduct;
import products.computerProduct;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        product product1=new product();
        product1.setCaption("monster notebook");
        product1.setPrice(14250);
        product1.setDiscoundrate(14);
        System.out.println(product1.getCaption());
        System.out.println(product1.getPrice());
        
        
        computerProduct computer1=new computerProduct();
        computer1.setCaption("lenovo loga2");
        computer1.setDiscoundrate(0);
        computer1.setProcesser("ýntel 17 9. nesil");
        computer1.setTouchScreen(true);
        System.out.println(computer1.getCaption());
        System.out.println(computer1.getPrice());
        
       PhoneProduct phone1=new PhoneProduct();
       phone1.setCaption("Oppo Reno");
       phone1.setPrice(3478);
       phone1.setDiscoundrate(12);
       phone1.setBatteryPower(5000);
       phone1.setCameraRezolution("48mp+12mp");
       phone1.setMemorySize(64000);
       phone1.setRamCapacity(6000);
       phone1.setScreenSize(6.3);
       phone1.setSelfieCameraRezolution(8000);
       phone1.showPhone();
       
       PrinterProduct printer1=new PrinterProduct();
       printer1.setCaption("bvhcgvhgv");
       printer1.setPrice(0);
       printer1.setDiscoundrate(0);
      printer1.showPrinter();
       
       
       
	}

}
