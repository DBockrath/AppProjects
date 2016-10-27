package com.DTMSoundMaster.ClownHunter;

import java.io.*;

public class Network {
	
	Client client;
	Server serevr;
	
	public Network() throws IOException {
		
		startServer();
		startClient();
		
	}
	
	private void startServer() throws IOException {
		
		serevr = new Server(57604);
		serevr.start();
		
	}
	
	private void startClient() throws IOException {
		
		boolean isConnected = false;
		
		while (!isConnected) {
			
			try {
				
				client = new Client("172.58.217.137", 57604);
				
			}
			
			catch (IOException e) {
				
				continue;
				
			}
			
			isConnected = true;
			
		}
		
		client.start();
		
	}
	
	public static void main(String[] args) {
		
		try {
			
			Network n = new Network();
			
		}
		
		catch (IOException e) {
			
			e.printStackTrace();
			
		}
		
	}
	
}
