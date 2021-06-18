package aiit.kace.student.integration.dto;

//CSD1.1 RESULTS CLASS

public class CyberSecurity1_1Results{
	
	
	


	private int id;
	private String student_id;
	private int cyber_security_attacks;
	private int cyber_security_methods;
	private int network_packet_analysis;
	private int network_monitoring_deep_packet_inspection;
	private int cyber_analytics;
	private int malware_analytics;
	
	
	

	
	public CyberSecurity1_1Results() {
		super();
	}





	public CyberSecurity1_1Results(int id, String student_id, int cyber_security_attacks, int cyber_security_methods,
			int network_packet_analysis, int network_monitoring_deep_packet_inspection, int cyber_analytics,
			int malware_analytics) {
		super();
		this.id = id;
		this.student_id = student_id;
		this.cyber_security_attacks = cyber_security_attacks;
		this.cyber_security_methods = cyber_security_methods;
		this.network_packet_analysis = network_packet_analysis;
		this.network_monitoring_deep_packet_inspection = network_monitoring_deep_packet_inspection;
		this.cyber_analytics = cyber_analytics;
		this.malware_analytics = malware_analytics;
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





	public int getCyber_security_attacks() {
		return cyber_security_attacks;
	}





	public void setCyber_security_attacks(int cyber_security_attacks) {
		this.cyber_security_attacks = cyber_security_attacks;
	}





	public int getCyber_security_methods() {
		return cyber_security_methods;
	}





	public void setCyber_security_methods(int cyber_security_methods) {
		this.cyber_security_methods = cyber_security_methods;
	}





	public int getNetwork_packet_analysis() {
		return network_packet_analysis;
	}





	public void setNetwork_packet_analysis(int network_packet_analysis) {
		this.network_packet_analysis = network_packet_analysis;
	}





	public int getNetwork_monitoring_deep_packet_inspection() {
		return network_monitoring_deep_packet_inspection;
	}





	public void setNetwork_monitoring_deep_packet_inspection(int network_monitoring_deep_packet_inspection) {
		this.network_monitoring_deep_packet_inspection = network_monitoring_deep_packet_inspection;
	}





	public int getCyber_analytics() {
		return cyber_analytics;
	}





	public void setCyber_analytics(int cyber_analytics) {
		this.cyber_analytics = cyber_analytics;
	}





	public int getMalware_analytics() {
		return malware_analytics;
	}





	public void setMalware_analytics(int malware_analytics) {
		this.malware_analytics = malware_analytics;
	}





	@Override
	public String toString() {
		return "CyberSecurity1_1Results [id=" + id + ", student_id=" + student_id + ", cyber_security_attacks="
				+ cyber_security_attacks + ", cyber_security_methods=" + cyber_security_methods
				+ ", network_packet_analysis=" + network_packet_analysis
				+ ", network_monitoring_deep_packet_inspection=" + network_monitoring_deep_packet_inspection
				+ ", cyber_analytics=" + cyber_analytics + ", malware_analytics=" + malware_analytics + "]";
	}





	

	
	

}
