import java.net.*;
class DemoInetAddress {
    public static void main(String[] args) {
        try {
            InetAddress obj = InetAddress.getLocalHost();
            System.out.println("Host Name : " + obj.getLocalHost());
            System.out.println("Host Address : " + obj.getHostAddress());

        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
    }
}
