package com.techelevator;

public class Television {

	private boolean isOn = false;
	private int currentChannel = 3;
	private int currentVolume = 2;
	
	
	public void turnOff(){
		isOn = false;
	}
	
	public void turnOn(){
		isOn = true;
		currentChannel = 3;
		currentVolume = 2;
	}
	
	public void changeChannel(int newChannel){
		if (isOn == true && 3 <= newChannel && newChannel <= 18){
			currentChannel = newChannel;
		}
	}
	
	public void channelUp(){
		if (isOn == true && currentChannel < 18){
			currentChannel += 1;
		} else if(isOn == true && currentChannel == 18){
			currentChannel = 3;
		}
	}
	
	public void channelDown(){
		if (isOn == true && currentChannel > 3){
			currentChannel--;
		} else if (isOn == true && currentChannel == 3) {
			currentChannel = 18;
		}
	}

	public void raiseVolume(){
		if (isOn == true && currentVolume < 10){
			currentVolume++;
		}
	}
	
	public void lowerVolume() {
		if (isOn == true && currentVolume > 0){
			currentVolume--;
		}
	}

	public boolean isOn() {
		return isOn;
	}

	public int getCurrentChannel() {
		return currentChannel;
	}

	public int getCurrentVolume() {
		return currentVolume;
	}
	
}
