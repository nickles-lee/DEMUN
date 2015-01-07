package de.nicklee.demun;

import java.util.ArrayList;
import java.util.List;

import static de.nicklee.demun.CountryImporter.importCustomCountryXML;
import static de.nicklee.demun.CountryImporter.importDefaultCountryXML;

public class CommitteeState {
    private static List<Country> masterCountryList = new ArrayList<Country>();
    private static List<Country> committeeCountryList = new ArrayList<Country>();
    private static List<Country> presentCountryList = new ArrayList<Country>();
    private static List<Country> speakersList = new ArrayList<Country>();
    //More lists will be added
    private static int defaultSpeakingMinutes = 1;
    private static int defaultSpeakingSeconds = 0;
    private static String committeeName = "";
    private static String topic1 = "";
    private static String topic2 = "";
    private static String currentTopic = "";
    public static String debateType = "";

    public CommitteeState() {
        setMasterCountryList(importDefaultCountryXML());
        getMasterCountryList().addAll(importCustomCountryXML());        //Currently does nothing until this is added
        setCommitteeCountryList(new ArrayList<Country>(getMasterCountryList()));
        setPresentCountryList(new ArrayList<Country>(getCommitteeCountryList()));
        setSpeakersList(new ArrayList<Country>(getPresentCountryList()));
        setCommitteeName("General Assembly");
        setCurrentTopic("General Discussion");
    }

    public static String getPresentStats() {
        return getPresentCountryList().size() + " / " + getCommitteeCountryList().size() + " (1/2 = " + (int) Math.ceil(getCommitteeCountryList().size() / 2.0) + "; 2/3 = " + (int) Math.ceil(getCommitteeCountryList().size() / 1.5) + ")";
    }

    public static void setDebateType(String type) {
        debateType = type;
        //Send update event!
    }

    public static String getDebateType() {
        return "moderatedCaucus";
    }

    public static List<Country> getCommitteeCountryList() {
        return committeeCountryList;
    }

    public static void setCommitteeCountryList(List<Country> ccl) {
        committeeCountryList = ccl;
    }

    public static List<Country> getPresentCountryList() {
        return presentCountryList;
    }

    public static void setPresentCountryList(List<Country> pcl) {
        presentCountryList = pcl;
    }

    public static List<Country> getSpeakersList() {
        return speakersList;
    }

    public static void setSpeakersList(List<Country> sl) {
        speakersList = sl;
    }

    public static int getDefaultSpeakingMinutes() {
        return defaultSpeakingMinutes;
    }

    public static void setDefaultSpeakingMinutes(int dsm) {
        defaultSpeakingMinutes = dsm;
    }

    public static int getDefaultSpeakingSeconds() {
        return defaultSpeakingSeconds;
    }

    public static void setDefaultSpeakingSeconds(int dss) {
        defaultSpeakingSeconds = dss;
    }

    public static String getCommitteeName() {
        return committeeName;
    }

    public static void setCommitteeName(String cn) {
        committeeName = cn;
    }

    public static String getCurrentTopic() {
        return currentTopic;
    }

    public static void setCurrentTopic(String ct) {
        currentTopic = ct;
    }

    public static List<Country> getMasterCountryList() {
        return masterCountryList;
    }

    public static void setMasterCountryList(List<Country> mcl) {
        masterCountryList = mcl;
    }

    public static String getTopic1() {
        return topic1;
    }

    public static void setTopic1(String t1) {
        topic1 = t1;
    }

    public static String getTopic2() {
        return topic2;
    }

    public static void setTopic2(String t2) {
        topic2 = t2;
    }

    public static int getPresentCount(){
        return 6;
    }

    public static int getMaximumCount(){
        return 100;
    }
}
