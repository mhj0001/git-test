package com.example.test.aa;

import java.io.IOException;

import com.google.android.gcm.server.Message;
import com.google.android.gcm.server.Result;
import com.google.android.gcm.server.Sender;

public class Test {
	
	String PUBLISHER_GCM_CERTIFICATION_KEY = "AIzaSyB29xGAZlmttKbvADfeNrEDSpllCiUMK44 ";
	String REG_ID = "APA91bGWQRvsksX5xD1Nlr4JfwkXbReiT_oBc0TmR4WjR1Uwz-eePy3eMgyIU5mAZS3ze_GqcwYtg15vd7ECVN6RlsKvMKYeITB_ceAiOsNijiVpzGD-b5XsIyAUe6xOGEPMC3R2LvEC";
	String message = "{\"type\":\"01\",\"message\":\"test push message\"}";
	private Sender sender;
	
	public void print(){
		System.out.println("#### Print !!! ");
	}
	
	public void push(){
		sender = new Sender(PUBLISHER_GCM_CERTIFICATION_KEY);
		
		Message msg = new Message.Builder().addData("message", message).build();
		Result result;
		try {
			result = sender.send(msg, REG_ID, 5);
			System.out.println("Result : " + result);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
