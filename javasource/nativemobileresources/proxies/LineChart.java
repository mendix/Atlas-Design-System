// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package nativemobileresources.proxies;

public class LineChart
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject lineChartMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "NativeMobileResources.LineChart";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Attribute("Attribute");

		private java.lang.String metaName;

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

	public LineChart(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "NativeMobileResources.LineChart"));
	}

	protected LineChart(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject lineChartMendixObject)
	{
		if (lineChartMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("NativeMobileResources.LineChart", lineChartMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a NativeMobileResources.LineChart");

		this.lineChartMendixObject = lineChartMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'LineChart.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static nativemobileresources.proxies.LineChart initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return nativemobileresources.proxies.LineChart.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static nativemobileresources.proxies.LineChart initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new nativemobileresources.proxies.LineChart(context, mendixObject);
	}

	public static nativemobileresources.proxies.LineChart load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return nativemobileresources.proxies.LineChart.initialize(context, mendixObject);
	}

	public static java.util.List<nativemobileresources.proxies.LineChart> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<nativemobileresources.proxies.LineChart> result = new java.util.ArrayList<nativemobileresources.proxies.LineChart>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//NativeMobileResources.LineChart" + xpathConstraint))
			result.add(nativemobileresources.proxies.LineChart.initialize(context, obj));
		return result;
	}

	/**
	 * Commit the changes made on this proxy object.
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
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
	 * @return value of Attribute
	 */
	public final java.lang.Integer getAttribute()
	{
		return getAttribute(getContext());
	}

	/**
	 * @param context
	 * @return value of Attribute
	 */
	public final java.lang.Integer getAttribute(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.Attribute.toString());
	}

	/**
	 * Set value of Attribute
	 * @param attribute
	 */
	public final void setAttribute(java.lang.Integer attribute)
	{
		setAttribute(getContext(), attribute);
	}

	/**
	 * Set value of Attribute
	 * @param context
	 * @param attribute
	 */
	public final void setAttribute(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer attribute)
	{
		getMendixObject().setValue(context, MemberNames.Attribute.toString(), attribute);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return lineChartMendixObject;
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
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final nativemobileresources.proxies.LineChart that = (nativemobileresources.proxies.LineChart) obj;
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
		return "NativeMobileResources.LineChart";
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
