package practiclecode;

import java.net.InetAddress;
public class InetAddressMethods
{
public static void main(String s[])
{
try
{
InetAddress ip1=InetAddress.getByName("www.google.com");
System.out.println("hostname 1 "+ip1.getHostName());
InetAddress ip2=InetAddress.getByName("www.chrome.com");
System.out.println("hostname1 "+ip2.getHostName());
if(ip1.equals(ip2))
{
System.out.println("both are equals");
}
else
{
System.out.println("both are not equals");
}
}
catch(Exception e)
{
System.out.println(e);
}
}
}