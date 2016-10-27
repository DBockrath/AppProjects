package com.DTMSoundMaster.ClownHunter;

import java.net.*;
import java.io.*;
import java.util.*;

public class Client extends Thread {
	
	Socket server;
	ObjectOutputStream out;
	Timer timer;
	
	public Client(String hostname, int port) throws IOException {
		
		server = new Socket(hostname, port);
		out = new ObjectOutputStream(server.getOutputStream());
		timer = new Timer();
		timer.schedule(new SendTask(), 0, 1 * 1000);
		
	}
	
	public void sendData(Integer b) throws IOException {
		
		out.writeObject(b);
		
	}
	
	class SendTask extends TimerTask {

		Integer i = new Integer(1);

		public void run() {

			System.out.println("Client: Sending Integer: " + i.toString());

			try {

				sendData(i);
				i = new Integer(i.intValue() + 1);

			}

			catch (IOException e) {

				e.printStackTrace();

			}

		}

	}
	
}
