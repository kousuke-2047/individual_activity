package com.oldmove.util;

public class RandomInt {

	public int getSelectmenber(int menbers){

		int i = (int)(Math.random()*menbers+1);

		return i;
	}

	public int getPriority(int actiontype){

		int i = (int)(Math.random()*10);
		int r = actiontype*i;
		return r;
	}
	public int gerRandomdamage(){
		int i=(int)(Math.random()*3);
		return i;
	}

}
