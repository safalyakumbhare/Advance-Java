import java.net.*;
import java.io.*;
class UDPServer
{
	public static void main(String args[])
	{
	try
	{
	DatagramSocket ds=new DatagramSocket(10000);

	byte b[]=new byte[100];

	DatagramPacket  dp=new DatagramPacket(b,100);

	System.out.println(" Before receive ");

	ds.receive(dp);

	System.out.println(" after receive ");

	byte arr[]=dp.getData();

	String s=new String(arr);

	System.out.println("message from client - Sab Badhiya"+s);

	      }
	      catch(Exception e){System.out.println(e);}
	}
}