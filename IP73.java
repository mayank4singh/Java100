//How to get IP address from site URL using java program
import java.io.*; 
import java.net.*; 

public class IP73{
    public static void main(String[] args){
    try{
    InetAddress ip=InetAddress.getByName("www.Technolamror.com");
    System.out.println("Host Name: "+ip.getHostName()); 
    System.out.println("IP Address: "+ip.getHostAddress());
    }catch(Exception e){System.out.println(e);}
    }
    }