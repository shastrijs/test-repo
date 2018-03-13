package com.aflabs.afbot.context;

import java.util.ArrayList;
import java.util.List;

import com.aflabs.afbot.core.Challenge;
import com.aflabs.afbot.core.Model;

public interface ChallengeContext extends Context{
	
	Challenge challenge = new Challenge<>();
	//Model model = new Model<>();
	
	public void loadChallenge();


}
