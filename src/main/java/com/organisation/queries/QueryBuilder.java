package com.organisation.queries;

public class QueryBuilder {
	public static final String GET_ALL = "SELECT * FROM ORGANISATION";
	public static final String INSERT = "INSERT INTO ORGANISATION(ID, EMPLOYEE_NAME, PASSWORD) VALUES(?,?,?)";
	public static final String GET_ORGANISATION_BY_ID = "select * from organisation where id = ?";
	public static final String DELETE_ORGANISATION_BY_ID = "delete from organisation where id = ?";
	public static final String DELETE_ALL = "delete from organisation";
	public static final String UPDATE_EMPLOYEE_NAME_BY_ID = "update organisation set employee_name = ? where id = ?";

	public static final String NJ_GET_ALL = "SELECT * FROM ORGANISATION";
	public static final String NJ_INSERT = "INSERT INTO ORGANISATION(ID,EMPLOYEE_NAME, PASSWORD) VALUES(:id,:employee_name,:password)";
	public static final String NJ_GET_ORGANISATION_BY_ID = "select * from organisation where id = :id";
	public static final String NJ_DELETE_ORGANISATION_BY_ID = "delete from user where user_id = :id";
	public static final String NJ_DELETE_ALL = "delete from organisation";
	public static final String NJ_UPDATE_EMPLOYEE_NAME_BY_ID = "update user set employee_name = :employee_name where id = :id";
}
