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
	
	// créer un message de façon aléatoire et le personnalisér
	public String getMessage(String nom)
	{
		Random rnd = new Random();
		String msg = tbMessage[rnd.nextInt(tbMessage.length)];
		
		return msg.replace("%%", nom);
	}
}
