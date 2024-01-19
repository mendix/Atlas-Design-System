// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package atlas_designsystem.proxies;

public class Dropdown implements com.mendix.systemwideinterfaces.core.IEntityProxy
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject dropdownMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "Atlas_DesignSystem.Dropdown";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		ValueSet("ValueSet"),
		NoValue("NoValue");

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

	public Dropdown(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, entityName));
	}

	protected Dropdown(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject dropdownMendixObject)
	{
		if (dropdownMendixObject == null) {
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		}
		if (!com.mendix.core.Core.isSubClassOf(entityName, dropdownMendixObject.getType())) {
			throw new java.lang.IllegalArgumentException(String.format("The given object is not a %s", entityName));
		}	

		this.dropdownMendixObject = dropdownMendixObject;
		this.context = context;
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 * @param context The context to be used
	 * @param mendixObject The Mendix object for the new instance
	 * @return a new instance of this proxy class
	 */
	public static atlas_designsystem.proxies.Dropdown initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new atlas_designsystem.proxies.Dropdown(context, mendixObject);
	}

	public static atlas_designsystem.proxies.Dropdown load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return atlas_designsystem.proxies.Dropdown.initialize(context, mendixObject);
	}

	/**
	 * Get value of ValueSet
	 * @param valueset
	 */
	public final atlas_designsystem.proxies.DropdownEnum getValueSet()
	{
		return getValueSet(getContext());
	}

	/**
	 * @param context
	 * @return value of ValueSet
	 */
	public final atlas_designsystem.proxies.DropdownEnum getValueSet(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.ValueSet.toString());
		if (obj == null) {
			return null;
		}
		return atlas_designsystem.proxies.DropdownEnum.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of ValueSet
	 * @param valueset
	 */
	public final void setValueSet(atlas_designsystem.proxies.DropdownEnum valueset)
	{
		setValueSet(getContext(), valueset);
	}

	/**
	 * Set value of ValueSet
	 * @param context
	 * @param valueset
	 */
	public final void setValueSet(com.mendix.systemwideinterfaces.core.IContext context, atlas_designsystem.proxies.DropdownEnum valueset)
	{
		if (valueset != null) {
			getMendixObject().setValue(context, MemberNames.ValueSet.toString(), valueset.toString());
		} else {
			getMendixObject().setValue(context, MemberNames.ValueSet.toString(), null);
		}
	}

	/**
	 * Get value of NoValue
	 * @param novalue
	 */
	public final atlas_designsystem.proxies.DropdownEnum getNoValue()
	{
		return getNoValue(getContext());
	}

	/**
	 * @param context
	 * @return value of NoValue
	 */
	public final atlas_designsystem.proxies.DropdownEnum getNoValue(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.NoValue.toString());
		if (obj == null) {
			return null;
		}
		return atlas_designsystem.proxies.DropdownEnum.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of NoValue
	 * @param novalue
	 */
	public final void setNoValue(atlas_designsystem.proxies.DropdownEnum novalue)
	{
		setNoValue(getContext(), novalue);
	}

	/**
	 * Set value of NoValue
	 * @param context
	 * @param novalue
	 */
	public final void setNoValue(com.mendix.systemwideinterfaces.core.IContext context, atlas_designsystem.proxies.DropdownEnum novalue)
	{
		if (novalue != null) {
			getMendixObject().setValue(context, MemberNames.NoValue.toString(), novalue.toString());
		} else {
			getMendixObject().setValue(context, MemberNames.NoValue.toString(), null);
		}
	}

	@Override
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return dropdownMendixObject;
	}

	@Override
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
			final atlas_designsystem.proxies.Dropdown that = (atlas_designsystem.proxies.Dropdown) obj;
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
   * Gives full name ("Module.Entity" name) of the type of the entity.
   *
   * @return the name
   */
	public static java.lang.String getType()
	{
		return entityName;
	}
}
