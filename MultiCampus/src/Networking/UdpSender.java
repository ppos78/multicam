package Networking;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class UdpSender {
	public static void main(String[] args) {
		DatagramSocket socket = null;

		try {
			socket = new DatagramSocket();
			String msg = "되니?";
			byte[] buf = msg.getBytes();

			DatagramPacket packet = new DatagramPacket(buf, buf.length, InetAddress.getByName("70.12.111.255"), 5000);
			socket.send(packet);
			
		} catch (SocketException e) {
			e.printStackTrace();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			socket.close();
		}
	}
}
