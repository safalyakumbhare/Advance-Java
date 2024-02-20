import java.net.*;
import java.io.*;
public class TCPServer
{
	public static void main(String args[])
	{
	try{
	ServerSocket ss=new ServerSocket(9001);
	System.out.println(" Waiting to accept client ");
	Socket s=ss.accept();
	System.out.println(" received first request ");

   // Reciving message from client
	InputStream is=s.getInputStream();  //Reading  data from the socket in bytes
	InputStreamReader isr=new InputStreamReader(is);
	BufferedReader br=new BufferedReader(isr);
	String data=br.readLine();
    System.out.println(data);

    // sending message to client
    OutputStream srv=s.getOutputStream();
	PrintWriter pw2=new PrintWriter(srv);
	pw2.println("messege from server");
	pw2.flush();


	      }catch(Exception e){System.out.println(e);}
	}
}


