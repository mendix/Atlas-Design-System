// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package atlas_designsystem.proxies;

public class TextBox
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject textBoxMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "Atlas_DesignSystem.TextBox";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		ValueSet("ValueSet"),
		NoValue("NoValue");

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

	public TextBox(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "Atlas_DesignSystem.TextBox"));
	}

	protected TextBox(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject textBoxMendixObject)
	{
		if (textBoxMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("Atlas_DesignSystem.TextBox", textBoxMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a Atlas_DesignSystem.TextBox");

		this.textBoxMendixObject = textBoxMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'TextBox.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static atlas_designsystem.proxies.TextBox initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return atlas_designsystem.proxies.TextBox.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static atlas_designsystem.proxies.TextBox initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new atlas_designsystem.proxies.TextBox(context, mendixObject);
	}

	public static atlas_designsystem.proxies.TextBox load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return atlas_designsystem.proxies.TextBox.initialize(context, mendixObject);
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
	 * @return value of ValueSet
	 */
	public final java.lang.String getValueSet()
	{
		return getValueSet(getContext());
	}

	/**
	 * @param context
	 * @return value of ValueSet
	 */
	public final java.lang.String getValueSet(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.ValueSet.toString());
	}

	/**
	 * Set value of ValueSet
	 * @param valueset
	 */
	public final void setValueSet(java.lang.String valueset)
	{
		setValueSet(getContext(), valueset);
	}

	/**
	 * Set value of ValueSet
	 * @param context
	 * @param valueset
	 */
	public final void setValueSet(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String valueset)
	{
		getMendixObject().setValue(context, MemberNames.ValueSet.toString(), valueset);
	}

	/**
	 * @return value of NoValue
	 */
	public final java.lang.String getNoValue()
	{
		return getNoValue(getContext());
	}

	/**
	 * @param context
	 * @return value of NoValue
	 */
	public final java.lang.String getNoValue(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.NoValue.toString());
	}

	/**
	 * Set value of NoValue
	 * @param novalue
	 */
	public final void setNoValue(java.lang.String novalue)
	{
		setNoValue(getContext(), novalue);
	}

	/**
	 * Set value of NoValue
	 * @param context
	 * @param novalue
	 */
	public final void setNoValue(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String novalue)
	{
		getMendixObject().setValue(context, MemberNames.NoValue.toString(), novalue);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return textBoxMendixObject;
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
			final atlas_designsystem.proxies.TextBox that = (atlas_designsystem.proxies.TextBox) obj;
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
		return "Atlas_DesignSystem.TextBox";
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
