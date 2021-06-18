package aiit.com.student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

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

@Controller
@RequestMapping("/aitiStudents")
public class Csd1_1StudentController {

	

	
	@Autowired
	Csd1_1RestClient csdStudentRestClient;
	
	
	
	
	
	
	
	//  METHOD TO RETRIEVE A CSD1.1 STUDENT ID
	
	@RequestMapping(value = "/csd1_1StudentIdRetrival", method = RequestMethod.GET)
	public String csd1_1StudentIdRetrival(String csd1_1StudentId, ModelMap modelMap) {
		
		String csd1_1StudentIdRetrival =  csdStudentRestClient.csd1_1StudentIdRetrival(csd1_1StudentId);
		modelMap.addAttribute("csd1_1StudentIdRetrival", csd1_1StudentIdRetrival);
		
		return "try";
	}
	
	
	
	
	
	
	
	//  METHOD TO RETRIEVE A CSD1.1 STUDENT ID
	
	@RequestMapping(value = "/getcsd1_1StudentIdRetrivals", method = RequestMethod.GET)
	public String findcsd1_1StudentIdRetrival(Csd1_1Results csd1_1StudentId, ModelMap modelMap) {
		
		Csd1_1Results csd1_1StudentIdRetrival = csdStudentRestClient.findcsd1_1StudentIdRetrival(csd1_1StudentId);
		modelMap.addAttribute("csd1_1StudentIdRetrival", csd1_1StudentIdRetrival);
		
		return "redirect: tryPages";
		
	}
	
	
	

	
	
	
	@RequestMapping(value = "/getCsd1_1ResultPage", method = RequestMethod.GET)
	public String tryPage(Csd1_1Results csd1_1StudentId, ModelMap modelMap) {
		
		Csd1_1Results csd1_1StudentIdRetrival = csdStudentRestClient.findcsd1_1StudentIdRetrival(csd1_1StudentId);
		modelMap.addAttribute("csd1_1StudentIdRetrival", csd1_1StudentIdRetrival);
		
		
		return "csd1_1Results";

	}
	
	
	
	
	


	
	
				//  ADMIN HOMEPAGE
	//  METHODS TO RETRIEVE ALL CSD1.1 STUDENT RECORDS
	
