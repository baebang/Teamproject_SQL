package Model;


public class Data {
	
	private int num; //연번
	private int month; //확진일 월
	private int date; //확진일 일
	private int people_num; // 환자번호
	private String contry; //국적
	private String people_info; //환자정보
	private String area; //지역
	private String travel; // 여행력
	private String contact; //접촉력
	private String measures; //조치사항
	private String status; //상태
	private String route; // 이동경로
	private String registration_d; //등록일
	private String modified_d; //수정날짜
	private String exposure; // 노출여부
	
	public String getPeople_info() {
		return people_info;
	}
	public void setPeople_info(String people_info) {
		this.people_info = people_info;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getDate() {
		return date;
	}
	public void setDate(int date) {
		this.date = date;
	}
	public int getPeople_num() {
		return people_num;
	}
	public void setPeople_num(int people_num) {
		this.people_num = people_num;
	}
	public String getContry() {
		return contry;
	}
	public void setContry(String contry) {
		this.contry = contry;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getTravel() {
		return travel;
	}
	public void setTravel(String travel) {
		this.travel = travel;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getMeasures() {
		return measures;
	}
	public void setMeasures(String measures) {
		this.measures = measures;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getRoute() {
		return route;
	}
	public void setRoute(String route) {
		this.route = route;
	}
	public String getRegistration_d() {
		return registration_d;
	}
	public void setRegistration_d(String registration_d) {
		this.registration_d = registration_d;
	}
	public String getModified_d() {
		return modified_d;
	}
	public void setModified_d(String modified_d) {
		this.modified_d = modified_d;
	}
	public String getExposure() {
		return exposure;
	}
	public void setExposure(String exposure) {
		this.exposure = exposure;
	}

	

}
