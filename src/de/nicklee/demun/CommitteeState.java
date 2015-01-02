package de.nicklee.demun;

import java.util.ArrayList;
import java.util.List;

import static de.nicklee.demun.CountryImporter.importCustomCountryXML;
import static de.nicklee.demun.CountryImporter.importDefaultCountryXML;

public class CommitteeState {
    private List<Country> masterCountryList = new ArrayList<Country>();
    private List<Country> committeeCountryList = new ArrayList<Country>();
    private List<String> presentCountryList = new ArrayList<String>();
    private List<String> speakersList = new ArrayList<String>();
    //More lists will be added
    private int defaultSpeakingMinutes = 1;
    private int defaultSpeakingSeconds = 0;
    private String committeeName = "";
    private String topic1 = "";
    private String topic2 = "";
    private String currentTopic = "";
    public String debateType = "";

    public CommitteeState() {
        setMasterCountryList(importDefaultCountryXML());
        getMasterCountryList().addAll(importCustomCountryXML());


        getCommitteeCountryList().add(new Country("United States","United States of America","UNST.png"));
        getPresentCountryList().add("USA");
        getPresentCountryList().add("Not USA");
        getSpeakersList().add("George Washington");
        setCommitteeName("East Asia Summit");
        setCurrentTopic("Addressing the Conflict around the Senkaku/Diaoyutai Islands");
    }

    public String getPresentStats() {
        return getPresentCountryList().size() + " / " + getCommitteeCountryList().size() + " (1/2 = " + (int) Math.ceil(getCommitteeCountryList().size() / 2.0) + "; 2/3 = " + (int) Math.ceil(getCommitteeCountryList().size() / 1.5) + ")";
    }

    public void setDebateType(String type) {
        debateType = type;
        //Send update event!
    }

    public String getDebateType() {
        return "moderatedCaucus";
    }

    public List<Country> getCommitteeCountryList() {
        return committeeCountryList;
    }

    public void setCommitteeCountryList(List<Country> committeeCountryList) {
        this.committeeCountryList = committeeCountryList;
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

    public List<Country> getMasterCountryList() {
        return masterCountryList;
    }

    public void setMasterCountryList(List<Country> masterCountryList) {
        this.masterCountryList = masterCountryList;
    }

    public String getTopic1() {
        return topic1;
    }

    public void setTopic1(String topic1) {
        this.topic1 = topic1;
    }

    public String getTopic2() {
        return topic2;
    }

    public void setTopic2(String topic2) {
        this.topic2 = topic2;
    }

    public int getPresentCount(){
        return 6;
    }

    public int getMaximumCount(){
        return 100;
    }
}
