// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package atlas_designsystem.proxies;

public class ScreenshotTaker
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject screenshotTakerMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "Atlas_DesignSystem.ScreenshotTaker";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Name("Name"),
		Base64("Base64"),
		Content("Content");

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

	public ScreenshotTaker(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, entityName));
	}

	protected ScreenshotTaker(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject screenshotTakerMendixObject)
	{
		if (screenshotTakerMendixObject == null) {
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		}
		if (!com.mendix.core.Core.isSubClassOf(entityName, screenshotTakerMendixObject.getType())) {
			throw new java.lang.IllegalArgumentException(String.format("The given object is not a %s", entityName));
		}	

		this.screenshotTakerMendixObject = screenshotTakerMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'ScreenshotTaker.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static atlas_designsystem.proxies.ScreenshotTaker initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return atlas_designsystem.proxies.ScreenshotTaker.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 * @param context The context to be used
	 * @param mendixObject The Mendix object for the new instance
	 * @return a new instance of this proxy class
	 */
	public static atlas_designsystem.proxies.ScreenshotTaker initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new atlas_designsystem.proxies.ScreenshotTaker(context, mendixObject);
	}

	public static atlas_designsystem.proxies.ScreenshotTaker load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return atlas_designsystem.proxies.ScreenshotTaker.initialize(context, mendixObject);
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
	 * @return value of Base64
	 */
	public final java.lang.String getBase64()
	{
		return getBase64(getContext());
	}

	/**
	 * @param context
	 * @return value of Base64
	 */
	public final java.lang.String getBase64(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Base64.toString());
	}

	/**
	 * Set value of Base64
	 * @param base64
	 */
	public final void setBase64(java.lang.String base64)
	{
		setBase64(getContext(), base64);
	}

	/**
	 * Set value of Base64
	 * @param context
	 * @param base64
	 */
	public final void setBase64(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String base64)
	{
		getMendixObject().setValue(context, MemberNames.Base64.toString(), base64);
	}

	/**
	 * Set value of Content
	 * @param content
	 */
	public final atlas_designsystem.proxies.Enum_ScreenshotContent getContent()
	{
		return getContent(getContext());
	}

	/**
	 * @param context
	 * @return value of Content
	 */
	public final atlas_designsystem.proxies.Enum_ScreenshotContent getContent(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.Content.toString());
		if (obj == null) {
			return null;
		}
		return atlas_designsystem.proxies.Enum_ScreenshotContent.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of Content
	 * @param content
	 */
	public final void setContent(atlas_designsystem.proxies.Enum_ScreenshotContent content)
	{
		setContent(getContext(), content);
	}

	/**
	 * Set value of Content
	 * @param context
	 * @param content
	 */
	public final void setContent(com.mendix.systemwideinterfaces.core.IContext context, atlas_designsystem.proxies.Enum_ScreenshotContent content)
	{
		if (content != null) {
			getMendixObject().setValue(context, MemberNames.Content.toString(), content.toString());
		} else {
			getMendixObject().setValue(context, MemberNames.Content.toString(), null);
		}
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return screenshotTakerMendixObject;
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
			final atlas_designsystem.proxies.ScreenshotTaker that = (atlas_designsystem.proxies.ScreenshotTaker) obj;
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
