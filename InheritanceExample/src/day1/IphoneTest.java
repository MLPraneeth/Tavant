package day1;

public class IphoneTest 
{
	public static void main(String args[])
	{
		System.out.println("specs of iphone xs--------->");
		IphoneXS xs=new IphoneXS("Face Id","A12 Bionic Chip","Dual camera");
		xs.specs(12,12,7);
		xs.disp(5);
		System.out.println("id type: "+xs.idtype+"\n"+"procressor: "+xs.procressor+"\n"+"camerasetup: "+xs.camerasetup);
		System.out.println("rear camera1 MegaPixels: "+xs.rearcamera1+"\n"+"rear camera2 MP: "+xs.rearcamera2+ "\n"+ "front camera MP: "+xs.frontcamera+"\n"+"display size: "+xs.display);
		IphoneXSmax xsm=new IphoneXSmax("Face Id+","A12 Bionic Chip+","DualOmni vision camera");
		xsm.Iphonemaxspecs(16,13,8);
		xsm.disp(7);
		IphoneVIII et=new IphoneVIII("touch id","A11 Bionic chip","DualHybridcamera");
		et.iphone8specs(32,8,16);
		et.disp(6);
		System.out.println("specs of iphone XS max-------->");
		System.out.println("id type: "+xsm.idtype+"\n"+"procressor: "+xsm.procressor+"\n"+"camerasetup: "+xsm.camerasetup);
		System.out.println("rear camera1 MegaPixels: "+xsm.rearcamera1+"\n"+"rear camera2 MP: "+xsm.rearcamera2+ "\n"+ "front camera MP: "+xsm.frontcamera+"\n"+"display size: "+xsm.display);
		System.out.println("specs of iphone 8------------>");
		System.out.println("id type: "+et.idtype+"\n"+"procressor: "+et.procressor+"\n"+"camerasetup: "+et.camerasetup);
		System.out.println("rear camera1 MegaPixels: "+et.rearcamera1+"\n"+"rear camera2 MP: "+et.rearcamera2+ "\n"+ "front camera MP: "+et.frontcamera+"\n"+"display size: "+et.display);
	}
}
