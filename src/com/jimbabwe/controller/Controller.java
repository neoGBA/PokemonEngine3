package com.jimbabwe.controller;

import com.jimbabwe.pokemon.*;

public class Controller{
	
	
	boolean drawBattle = true;
	boolean battleBeginning = true;
	
	Object [] myTeam;
	Object [] enemyTeam;

	public void start() {
		battle fight = new battle();
		fight.startBattle();
	}
	
}
