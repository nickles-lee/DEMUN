package de.nicklee.demun;

import org.codehaus.plexus.util.Base64;

import javax.imageio.ImageIO;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.awt.*;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Country {
	private String shortName;
	private String longName;
	private String flagName;
	private Image flagData;

	public Country(String sname, String lname, String flagname){
		this.setShortName(sname);
		this.setLongName(lname);
		try {
			this.setFlagImage(ImageIO.read(Country.class.getResource("/de/nicklee/demun/resources/flags/" + flagname)));
		}catch(Exception ex){
			System.out.println("[Error: Incorrect flagfile for "+shortName + ", " + flagName);
		}
	}

	public Country (String sname, String lname, byte[] flagDataBase64) throws IOException {
		shortName = sname;
		longName = lname;
		InputStream in = new ByteArrayInputStream(Base64.decodeBase64(flagDataBase64));
		flagData = ImageIO.read(in);
	}
	
	public String getShortName() {
		return shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	public String getLongName() {
		return longName;
	}

	public void setLongName(String longName) {
		this.longName = longName;
	}

	public String getFlagName() {
		return flagName;
	}

	public void setFlagName(String flagName) {
		this.flagName = flagName;
	}

	public Image getFlagImage(){
		return flagData;
	}

	public void setFlagImage(Image img){
		flagData = img;
	}

	public String toString(){
		return shortName;
	}
}
