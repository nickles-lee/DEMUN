package de.nicklee.demun;

import java.util.ArrayList;
import java.util.List;

public class CommitteeState {
    private List<String> masterCountryList = new ArrayList<String>();
    private List<String> presentCountryList = new ArrayList<String>();
    private List<String> speakersList = new ArrayList<String>();
    //More lists will be added
    private int defaultSpeakingMinutes;
    private int defaultSpeakingSeconds;
    private String committeeName;
    private String currentTopic;
    public String debateType;

    public CommitteeState() {
        getMasterCountryList().add("I need stuff here");
        getMasterCountryList().add("I need stuff here");
        getMasterCountryList().add("I need stuff here");
        getMasterCountryList().add("I need stuff here");
        getMasterCountryList().add("I need stuff here");
        getPresentCountryList().add("USA");
        getPresentCountryList().add("Not USA");
        getSpeakersList().add("George Washington");
        setCommitteeName("East Asia Summit");
        setCurrentTopic("Addressing the Conflict around the Senkaku/Diaoyutai Islands");
    }

    public String getPresentStats() {
        return getPresentCountryList().size() + " / " + getMasterCountryList().size() + " (1/2 = " + (int) Math.ceil(getMasterCountryList().size() / 2.0) + "; 2/3 = " + (int) Math.ceil(getMasterCountryList().size() / 1.5) + ")";
    }

    public void setDebateType(String type) {
        debateType = type;
        //Send update event!
    }

    public String getDebateType() {
        return "moderatedCaucus";
    }

    public List<String> getMasterCountryList() {
        return masterCountryList;
    }

    public void setMasterCountryList(List<String> masterCountryList) {
        this.masterCountryList = masterCountryList;
    }

    public List<String> getPresentCountryList() {
        return presentCountryList;
    }

    public void setPresentCountryList(List<String> presentCountryList) {
        this.presentCountryList = presentCountryList;
    }

    public List<String> getSpeakersList() {
        return speakersList;
    }

    public void setSpeakersList(List<String> speakersList) {
        this.speakersList = speakersList;
    }

    public int getDefaultSpeakingMinutes() {
        return defaultSpeakingMinutes;
    }

    public void setDefaultSpeakingMinutes(int defaultSpeakingMinutes) {
        this.defaultSpeakingMinutes = defaultSpeakingMinutes;
    }

    public int getDefaultSpeakingSeconds() {
        return defaultSpeakingSeconds;
    }

    public void setDefaultSpeakingSeconds(int defaultSpeakingSeconds) {
        this.defaultSpeakingSeconds = defaultSpeakingSeconds;
    }

    public String getCommitteeName() {
        return committeeName;
    }

    public void setCommitteeName(String committeeName) {
        this.committeeName = committeeName;
    }

    public String getCurrentTopic() {
        return currentTopic;
    }

    public void setCurrentTopic(String currentTopic) {
        this.currentTopic = currentTopic;
    }
}
