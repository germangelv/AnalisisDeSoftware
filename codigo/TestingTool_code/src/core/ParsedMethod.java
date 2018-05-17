package core;

import java.util.HashSet;

public class ParsedMethod extends ParsedClass {
	private int totalLines;
	private int totalComments;
	private int cyclomaticComplexity;
	private int fanIn;
	private int fanOut;
	private int halsteadLength;
	private double halsteadVolume;
	private String halsteadInfo;
	private HashSet<String> lvars;

	public ParsedMethod(String name, int start, int end) {
		super(name, start, end);
		totalLines = 0;
		totalComments = 0;
		cyclomaticComplexity = 0;
		fanIn = 0;
		fanOut = 0;
		halsteadLength = 0;
		halsteadVolume = 0;
		halsteadInfo = "";
		lvars = null;
	}

	public void setTotalLines(int totalLines) {
		this.totalLines = totalLines;
	}

	public void setTotalComments(int totalComments) {
		this.totalComments = totalComments;
	}

	public void setCyclomaticComplexity(int cyclomaticComplexity) {
		this.cyclomaticComplexity = cyclomaticComplexity;
	}

	public void setFanIn(int fanIn) {
		this.fanIn = fanIn;
	}

	public void setFanOut(int fanOut) {
		this.fanOut = fanOut;
	}

	public void setHalsteadLength(int halsteadLength) {
		this.halsteadLength = halsteadLength;
	}

	public void setHalsteadVolume(double halsteadVolume) {
		this.halsteadVolume = halsteadVolume;
	}

	public int getTotalLines() {
		return totalLines;
	}

	public int getTotalComments() {
		return totalComments;
	}

	public float getCommentsPercentage() {
		return (totalLines == 0) ? 0 : ((float) totalComments / totalLines) * 100;
	}

	public int getCyclomaticComplexity() {
		return cyclomaticComplexity + 1;
	}

	public int getFanIn() {
		return fanIn;
	}

	public int getFanOut() {
		return fanOut;
	}

	public int getHalsteadLength() {
		return halsteadLength;
	}

	public double getHalsteadVolume() {
		return halsteadVolume;
	}

	public void incrementTotalLines() {
		this.totalLines++;
	}

	public void incrementTotalLines(int incr) {
		this.totalLines += incr;
	}

	public void incrementTotalComments() {
		this.totalComments++;
	}

	public void incrementTotalComments(int incr) {
		this.totalComments += incr;
	}

	public void incrementCyclomaticComplexity() {
		this.cyclomaticComplexity++;
	}

	public void incrementCyclomaticComplexity(int incr) {
		this.cyclomaticComplexity += incr;
	}

	public void setHalsteadInfo(String halsteadInfo) {
		this.halsteadInfo = halsteadInfo;
	}

	public String getHalsteadInfo() {
		return this.halsteadInfo;
	}
	
	public void setLVars(HashSet<String> lvars){
		this.lvars = lvars;
	}

	public HashSet<String> getLVars() {
		return this.lvars;
	}
}
