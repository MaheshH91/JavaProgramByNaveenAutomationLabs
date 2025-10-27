package interviewPrograms.basicPrograms;

import java.net.InetAddress;
import java.net.URI;
import java.net.URL;

public class URlcompareWithItsIPAddress {

    public static void main(String[] args) {
        try {
            // Create URL from domain
            URI uri1 = URI.create("https://google.com");
            URL url1 = uri1.toURL();

            // Create URL from IP address
            URI uri2 = URI.create("https://142.250.192.100"); // Google's ip
            URL url2 = uri2.toURL();

            // Compare URLs directly
            System.out.println("Are URLs equal? " + url1.equals(url2));

            // Compare resolved IPs
            InetAddress ipFromDomain = InetAddress.getByName("google.com");
            InetAddress ipLiteral = InetAddress.getByName("2404:6800:4009:80e::200e");

            System.out.println("Resolved IP of google.com: " + ipFromDomain.getHostAddress());
            System.out.println("Literal IP: " + ipLiteral.getHostAddress());
            System.out.println("Are IPs equal? " + ipFromDomain.equals(ipLiteral));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}