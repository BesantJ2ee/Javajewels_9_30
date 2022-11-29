package Nov27;

public class Address {
	
	private String roadName;
	
	@Override
	public String toString() {
		return "Address [roadName=" + roadName + ", city=" + city + ", buildingname=" + buildingname + ", stateName="
				+ stateName + "]";
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getBuildingname() {
		return buildingname;
	}

	public void setBuildingname(String buildingname) {
		this.buildingname = buildingname;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	private String city;
	
	private String buildingname;
	
	private String stateName;

	public String getRoadName() {
		return roadName;
	}

	public void setRoadName(String roadName) {
		this.roadName = roadName;
	}
	

}
