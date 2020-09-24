package model;

import java.util.ArrayList;

public class MadLib {
String specialCase;
ArrayList<String>adjectives = new ArrayList<String>();
ArrayList<String> nouns = new ArrayList<String>();
ArrayList<String> verbs = new ArrayList<String>();
ArrayList<String> pluralNouns = new ArrayList<String>();

MadLib() {
	
	
	}
public MadLib(ArrayList<String> adjectives,ArrayList<String> noun,ArrayList<String> verbs,ArrayList<String> pluralNouns, String specialCase) {
	this.adjectives = adjectives;
	this.nouns = noun;
	this.verbs = verbs;
	this.pluralNouns = pluralNouns;
	this.specialCase = specialCase;
	
}
public String farmMadLib() {
	String madLib = "I spent last summer on my grandfather's "+adjectives.get(0)+" farm. He\r\n" + 
			"raises oats, wheat, and " + nouns.get(0) + " Grandfather also grows lettuce,\r\n" + 
			"corn, and lima " + pluralNouns.get(0) +".  My favorite place to "+ verbs.get(0) + " on\r\n" + 
			"the farm is the " + nouns.get(1) +" house where Grandfather keeps his\r\n" + 
			adjectives.get(1)+" chickens. Every day, each hen lays round, smooth\r\n" + 
			pluralNouns.get(1)+" Grandfather sells most of them, but keeps some so\r\n" + 
			"the hens can "+ verbs.get(1)+" on them and hatch cute, fuzzy little\r\n" + 
			pluralNouns.get(2)+" for an hour, and climb a " + nouns.get(2)+" without losing your\r\n" + 
			specialCase + ". I'm looking forward to next year, when Grandfather\r\n" + 
			"is going to show me how to drive his " + nouns.get(3) + " sow the\r\n" + 
			nouns.get(0)+", and "+ verbs.get(2) +" the cow. ";
	return madLib;
	
	
}
public String drivingMadLib() {
	String madLib = "Driving a car can be fun if you follow this " + adjectives.get(0)+" advice:\r\n" + 
			"When approaching a " + nouns.get(0) +" on the right, always blow your" + nouns.get(1) + "\r\n" + 
			"Before making a "+adjectives.get(1)+" turn, always stick your " + nouns.get(2)+ " out of the window.\r\n" + 
			"Every 2000 miles, have your "+ nouns.get(3) + " inspected and your "+ nouns.get(4)+" checked.\r\n" + 
			"When approaching a school, watch out for "+ adjectives.get(0) + pluralNouns.get(0) + "\r\n" + 
			"Above all, drive " + specialCase + ". The "+ nouns.get(5)+" you save may be your own!";
	return madLib;
}

public String getSpecialCase() {
	return specialCase;
}
public void setSpecialCase(String specialCase) {
	this.specialCase = specialCase;
}
public ArrayList<String> getAdjectives() {
	return adjectives;
}
public void setAdjectives(ArrayList<String> adjectives) {
	this.adjectives = adjectives;
}
public ArrayList<String> getNoun() {
	return nouns;
}
public void setNoun(ArrayList<String> noun) {
	this.nouns = noun;
}
public ArrayList<String> getVerbs() {
	return verbs;
}
public void setVerbs(ArrayList<String> verbs) {
	this.verbs = verbs;
}
public ArrayList<String> getPluralNouns() {
	return pluralNouns;
}
public void setPluralNouns(ArrayList<String> pluralNouns) {
	this.pluralNouns = pluralNouns;
}
}
