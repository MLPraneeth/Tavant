package day1;

public class IphoneXS 
{
	public String idtype,procressor,camerasetup;
	public int display,rearcamera1,rearcamera2,frontcamera;
	public IphoneXS(String idtype,String procressor,String camerasetup)
	{
		this.idtype=idtype;
		this.procressor=procressor;
		this.camerasetup=camerasetup;
	}
	public void specs(int rearcamera1,int rearcamera2,int frontcamera)
	{
		this.rearcamera1=rearcamera1;
		this.rearcamera2=rearcamera2;
		this.frontcamera=frontcamera;
	}
	public void disp(int display)
	{
		this.display=display;
	}
}
