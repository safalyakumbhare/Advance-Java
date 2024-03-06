import java.net.*;
class DemoURL
{
    public static void main(String[] args) {
        try {
            URL url = new URL("http","www.yahoo.com",60,"/index.html");
            System.out.println("Protocol : "+url.getProtocol());
            System.out.println("Host : "+url.getHost());
            System.out.println("Port : "+url.getPort());
            System.out.println("File : "+url.getFile());
        } catch (Exception e) {
            System.out.println(e);
            // TODO: handle exception
        }
    }
}