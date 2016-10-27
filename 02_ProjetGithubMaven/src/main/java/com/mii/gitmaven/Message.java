package com.mii.gitmaven;

import java.util.*;

public class Message 
{
	private static String[] tbMessage = 
	{
			"Bonjour %%",
			"comment allez-vous %% ?",
			"ca va %% ?",
			"Vous avez bonne mine, %%,aujourd'hui !"
	};
	
	// cr�er un message de fa�on al�atoire et le personnalis�r
	public String getMessage(String nom)
	{
		Random rnd = new Random();
		String msg = tbMessage[rnd.nextInt(tbMessage.length)];
		
		return msg.replace("%%", nom);
	}
}
