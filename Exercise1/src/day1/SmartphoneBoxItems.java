package day1;

public class SmartphoneBoxItems
{
	public static void main(String args[])
	{
		Smartphone sm=new Smartphone();
		Smartphone ph=new Smartphone();
		Earphones er=new Earphones();
		Earphones ep=new Earphones();
		Charger ch=new Charger();
		Charger cg=new Charger();
		sm.setCompany("OnePlus");
		sm.setProcressor("Snapdragon855");
		sm.setRam(6);
		sm.setStorage(64);
		sm.setRearcamera(64);
		sm.setFrontcamera(16);
		ph.setCompany("RedmiK20pro");
		ph.setProcressor("Snapdragon855");
		ph.setRam(8);
		ph.setStorage(128);
		ph.setRearcamera(48);
		ph.setFrontcamera(20);
		System.out.println("phone-1--------------->");
		System.out.println("smartphone company "+ph.getCompany());
		System.out.println("procressor "+ph.getProcressor());
		System.out.println("phone ram "+ph.getRam()+"GB"+"\n"+"phone storage "+ph.getStorage()+"GB"+"\n"+"back camera "+ph.getRearcamera()+"MP"+"\n"+"front camera "+ph.getFrontcamera()+"MP");
		System.out.println("phone-2--------------->");
		System.out.println("smartphone company "+sm.getCompany());
		System.out.println("procressor "+sm.getProcressor());
		System.out.println("phone ram "+sm.getRam()+"GB"+"\n"+"phone storage "+sm.getStorage()+"GB"+"\n"+"back camera "+sm.getRearcamera()+"MP"+"\n"+"front camera "+sm.getFrontcamera()+"MP");
		ch.setCompany("OnePlus");
		ch.setType("WARP Charge");
		ch.setModel("Indian");
		ch.setVoltage(5);
		ch.setCurrent(6);
		cg.setCompany("Xiaomi");
		cg.setType("sonic Charge");
		cg.setModel("Indian");
		cg.setVoltage(5);
		cg.setCurrent(3);
		er.setCompany("Xiaomi");
		er.setType("wired");
		er.setCost(1500);
		ep.setCompany("OnePlus");
		ep.setType("wireless");
		ep.setCost(5000);
		System.out.println("Charger-1---------------------->");
		System.out.println("charger company "+ch.getCompany());
		System.out.println("type "+ch.getType());
		System.out.println("model "+ch.getModel()+"\n"+"output voltage "+ch.getVoltage()+"\n"+"output current"+ch.getCurrent());
		System.out.println("Charger-2---------------------->");
		System.out.println("charger company "+cg.getCompany());
		System.out.println("type "+cg.getType());
		System.out.println("model "+cg.getModel()+"\n"+"output voltage"+cg.getVoltage()+"\n"+"output current"+cg.getCurrent());
		System.out.println("Earphones-1---------------------->");
		System.out.println("Company "+er.getCompany()+"\n"+"Type "+er.getType()+"\n"+"Cost "+er.getCost());
		System.out.println("Earphones-2---------------------->");
		System.out.println("Company "+ep.getCompany()+"\n"+"Type "+ep.getType()+"\n"+"Cost "+ep.getCost());


		
	}
}