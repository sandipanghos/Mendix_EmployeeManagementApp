// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package employeemanagement.proxies.microflows;

import java.util.HashMap;
import java.util.Map;
import com.mendix.core.Core;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObject;

public class Microflows
{
	/**
	 * @deprecated
	 * The default constructor of the Microflows class should not be used.
	 * Use the static microflow invocation methods instead.
	 */
	@java.lang.Deprecated(since = "9.12", forRemoval = true)
	public Microflows() {}

	// These are the microflows for the EmployeeManagement module
	public static void aCO_Employee_Account_Create_SendEmail(IContext context, employeemanagement.proxies.Employee _employee)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Employee", _employee == null ? null : _employee.getMendixObject());
		Core.microflowCall("EmployeeManagement.ACO_Employee_Account_Create_SendEmail").withParams(params).execute(context);
	}
	public static void aCT_Department_Create(IContext context, employeemanagement.proxies.Helper _helper)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Helper", _helper == null ? null : _helper.getMendixObject());
		Core.microflowCall("EmployeeManagement.ACT_Department_Create").withParams(params).execute(context);
	}
	public static void aCT_Department_Edit(IContext context, employeemanagement.proxies.Department _department)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Department", _department == null ? null : _department.getMendixObject());
		Core.microflowCall("EmployeeManagement.ACT_Department_Edit").withParams(params).execute(context);
	}
	public static void aCT_Department_Save(IContext context, employeemanagement.proxies.Department _department)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Department", _department == null ? null : _department.getMendixObject());
		Core.microflowCall("EmployeeManagement.ACT_Department_Save").withParams(params).execute(context);
	}
	public static void aCT_Employee_Create(IContext context, employeemanagement.proxies.Helper _employeeHelper)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("EmployeeHelper", _employeeHelper == null ? null : _employeeHelper.getMendixObject());
		Core.microflowCall("EmployeeManagement.ACT_Employee_Create").withParams(params).execute(context);
	}
	public static void aCT_Employee_Edit(IContext context, employeemanagement.proxies.Employee _employee)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Employee", _employee == null ? null : _employee.getMendixObject());
		Core.microflowCall("EmployeeManagement.ACT_Employee_Edit").withParams(params).execute(context);
	}
	public static void aCT_Employee_Save(IContext context, employeemanagement.proxies.Employee _employee)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Employee", _employee == null ? null : _employee.getMendixObject());
		Core.microflowCall("EmployeeManagement.ACT_Employee_Save").withParams(params).execute(context);
	}
	public static java.util.List<employeemanagement.proxies.Department> dS_Department_GetList(IContext context, employeemanagement.proxies.Helper _helper)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Helper", _helper == null ? null : _helper.getMendixObject());
		java.util.List<IMendixObject> objs = Core.microflowCall("EmployeeManagement.DS_Department_GetList").withParams(params).execute(context);
		if (objs == null) {
			return null;
		} else {
			return objs.stream()
				.map(obj -> employeemanagement.proxies.Department.initialize(context, obj))
				.collect(java.util.stream.Collectors.toList());
		}
	}
	public static java.util.List<employeemanagement.proxies.Employee> dS_DepartmentAndSubDepartmentEmployess_Get(IContext context, employeemanagement.proxies.Department _department)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Department", _department == null ? null : _department.getMendixObject());
		java.util.List<IMendixObject> objs = Core.microflowCall("EmployeeManagement.DS_DepartmentAndSubDepartmentEmployess_Get").withParams(params).execute(context);
		if (objs == null) {
			return null;
		} else {
			return objs.stream()
				.map(obj -> employeemanagement.proxies.Employee.initialize(context, obj))
				.collect(java.util.stream.Collectors.toList());
		}
	}
	public static employeemanagement.proxies.Employee dS_GetCurrentEmployee(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		IMendixObject result = (IMendixObject)Core.microflowCall("EmployeeManagement.DS_GetCurrentEmployee").withParams(params).execute(context);
		return result == null ? null : employeemanagement.proxies.Employee.initialize(context, result);
	}
	public static java.util.List<employeemanagement.proxies.Department> dS_GetDepartment_SortedAndFiltered(IContext context, employeemanagement.proxies.Helper _paging)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Paging", _paging == null ? null : _paging.getMendixObject());
		java.util.List<IMendixObject> objs = Core.microflowCall("EmployeeManagement.DS_GetDepartment_SortedAndFiltered").withParams(params).execute(context);
		if (objs == null) {
			return null;
		} else {
			return objs.stream()
				.map(obj -> employeemanagement.proxies.Department.initialize(context, obj))
				.collect(java.util.stream.Collectors.toList());
		}
	}
	public static java.util.List<employeemanagement.proxies.Employee> dS_GetEmployees_SortedAndFiltered(IContext context, employeemanagement.proxies.Helper _paging)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Paging", _paging == null ? null : _paging.getMendixObject());
		java.util.List<IMendixObject> objs = Core.microflowCall("EmployeeManagement.DS_GetEmployees_SortedAndFiltered").withParams(params).execute(context);
		if (objs == null) {
			return null;
		} else {
			return objs.stream()
				.map(obj -> employeemanagement.proxies.Employee.initialize(context, obj))
				.collect(java.util.stream.Collectors.toList());
		}
	}
	public static employeemanagement.proxies.CurrentWeatherRoot dS_Weather_Get(IContext context, nanoflowcommons.proxies.Position _position, employeemanagement.proxies.Employee _employee)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Position", _position == null ? null : _position.getMendixObject());
		params.put("Employee", _employee == null ? null : _employee.getMendixObject());
		IMendixObject result = (IMendixObject)Core.microflowCall("EmployeeManagement.DS_Weather_Get").withParams(params).execute(context);
		return result == null ? null : employeemanagement.proxies.CurrentWeatherRoot.initialize(context, result);
	}
	public static administration.proxies.Account sUB_CurrentAccount_Get(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		IMendixObject result = (IMendixObject)Core.microflowCall("EmployeeManagement.SUB_CurrentAccount_Get").withParams(params).execute(context);
		return result == null ? null : administration.proxies.Account.initialize(context, result);
	}
	public static java.util.List<employeemanagement.proxies.Department> sUB_DatabaseDepartment_GetForObjectInMemory(IContext context, java.util.List<employeemanagement.proxies.Department> _departmentistCreatedInMemory, java.util.List<employeemanagement.proxies.Department> _departmentListToBeAdd)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		java.util.List<IMendixObject> listparam_departmentistCreatedInMemory = null;
		if (_departmentistCreatedInMemory != null)
		{
			listparam_departmentistCreatedInMemory = new java.util.ArrayList<>();
			for (var obj : _departmentistCreatedInMemory) {
				listparam_departmentistCreatedInMemory.add(obj.getMendixObject());
			}
		}
		params.put("DepartmentistCreatedInMemory", listparam_departmentistCreatedInMemory);

		java.util.List<IMendixObject> listparam_departmentListToBeAdd = null;
		if (_departmentListToBeAdd != null)
		{
			listparam_departmentListToBeAdd = new java.util.ArrayList<>();
			for (var obj : _departmentListToBeAdd) {
				listparam_departmentListToBeAdd.add(obj.getMendixObject());
			}
		}
		params.put("DepartmentListToBeAdd", listparam_departmentListToBeAdd);

		java.util.List<IMendixObject> objs = Core.microflowCall("EmployeeManagement.SUB_DatabaseDepartment_GetForObjectInMemory").withParams(params).execute(context);
		if (objs == null) {
			return null;
		} else {
			return objs.stream()
				.map(obj -> employeemanagement.proxies.Department.initialize(context, obj))
				.collect(java.util.stream.Collectors.toList());
		}
	}
	public static java.util.List<employeemanagement.proxies.Employee> sUB_DatabaseEmployees_GetForObjectInMemory(IContext context, java.util.List<employeemanagement.proxies.Employee> _employeeListCreatedInMemory, java.util.List<employeemanagement.proxies.Employee> _employeeListToBeAdd)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		java.util.List<IMendixObject> listparam_employeeListCreatedInMemory = null;
		if (_employeeListCreatedInMemory != null)
		{
			listparam_employeeListCreatedInMemory = new java.util.ArrayList<>();
			for (var obj : _employeeListCreatedInMemory) {
				listparam_employeeListCreatedInMemory.add(obj.getMendixObject());
			}
		}
		params.put("EmployeeListCreatedInMemory", listparam_employeeListCreatedInMemory);

		java.util.List<IMendixObject> listparam_employeeListToBeAdd = null;
		if (_employeeListToBeAdd != null)
		{
			listparam_employeeListToBeAdd = new java.util.ArrayList<>();
			for (var obj : _employeeListToBeAdd) {
				listparam_employeeListToBeAdd.add(obj.getMendixObject());
			}
		}
		params.put("EmployeeListToBeAdd", listparam_employeeListToBeAdd);

		java.util.List<IMendixObject> objs = Core.microflowCall("EmployeeManagement.SUB_DatabaseEmployees_GetForObjectInMemory").withParams(params).execute(context);
		if (objs == null) {
			return null;
		} else {
			return objs.stream()
				.map(obj -> employeemanagement.proxies.Employee.initialize(context, obj))
				.collect(java.util.stream.Collectors.toList());
		}
	}
	public static java.lang.Long sUB_Department_GetTotalCount(IContext context, employeemanagement.proxies.Helper _paging)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Paging", _paging == null ? null : _paging.getMendixObject());
		return (java.lang.Long) Core.microflowCall("EmployeeManagement.SUB_Department_GetTotalCount").withParams(params).execute(context);
	}
	public static java.lang.String sUB_DepartmentQuery_Create(IContext context, employeemanagement.proxies.Helper _paging, java.lang.String _departmentIDField, java.lang.String _departmentNameField)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Paging", _paging == null ? null : _paging.getMendixObject());
		params.put("DepartmentIDField", _departmentIDField);
		params.put("DepartmentNameField", _departmentNameField);
		return (java.lang.String) Core.microflowCall("EmployeeManagement.SUB_DepartmentQuery_Create").withParams(params).execute(context);
	}
	public static java.lang.String sUB_DepartmentSortByQuery_Create(IContext context, java.lang.String _departmentIDField, java.lang.String _departmentNameField, employeemanagement.proxies.Helper _paging)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("DepartmentIDField", _departmentIDField);
		params.put("DepartmentNameField", _departmentNameField);
		params.put("Paging", _paging == null ? null : _paging.getMendixObject());
		return (java.lang.String) Core.microflowCall("EmployeeManagement.SUB_DepartmentSortByQuery_Create").withParams(params).execute(context);
	}
	public static java.util.List<employeemanagement.proxies.Employee> sUB_DepartmnetEmployees_Get(IContext context, employeemanagement.proxies.Department _department)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Department", _department == null ? null : _department.getMendixObject());
		java.util.List<IMendixObject> objs = Core.microflowCall("EmployeeManagement.SUB_DepartmnetEmployees_Get").withParams(params).execute(context);
		if (objs == null) {
			return null;
		} else {
			return objs.stream()
				.map(obj -> employeemanagement.proxies.Employee.initialize(context, obj))
				.collect(java.util.stream.Collectors.toList());
		}
	}
	public static void sUB_EmailSent_To_User(IContext context, employeemanagement.proxies.Employee _employee)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Employee", _employee == null ? null : _employee.getMendixObject());
		Core.microflowCall("EmployeeManagement.SUB_EmailSent_To_User").withParams(params).execute(context);
	}
	public static java.lang.String sUB_EmloyeeQuery_Create(IContext context, employeemanagement.proxies.Helper _paging, java.lang.String _employeeNameField, java.lang.String _employeeIDField, java.lang.String _designationField, java.lang.String _departmentField, java.lang.String _dateOfJoiningField, java.lang.String _contactInfo)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Paging", _paging == null ? null : _paging.getMendixObject());
		params.put("EmployeeNameField", _employeeNameField);
		params.put("EmployeeIDField", _employeeIDField);
		params.put("DesignationField", _designationField);
		params.put("DepartmentField", _departmentField);
		params.put("DateOfJoiningField", _dateOfJoiningField);
		params.put("ContactInfo", _contactInfo);
		return (java.lang.String) Core.microflowCall("EmployeeManagement.SUB_EmloyeeQuery_Create").withParams(params).execute(context);
	}
	public static java.lang.String sUB_EmployeeSortByQuery_Create(IContext context, java.lang.String _employeeNameField, java.lang.String _employeeIDField, java.lang.String _designationField, java.lang.String _departmentField, java.lang.String _dateOfJoiningField, java.lang.String _contactInfo, employeemanagement.proxies.Helper _paging)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("EmployeeNameField", _employeeNameField);
		params.put("EmployeeIDField", _employeeIDField);
		params.put("DesignationField", _designationField);
		params.put("DepartmentField", _departmentField);
		params.put("DateOfJoiningField", _dateOfJoiningField);
		params.put("ContactInfo", _contactInfo);
		params.put("Paging", _paging == null ? null : _paging.getMendixObject());
		return (java.lang.String) Core.microflowCall("EmployeeManagement.SUB_EmployeeSortByQuery_Create").withParams(params).execute(context);
	}
	public static void sUB_SendEmail(IContext context, email_connector.proxies.EmailTemplate _emailTemplate, employeemanagement.proxies.Employee _employee)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("EmailTemplate", _emailTemplate == null ? null : _emailTemplate.getMendixObject());
		params.put("Employee", _employee == null ? null : _employee.getMendixObject());
		Core.microflowCall("EmployeeManagement.SUB_SendEmail").withParams(params).execute(context);
	}
	public static java.lang.Long sUB_Table_GetTotalCount(IContext context, employeemanagement.proxies.Helper _paging)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Paging", _paging == null ? null : _paging.getMendixObject());
		return (java.lang.Long) Core.microflowCall("EmployeeManagement.SUB_Table_GetTotalCount").withParams(params).execute(context);
	}
	public static boolean val_Employee(IContext context, employeemanagement.proxies.Employee _employee)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Employee", _employee == null ? null : _employee.getMendixObject());
		return (java.lang.Boolean) Core.microflowCall("EmployeeManagement.Val_Employee").withParams(params).execute(context);
	}
	public static boolean validate_Department(IContext context, employeemanagement.proxies.Department _department)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Department", _department == null ? null : _department.getMendixObject());
		return (java.lang.Boolean) Core.microflowCall("EmployeeManagement.Validate_Department").withParams(params).execute(context);
	}
}
