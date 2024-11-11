// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package employeemanagement.proxies;

public class CurrentWeather
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject currentWeatherMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "EmployeeManagement.CurrentWeather";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Dt("Dt"),
		Sunrise("Sunrise"),
		Sunset("Sunset"),
		Temp("Temp"),
		Feels_like("Feels_like"),
		Pressure("Pressure"),
		Humidity("Humidity"),
		Dew_point("Dew_point"),
		Uvi("Uvi"),
		Clouds("Clouds"),
		Visibility("Visibility"),
		Wind_speed("Wind_speed"),
		Wind_deg("Wind_deg"),
		Wind_gust("Wind_gust"),
		Location("Location"),
		CurrentWeather_CurrentWeatherRoot("EmployeeManagement.CurrentWeather_CurrentWeatherRoot");

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

	public CurrentWeather(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, entityName));
	}

	protected CurrentWeather(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject currentWeatherMendixObject)
	{
		if (currentWeatherMendixObject == null) {
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		}
		if (!com.mendix.core.Core.isSubClassOf(entityName, currentWeatherMendixObject.getType())) {
			throw new java.lang.IllegalArgumentException(String.format("The given object is not a %s", entityName));
		}	

		this.currentWeatherMendixObject = currentWeatherMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'CurrentWeather.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static employeemanagement.proxies.CurrentWeather initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return employeemanagement.proxies.CurrentWeather.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 * @param context The context to be used
	 * @param mendixObject The Mendix object for the new instance
	 * @return a new instance of this proxy class
	 */
	public static employeemanagement.proxies.CurrentWeather initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new employeemanagement.proxies.CurrentWeather(context, mendixObject);
	}

	public static employeemanagement.proxies.CurrentWeather load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return employeemanagement.proxies.CurrentWeather.initialize(context, mendixObject);
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
	 * @return value of Dt
	 */
	public final java.lang.Integer getDt()
	{
		return getDt(getContext());
	}

	/**
	 * @param context
	 * @return value of Dt
	 */
	public final java.lang.Integer getDt(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.Dt.toString());
	}

	/**
	 * Set value of Dt
	 * @param dt
	 */
	public final void setDt(java.lang.Integer dt)
	{
		setDt(getContext(), dt);
	}

	/**
	 * Set value of Dt
	 * @param context
	 * @param dt
	 */
	public final void setDt(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer dt)
	{
		getMendixObject().setValue(context, MemberNames.Dt.toString(), dt);
	}

	/**
	 * @return value of Sunrise
	 */
	public final java.lang.Integer getSunrise()
	{
		return getSunrise(getContext());
	}

	/**
	 * @param context
	 * @return value of Sunrise
	 */
	public final java.lang.Integer getSunrise(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.Sunrise.toString());
	}

	/**
	 * Set value of Sunrise
	 * @param sunrise
	 */
	public final void setSunrise(java.lang.Integer sunrise)
	{
		setSunrise(getContext(), sunrise);
	}

	/**
	 * Set value of Sunrise
	 * @param context
	 * @param sunrise
	 */
	public final void setSunrise(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer sunrise)
	{
		getMendixObject().setValue(context, MemberNames.Sunrise.toString(), sunrise);
	}

	/**
	 * @return value of Sunset
	 */
	public final java.lang.Integer getSunset()
	{
		return getSunset(getContext());
	}

	/**
	 * @param context
	 * @return value of Sunset
	 */
	public final java.lang.Integer getSunset(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.Sunset.toString());
	}

	/**
	 * Set value of Sunset
	 * @param sunset
	 */
	public final void setSunset(java.lang.Integer sunset)
	{
		setSunset(getContext(), sunset);
	}

	/**
	 * Set value of Sunset
	 * @param context
	 * @param sunset
	 */
	public final void setSunset(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer sunset)
	{
		getMendixObject().setValue(context, MemberNames.Sunset.toString(), sunset);
	}

	/**
	 * @return value of Temp
	 */
	public final java.math.BigDecimal getTemp()
	{
		return getTemp(getContext());
	}

	/**
	 * @param context
	 * @return value of Temp
	 */
	public final java.math.BigDecimal getTemp(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.math.BigDecimal) getMendixObject().getValue(context, MemberNames.Temp.toString());
	}

	/**
	 * Set value of Temp
	 * @param temp
	 */
	public final void setTemp(java.math.BigDecimal temp)
	{
		setTemp(getContext(), temp);
	}

	/**
	 * Set value of Temp
	 * @param context
	 * @param temp
	 */
	public final void setTemp(com.mendix.systemwideinterfaces.core.IContext context, java.math.BigDecimal temp)
	{
		getMendixObject().setValue(context, MemberNames.Temp.toString(), temp);
	}

	/**
	 * @return value of Feels_like
	 */
	public final java.math.BigDecimal getFeels_like()
	{
		return getFeels_like(getContext());
	}

	/**
	 * @param context
	 * @return value of Feels_like
	 */
	public final java.math.BigDecimal getFeels_like(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.math.BigDecimal) getMendixObject().getValue(context, MemberNames.Feels_like.toString());
	}

	/**
	 * Set value of Feels_like
	 * @param feels_like
	 */
	public final void setFeels_like(java.math.BigDecimal feels_like)
	{
		setFeels_like(getContext(), feels_like);
	}

	/**
	 * Set value of Feels_like
	 * @param context
	 * @param feels_like
	 */
	public final void setFeels_like(com.mendix.systemwideinterfaces.core.IContext context, java.math.BigDecimal feels_like)
	{
		getMendixObject().setValue(context, MemberNames.Feels_like.toString(), feels_like);
	}

	/**
	 * @return value of Pressure
	 */
	public final java.lang.Integer getPressure()
	{
		return getPressure(getContext());
	}

	/**
	 * @param context
	 * @return value of Pressure
	 */
	public final java.lang.Integer getPressure(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.Pressure.toString());
	}

	/**
	 * Set value of Pressure
	 * @param pressure
	 */
	public final void setPressure(java.lang.Integer pressure)
	{
		setPressure(getContext(), pressure);
	}

	/**
	 * Set value of Pressure
	 * @param context
	 * @param pressure
	 */
	public final void setPressure(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer pressure)
	{
		getMendixObject().setValue(context, MemberNames.Pressure.toString(), pressure);
	}

	/**
	 * @return value of Humidity
	 */
	public final java.lang.Integer getHumidity()
	{
		return getHumidity(getContext());
	}

	/**
	 * @param context
	 * @return value of Humidity
	 */
	public final java.lang.Integer getHumidity(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.Humidity.toString());
	}

	/**
	 * Set value of Humidity
	 * @param humidity
	 */
	public final void setHumidity(java.lang.Integer humidity)
	{
		setHumidity(getContext(), humidity);
	}

	/**
	 * Set value of Humidity
	 * @param context
	 * @param humidity
	 */
	public final void setHumidity(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer humidity)
	{
		getMendixObject().setValue(context, MemberNames.Humidity.toString(), humidity);
	}

	/**
	 * @return value of Dew_point
	 */
	public final java.math.BigDecimal getDew_point()
	{
		return getDew_point(getContext());
	}

	/**
	 * @param context
	 * @return value of Dew_point
	 */
	public final java.math.BigDecimal getDew_point(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.math.BigDecimal) getMendixObject().getValue(context, MemberNames.Dew_point.toString());
	}

	/**
	 * Set value of Dew_point
	 * @param dew_point
	 */
	public final void setDew_point(java.math.BigDecimal dew_point)
	{
		setDew_point(getContext(), dew_point);
	}

	/**
	 * Set value of Dew_point
	 * @param context
	 * @param dew_point
	 */
	public final void setDew_point(com.mendix.systemwideinterfaces.core.IContext context, java.math.BigDecimal dew_point)
	{
		getMendixObject().setValue(context, MemberNames.Dew_point.toString(), dew_point);
	}

	/**
	 * @return value of Uvi
	 */
	public final java.math.BigDecimal getUvi()
	{
		return getUvi(getContext());
	}

	/**
	 * @param context
	 * @return value of Uvi
	 */
	public final java.math.BigDecimal getUvi(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.math.BigDecimal) getMendixObject().getValue(context, MemberNames.Uvi.toString());
	}

	/**
	 * Set value of Uvi
	 * @param uvi
	 */
	public final void setUvi(java.math.BigDecimal uvi)
	{
		setUvi(getContext(), uvi);
	}

	/**
	 * Set value of Uvi
	 * @param context
	 * @param uvi
	 */
	public final void setUvi(com.mendix.systemwideinterfaces.core.IContext context, java.math.BigDecimal uvi)
	{
		getMendixObject().setValue(context, MemberNames.Uvi.toString(), uvi);
	}

	/**
	 * @return value of Clouds
	 */
	public final java.lang.Integer getClouds()
	{
		return getClouds(getContext());
	}

	/**
	 * @param context
	 * @return value of Clouds
	 */
	public final java.lang.Integer getClouds(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.Clouds.toString());
	}

	/**
	 * Set value of Clouds
	 * @param clouds
	 */
	public final void setClouds(java.lang.Integer clouds)
	{
		setClouds(getContext(), clouds);
	}

	/**
	 * Set value of Clouds
	 * @param context
	 * @param clouds
	 */
	public final void setClouds(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer clouds)
	{
		getMendixObject().setValue(context, MemberNames.Clouds.toString(), clouds);
	}

	/**
	 * @return value of Visibility
	 */
	public final java.lang.Integer getVisibility()
	{
		return getVisibility(getContext());
	}

	/**
	 * @param context
	 * @return value of Visibility
	 */
	public final java.lang.Integer getVisibility(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.Visibility.toString());
	}

	/**
	 * Set value of Visibility
	 * @param visibility
	 */
	public final void setVisibility(java.lang.Integer visibility)
	{
		setVisibility(getContext(), visibility);
	}

	/**
	 * Set value of Visibility
	 * @param context
	 * @param visibility
	 */
	public final void setVisibility(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer visibility)
	{
		getMendixObject().setValue(context, MemberNames.Visibility.toString(), visibility);
	}

	/**
	 * @return value of Wind_speed
	 */
	public final java.math.BigDecimal getWind_speed()
	{
		return getWind_speed(getContext());
	}

	/**
	 * @param context
	 * @return value of Wind_speed
	 */
	public final java.math.BigDecimal getWind_speed(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.math.BigDecimal) getMendixObject().getValue(context, MemberNames.Wind_speed.toString());
	}

	/**
	 * Set value of Wind_speed
	 * @param wind_speed
	 */
	public final void setWind_speed(java.math.BigDecimal wind_speed)
	{
		setWind_speed(getContext(), wind_speed);
	}

	/**
	 * Set value of Wind_speed
	 * @param context
	 * @param wind_speed
	 */
	public final void setWind_speed(com.mendix.systemwideinterfaces.core.IContext context, java.math.BigDecimal wind_speed)
	{
		getMendixObject().setValue(context, MemberNames.Wind_speed.toString(), wind_speed);
	}

	/**
	 * @return value of Wind_deg
	 */
	public final java.lang.Integer getWind_deg()
	{
		return getWind_deg(getContext());
	}

	/**
	 * @param context
	 * @return value of Wind_deg
	 */
	public final java.lang.Integer getWind_deg(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.Wind_deg.toString());
	}

	/**
	 * Set value of Wind_deg
	 * @param wind_deg
	 */
	public final void setWind_deg(java.lang.Integer wind_deg)
	{
		setWind_deg(getContext(), wind_deg);
	}

	/**
	 * Set value of Wind_deg
	 * @param context
	 * @param wind_deg
	 */
	public final void setWind_deg(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer wind_deg)
	{
		getMendixObject().setValue(context, MemberNames.Wind_deg.toString(), wind_deg);
	}

	/**
	 * @return value of Wind_gust
	 */
	public final java.math.BigDecimal getWind_gust()
	{
		return getWind_gust(getContext());
	}

	/**
	 * @param context
	 * @return value of Wind_gust
	 */
	public final java.math.BigDecimal getWind_gust(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.math.BigDecimal) getMendixObject().getValue(context, MemberNames.Wind_gust.toString());
	}

	/**
	 * Set value of Wind_gust
	 * @param wind_gust
	 */
	public final void setWind_gust(java.math.BigDecimal wind_gust)
	{
		setWind_gust(getContext(), wind_gust);
	}

	/**
	 * Set value of Wind_gust
	 * @param context
	 * @param wind_gust
	 */
	public final void setWind_gust(com.mendix.systemwideinterfaces.core.IContext context, java.math.BigDecimal wind_gust)
	{
		getMendixObject().setValue(context, MemberNames.Wind_gust.toString(), wind_gust);
	}

	/**
	 * @return value of Location
	 */
	public final java.lang.String getLocation()
	{
		return getLocation(getContext());
	}

	/**
	 * @param context
	 * @return value of Location
	 */
	public final java.lang.String getLocation(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Location.toString());
	}

	/**
	 * Set value of Location
	 * @param location
	 */
	public final void setLocation(java.lang.String location)
	{
		setLocation(getContext(), location);
	}

	/**
	 * Set value of Location
	 * @param context
	 * @param location
	 */
	public final void setLocation(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String location)
	{
		getMendixObject().setValue(context, MemberNames.Location.toString(), location);
	}

	/**
	 * @throws com.mendix.core.CoreException
	 * @return value of CurrentWeather_CurrentWeatherRoot
	 */
	public final employeemanagement.proxies.CurrentWeatherRoot getCurrentWeather_CurrentWeatherRoot() throws com.mendix.core.CoreException
	{
		return getCurrentWeather_CurrentWeatherRoot(getContext());
	}

	/**
	 * @param context
	 * @return value of CurrentWeather_CurrentWeatherRoot
	 * @throws com.mendix.core.CoreException
	 */
	public final employeemanagement.proxies.CurrentWeatherRoot getCurrentWeather_CurrentWeatherRoot(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		employeemanagement.proxies.CurrentWeatherRoot result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.CurrentWeather_CurrentWeatherRoot.toString());
		if (identifier != null) {
			result = employeemanagement.proxies.CurrentWeatherRoot.load(context, identifier);
		}
		return result;
	}

	/**
	 * Set value of CurrentWeather_CurrentWeatherRoot
	 * @param currentweather_currentweatherroot
	 */
	public final void setCurrentWeather_CurrentWeatherRoot(employeemanagement.proxies.CurrentWeatherRoot currentweather_currentweatherroot)
	{
		setCurrentWeather_CurrentWeatherRoot(getContext(), currentweather_currentweatherroot);
	}

	/**
	 * Set value of CurrentWeather_CurrentWeatherRoot
	 * @param context
	 * @param currentweather_currentweatherroot
	 */
	public final void setCurrentWeather_CurrentWeatherRoot(com.mendix.systemwideinterfaces.core.IContext context, employeemanagement.proxies.CurrentWeatherRoot currentweather_currentweatherroot)
	{
		if (currentweather_currentweatherroot == null) {
			getMendixObject().setValue(context, MemberNames.CurrentWeather_CurrentWeatherRoot.toString(), null);
		} else {
			getMendixObject().setValue(context, MemberNames.CurrentWeather_CurrentWeatherRoot.toString(), currentweather_currentweatherroot.getMendixObject().getId());
		}
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return currentWeatherMendixObject;
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
			final employeemanagement.proxies.CurrentWeather that = (employeemanagement.proxies.CurrentWeather) obj;
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