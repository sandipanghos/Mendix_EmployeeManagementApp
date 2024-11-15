// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package employeemanagement.proxies;

public class Helper extends system.proxies.Paging
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "EmployeeManagement.Helper";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		EmployeeID("EmployeeID"),
		Name("Name"),
		Designation("Designation"),
		DateOfJoining("DateOfJoining"),
		ContactInfo("ContactInfo"),
		Department("Department"),
		PageSize("PageSize"),
		TotalCount("TotalCount"),
		CurrentCount("CurrentCount"),
		EmployeeIdFieldSortApplied("EmployeeIdFieldSortApplied"),
		EmployeeNameFieldApplied("EmployeeNameFieldApplied"),
		DepartmentNameFieldApplied("DepartmentNameFieldApplied"),
		DesignationFieldApplied("DesignationFieldApplied"),
		DateOfJoiningFieldApplied("DateOfJoiningFieldApplied"),
		ContactInfoFieldApplied("ContactInfoFieldApplied"),
		DepartmentID("DepartmentID"),
		DepartmentName("DepartmentName"),
		DepartmentIDFieldApplied("DepartmentIDFieldApplied"),
		DepartmentFIeldApplied("DepartmentFIeldApplied"),
		PageNumber("PageNumber"),
		IsSortable("IsSortable"),
		SortAttribute("SortAttribute"),
		SortAscending("SortAscending"),
		HasMoreData("HasMoreData");

		private final java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@java.lang.Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public Helper(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, entityName));
	}

	protected Helper(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject helperMendixObject)
	{
		super(context, helperMendixObject);
		if (!com.mendix.core.Core.isSubClassOf(entityName, helperMendixObject.getType())) {
			throw new java.lang.IllegalArgumentException(String.format("The given object is not a %s", entityName));
		}	
	}

	/**
	 * @deprecated Use 'Helper.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static employeemanagement.proxies.Helper initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return employeemanagement.proxies.Helper.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 * @param context The context to be used
	 * @param mendixObject The Mendix object for the new instance
	 * @return a new instance of this proxy class
	 */
	public static employeemanagement.proxies.Helper initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new employeemanagement.proxies.Helper(context, mendixObject);
	}

	public static employeemanagement.proxies.Helper load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return employeemanagement.proxies.Helper.initialize(context, mendixObject);
	}

	/**
	 * @return value of EmployeeID
	 */
	public final java.lang.Integer getEmployeeID()
	{
		return getEmployeeID(getContext());
	}

	/**
	 * @param context
	 * @return value of EmployeeID
	 */
	public final java.lang.Integer getEmployeeID(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.EmployeeID.toString());
	}

	/**
	 * Set value of EmployeeID
	 * @param employeeid
	 */
	public final void setEmployeeID(java.lang.Integer employeeid)
	{
		setEmployeeID(getContext(), employeeid);
	}

	/**
	 * Set value of EmployeeID
	 * @param context
	 * @param employeeid
	 */
	public final void setEmployeeID(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer employeeid)
	{
		getMendixObject().setValue(context, MemberNames.EmployeeID.toString(), employeeid);
	}

	/**
	 * @return value of Name
	 */
	public final java.lang.String getName()
	{
		return getName(getContext());
	}

	/**
	 * @param context
	 * @return value of Name
	 */
	public final java.lang.String getName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Name.toString());
	}

	/**
	 * Set value of Name
	 * @param name
	 */
	public final void setName(java.lang.String name)
	{
		setName(getContext(), name);
	}

	/**
	 * Set value of Name
	 * @param context
	 * @param name
	 */
	public final void setName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String name)
	{
		getMendixObject().setValue(context, MemberNames.Name.toString(), name);
	}

	/**
	 * @return value of Designation
	 */
	public final java.lang.String getDesignation()
	{
		return getDesignation(getContext());
	}

	/**
	 * @param context
	 * @return value of Designation
	 */
	public final java.lang.String getDesignation(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Designation.toString());
	}

	/**
	 * Set value of Designation
	 * @param designation
	 */
	public final void setDesignation(java.lang.String designation)
	{
		setDesignation(getContext(), designation);
	}

	/**
	 * Set value of Designation
	 * @param context
	 * @param designation
	 */
	public final void setDesignation(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String designation)
	{
		getMendixObject().setValue(context, MemberNames.Designation.toString(), designation);
	}

	/**
	 * @return value of DateOfJoining
	 */
	public final java.util.Date getDateOfJoining()
	{
		return getDateOfJoining(getContext());
	}

	/**
	 * @param context
	 * @return value of DateOfJoining
	 */
	public final java.util.Date getDateOfJoining(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.DateOfJoining.toString());
	}

	/**
	 * Set value of DateOfJoining
	 * @param dateofjoining
	 */
	public final void setDateOfJoining(java.util.Date dateofjoining)
	{
		setDateOfJoining(getContext(), dateofjoining);
	}

	/**
	 * Set value of DateOfJoining
	 * @param context
	 * @param dateofjoining
	 */
	public final void setDateOfJoining(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date dateofjoining)
	{
		getMendixObject().setValue(context, MemberNames.DateOfJoining.toString(), dateofjoining);
	}

	/**
	 * @return value of ContactInfo
	 */
	public final java.lang.String getContactInfo()
	{
		return getContactInfo(getContext());
	}

	/**
	 * @param context
	 * @return value of ContactInfo
	 */
	public final java.lang.String getContactInfo(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.ContactInfo.toString());
	}

	/**
	 * Set value of ContactInfo
	 * @param contactinfo
	 */
	public final void setContactInfo(java.lang.String contactinfo)
	{
		setContactInfo(getContext(), contactinfo);
	}

	/**
	 * Set value of ContactInfo
	 * @param context
	 * @param contactinfo
	 */
	public final void setContactInfo(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String contactinfo)
	{
		getMendixObject().setValue(context, MemberNames.ContactInfo.toString(), contactinfo);
	}

	/**
	 * @return value of Department
	 */
	public final java.lang.String getDepartment()
	{
		return getDepartment(getContext());
	}

	/**
	 * @param context
	 * @return value of Department
	 */
	public final java.lang.String getDepartment(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Department.toString());
	}

	/**
	 * Set value of Department
	 * @param department
	 */
	public final void setDepartment(java.lang.String department)
	{
		setDepartment(getContext(), department);
	}

	/**
	 * Set value of Department
	 * @param context
	 * @param department
	 */
	public final void setDepartment(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String department)
	{
		getMendixObject().setValue(context, MemberNames.Department.toString(), department);
	}

	/**
	 * @return value of PageSize
	 */
	public final java.lang.Integer getPageSize()
	{
		return getPageSize(getContext());
	}

	/**
	 * @param context
	 * @return value of PageSize
	 */
	public final java.lang.Integer getPageSize(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.PageSize.toString());
	}

	/**
	 * Set value of PageSize
	 * @param pagesize
	 */
	public final void setPageSize(java.lang.Integer pagesize)
	{
		setPageSize(getContext(), pagesize);
	}

	/**
	 * Set value of PageSize
	 * @param context
	 * @param pagesize
	 */
	public final void setPageSize(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer pagesize)
	{
		getMendixObject().setValue(context, MemberNames.PageSize.toString(), pagesize);
	}

	/**
	 * @return value of TotalCount
	 */
	public final java.lang.Integer getTotalCount()
	{
		return getTotalCount(getContext());
	}

	/**
	 * @param context
	 * @return value of TotalCount
	 */
	public final java.lang.Integer getTotalCount(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.TotalCount.toString());
	}

	/**
	 * Set value of TotalCount
	 * @param totalcount
	 */
	public final void setTotalCount(java.lang.Integer totalcount)
	{
		setTotalCount(getContext(), totalcount);
	}

	/**
	 * Set value of TotalCount
	 * @param context
	 * @param totalcount
	 */
	public final void setTotalCount(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer totalcount)
	{
		getMendixObject().setValue(context, MemberNames.TotalCount.toString(), totalcount);
	}

	/**
	 * @return value of CurrentCount
	 */
	public final java.lang.Integer getCurrentCount()
	{
		return getCurrentCount(getContext());
	}

	/**
	 * @param context
	 * @return value of CurrentCount
	 */
	public final java.lang.Integer getCurrentCount(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.CurrentCount.toString());
	}

	/**
	 * Set value of CurrentCount
	 * @param currentcount
	 */
	public final void setCurrentCount(java.lang.Integer currentcount)
	{
		setCurrentCount(getContext(), currentcount);
	}

	/**
	 * Set value of CurrentCount
	 * @param context
	 * @param currentcount
	 */
	public final void setCurrentCount(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer currentcount)
	{
		getMendixObject().setValue(context, MemberNames.CurrentCount.toString(), currentcount);
	}

	/**
	 * @return value of EmployeeIdFieldSortApplied
	 */
	public final java.lang.Boolean getEmployeeIdFieldSortApplied()
	{
		return getEmployeeIdFieldSortApplied(getContext());
	}

	/**
	 * @param context
	 * @return value of EmployeeIdFieldSortApplied
	 */
	public final java.lang.Boolean getEmployeeIdFieldSortApplied(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.EmployeeIdFieldSortApplied.toString());
	}

	/**
	 * Set value of EmployeeIdFieldSortApplied
	 * @param employeeidfieldsortapplied
	 */
	public final void setEmployeeIdFieldSortApplied(java.lang.Boolean employeeidfieldsortapplied)
	{
		setEmployeeIdFieldSortApplied(getContext(), employeeidfieldsortapplied);
	}

	/**
	 * Set value of EmployeeIdFieldSortApplied
	 * @param context
	 * @param employeeidfieldsortapplied
	 */
	public final void setEmployeeIdFieldSortApplied(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean employeeidfieldsortapplied)
	{
		getMendixObject().setValue(context, MemberNames.EmployeeIdFieldSortApplied.toString(), employeeidfieldsortapplied);
	}

	/**
	 * @return value of EmployeeNameFieldApplied
	 */
	public final java.lang.Boolean getEmployeeNameFieldApplied()
	{
		return getEmployeeNameFieldApplied(getContext());
	}

	/**
	 * @param context
	 * @return value of EmployeeNameFieldApplied
	 */
	public final java.lang.Boolean getEmployeeNameFieldApplied(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.EmployeeNameFieldApplied.toString());
	}

	/**
	 * Set value of EmployeeNameFieldApplied
	 * @param employeenamefieldapplied
	 */
	public final void setEmployeeNameFieldApplied(java.lang.Boolean employeenamefieldapplied)
	{
		setEmployeeNameFieldApplied(getContext(), employeenamefieldapplied);
	}

	/**
	 * Set value of EmployeeNameFieldApplied
	 * @param context
	 * @param employeenamefieldapplied
	 */
	public final void setEmployeeNameFieldApplied(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean employeenamefieldapplied)
	{
		getMendixObject().setValue(context, MemberNames.EmployeeNameFieldApplied.toString(), employeenamefieldapplied);
	}

	/**
	 * @return value of DepartmentNameFieldApplied
	 */
	public final java.lang.Boolean getDepartmentNameFieldApplied()
	{
		return getDepartmentNameFieldApplied(getContext());
	}

	/**
	 * @param context
	 * @return value of DepartmentNameFieldApplied
	 */
	public final java.lang.Boolean getDepartmentNameFieldApplied(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.DepartmentNameFieldApplied.toString());
	}

	/**
	 * Set value of DepartmentNameFieldApplied
	 * @param departmentnamefieldapplied
	 */
	public final void setDepartmentNameFieldApplied(java.lang.Boolean departmentnamefieldapplied)
	{
		setDepartmentNameFieldApplied(getContext(), departmentnamefieldapplied);
	}

	/**
	 * Set value of DepartmentNameFieldApplied
	 * @param context
	 * @param departmentnamefieldapplied
	 */
	public final void setDepartmentNameFieldApplied(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean departmentnamefieldapplied)
	{
		getMendixObject().setValue(context, MemberNames.DepartmentNameFieldApplied.toString(), departmentnamefieldapplied);
	}

	/**
	 * @return value of DesignationFieldApplied
	 */
	public final java.lang.Boolean getDesignationFieldApplied()
	{
		return getDesignationFieldApplied(getContext());
	}

	/**
	 * @param context
	 * @return value of DesignationFieldApplied
	 */
	public final java.lang.Boolean getDesignationFieldApplied(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.DesignationFieldApplied.toString());
	}

	/**
	 * Set value of DesignationFieldApplied
	 * @param designationfieldapplied
	 */
	public final void setDesignationFieldApplied(java.lang.Boolean designationfieldapplied)
	{
		setDesignationFieldApplied(getContext(), designationfieldapplied);
	}

	/**
	 * Set value of DesignationFieldApplied
	 * @param context
	 * @param designationfieldapplied
	 */
	public final void setDesignationFieldApplied(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean designationfieldapplied)
	{
		getMendixObject().setValue(context, MemberNames.DesignationFieldApplied.toString(), designationfieldapplied);
	}

	/**
	 * @return value of DateOfJoiningFieldApplied
	 */
	public final java.lang.Boolean getDateOfJoiningFieldApplied()
	{
		return getDateOfJoiningFieldApplied(getContext());
	}

	/**
	 * @param context
	 * @return value of DateOfJoiningFieldApplied
	 */
	public final java.lang.Boolean getDateOfJoiningFieldApplied(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.DateOfJoiningFieldApplied.toString());
	}

	/**
	 * Set value of DateOfJoiningFieldApplied
	 * @param dateofjoiningfieldapplied
	 */
	public final void setDateOfJoiningFieldApplied(java.lang.Boolean dateofjoiningfieldapplied)
	{
		setDateOfJoiningFieldApplied(getContext(), dateofjoiningfieldapplied);
	}

	/**
	 * Set value of DateOfJoiningFieldApplied
	 * @param context
	 * @param dateofjoiningfieldapplied
	 */
	public final void setDateOfJoiningFieldApplied(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean dateofjoiningfieldapplied)
	{
		getMendixObject().setValue(context, MemberNames.DateOfJoiningFieldApplied.toString(), dateofjoiningfieldapplied);
	}

	/**
	 * @return value of ContactInfoFieldApplied
	 */
	public final java.lang.Boolean getContactInfoFieldApplied()
	{
		return getContactInfoFieldApplied(getContext());
	}

	/**
	 * @param context
	 * @return value of ContactInfoFieldApplied
	 */
	public final java.lang.Boolean getContactInfoFieldApplied(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.ContactInfoFieldApplied.toString());
	}

	/**
	 * Set value of ContactInfoFieldApplied
	 * @param contactinfofieldapplied
	 */
	public final void setContactInfoFieldApplied(java.lang.Boolean contactinfofieldapplied)
	{
		setContactInfoFieldApplied(getContext(), contactinfofieldapplied);
	}

	/**
	 * Set value of ContactInfoFieldApplied
	 * @param context
	 * @param contactinfofieldapplied
	 */
	public final void setContactInfoFieldApplied(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean contactinfofieldapplied)
	{
		getMendixObject().setValue(context, MemberNames.ContactInfoFieldApplied.toString(), contactinfofieldapplied);
	}

	/**
	 * @return value of DepartmentID
	 */
	public final java.lang.Integer getDepartmentID()
	{
		return getDepartmentID(getContext());
	}

	/**
	 * @param context
	 * @return value of DepartmentID
	 */
	public final java.lang.Integer getDepartmentID(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.DepartmentID.toString());
	}

	/**
	 * Set value of DepartmentID
	 * @param departmentid
	 */
	public final void setDepartmentID(java.lang.Integer departmentid)
	{
		setDepartmentID(getContext(), departmentid);
	}

	/**
	 * Set value of DepartmentID
	 * @param context
	 * @param departmentid
	 */
	public final void setDepartmentID(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer departmentid)
	{
		getMendixObject().setValue(context, MemberNames.DepartmentID.toString(), departmentid);
	}

	/**
	 * @return value of DepartmentName
	 */
	public final java.lang.String getDepartmentName()
	{
		return getDepartmentName(getContext());
	}

	/**
	 * @param context
	 * @return value of DepartmentName
	 */
	public final java.lang.String getDepartmentName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.DepartmentName.toString());
	}

	/**
	 * Set value of DepartmentName
	 * @param departmentname
	 */
	public final void setDepartmentName(java.lang.String departmentname)
	{
		setDepartmentName(getContext(), departmentname);
	}

	/**
	 * Set value of DepartmentName
	 * @param context
	 * @param departmentname
	 */
	public final void setDepartmentName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String departmentname)
	{
		getMendixObject().setValue(context, MemberNames.DepartmentName.toString(), departmentname);
	}

	/**
	 * @return value of DepartmentIDFieldApplied
	 */
	public final java.lang.Boolean getDepartmentIDFieldApplied()
	{
		return getDepartmentIDFieldApplied(getContext());
	}

	/**
	 * @param context
	 * @return value of DepartmentIDFieldApplied
	 */
	public final java.lang.Boolean getDepartmentIDFieldApplied(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.DepartmentIDFieldApplied.toString());
	}

	/**
	 * Set value of DepartmentIDFieldApplied
	 * @param departmentidfieldapplied
	 */
	public final void setDepartmentIDFieldApplied(java.lang.Boolean departmentidfieldapplied)
	{
		setDepartmentIDFieldApplied(getContext(), departmentidfieldapplied);
	}

	/**
	 * Set value of DepartmentIDFieldApplied
	 * @param context
	 * @param departmentidfieldapplied
	 */
	public final void setDepartmentIDFieldApplied(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean departmentidfieldapplied)
	{
		getMendixObject().setValue(context, MemberNames.DepartmentIDFieldApplied.toString(), departmentidfieldapplied);
	}

	/**
	 * @return value of DepartmentFIeldApplied
	 */
	public final java.lang.Boolean getDepartmentFIeldApplied()
	{
		return getDepartmentFIeldApplied(getContext());
	}

	/**
	 * @param context
	 * @return value of DepartmentFIeldApplied
	 */
	public final java.lang.Boolean getDepartmentFIeldApplied(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.DepartmentFIeldApplied.toString());
	}

	/**
	 * Set value of DepartmentFIeldApplied
	 * @param departmentfieldapplied
	 */
	public final void setDepartmentFIeldApplied(java.lang.Boolean departmentfieldapplied)
	{
		setDepartmentFIeldApplied(getContext(), departmentfieldapplied);
	}

	/**
	 * Set value of DepartmentFIeldApplied
	 * @param context
	 * @param departmentfieldapplied
	 */
	public final void setDepartmentFIeldApplied(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean departmentfieldapplied)
	{
		getMendixObject().setValue(context, MemberNames.DepartmentFIeldApplied.toString(), departmentfieldapplied);
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this) {
			return true;
		}
		if (obj != null && getClass().equals(obj.getClass()))
		{
			final employeemanagement.proxies.Helper that = (employeemanagement.proxies.Helper) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@java.lang.Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return entityName;
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@java.lang.Override
	@java.lang.Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
