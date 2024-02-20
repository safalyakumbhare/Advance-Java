import java.net.*;
import java.io.*;
public class TCPClient
{
	public static void main(String args[])
	{
	try{
		Socket s=new Socket("127.0.0.1",9001);

	    // sending message to server
		OutputStream os=s.getOutputStream();  //Sending request
		PrintWriter pw=new PrintWriter(os);
		pw.println("Ram Ram Bhai Server");

         // Reciving message from server
		InputStream is2=s.getInputStream();
		InputStreamReader isr2=new InputStreamReader(is2);
		BufferedReader br=new BufferedReader(isr2);
		pw.flush();
		String data2=br.readLine();
	    System.out.println(data2);


		pw.close();
		s.close();
	      }
	      catch(Exception e){System.out.println(e);}
	}
}