package com.tencent.pattern.builder;

/**
 * Created by masonqwli on 16/2/15.
 */
public class Main {
	public static void main(String[] args) {
		Holiday.Builder builder = new Holiday.Builder();
		Holiday holiday = builder.addDay().addDay().addHotel().addTicket().addPerson().addDay().build();
		System.err.println("holiday:\n" + holiday);
	}
}
