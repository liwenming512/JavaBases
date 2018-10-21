package com.lwm.socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;

public class GreetingServer extends Thread {
	
	private ServerSocket serverSocket;
	
	public GreetingServer(int port) throws IOException{
		serverSocket = new ServerSocket(port);
		serverSocket.setSoTimeout(20000);
	}
	
	public void run(){
		while(true){
			System.out.println("等待远程连接，端口号为：" + serverSocket.getLocalPort() + "...");
			try {
				Socket server = serverSocket.accept();
				System.out.println("远程主机地址:" + server.getRemoteSocketAddress());
				DataInputStream in = new DataInputStream(server.getInputStream());
				System.out.println(in.readUTF());
				DataOutputStream out = new DataOutputStream(server.getOutputStream());
				out.writeUTF("谢谢连接我，" + server.getLocalSocketAddress() + "\nGoodbye");
				server.close();
			} catch(SocketTimeoutException s){
				s.printStackTrace();
				break;
			}
			catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				break;
			}
		}
	}
	
	public static void main(String args[]){
		int port = Integer.parseInt(args[0]);
		try {
			Thread thread = new GreetingServer(port);
			thread.run();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
