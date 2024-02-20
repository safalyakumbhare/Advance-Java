import java.net.*;
//import java.io.*;

class UDPClient
{
	public static void main(String args[])
	{
	try{
			DatagramSocket ds=new DatagramSocket(11000);
			String s="Kya Haal chal Server";
			byte b[]=s.getBytes();
			DatagramPacket  dp=new DatagramPacket(b,b.length,InetAddress.getLocalHost(),10000);
			ds.send(dp);

	       }
	       catch(Exception e){System.out.println(e);}
	}
}