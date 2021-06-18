package aiit.com.student.integration;

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

public interface Csd1_1RestClient {
	
	
	
	
	
	// RETRIEVE A SINGLE CSD1.1 STUDENT ID RECORD
	public String csd1_1StudentIdRetrival(String csd1_1StudentId);
	
	
	
	
	
	// 2ND METHOD RETRIEVE A SINGLE CSD1.1 STUDENT ID RECORD
	public Csd1_1Results findcsd1_1StudentIdRetrival(Csd1_1Results csd1_1StudentId);
	
	
	
	
	
	
	//  SAVE CSD1.1 STUDENT
	public void saveCsd1_1Stduent(Csd1_1Info csd1_1Student);
	
	//  SAVE CSD1.2 STUDENT
	public void saveCsd1_2Stduent(Csd1_2Info csd1_2Student);
	
	//  SAVE CSD1.3 STUDENT
	public void saveCsd1_3Stduent(Csd1_3Info csd1_3Student);
	
	//  SAVE CSD1.4 STUDENT
	public void saveCsd1_4Stduent(Csd1_4Info csd1_4Student);
	
	//  SAVE CSD1.5 STUDENT
	public void saveCsd1_5Stduent(Csd1_5Info csd1_5Student);
	
	//  SAVE CSD1.6 STUDENT
	public void saveCsd1_6Stduent(Csd1_6Info csd1_6Student);
	
	//  SAVE CSD1.7 STUDENT
	public void saveCsd1_7Stduent(Csd1_7Info csd1_7Student);
	
	
	
	
	
	
	
	//  RETRIEVE ALL CSD1.1 STUDENTS
	public Csd1_1Info[] findAllCsd1_1Students(Csd1_1Info csd1_1Students);
	
//  RETRIEVE ALL CSD1.2 STUDENTS
	public Csd1_2Info[] findAllCsd1_2Students(Csd1_2Info csd1_2Students);
	
//  RETRIEVE ALL CSD1.3 STUDENTS
	public Csd1_3Info[] findAllCsd1_3Students(Csd1_3Info csd1_3Students);
	
//  RETRIEVE ALL CSD1.4 STUDENTS
	public Csd1_4Info[] findAllCsd1_4Students(Csd1_4Info csd1_4Students);
	
//  RETRIEVE ALL CSD1.5 STUDENTS
	public Csd1_5Info[] findAllCsd1_5Students(Csd1_5Info csd1_5Students);
	
//  RETRIEVE ALL CSD1.6 STUDENTS
	public Csd1_6Info[] findAllCsd1_6Students(Csd1_6Info csd1_6Students);
	
//  RETRIEVE ALL CSD1.7 STUDENTS
	public Csd1_7Info[] findAllCsd1_7Students(Csd1_7Info csd1_7Students);
	
	
	
	
	
	
	
	
	
	
		// RETRIEVE SINGLE CSD1.1 RECORD
		public Csd1_1Info findCsd1_1StudentById(String csd1_1StudentId);
	
		// RETRIEVE SINGLE CSD1.2 RECORD
		public Csd1_2Info findCsd1_2StudentById(String csd1_2StudentId);
		
		// RETRIEVE SINGLE CSD1.3 RECORD
		public Csd1_3Info findCsd1_3StudentById(String csd1_3StudentId);
		
		// RETRIEVE SINGLE CSD1.4 RECORD
		public Csd1_4Info findCsd1_4StudentById(String csd1_4StudentId);
		
		// RETRIEVE SINGLE CSD1.5 RECORD
		public Csd1_5Info findCsd1_5StudentById(String csd1_5StudentId);
		
		// RETRIEVE SINGLE CSD1.6 RECORD
		public Csd1_6Info findCsd1_6StudentById(String csd1_6StudentId);
		
		// RETRIEVE SINGLE CSD1.7 RECORD
		public Csd1_7Info findCsd1_7StudentById(String csd1_7StudentId);
		
		
		
		
		
		
		

