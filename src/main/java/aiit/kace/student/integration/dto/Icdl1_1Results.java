package aiit.kace.student.integration.dto;

//CSD1.1 RESULTS CLASS

public class Icdl1_1Results{
	
	
	


	private int id;
	private String student_id;
	private int foc;
	private int microsoft_word;
	private int excel;
	private int powerpoint;
	private int it_security;
	private int digital_marketing;
	
	
	

	
	public Icdl1_1Results() {
		super();
	}





	public Icdl1_1Results(int id, String student_id, int foc, int microsoft_word, int excel, int powerpoint,
			int it_security, int digital_marketing) {
		super();
		this.id = id;
		this.student_id = student_id;
		this.foc = foc;
		this.microsoft_word = microsoft_word;
		this.excel = excel;
		this.powerpoint = powerpoint;
		this.it_security = it_security;
		this.digital_marketing = digital_marketing;
	}





	public int getId() {
		return id;
	}





	public void setId(int id) {
		this.id = id;
	}





	public String getStudent_id() {
		return student_id;
	}





	public void setStudent_id(String student_id) {
		this.student_id = student_id;
	}





	public int getFoc() {
		return foc;
	}





	public void setFoc(int foc) {
		this.foc = foc;
	}





	public int getMicrosoft_word() {
		return microsoft_word;
	}





	public void setMicrosoft_word(int microsoft_word) {
		this.microsoft_word = microsoft_word;
	}





	public int getExcel() {
		return excel;
	}





	public void setExcel(int excel) {
		this.excel = excel;
	}





	public int getPowerpoint() {
		return powerpoint;
	}





	public void setPowerpoint(int powerpoint) {
		this.powerpoint = powerpoint;
	}





	public int getIt_security() {
		return it_security;
	}





	public void setIt_security(int it_security) {
		this.it_security = it_security;
	}





	public int getDigital_marketing() {
		return digital_marketing;
	}





	public void setDigital_marketing(int digital_marketing) {
		this.digital_marketing = digital_marketing;
	}





	@Override
	public String toString() {
		return "Icdl1_1Results [id=" + id + ", student_id=" + student_id + ", foc=" + foc + ", microsoft_word="
				+ microsoft_word + ", excel=" + excel + ", powerpoint=" + powerpoint + ", it_security=" + it_security
				+ ", digital_marketing=" + digital_marketing + "]";
	}



	
	

}
