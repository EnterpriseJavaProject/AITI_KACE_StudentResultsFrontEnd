package aiit.kace.student.integration.dto;

//CSD1.1 RESULTS CLASS

public class Ccna1_3Results{
	
	
	

	private int id;
	private String student_id;
	private int networks;
	private int routing_security_essentials;
	private int scaling_connecting_networks;
	private int switched_network;
	
	
	

	
	public Ccna1_3Results() {
		super();
	}





	public Ccna1_3Results(int id, String student_id, int networks, int routing_security_essentials,
			int scaling_connecting_networks, int switched_network) {
		super();
		this.id = id;
		this.student_id = student_id;
		this.networks = networks;
		this.routing_security_essentials = routing_security_essentials;
		this.scaling_connecting_networks = scaling_connecting_networks;
		this.switched_network = switched_network;
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





	public int getNetworks() {
		return networks;
	}





	public void setNetworks(int networks) {
		this.networks = networks;
	}





	public int getRouting_security_essentials() {
		return routing_security_essentials;
	}





	public void setRouting_security_essentials(int routing_security_essentials) {
		this.routing_security_essentials = routing_security_essentials;
	}





	public int getScaling_connecting_networks() {
		return scaling_connecting_networks;
	}





	public void setScaling_connecting_networks(int scaling_connecting_networks) {
		this.scaling_connecting_networks = scaling_connecting_networks;
	}





	public int getSwitched_network() {
		return switched_network;
	}





	public void setSwitched_network(int switched_network) {
		this.switched_network = switched_network;
	}





	@Override
	public String toString() {
		return "Ccna1_1Results [id=" + id + ", student_id=" + student_id + ", networks=" + networks
				+ ", routing_security_essentials=" + routing_security_essentials + ", scaling_connecting_networks="
				+ scaling_connecting_networks + ", switched_network=" + switched_network + "]";
	}





	

	
	

}