		// UPDTAE CSD1_1 STUDENT RECORD
		public void updateCsd1_1Student(Csd1_1Info csd1_1Student);
	
		// UPDTAE CSD1_2 STUDENT RECORD
		public void updateCsd1_2Student(Csd1_2Info csd1_2Student);
		
		// UPDTAE CSD1_3 STUDENT RECORD
		public void updateCsd1_3Student(Csd1_3Info csd1_3Student);
		
		// UPDTAE CSD1_4 STUDENT RECORD
		public void updateCsd1_4Student(Csd1_4Info csd1_4Student);
		
		// UPDTAE CSD1_5 STUDENT RECORD
		public void updateCsd1_5Student(Csd1_5Info csd1_5Student);
		
		// UPDTAE CSD1_6 STUDENT RECORD
		public void updateCsd1_6Student(Csd1_6Info csd1_6Student);
		
		// UPDTAE CSD1_7 STUDENT RECORD
		public void updateCsd1_7Student(Csd1_7Info csd1_7Student);
		
		
		
		
		
	
	
		// DELETING CSD1.1 STUDENT RECORD
		public void deleteCsd1_1Student(String csd1_1StudentId);
		
		// DELETING CSD1.2 STUDENT RECORD
		public void deleteCsd1_2Student(String csd1_2StudentId);
		
		// DELETING CSD1.3 STUDENT RECORDCsd1_1Results
		public void deleteCsd1_3Student(String csd1_3StudentId);
		
		// DELETING CSD1.4 STUDENT RECORD
		public void deleteCsd1_4Student(String csd1_4StudentId);
		
		// DELETING CSD1.5 STUDENT RECORD
		public void deleteCsd1_5Student(String csd1_5StudentId);
		
		// DELETING CSD1.6 STUDENT RECORD
		public void deleteCsd1_6Student(String csd1_6StudentId);
		
		// DELETING CSD1.7 STUDENT RECORD
		public void deleteCsd1_7Student(String csd1_7StudentId);
	
	
	
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			//  SAVE CSD1.1 STUDENT RESULTS
		
		public void saveCsd1_1StduentResults(Csd1_1Results csd1_1StudentResults);
		
		//  SAVE CSD1.2 STUDENT Results
		public void saveCsd1_2StduentResults(Csd1_2Results csd1_2StudentResults);
		
		//  SAVE CSD1.3 STUDENT Results
		public void saveCsd1_3StduentResults(Csd1_3Results csd1_3StudentResults);
		
		//  SAVE CSD1.4 STUDENT Results
		public void saveCsd1_4StduentResults(Csd1_4Results csd1_4StudentResults);
		
		//  SAVE CSD1.5 STUDENT Results
		public void saveCsd1_5StduentResults(Csd1_5Results csd1_5StudentResults);
		
		//  SAVE CSD1.6 STUDENT Results
		public void saveCsd1_6StduentResults(Csd1_6Results csd1_6StudentResults);
		
		//  SAVE CSD1.7 STUDENT Results
		public void saveCsd1_7StduentResults(Csd1_7Results csd1_7StudentResults);
		
		
		
		
		
		
		
		//  RETRIEVE ALL CSD1.1 STUDENTS Results
		public Csd1_1Results[] findAllCsd1_1StudentResults(Csd1_1Results csd1_1StudentResults);
		
	//  RETRIEVE ALL CSD1.2 STUDENTS Results
		public Csd1_2Results[] findAllCsd1_2StudentResults(Csd1_2Results csd1_2StudentResults);
		
	//  RETRIEVE ALL CSD1.3 STUDENTS Results
		public Csd1_3Results[] findAllCsd1_3StudentResults(Csd1_3Results csd1_3StudentResults);
		
	//  RETRIEVE ALL CSD1.4 STUDENTS Results
		public Csd1_4Results[] findAllCsd1_4StudentResults(Csd1_4Results csd1_4StudentResults);
		
