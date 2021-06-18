package aiit.com.student.integration.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import aiit.com.student.integration.Csd1_1RestClient;
import aiit.kace.student.integration.dto.Csd1_1Info;
import aiit.kace.student.integration.dto.Csd1_1Results;
import aiit.kace.student.integration.dto.Csd1_2Info;
import aiit.kace.student.integration.dto.Csd1_2Results;
import aiit.kace.student.integration.dto.Csd1_3Info;
import aiit.kace.student.integration.dto.Csd1_3Results;
import aiit.kace.student.integration.dto.Csd1_4Info;
import aiit.kace.student.integration.dto.Csd1_4Results;
import aiit.kace.student.integration.dto.Csd1_5Info;
import aiit.kace.student.integration.dto.Csd1_5Results;
import aiit.kace.student.integration.dto.Csd1_6Info;
import aiit.kace.student.integration.dto.Csd1_6Results;
import aiit.kace.student.integration.dto.Csd1_7Info;
import aiit.kace.student.integration.dto.Csd1_7Results;


@Component
public class Csd1_1RestClientImpl implements Csd1_1RestClient {

	
	
	RestTemplate restTemplate = new RestTemplate();
	
	Csd1_1Info Aiti_Kace_csd1_1Student = new Csd1_1Info();
	Csd1_2Info Aiti_Kace_csd1_2Student = new Csd1_2Info();
	Csd1_3Info Aiti_Kace_csd1_3Student = new Csd1_3Info();
	Csd1_4Info Aiti_Kace_csd1_4Student = new Csd1_4Info();
	Csd1_5Info Aiti_Kace_csd1_5Student = new Csd1_5Info();
	Csd1_6Info Aiti_Kace_csd1_6Student = new Csd1_6Info();
	Csd1_7Info Aiti_Kace_csd1_7Student = new Csd1_7Info();
	
	
	
	Csd1_1Results Aiti_Kace_csd1_1StudentResults = new Csd1_1Results();
	Csd1_2Results Aiti_Kace_csd1_2StudentResults = new Csd1_2Results();
	Csd1_3Results Aiti_Kace_csd1_3StudentResults = new Csd1_3Results();
	Csd1_4Results Aiti_Kace_csd1_4StudentResults = new Csd1_4Results();
	Csd1_5Results Aiti_Kace_csd1_5StudentResults = new Csd1_5Results();
	Csd1_6Results Aiti_Kace_csd1_6StudentResults = new Csd1_6Results();
	Csd1_7Results Aiti_Kace_csd1_7StudentResults = new Csd1_7Results();
	
	
	
	
	
	
	
	@Override
	public String csd1_1StudentIdRetrival(String csd1_1StudentId) {
		
		String csd1_1StudentIdRetrival = String.valueOf(restTemplate.getForObject("http://localhost:9090/aitiCsdStudentsAPI/getCsd1_1StudentId",  Csd1_1Results.class));
		
		return csd1_1StudentIdRetrival;
	}
	
	
	
	
	
	
	

	@Override
	public Csd1_1Results findcsd1_1StudentIdRetrival(Csd1_1Results csd1_1StudentId) {
		
		Csd1_1Results findcsd1_1StudentIdRetrival = restTemplate.getForObject("http://localhost:9090/aitiCsdStudentsAPI/getCsd1_1Student",  Csd1_1Results.class);
		
		return findcsd1_1StudentIdRetrival;
	
	}

	
	
	
	
	
	
	

	
	
	
				//  SAVE CSD STUDENT
	
	@Override
	public void saveCsd1_1Stduent(Csd1_1Info csd1_1Student) {
		
		Aiti_Kace_csd1_1Student.setStudent_id(csd1_1Student.getStudent_id());
		Aiti_Kace_csd1_1Student.setStudent_name(csd1_1Student.getStudent_name());
		Aiti_Kace_csd1_1Student.setCourse(csd1_1Student.getCourse());
		Aiti_Kace_csd1_1Student.setEmail(csd1_1Student.getEmail());
		Aiti_Kace_csd1_1Student.setPhone(csd1_1Student.getPhone());
		Aiti_Kace_csd1_1Student.setGender(csd1_1Student.getGender());
		
		restTemplate.postForObject("http://localhost:9090/aitiCsdStudentsAPI/createCsd1_1Student", csd1_1Student, Csd1_1Info.class);

	}
	
	
	