	@RequestMapping(value = "/getAllStudentInfo", method = RequestMethod.GET)
	public String getAllStudentInfo(Csd1_1Info csd1_1Students, ModelMap modelMap) {
		
		Csd1_1Info[] students = csdStudentRestClient.findAllCsd1_1Students(csd1_1Students);
		modelMap.addAttribute("student", students);
		
		return "displayAllStudentInfo";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	//  METHODS TO RETRIEVE ALL CSD1.1 STUDENT RECORDS AND RESULTS
	@RequestMapping(value = "/getCsd1_1Page", method = RequestMethod.GET)
	public String findAllCsd1_1Students(Csd1_1Info csd1_1Students, Csd1_1Results csd1_1StudentResults, ModelMap modelMap) {
		
		Csd1_1Info[] students = csdStudentRestClient.findAllCsd1_1Students(csd1_1Students);
		modelMap.addAttribute("student", students);
		
		Csd1_1Results[] results = csdStudentRestClient.findAllCsd1_1StudentResults(csd1_1StudentResults);
		modelMap.addAttribute("studentResults", results);
		
		return "csd1_1";
	}
	
	
	
	
	
	//  METHODS TO RETRIEVE ALL CSD1.2 STUDENT RECORDS AND RESULTS
	@RequestMapping(value = "/getCsd1_2Page", method = RequestMethod.GET)
	public String findAllCsd1_2Students(Csd1_2Info csd1_2Students, Csd1_2Results csd1_2StudentResults, ModelMap modelMap) {
		
		Csd1_2Info[] students = csdStudentRestClient.findAllCsd1_2Students(csd1_2Students);
		modelMap.addAttribute("student", students);
		
		Csd1_2Results[] results = csdStudentRestClient.findAllCsd1_2StudentResults(csd1_2StudentResults);
		modelMap.addAttribute("results", results);
		
		return "csd1_2";
	}
	
	
	//  METHODS TO RETRIEVE ALL CSD1.3 STUDENT RECORDS AND RESULTS
	@RequestMapping(value = "/getCsd1_3Page", method = RequestMethod.GET)
	public String findAllCsd1_3Students(Csd1_3Info csd1_3Students, Csd1_3Results csd1_3StudentResults, ModelMap modelMap) {
		
		Csd1_3Info[] students = csdStudentRestClient.findAllCsd1_3Students(csd1_3Students);
		modelMap.addAttribute("student", students);
		
		Csd1_3Results[] results = csdStudentRestClient.findAllCsd1_3StudentResults(csd1_3StudentResults);
		modelMap.addAttribute("results", results);
		
		return "csd1_3";
	}
	
	
	//  METHODS TO RETRIEVE ALL CSD1.4 STUDENT RECORDS AND RESULTS
	@RequestMapping(value = "/getCsd1_4Page", method = RequestMethod.GET)
	public String findAllCsd1_4Students(Csd1_4Info csd1_4Students, Csd1_4Results csd1_4StudentResults, ModelMap modelMap) {
		
		Csd1_4Info[] students = csdStudentRestClient.findAllCsd1_4Students(csd1_4Students);
		modelMap.addAttribute("student", students);
		
		Csd1_4Results[] results = csdStudentRestClient.findAllCsd1_4StudentResults(csd1_4StudentResults);
		modelMap.addAttribute("results", results);
		
		return "csd1_4";
	}
	
	
	//  METHODS TO RETRIEVE ALL CSD1.5 STUDENT RECORDS AND RESULTS
	@RequestMapping(value = "/getCsd1_5Page", method = RequestMethod.GET)
	public String findAllCsd1_5Students(Csd1_5Info csd1_5Students, Csd1_5Results csd1_5StudentResults, ModelMap modelMap) {
		
		Csd1_5Info[] students = csdStudentRestClient.findAllCsd1_5Students(csd1_5Students);
		modelMap.addAttribute("student", students);
		
		Csd1_5Results[] results = csdStudentRestClient.findAllCsd1_5StudentResults(csd1_5StudentResults);
		modelMap.addAttribute("results", results);
		
		return "csd1_5";
	}
	
	
	//  METHODS TO RETRIEVE ALL CSD1.6 STUDENT RECORDS AND RESULTS
	@RequestMapping(value = "/getCsd1_6Page", method = RequestMethod.GET)
	public String findAllCsd1_6Students(Csd1_6Info csd1_6Students, Csd1_6Results csd1_6StudentResults, ModelMap modelMap) {
		
		Csd1_6Info[] students = csdStudentRestClient.findAllCsd1_6Students(csd1_6Students);
		modelMap.addAttribute("student", students);
		
		Csd1_6Results[] results = csdStudentRestClient.findAllCsd1_6StudentResults(csd1_6StudentResults);
		modelMap.addAttribute("results", results);
		
		return "csd1_6";
	}
	
	
	//  METHODS TO RETRIEVE ALL CSD1.7 STUDENT RECORDS AND RESULTS
	@RequestMapping(value = "/getCsd1_7Page", method = RequestMethod.GET)
	public String findAllCsd1_7Students(Csd1_7Info csd1_7Students, Csd1_7Results csd1_7StudentResults, ModelMap modelMap) {
		
		Csd1_7Info[] students = csdStudentRestClient.findAllCsd1_7Students(csd1_7Students);
		modelMap.addAttribute("student", students);
		
		Csd1_7Results[] results = csdStudentRestClient.findAllCsd1_7StudentResults(csd1_7StudentResults);
		modelMap.addAttribute("results", results);
		
		return "csd1_7";
	}
				
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@RequestMapping(value = "/getCsd1_1StudentById", method = RequestMethod.GET)
	public String getCsd1_1StudentById(@RequestParam("student_id") String csd1_1StudentId) {
		
		csdStudentRestClient.findCsd1_1StudentById(csd1_1StudentId);
		
		return "updateCsd1_1StudentInfo";
	}
	
	
	
	@RequestMapping("/editCsd1_1StudentInfo")
	public String updateCsd1_1Student(Csd1_1Info csd1_1Student) {
		
		csdStudentRestClient.updateCsd1_1Student(csd1_1Student);
		
		return "redirect: getCsd1_1Page";
	}
	
	
	
	
	@RequestMapping("/deleteCsd1_1StudentInfo")
	public String deleteCsd1_1Student(@RequestParam("student_id") String csd1_1StudentId) {
		
		csdStudentRestClient.deleteCsd1_1Student(csd1_1StudentId);
		
		return "redirect: getCsd1_1Page";
	}
	
	
	
	
	
	
	  //  SAVE CSD1.1 STUDENT RECORD
	@RequestMapping("/saveCsd1_1Student")
	public String saveCsd1_1Student(Csd1_1Info csd1_1Student) {
		
		csdStudentRestClient.saveCsd1_1Stduent(csd1_1Student);
		
		return "redirect: getCsd1_1ResultPage";
	}
	
	
	
	
//	@RequestMapping("/getCsd1_1ResultPage")
//	public String getCsd1_1ResultPage() {
//
//		return "csd1_1Results";
//
//	}
	
	
			
	
	
	  //  SAVE CSD1.1 STUDENT RECORD
	@RequestMapping("/addCsd1_1StudentResult")
	public String saveCsd1_1StudentResults(Csd1_1Results csd1_1StudentResults) {
		
		csdStudentRestClient.saveCsd1_1StduentResults(csd1_1StudentResults);
		
		return "redirect: getCsd1_1Page";
	}
	
	
	
	
	
	@RequestMapping(value = "/getCsd1_1StudentResultsById", method = RequestMethod.GET)
	public String getCsd1_1StudentResultsById(@RequestParam("student_id") String csd1_1StudentId) {
		
		csdStudentRestClient.findCsd1_1StudentResultsById(csd1_1StudentId);
		
		return "updateCsd1_1StudentResult";
	}
	
	
	
	@RequestMapping("/updateCsd1_1StudentResults")
	public String updateCsd1_1StudentResults(Csd1_1Results csd1_1StudentResults) {
		
		csdStudentRestClient.updateCsd1_1StudentResults(csd1_1StudentResults);
		
		return "redirect: getCsd1_1Page";
	}
	
	
	
	
	
	@RequestMapping("/deleteCsd1_1StudentResults")
	public String deleteCsd1_1StudentResults(@RequestParam("student_id") String csd1_1ResultsStudentId) {
		
		csdStudentRestClient.deleteCsd1_1StudentResults(csd1_1ResultsStudentId);
		
		return "redirect: getCsd1_1Page";
	
	}
	
//	@RequestMapping("/getCsd1_1Page")
//	public String getCsd1_1Page() {
//
//		return "csd1_1";
//
//	}

	
	
	
	
	@RequestMapping("/getStudentLoginPage")
	public String getStudentLoginPage() {

		return "stduentLoginPage";

	}
	
	
	
	@RequestMapping(value = "studentLogin", method = RequestMethod.POST)
	public String studentLoginAction(@RequestParam("student_id") String student_id){

		
		return "studentResults";

	}
	
	
	
	
	
	
	
	
	@RequestMapping("/getAdminLoginPage")
	public String getAdminLoginPage() {

		return "adminLoginPage";

	}

	
	
	@RequestMapping("/getAdminLoginErrorPage")
	public String getAdminLoginErrorPage() {

		return "errorAdminLogin";
	}
	
	@RequestMapping("/getStudentLoginErrorPage")
	public String getStudentLoginErrorPage() {

		return "errorStudentLogin";
	}
	
	
	@RequestMapping("/getStudentResultPage")
	public String getStudentResultPage() {

		return "csd1_1ResultsPage";
	}

	@RequestMapping("/homePage")
	public String homePage() {

		return "../../index";

	}

	@RequestMapping(value = "adminLogin", method = RequestMethod.POST)
	public String adminLoginAction(@RequestParam("username") String adminUsername, @RequestParam("password") String adminPassword) {

		String username1 = adminUsername;
		String password1 = adminPassword;

		if (username1.equalsIgnoreCase("admin") && password1.equalsIgnoreCase("admin@2020")) {

			return "redirect:getAllStudentInfo";
		} else {

			return "redirect:getAdminLoginErrorPage";
		}

	}
		
	
	
	
	
	
	
	
	
}
