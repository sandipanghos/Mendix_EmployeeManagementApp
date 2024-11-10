// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package mxmodelreflection.proxies;

public class Parameter
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject parameterMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "MxModelReflection.Parameter";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Name("Name"),
		Parameter_ValueType("MxModelReflection.Parameter_ValueType"),
		Parameter_MxObjectType("MxModelReflection.Parameter_MxObjectType");

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

	public Parameter(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, entityName));
	}

	protected Parameter(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject parameterMendixObject)
	{
		if (parameterMendixObject == null) {
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		}
		if (!com.mendix.core.Core.isSubClassOf(entityName, parameterMendixObject.getType())) {
			throw new java.lang.IllegalArgumentException(String.format("The given object is not a %s", entityName));
		}	

		this.parameterMendixObject = parameterMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Parameter.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static mxmodelreflection.proxies.Parameter initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return mxmodelreflection.proxies.Parameter.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 * @param context The context to be used
	 * @param mendixObject The Mendix object for the new instance
	 * @return a new instance of this proxy class
	 */
	public static mxmodelreflection.proxies.Parameter initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new mxmodelreflection.proxies.Parameter(context, mendixObject);
	}

	public static mxmodelreflection.proxies.Parameter load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return mxmodelreflection.proxies.Parameter.initialize(context, mendixObject);
	}

	public static java.util.List<mxmodelreflection.proxies.Parameter> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		return com.mendix.core.Core.createXPathQuery(String.format("//%1$s%2$s", entityName, xpathConstraint))
			.execute(context)
			.stream()
			.map(obj -> mxmodelreflection.proxies.Parameter.initialize(context, obj))
			.collect(java.util.stream.Collectors.toList());
	}

	/**
	 * Commit the changes made on this proxy object.
	 * @throws com.mendix.core.CoreException
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 * @throws com.mendix.core.CoreException
	 */
	public final void commit(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(com.mendix.systemwideinterfaces.core.IContext context)
	{
		com.mendix.core.Core.delete(context, getMendixObject());
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
	 * @throws com.mendix.core.CoreException
	 * @return value of Parameter_ValueType
	 */
	public final mxmodelreflection.proxies.ValueType getParameter_ValueType() throws com.mendix.core.CoreException
	{
		return getParameter_ValueType(getContext());
	}

	/**
	 * @param context
	 * @return value of Parameter_ValueType
	 * @throws com.mendix.core.CoreException
	 */
	public final mxmodelreflection.proxies.ValueType getParameter_ValueType(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		mxmodelreflection.proxies.ValueType result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Parameter_ValueType.toString());
		if (identifier != null) {
			result = mxmodelreflection.proxies.ValueType.load(context, identifier);
		}
		return result;
	}

	/**
	 * Set value of Parameter_ValueType
	 * @param parameter_valuetype
	 */
	public final void setParameter_ValueType(mxmodelreflection.proxies.ValueType parameter_valuetype)
	{
		setParameter_ValueType(getContext(), parameter_valuetype);
	}

	/**
	 * Set value of Parameter_ValueType
	 * @param context
	 * @param parameter_valuetype
	 */
	public final void setParameter_ValueType(com.mendix.systemwideinterfaces.core.IContext context, mxmodelreflection.proxies.ValueType parameter_valuetype)
	{
		if (parameter_valuetype == null) {
			getMendixObject().setValue(context, MemberNames.Parameter_ValueType.toString(), null);
		} else {
			getMendixObject().setValue(context, MemberNames.Parameter_ValueType.toString(), parameter_valuetype.getMendixObject().getId());
		}
	}

	/**
	 * @throws com.mendix.core.CoreException
	 * @return value of Parameter_MxObjectType
	 */
	public final mxmodelreflection.proxies.MxObjectType getParameter_MxObjectType() throws com.mendix.core.CoreException
	{
		return getParameter_MxObjectType(getContext());
	}

	/**
	 * @param context
	 * @return value of Parameter_MxObjectType
	 * @throws com.mendix.core.CoreException
	 */
	public final mxmodelreflection.proxies.MxObjectType getParameter_MxObjectType(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		mxmodelreflection.proxies.MxObjectType result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Parameter_MxObjectType.toString());
		if (identifier != null) {
			result = mxmodelreflection.proxies.MxObjectType.load(context, identifier);
		}
		return result;
	}

	/**
	 * Set value of Parameter_MxObjectType
	 * @param parameter_mxobjecttype
	 */
	public final void setParameter_MxObjectType(mxmodelreflection.proxies.MxObjectType parameter_mxobjecttype)
	{
		setParameter_MxObjectType(getContext(), parameter_mxobjecttype);
	}

	/**
	 * Set value of Parameter_MxObjectType
	 * @param context
	 * @param parameter_mxobjecttype
	 */
	public final void setParameter_MxObjectType(com.mendix.systemwideinterfaces.core.IContext context, mxmodelreflection.proxies.MxObjectType parameter_mxobjecttype)
	{
		if (parameter_mxobjecttype == null) {
			getMendixObject().setValue(context, MemberNames.Parameter_MxObjectType.toString(), null);
		} else {
			getMendixObject().setValue(context, MemberNames.Parameter_MxObjectType.toString(), parameter_mxobjecttype.getMendixObject().getId());
		}
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return parameterMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this) {
			return true;
		}
		if (obj != null && getClass().equals(obj.getClass()))
		{
			final mxmodelreflection.proxies.Parameter that = (mxmodelreflection.proxies.Parameter) obj;
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
	@java.lang.Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