	@Override
	public void saveCsd1_2Stduent(Csd1_2Info csd1_2Student) {
		
		Aiti_Kace_csd1_2Student.setStudent_id(csd1_2Student.getStudent_id());
		Aiti_Kace_csd1_2Student.setStudent_name(csd1_2Student.getStudent_name());
		Aiti_Kace_csd1_2Student.setCourse(csd1_2Student.getCourse());
		Aiti_Kace_csd1_2Student.setEmail(csd1_2Student.getEmail());
		Aiti_Kace_csd1_2Student.setPhone(csd1_2Student.getPhone());
		Aiti_Kace_csd1_2Student.setGender(csd1_2Student.getGender());
		
		restTemplate.postForObject("http://localhost:9090/aitiCsdStudentsAPI/createCsd1_2Student", csd1_2Student, Csd1_2Info.class);

		
	}


	@Override
	public void saveCsd1_3Stduent(Csd1_3Info csd1_3Student) {
		
		Aiti_Kace_csd1_3Student.setStudent_id(csd1_3Student.getStudent_id());
		Aiti_Kace_csd1_3Student.setStudent_name(csd1_3Student.getStudent_name());
		Aiti_Kace_csd1_3Student.setCourse(csd1_3Student.getCourse());
		Aiti_Kace_csd1_3Student.setEmail(csd1_3Student.getEmail());
		Aiti_Kace_csd1_3Student.setPhone(csd1_3Student.getPhone());
		Aiti_Kace_csd1_3Student.setGender(csd1_3Student.getGender());
		
		restTemplate.postForObject("http://localhost:9090/aitiCsdStudentsAPI/createCsd1_3Student", csd1_3Student, Csd1_3Info.class);

		
	}




	@Override
	public void saveCsd1_4Stduent(Csd1_4Info csd1_4Student) {
		
		Aiti_Kace_csd1_4Student.setStudent_id(csd1_4Student.getStudent_id());
		Aiti_Kace_csd1_4Student.setStudent_name(csd1_4Student.getStudent_name());
		Aiti_Kace_csd1_4Student.setCourse(csd1_4Student.getCourse());
		Aiti_Kace_csd1_4Student.setEmail(csd1_4Student.getEmail());
		Aiti_Kace_csd1_4Student.setPhone(csd1_4Student.getPhone());
		Aiti_Kace_csd1_4Student.setGender(csd1_4Student.getGender());
		
		restTemplate.postForObject("http://localhost:9090/aitiCsdStudentsAPI/createCsd1_4Student", csd1_4Student, Csd1_4Info.class);

		
	}




	@Override
	public void saveCsd1_5Stduent(Csd1_5Info csd1_5Student) {
		
		Aiti_Kace_csd1_5Student.setStudent_id(csd1_5Student.getStudent_id());
		Aiti_Kace_csd1_5Student.setStudent_name(csd1_5Student.getStudent_name());
		Aiti_Kace_csd1_5Student.setCourse(csd1_5Student.getCourse());
		Aiti_Kace_csd1_5Student.setEmail(csd1_5Student.getEmail());
		Aiti_Kace_csd1_5Student.setPhone(csd1_5Student.getPhone());
		Aiti_Kace_csd1_5Student.setGender(csd1_5Student.getGender());
		
		restTemplate.postForObject("http://localhost:9090/aitiCsdStudentsAPI/createCsd1_5Student", csd1_5Student, Csd1_5Info.class);

		
	}




	@Override
	public void saveCsd1_6Stduent(Csd1_6Info csd1_6Student) {
		
		Aiti_Kace_csd1_6Student.setStudent_id(csd1_6Student.getStudent_id());
		Aiti_Kace_csd1_6Student.setStudent_name(csd1_6Student.getStudent_name());
		Aiti_Kace_csd1_6Student.setCourse(csd1_6Student.getCourse());
		Aiti_Kace_csd1_6Student.setEmail(csd1_6Student.getEmail());
		Aiti_Kace_csd1_6Student.setPhone(csd1_6Student.getPhone());
		Aiti_Kace_csd1_6Student.setGender(csd1_6Student.getGender());
		
		restTemplate.postForObject("http://localhost:9090/aitiCsdStudentsAPI/createCsd1_6Student", csd1_6Student, Csd1_6Info.class);

		
	}




