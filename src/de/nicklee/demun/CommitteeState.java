package de.nicklee.demun;

import java.util.List;
import java.util.ArrayList;

class CommitteeState {
	public List<String> overallCountryList = new ArrayList<String>();
	public List<String> presentCountryList = new ArrayList<String>();
	public List<String> speakersList = new ArrayList<String>();
	public int defaultSpeakingMinutes;
	public int defaultSpeakingSeconds;
	public String committeeName;
	public String currentTopic;
	public String debateType;
	
	public CommitteeState(){
		overallCountryList.add("I need stuff here");
		overallCountryList.add("I need stuff here");
		overallCountryList.add("I need stuff here");
		overallCountryList.add("I need stuff here");
		overallCountryList.add("I need stuff here");
		presentCountryList.add("USA");
		presentCountryList.add("Not USA");
		speakersList.add("George Washington");
		committeeName = "East Asia Summit";
		currentTopic = "Addressing the Conflict around the Senkaku/Diaoyutai Islands";
	}
	
	public String getPresentStats(){
		return presentCountryList.size() + " / " + overallCountryList.size() + " (1/2 = " + (int)Math.ceil(overallCountryList.size() / 2.0) + "; 2/3 = " + (int)Math.ceil(overallCountryList.size() / 1.5) + ")";
	}
	
	public void setDebateType(String type){
		debateType = type;
		//Send update event!
	}
	
	public String getDebateType(){
		return "moderatedCaucus";
	}
	
	}
