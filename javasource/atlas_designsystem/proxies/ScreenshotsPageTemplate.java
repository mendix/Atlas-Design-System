// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package atlas_designsystem.proxies;

public class ScreenshotsPageTemplate extends system.proxies.Image
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "Atlas_DesignSystem.ScreenshotsPageTemplate";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		NameCustom("NameCustom"),
		PublicThumbnailPath("PublicThumbnailPath"),
		FileID("FileID"),
		Name("Name"),
		DeleteAfterDownload("DeleteAfterDownload"),
		Contents("Contents"),
		HasContents("HasContents"),
		Size("Size");

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

	public ScreenshotsPageTemplate(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, entityName));
	}

	protected ScreenshotsPageTemplate(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject screenshotsPageTemplateMendixObject)
	{
		super(context, screenshotsPageTemplateMendixObject);
		if (!com.mendix.core.Core.isSubClassOf(entityName, screenshotsPageTemplateMendixObject.getType())) {
			throw new java.lang.IllegalArgumentException(String.format("The given object is not a %s", entityName));
		}	
	}

	/**
	 * @deprecated Use 'ScreenshotsPageTemplate.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static atlas_designsystem.proxies.ScreenshotsPageTemplate initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return atlas_designsystem.proxies.ScreenshotsPageTemplate.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 * @param context The context to be used
	 * @param mendixObject The Mendix object for the new instance
	 * @return a new instance of this proxy class
	 */
	public static atlas_designsystem.proxies.ScreenshotsPageTemplate initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new atlas_designsystem.proxies.ScreenshotsPageTemplate(context, mendixObject);
	}

	public static atlas_designsystem.proxies.ScreenshotsPageTemplate load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return atlas_designsystem.proxies.ScreenshotsPageTemplate.initialize(context, mendixObject);
	}

	public static java.util.List<atlas_designsystem.proxies.ScreenshotsPageTemplate> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		return com.mendix.core.Core.createXPathQuery(String.format("//%1$s%2$s", entityName, xpathConstraint))
			.execute(context)
			.stream()
			.map(obj -> atlas_designsystem.proxies.ScreenshotsPageTemplate.initialize(context, obj))
			.collect(java.util.stream.Collectors.toList());
	}

	/**
	 * @return value of NameCustom
	 */
	public final java.lang.String getNameCustom()
	{
		return getNameCustom(getContext());
	}

	/**
	 * @param context
	 * @return value of NameCustom
	 */
	public final java.lang.String getNameCustom(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.NameCustom.toString());
	}

	/**
	 * Set value of NameCustom
	 * @param namecustom
	 */
	public final void setNameCustom(java.lang.String namecustom)
	{
		setNameCustom(getContext(), namecustom);
	}

	/**
	 * Set value of NameCustom
	 * @param context
	 * @param namecustom
	 */
	public final void setNameCustom(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String namecustom)
	{
		getMendixObject().setValue(context, MemberNames.NameCustom.toString(), namecustom);
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this) {
			return true;
		}
		if (obj != null && getClass().equals(obj.getClass()))
		{
			final atlas_designsystem.proxies.ScreenshotsPageTemplate that = (atlas_designsystem.proxies.ScreenshotsPageTemplate) obj;
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