	@Override
	public void saveCsd1_7Stduent(Csd1_7Info csd1_7Student) {
		
		Aiti_Kace_csd1_7Student.setStudent_id(csd1_7Student.getStudent_id());
		Aiti_Kace_csd1_7Student.setStudent_name(csd1_7Student.getStudent_name());
		Aiti_Kace_csd1_7Student.setCourse(csd1_7Student.getCourse());
		Aiti_Kace_csd1_7Student.setEmail(csd1_7Student.getEmail());
		Aiti_Kace_csd1_7Student.setPhone(csd1_7Student.getPhone());
		Aiti_Kace_csd1_7Student.setGender(csd1_7Student.getGender());
		
		restTemplate.postForObject("http://localhost:9090/aitiCsdStudentsAPI/createCsd1_7Student", csd1_7Student, Csd1_7Info.class);

		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	@Override
	public Csd1_1Info[] findAllCsd1_1Students(Csd1_1Info csd1_1Students) {
		
		Csd1_1Info[] csd1_1Student = restTemplate.getForObject("http://localhost:9090/aitiCsdStudentsAPI/getAllCsd1_1Students", Csd1_1Info[].class);
				
		return csd1_1Student;
	}

	
	@Override
	public Csd1_2Info[] findAllCsd1_2Students(Csd1_2Info csd1_2Students) {
		
		Csd1_2Info[] csd1_2Student = restTemplate.getForObject("http://localhost:9090/aitiCsdStudentsAPI/getAllCsd1_2Students", Csd1_2Info[].class);
		
		return csd1_2Student;
	}



	@Override
	public Csd1_3Info[] findAllCsd1_3Students(Csd1_3Info csd1_3Students) {
		
		Csd1_3Info[] csd1_3Student = restTemplate.getForObject("http://localhost:9090/aitiCsdStudentsAPI/getAllCsd1_3Students", Csd1_3Info[].class);
		
		return csd1_3Student;
	}



	@Override
	public Csd1_4Info[] findAllCsd1_4Students(Csd1_4Info csd1_4Students) {
		
		Csd1_4Info[] csd1_4Student = restTemplate.getForObject("http://localhost:9090/aitiCsdStudentsAPI/getAllCsd1_4Students", Csd1_4Info[].class);
		
		return csd1_4Student;
	}



	@Override
	public Csd1_5Info[] findAllCsd1_5Students(Csd1_5Info csd1_5Students) {
		
		Csd1_5Info[] csd1_5Student = restTemplate.getForObject("http://localhost:9090/aitiCsdStudentsAPI/getAllCsd1_5Students", Csd1_5Info[].class);
		
		return csd1_5Student;
	}



	@Override
	public Csd1_6Info[] findAllCsd1_6Students(Csd1_6Info csd1_6Students) {
		
		Csd1_6Info[] csd1_6Student = restTemplate.getForObject("http://localhost:9090/aitiCsdStudentsAPI/getAllCsd1_6Students", Csd1_6Info[].class);
		
		return csd1_6Student;
	}



	@Override
	public Csd1_7Info[] findAllCsd1_7Students(Csd1_7Info csd1_7Students) {
		
		Csd1_7Info[] csd1_7Student = restTemplate.getForObject("http://localhost:9090/aitiCsdStudentsAPI/getAllCsd1_7Students", Csd1_7Info[].class);
		
		return csd1_7Student;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@Override
	public Csd1_1Info findCsd1_1StudentById(String csd1_1StudentId) {
		
		Aiti_Kace_csd1_1Student = restTemplate.getForObject("http://localhost:9090/aitiCsdStudentsAPI/getCsd1_1Student/" + csd1_1StudentId, Csd1_1Info.class);
		
		return Aiti_Kace_csd1_1Student;
	}
	
	
	
	@Override
	public Csd1_2Info findCsd1_2StudentById(String csd1_2StudentId) {
		
		Aiti_Kace_csd1_2Student = restTemplate.getForObject("http://localhost:9090/aitiCsdStudentsAPI/getCsd1_2Student/" + csd1_2StudentId, Csd1_2Info.class);
		
		return Aiti_Kace_csd1_2Student;
	}



	@Override
	public Csd1_3Info findCsd1_3StudentById(String csd1_3StudentId) {
		
		Aiti_Kace_csd1_3Student = restTemplate.getForObject("http://localhost:9090/aitiCsdStudentsAPI/getCsd1_3Student/" + csd1_3StudentId, Csd1_3Info.class);
		
		return Aiti_Kace_csd1_3Student;
	}



	@Override
	public Csd1_4Info findCsd1_4StudentById(String csd1_4StudentId) {
		
		Aiti_Kace_csd1_4Student = restTemplate.getForObject("http://localhost:9090/aitiCsdStudentsAPI/getCsd1_4Student/" + csd1_4StudentId, Csd1_4Info.class);
		
		return Aiti_Kace_csd1_4Student;
	}



	@Override
	public Csd1_5Info findCsd1_5StudentById(String csd1_5StudentId) {
		
		Aiti_Kace_csd1_5Student = restTemplate.getForObject("http://localhost:9090/aitiCsdStudentsAPI/getCsd1_5Student/" + csd1_5StudentId, Csd1_5Info.class);
		
		return Aiti_Kace_csd1_5Student;
	}



	@Override
	public Csd1_6Info findCsd1_6StudentById(String csd1_6StudentId) {
		
		Aiti_Kace_csd1_6Student = restTemplate.getForObject("http://localhost:9090/aitiCsdStudentsAPI/getCsd1_6Student/" + csd1_6StudentId, Csd1_6Info.class);
		
		return Aiti_Kace_csd1_6Student;
	}



	@Override
	public Csd1_7Info findCsd1_7StudentById(String csd1_7StudentId) {
		
		Aiti_Kace_csd1_7Student = restTemplate.getForObject("http://localhost:9090/aitiCsdStudentsAPI/getCsd1_7Student/" + csd1_7StudentId, Csd1_7Info.class);
		
		return Aiti_Kace_csd1_7Student;
	}

	
	
	
	
	
	

	
				//   UPDATE CSD STUDENT METHODS
	
	@Override
	public void updateCsd1_1Student(Csd1_1Info csd1_1Student) {
		
		Map<String, String> params = new HashMap<String, String>();
		params.put("student_id", csd1_1Student.getStudent_id());
		
		restTemplate.put("http://localhost:9090/aitiCsdStudentsAPI/updateCsd1_1Student", csd1_1Student, params);

	}

	
	@Override
	public void updateCsd1_2Student(Csd1_2Info csd1_2Student) {
		
		Map<String, String> params = new HashMap<String, String>();
		params.put("student_id", csd1_2Student.getStudent_id());
		
		restTemplate.put("http://localhost:9090/aitiCsdStudentsAPI/updateCsd1_2Student", csd1_2Student, params);
		
	}



	@Override
	public void updateCsd1_3Student(Csd1_3Info csd1_3Student) {
		
		Map<String, String> params = new HashMap<String, String>();
		params.put("student_id", csd1_3Student.getStudent_id());
		
		restTemplate.put("http://localhost:9090/aitiCsdStudentsAPI/updateCsd1_3Student", csd1_3Student, params);
		
	}



	@Override
	public void updateCsd1_4Student(Csd1_4Info csd1_4Student) {
		
		Map<String, String> params = new HashMap<String, String>();
		params.put("student_id", csd1_4Student.getStudent_id());
		
		restTemplate.put("http://localhost:9090/aitiCsdStudentsAPI/updateCsd1_4Student", csd1_4Student, params);
		
	}



	@Override
	public void updateCsd1_5Student(Csd1_5Info csd1_5Student) {
		
		Map<String, String> params = new HashMap<String, String>();
		params.put("student_id", csd1_5Student.getStudent_id());
		
		restTemplate.put("http://localhost:9090/aitiCsdStudentsAPI/updateCsd1_5Student", csd1_5Student, params);
		
	}



	@Override
	public void updateCsd1_6Student(Csd1_6Info csd1_6Student) {
		
		Map<String, String> params = new HashMap<String, String>();
		params.put("student_id", csd1_6Student.getStudent_id());
		
		restTemplate.put("http://localhost:9090/aitiCsdStudentsAPI/updateCsd1_6Student", csd1_6Student, params);
		
	}



	@Override
	public void updateCsd1_7Student(Csd1_7Info csd1_7Student) {
		
		Map<String, String> params = new HashMap<String, String>();
		params.put("student_id", csd1_7Student.getStudent_id());
		
		restTemplate.put("http://localhost:9090/aitiCsdStudentsAPI/updateCsd1_7Student", csd1_7Student, params);
		
	}

	
	
	
	
	
	
	
	
	
				// DELETE CSD STUDENT METHODS
	
	
	@Override
	public void deleteCsd1_1Student(String csd1_1StudentId) {
		
		restTemplate.delete("http://localhost:9090/aitiCsdStudentsAPI/deleteCsd1_1Student/" + csd1_1StudentId);

	}


	@Override
	public void deleteCsd1_2Student(String csd1_2StudentId) {
		
		restTemplate.delete("http://localhost:9090/aitiCsdStudentsAPI/deleteCsd1_2Student/" + csd1_2StudentId);
		
	}


	@Override
	public void deleteCsd1_3Student(String csd1_3StudentId) {
		
		restTemplate.delete("http://localhost:9090/aitiCsdStudentsAPI/deleteCsd1_3Student/" + csd1_3StudentId);
		
	}


	@Override
	public void deleteCsd1_4Student(String csd1_4StudentId) {
		
		restTemplate.delete("http://localhost:9090/aitiCsdStudentsAPI/deleteCsd1_4Student/" + csd1_4StudentId);
		
	}


	@Override
	public void deleteCsd1_5Student(String csd1_5StudentId) {
		
		restTemplate.delete("http://localhost:9090/aitiCsdStudentsAPI/deleteCsd1_5Student/" + csd1_5StudentId);
		
	}


	@Override
	public void deleteCsd1_6Student(String csd1_6StudentId) {
		
		restTemplate.delete("http://localhost:9090/aitiCsdStudentsAPI/deleteCsd1_6Student/" + csd1_6StudentId);
		
	}


	@Override
	public void deleteCsd1_7Student(String csd1_7StudentId) {
		
		restTemplate.delete("http://localhost:9090/aitiCsdStudentsAPI/deleteCsd1_7Student/" + csd1_7StudentId);
		
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
					// SAVE CSD STUDENT RESULTS
	
	

	@Override
	public void saveCsd1_1StduentResults(Csd1_1Results csd1_1StudentResults) {
		
		Aiti_Kace_csd1_1StudentResults.setFoc(csd1_1StudentResults.getFoc());
		Aiti_Kace_csd1_1StudentResults.setHtml_css(csd1_1StudentResults.getHtml_css());
		Aiti_Kace_csd1_1StudentResults.setJavascript(csd1_1StudentResults.getJavascript());
		Aiti_Kace_csd1_1StudentResults.setDatabase_tec(csd1_1StudentResults.getDatabase_tec());
		Aiti_Kace_csd1_1StudentResults.setSe(csd1_1StudentResults.getSe());
		Aiti_Kace_csd1_1StudentResults.setPython(csd1_1StudentResults.getPython());
		
		restTemplate.postForObject("http://localhost:9090/aitiCsdStudentsAPI/createCsd1_1StudentResult", csd1_1StudentResults, Csd1_1Results.class);
		
	}



	@Override
	public void saveCsd1_2StduentResults(Csd1_2Results csd1_2StudentResults) {
		
		Aiti_Kace_csd1_2StudentResults.setFoc(csd1_2StudentResults.getFoc());
		Aiti_Kace_csd1_2StudentResults.setHtml_css(csd1_2StudentResults.getHtml_css());
		Aiti_Kace_csd1_2StudentResults.setJavascript(csd1_2StudentResults.getJavascript());
		Aiti_Kace_csd1_2StudentResults.setDatabase_tec(csd1_2StudentResults.getDatabase_tec());
		Aiti_Kace_csd1_2StudentResults.setSe(csd1_2StudentResults.getSe());
		Aiti_Kace_csd1_2StudentResults.setPython(csd1_2StudentResults.getPython());
		
		restTemplate.postForObject("http://localhost:9090/aitiCsdStudentsAPI/createCsd1_2StudentResult", csd1_2StudentResults, Csd1_2Results.class);
		
		
	}



	@Override
	public void saveCsd1_3StduentResults(Csd1_3Results csd1_3StudentResults) {
		
		Aiti_Kace_csd1_3StudentResults.setFoc(csd1_3StudentResults.getFoc());
		Aiti_Kace_csd1_3StudentResults.setHtml_css(csd1_3StudentResults.getHtml_css());
		Aiti_Kace_csd1_3StudentResults.setJavascript(csd1_3StudentResults.getJavascript());
		Aiti_Kace_csd1_3StudentResults.setDatabase_tec(csd1_3StudentResults.getDatabase_tec());
		Aiti_Kace_csd1_3StudentResults.setSe(csd1_3StudentResults.getSe());
		Aiti_Kace_csd1_3StudentResults.setPython(csd1_3StudentResults.getPython());
		
		restTemplate.postForObject("http://localhost:9090/aitiCsdStudentsAPI/createCsd1_3StudentResult", csd1_3StudentResults, Csd1_3Results.class);
		
		
	}



	@Override
	public void saveCsd1_4StduentResults(Csd1_4Results csd1_4StudentResults) {
		
		Aiti_Kace_csd1_4StudentResults.setFoc(csd1_4StudentResults.getFoc());
		Aiti_Kace_csd1_4StudentResults.setHtml_css(csd1_4StudentResults.getHtml_css());
		Aiti_Kace_csd1_4StudentResults.setJavascript(csd1_4StudentResults.getJavascript());
		Aiti_Kace_csd1_4StudentResults.setDatabase_tec(csd1_4StudentResults.getDatabase_tec());
		Aiti_Kace_csd1_4StudentResults.setSe(csd1_4StudentResults.getSe());
		Aiti_Kace_csd1_4StudentResults.setPython(csd1_4StudentResults.getPython());
		
		restTemplate.postForObject("http://localhost:9090/aitiCsdStudentsAPI/createCsd1_4StudentResult", csd1_4StudentResults, Csd1_4Results.class);
		
		
	}



	@Override
	public void saveCsd1_5StduentResults(Csd1_5Results csd1_5StudentResults) {
		
		Aiti_Kace_csd1_5StudentResults.setFoc(csd1_5StudentResults.getFoc());
		Aiti_Kace_csd1_5StudentResults.setHtml_css(csd1_5StudentResults.getHtml_css());
		Aiti_Kace_csd1_5StudentResults.setJavascript(csd1_5StudentResults.getJavascript());
		Aiti_Kace_csd1_5StudentResults.setDatabase_tec(csd1_5StudentResults.getDatabase_tec());
		Aiti_Kace_csd1_5StudentResults.setSe(csd1_5StudentResults.getSe());
		Aiti_Kace_csd1_5StudentResults.setPython(csd1_5StudentResults.getPython());
		
		restTemplate.postForObject("http://localhost:9090/aitiCsdStudentsAPI/createCsd1_5StudentResult", csd1_5StudentResults, Csd1_5Results.class);
		
		
	}



	@Override
	public void saveCsd1_6StduentResults(Csd1_6Results csd1_6StudentResults) {
		
		Aiti_Kace_csd1_6StudentResults.setFoc(csd1_6StudentResults.getFoc());
		Aiti_Kace_csd1_6StudentResults.setHtml_css(csd1_6StudentResults.getHtml_css());
		Aiti_Kace_csd1_6StudentResults.setJavascript(csd1_6StudentResults.getJavascript());
		Aiti_Kace_csd1_6StudentResults.setDatabase_tec(csd1_6StudentResults.getDatabase_tec());
		Aiti_Kace_csd1_6StudentResults.setSe(csd1_6StudentResults.getSe());
		Aiti_Kace_csd1_6StudentResults.setPython(csd1_6StudentResults.getPython());
		
		restTemplate.postForObject("http://localhost:9090/aitiCsdStudentsAPI/createCsd1_6StudentResult", csd1_6StudentResults, Csd1_6Results.class);
		
		
	}



	@Override
	public void saveCsd1_7StduentResults(Csd1_7Results csd1_7StudentResults) {
		
		Aiti_Kace_csd1_7StudentResults.setFoc(csd1_7StudentResults.getFoc());
		Aiti_Kace_csd1_7StudentResults.setHtml_css(csd1_7StudentResults.getHtml_css());
		Aiti_Kace_csd1_7StudentResults.setJavascript(csd1_7StudentResults.getJavascript());
		Aiti_Kace_csd1_7StudentResults.setDatabase_tec(csd1_7StudentResults.getDatabase_tec());
		Aiti_Kace_csd1_7StudentResults.setSe(csd1_7StudentResults.getSe());
		Aiti_Kace_csd1_7StudentResults.setPython(csd1_7StudentResults.getPython());
		
		restTemplate.postForObject("http://localhost:9090/aitiCsdStudentsAPI/createCsd1_7StudentResult", csd1_7StudentResults, Csd1_7Results.class);
		
		
	}

	
	
	
	
	

	
	
	
	
				//    RETRIEVE ALL CSD STUDENT RESULTS
	

	@Override
	public Csd1_1Results[] findAllCsd1_1StudentResults(Csd1_1Results csd1_1StudentResults) {
		
		Csd1_1Results[] csd1_1StudentResult = restTemplate.getForObject("http://localhost:9090/aitiCsdStudentsAPI/getAllCsd1_1StudentResults", Csd1_1Results[].class);
		
		return csd1_1StudentResult;
	}



	@Override
	public Csd1_2Results[] findAllCsd1_2StudentResults(Csd1_2Results csd1_2StudentResults) {
		
		Csd1_2Results[] csd1_2StudentResult = restTemplate.getForObject("http://localhost:9090/aitiCsdStudentsAPI/getAllCsd1_2StudentResults", Csd1_2Results[].class);
		
		return csd1_2StudentResult;
	}



	@Override
	public Csd1_3Results[] findAllCsd1_3StudentResults(Csd1_3Results csd1_3StudentResults) {
		
		Csd1_3Results[] csd1_1StudentResult = restTemplate.getForObject("http://localhost:9090/aitiCsdStudentsAPI/getAllCsd1_3StudentResults", Csd1_3Results[].class);
		
		return csd1_1StudentResult;
	}



	@Override
	public Csd1_4Results[] findAllCsd1_4StudentResults(Csd1_4Results csd1_4StudentResults) {
		
		Csd1_4Results[] csd1_1StudentResult = restTemplate.getForObject("http://localhost:9090/aitiCsdStudentsAPI/getAllCsd1_4StudentResults", Csd1_4Results[].class);
		
		return csd1_1StudentResult;
	}



	@Override
	public Csd1_5Results[] findAllCsd1_5StudentResults(Csd1_5Results csd1_5StudentResults) {
		
		Csd1_5Results[] csd1_1StudentResult = restTemplate.getForObject("http://localhost:9090/aitiCsdStudentsAPI/getAllCsd1_5StudentResults", Csd1_5Results[].class);
		
		return csd1_1StudentResult;
	}



	@Override
	public Csd1_6Results[] findAllCsd1_6StudentResults(Csd1_6Results csd1_6StudentResults) {
		
		Csd1_6Results[] csd1_1StudentResult = restTemplate.getForObject("http://localhost:9090/aitiCsdStudentsAPI/getAllCsd1_6StudentResults", Csd1_6Results[].class);
		
		return csd1_1StudentResult;
	}



	@Override
	public Csd1_7Results[] findAllCsd1_7StudentResults(Csd1_7Results csd1_7StudentResults) {
		
		Csd1_7Results[] csd1_1StudentResult = restTemplate.getForObject("http://localhost:9090/aitiCsdStudentsAPI/getAllCsd1_7StudentResults", Csd1_7Results[].class);
		
		return csd1_1StudentResult;
	}


	
	
	
	
	
	
	
	
					//  FIND A SINGLE CSD STUDENT RESULTS
	

	@Override
	public Csd1_1Results findCsd1_1StudentResultsById(String csd1_1ResultsStudentId) {
		
		Aiti_Kace_csd1_1StudentResults = restTemplate.getForObject("http://localhost:9090/aitiCsdStudentsAPI/getCsd1_1StudentResult/" + csd1_1ResultsStudentId, Csd1_1Results.class);
		
		return Aiti_Kace_csd1_1StudentResults;
	}



	@Override
	public Csd1_2Results findCsd1_2StudentResultsById(String csd1_2ResultsStudentId) {
		
		Aiti_Kace_csd1_2StudentResults = restTemplate.getForObject("http://localhost:9090/aitiCsdStudentsAPI/getCsd1_2StudentResult/" + csd1_2ResultsStudentId, Csd1_2Results.class);
		
		return Aiti_Kace_csd1_2StudentResults;
	}



	@Override
	public Csd1_3Results findCsd1_3StudentResultsById(String csd1_3ResultsStudentId) {
		
		Aiti_Kace_csd1_3StudentResults = restTemplate.getForObject("http://localhost:9090/aitiCsdStudentsAPI/getCsd1_3StudentResult/" + csd1_3ResultsStudentId, Csd1_3Results.class);
		
		return Aiti_Kace_csd1_3StudentResults;
	}



	@Override
	public Csd1_4Results findCsd1_4StudentResultsById(String csd1_4ResultsStudentId) {
		
		Aiti_Kace_csd1_4StudentResults = restTemplate.getForObject("http://localhost:9090/aitiCsdStudentsAPI/getCsd1_4StudentResult/" + csd1_4ResultsStudentId, Csd1_4Results.class);
		
		return Aiti_Kace_csd1_4StudentResults;
	}



	@Override
	public Csd1_5Results findCsd1_5StudentResultsById(String csd1_5ResultsStudentId) {
		
		Aiti_Kace_csd1_5StudentResults = restTemplate.getForObject("http://localhost:9090/aitiCsdStudentsAPI/getCsd1_5StudentResult/" + csd1_5ResultsStudentId, Csd1_5Results.class);
		
		return Aiti_Kace_csd1_5StudentResults;
	}



	@Override
	public Csd1_6Results findCsd1_6StudentResultsById(String csd1_6ResultsStudentId) {
		
		Aiti_Kace_csd1_6StudentResults = restTemplate.getForObject("http://localhost:9090/aitiCsdStudentsAPI/getCsd1_6StudentResult/" + csd1_6ResultsStudentId, Csd1_6Results.class);
		
		return Aiti_Kace_csd1_6StudentResults;
	}



	@Override
	public Csd1_7Results findCsd1_7StudentResultsById(String csd1_7ResultsStudentId) {
		
		Aiti_Kace_csd1_7StudentResults = restTemplate.getForObject("http://localhost:9090/aitiCsdStudentsAPI/getCsd1_7StudentResult/" + csd1_7ResultsStudentId, Csd1_7Results.class);
		
		return Aiti_Kace_csd1_7StudentResults;
	}



	
	
	
	
	
	
	
				//  UPDATE CSD STUDENT RESULTS METHODS
	
	
	
	@Override
	public void updateCsd1_1StudentResults(Csd1_1Results csd1_1StudentResults) {
		
		Map<String, String> params = new HashMap<String, String>();
		params.put("student_id", csd1_1StudentResults.getStudent_id());
		
		restTemplate.put("http://localhost:9090/aitiCsdStudentsAPI/updateCsd1_1StudentResult", csd1_1StudentResults, params);
		
	}



	@Override
	public void updateCsd1_2StudentResults(Csd1_2Results csd1_2StudentResults) {
		
		Map<String, String> params = new HashMap<String, String>();
		params.put("student_id", csd1_2StudentResults.getStudent_id());
		
		restTemplate.put("http://localhost:9090/aitiCsdStudentsAPI/updateCsd1_2StudentResult", csd1_2StudentResults, params);
		
	}



	@Override
	public void updateCsd1_3StudentResults(Csd1_3Results csd1_3StudentResults) {
		
		Map<String, String> params = new HashMap<String, String>();
		params.put("student_id", csd1_3StudentResults.getStudent_id());
		
		restTemplate.put("http://localhost:9090/aitiCsdStudentsAPI/updateCsd1_3StudentResult", csd1_3StudentResults, params);
		
	}



	@Override
	public void updateCsd1_4StudentResults(Csd1_4Results csd1_4StudentResults) {
		
		Map<String, String> params = new HashMap<String, String>();
		params.put("student_id", csd1_4StudentResults.getStudent_id());
		
		restTemplate.put("http://localhost:9090/aitiCsdStudentsAPI/updateCsd1_4StudentResult", csd1_4StudentResults, params);
		
	}



	@Override
	public void updateCsd1_5StudentResults(Csd1_5Results csd1_5StudentResults) {
		
		Map<String, String> params = new HashMap<String, String>();
		params.put("student_id", csd1_5StudentResults.getStudent_id());
		
		restTemplate.put("http://localhost:9090/aitiCsdStudentsAPI/updateCsd1_5StudentResult", csd1_5StudentResults, params);
		
	}



	@Override
	public void updateCsd1_6StudentResults(Csd1_6Results csd1_6StudentResults) {
		
		Map<String, String> params = new HashMap<String, String>();
		params.put("student_id", csd1_6StudentResults.getStudent_id());
		
		restTemplate.put("http://localhost:9090/aitiCsdStudentsAPI/updateCsd1_6StudentResult", csd1_6StudentResults, params);
		
	}



	@Override
	public void updateCsd1_7StudentResults(Csd1_7Results csd1_7StudentResults) {
		
		Map<String, String> params = new HashMap<String, String>();
		params.put("student_id", csd1_7StudentResults.getStudent_id());
		
		restTemplate.put("http://localhost:9090/aitiCsdStudentsAPI/updateCsd1_7StudentResult", csd1_7StudentResults, params);
		
	}



	
	
	
	
	
	
	
	
	
	
			//   DELETE CSD STUDENT RESULTS METHODS
	
	
	@Override
	public void deleteCsd1_1StudentResults(String csd1_1ResultsStudentId) {
		
		restTemplate.delete("http://localhost:9090/aitiCsdStudentsAPI/deleteCsd1_1StudentResult/" + csd1_1ResultsStudentId);
		
	}



	@Override
	public void deleteCsd1_2StudentResults(String csd1_2ResultsStudentId) {
		
		restTemplate.delete("http://localhost:9090/aitiCsdStudentsAPI/deleteCsd1_2StudentResult/" + csd1_2ResultsStudentId);
		
	}



	@Override
	public void deleteCsd1_3StudentResults(String csd1_3ResultsStudentId) {
		
		restTemplate.delete("http://localhost:9090/aitiCsdStudentsAPI/deleteCsd1_3StudentResult/" + csd1_3ResultsStudentId);
		
	}



	@Override
	public void deleteCsd1_4StudentResults(String csd1_4ResultsStudentId) {
		
		restTemplate.delete("http://localhost:9090/aitiCsdStudentsAPI/deleteCsd1_4StudentResult/" + csd1_4ResultsStudentId);
		
	}



	@Override
	public void deleteCsd1_5StudentResults(String csd1_5ResultsStudentId) {
		
		restTemplate.delete("http://localhost:9090/aitiCsdStudentsAPI/deleteCsd1_5StudentResult/" + csd1_5ResultsStudentId);
		
	}



	@Override
	public void deleteCsd1_6StudentResults(String csd1_6ResultsStudentId) {
		
		restTemplate.delete("http://localhost:9090/aitiCsdStudentsAPI/deleteCsd1_6StudentResult/" + csd1_6ResultsStudentId);
		
	}



	@Override
	public void deleteCsd1_7StudentResults(String csd1_7ResultsStudentId) {
		
		restTemplate.delete("http://localhost:9090/aitiCsdStudentsAPI/deleteCsd1_7StudentResult/" + csd1_7ResultsStudentId);
		
	}























	


	


	




	

}
