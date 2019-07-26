package day1;

public class IphoneVIII extends IphoneXS 
{

	public IphoneVIII(String idtype, String procressor, String camerasetup) 
	{
		super(idtype, procressor, camerasetup);
	}
	public void iphone8specs(int rearcamera1,int rearcamera2,int frontcamera)
	{
		super.specs(rearcamera1,rearcamera2,frontcamera);
	}
	public void disp(int display)
	{
		this.display=display;
	}
	
}