	//  RETRIEVE ALL CSD1.5 STUDENTS Results
		public Csd1_5Results[] findAllCsd1_5StudentResults(Csd1_5Results csd1_5StudentResults);
		
	//  RETRIEVE ALL CSD1.6 STUDENTS Results
		public Csd1_6Results[] findAllCsd1_6StudentResults(Csd1_6Results csd1_6StudentResults);
		
	//  RETRIEVE ALL CSD1.7 STUDENTS Results
		public Csd1_7Results[] findAllCsd1_7StudentResults(Csd1_7Results csd1_7StudentResults);
		
		
		
		
		
		
		
		
		
		
			// RETRIEVE SINGLE CSD1.1 Results
			public Csd1_1Results findCsd1_1StudentResultsById(String csd1_1ResultsStudentId);
		
			// RETRIEVE SINGLE CSD1.2 Results
			public Csd1_2Results findCsd1_2StudentResultsById(String csd1_2ResultsStudentId);
			
			// RETRIEVE SINGLE CSD1.3 Results
			public Csd1_3Results findCsd1_3StudentResultsById(String csd1_3ResultsStudentId);
			
			// RETRIEVE SINGLE CSD1.4 Results
			public Csd1_4Results findCsd1_4StudentResultsById(String csd1_4ResultsStudentId);
			
			// RETRIEVE SINGLE CSD1.5 Results
			public Csd1_5Results findCsd1_5StudentResultsById(String csd1_5ResultsStudentId);
			
			// RETRIEVE SINGLE CSD1.6 Results
			public Csd1_6Results findCsd1_6StudentResultsById(String csd1_6ResultsStudentId);
			
			// RETRIEVE SINGLE CSD1.7 Results
			public Csd1_7Results findCsd1_7StudentResultsById(String csd1_7ResultsStudentId);
			
			
			
			
			
			
			

			// UPDTAE CSD1_1 STUDENT Results
			public void updateCsd1_1StudentResults(Csd1_1Results csd1_1StudentResults);
		
			// UPDTAE CSD1_2 STUDENT Results
			public void updateCsd1_2StudentResults(Csd1_2Results csd1_2StudentResults);
			
			// UPDTAE CSD1_3 STUDENT Results
			public void updateCsd1_3StudentResults(Csd1_3Results csd1_3StudentResults);
			
			// UPDTAE CSD1_4 STUDENT Results
			public void updateCsd1_4StudentResults(Csd1_4Results csd1_4StudentResults);
			
			// UPDTAE CSD1_5 STUDENT Results
			public void updateCsd1_5StudentResults(Csd1_5Results csd1_5StudentResults);
			
			// UPDTAE CSD1_6 STUDENT Results
			public void updateCsd1_6StudentResults(Csd1_6Results csd1_6StudentResults);
			
			// UPDTAE CSD1_7 STUDENT Results
			public void updateCsd1_7StudentResults(Csd1_7Results csd1_7StudentResults);
			
			
			
			
			
		
		
			// DELETING CSD1.1 STUDENT Results
			public void deleteCsd1_1StudentResults(String csd1_1ResultsStudentId);
			
			// DELETING CSD1.2 STUDENT Results
			public void deleteCsd1_2StudentResults(String csd1_2ResultsStudentId);
			
			// DELETING CSD1.3 STUDENT Results
			public void deleteCsd1_3StudentResults(String csd1_3ResultsStudentId);
			
			// DELETING CSD1.4 STUDENT Results
			public void deleteCsd1_4StudentResults(String csd1_4ResultsStudentId);
			
			// DELETING CSD1.5 STUDENT Results
			public void deleteCsd1_5StudentResults(String csd1_5ResultsStudentId);
			
			// DELETING CSD1.6 STUDENT Results
			public void deleteCsd1_6StudentResults(String csd1_6ResultsStudentId);
			
			// DELETING CSD1.7 STUDENT Results
			public void deleteCsd1_7StudentResults(String csd1_7ResultsStudentId);
		
	
	
	
}
