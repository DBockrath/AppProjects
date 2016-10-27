package com.DTMSoundMaster.ClownHunter;

import java.net.*;
import java.io.*;

public class Server extends Thread {
	
	private ServerSocket serverSocket;
	private Socket client;
	private Integer i;
	private ObjectInputStream in;
	
	public Server(int port) throws IOException {
		
		serverSocket = new ServerSocket(port);
		
	}
	
	public void run() {
		
		try {
			
			System.out.println("Waiting for client on port " + serverSocket.getLocalPort() + "...");
			client = serverSocket.accept();
			
			System.out.println("Just connected to " + client.getRemoteSocketAddress());
			
			in = new ObjectInputStream(client.getInputStream());
			
		}
		
		catch (IOException e2) {
			
			e2.printStackTrace();
			
		}
		
		while(true) {
			
			try {
				
				i = (Integer) in.readObject();
				
				System.out.println("Server: Recieved the integer: " + i.toString());
				
			}
			
			catch(SocketTimeoutException s) {
				
				System.out.println("Socket timed out!");
				break;
				
			}
			
			catch(IOException e) {
				
				e.printStackTrace();
				
				try {
					
					client.close();
					
				}
				
				catch(IOException e1) {
					
				}
				
				break;
				
			}
			
			catch(ClassNotFoundException e) {
				
				e.printStackTrace();
				
			}
			
		}
		
	}
	
}
