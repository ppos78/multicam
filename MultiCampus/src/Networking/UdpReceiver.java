package Networking;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UdpReceiver {
	public static void main(String[] args) {
		DatagramSocket socket=null;
	
		
		try {
			socket=new DatagramSocket(5000);
			byte[] buf=new byte[512];
			DatagramPacket packet=new DatagramPacket(buf, buf.length);
						
			socket.receive(packet);
			System.out.println(new String(buf));
		}catch(SocketException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
