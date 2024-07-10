package com.flipkart.dao;

import com.flipkart.bean.Student;
import com.flipkart.constants.StatusConstants;
import com.flipkart.exception.InvalidStudentIdException;

public interface StudentDaoInterface {
	
	/** Dao Function to get student details
	 * @param String student id
	 * @throws InvalidStudentIdException
	 * */
	public Student getStudentDetails(String studentId) throws InvalidStudentIdException;
	
	/** Dao Function to remove a student from db
	 * @param String student id
	 * @throws InvalidStudentIdException
	 * */
	public StatusConstants deleteStudent(String studentID) throws InvalidStudentIdException;
	
	/** Dao Function to add student details
	 * @param Student student
	 * */
	public StatusConstants addStudent(Student student);
	
	/** Dao Function to change student verification status
	 * @param String student id
	 * @throws InvalidStudentIdException
	 * */
	public StatusConstants changeStudentVerificationStatus(String studentId) throws InvalidStudentIdException;
	
	/** Dao Function to get verification status of a student
	 * @param String student id
	 * @throws InvalidStudentIdException
	 * */
	public boolean getVerificationStatus(String studentId) throws InvalidStudentIdException;
}