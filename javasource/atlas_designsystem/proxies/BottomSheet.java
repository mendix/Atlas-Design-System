// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package atlas_designsystem.proxies;

public class BottomSheet
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject bottomSheetMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "Atlas_DesignSystem.BottomSheet";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		ModalNative("ModalNative"),
		Expanding("Expanding"),
		ModalCustom("ModalCustom"),
		ModalCustomHeader("ModalCustomHeader"),
		ModalCustomHeaderLarge("ModalCustomHeaderLarge"),
		ModalCustomHeaderScroll("ModalCustomHeaderScroll"),
		GalleryNative("GalleryNative");

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

	public BottomSheet(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, entityName));
	}

	protected BottomSheet(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject bottomSheetMendixObject)
	{
		if (bottomSheetMendixObject == null) {
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		}
		if (!com.mendix.core.Core.isSubClassOf(entityName, bottomSheetMendixObject.getType())) {
			throw new java.lang.IllegalArgumentException(String.format("The given object is not a %s", entityName));
		}	

		this.bottomSheetMendixObject = bottomSheetMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'BottomSheet.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static atlas_designsystem.proxies.BottomSheet initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return atlas_designsystem.proxies.BottomSheet.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 * @param context The context to be used
	 * @param mendixObject The Mendix object for the new instance
	 * @return a new instance of this proxy class
	 */
	public static atlas_designsystem.proxies.BottomSheet initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new atlas_designsystem.proxies.BottomSheet(context, mendixObject);
	}

	public static atlas_designsystem.proxies.BottomSheet load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return atlas_designsystem.proxies.BottomSheet.initialize(context, mendixObject);
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
	 * @return value of ModalNative
	 */
	public final java.lang.Boolean getModalNative()
	{
		return getModalNative(getContext());
	}

	/**
	 * @param context
	 * @return value of ModalNative
	 */
	public final java.lang.Boolean getModalNative(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.ModalNative.toString());
	}

	/**
	 * Set value of ModalNative
	 * @param modalnative
	 */
	public final void setModalNative(java.lang.Boolean modalnative)
	{
		setModalNative(getContext(), modalnative);
	}

	/**
	 * Set value of ModalNative
	 * @param context
	 * @param modalnative
	 */
	public final void setModalNative(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean modalnative)
	{
		getMendixObject().setValue(context, MemberNames.ModalNative.toString(), modalnative);
	}

	/**
	 * @return value of Expanding
	 */
	public final java.lang.Boolean getExpanding()
	{
		return getExpanding(getContext());
	}

	/**
	 * @param context
	 * @return value of Expanding
	 */
	public final java.lang.Boolean getExpanding(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.Expanding.toString());
	}

	/**
	 * Set value of Expanding
	 * @param expanding
	 */
	public final void setExpanding(java.lang.Boolean expanding)
	{
		setExpanding(getContext(), expanding);
	}

	/**
	 * Set value of Expanding
	 * @param context
	 * @param expanding
	 */
	public final void setExpanding(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean expanding)
	{
		getMendixObject().setValue(context, MemberNames.Expanding.toString(), expanding);
	}

	/**
	 * @return value of ModalCustom
	 */
	public final java.lang.Boolean getModalCustom()
	{
		return getModalCustom(getContext());
	}

	/**
	 * @param context
	 * @return value of ModalCustom
	 */
	public final java.lang.Boolean getModalCustom(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.ModalCustom.toString());
	}

	/**
	 * Set value of ModalCustom
	 * @param modalcustom
	 */
	public final void setModalCustom(java.lang.Boolean modalcustom)
	{
		setModalCustom(getContext(), modalcustom);
	}

	/**
	 * Set value of ModalCustom
	 * @param context
	 * @param modalcustom
	 */
	public final void setModalCustom(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean modalcustom)
	{
		getMendixObject().setValue(context, MemberNames.ModalCustom.toString(), modalcustom);
	}

	/**
	 * @return value of ModalCustomHeader
	 */
	public final java.lang.Boolean getModalCustomHeader()
	{
		return getModalCustomHeader(getContext());
	}

	/**
	 * @param context
	 * @return value of ModalCustomHeader
	 */
	public final java.lang.Boolean getModalCustomHeader(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.ModalCustomHeader.toString());
	}

	/**
	 * Set value of ModalCustomHeader
	 * @param modalcustomheader
	 */
	public final void setModalCustomHeader(java.lang.Boolean modalcustomheader)
	{
		setModalCustomHeader(getContext(), modalcustomheader);
	}

	/**
	 * Set value of ModalCustomHeader
	 * @param context
	 * @param modalcustomheader
	 */
	public final void setModalCustomHeader(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean modalcustomheader)
	{
		getMendixObject().setValue(context, MemberNames.ModalCustomHeader.toString(), modalcustomheader);
	}

	/**
	 * @return value of ModalCustomHeaderLarge
	 */
	public final java.lang.Boolean getModalCustomHeaderLarge()
	{
		return getModalCustomHeaderLarge(getContext());
	}

	/**
	 * @param context
	 * @return value of ModalCustomHeaderLarge
	 */
	public final java.lang.Boolean getModalCustomHeaderLarge(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.ModalCustomHeaderLarge.toString());
	}

	/**
	 * Set value of ModalCustomHeaderLarge
	 * @param modalcustomheaderlarge
	 */
	public final void setModalCustomHeaderLarge(java.lang.Boolean modalcustomheaderlarge)
	{
		setModalCustomHeaderLarge(getContext(), modalcustomheaderlarge);
	}

	/**
	 * Set value of ModalCustomHeaderLarge
	 * @param context
	 * @param modalcustomheaderlarge
	 */
	public final void setModalCustomHeaderLarge(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean modalcustomheaderlarge)
	{
		getMendixObject().setValue(context, MemberNames.ModalCustomHeaderLarge.toString(), modalcustomheaderlarge);
	}

	/**
	 * @return value of ModalCustomHeaderScroll
	 */
	public final java.lang.Boolean getModalCustomHeaderScroll()
	{
		return getModalCustomHeaderScroll(getContext());
	}

	/**
	 * @param context
	 * @return value of ModalCustomHeaderScroll
	 */
	public final java.lang.Boolean getModalCustomHeaderScroll(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.ModalCustomHeaderScroll.toString());
	}

	/**
	 * Set value of ModalCustomHeaderScroll
	 * @param modalcustomheaderscroll
	 */
	public final void setModalCustomHeaderScroll(java.lang.Boolean modalcustomheaderscroll)
	{
		setModalCustomHeaderScroll(getContext(), modalcustomheaderscroll);
	}

	/**
	 * Set value of ModalCustomHeaderScroll
	 * @param context
	 * @param modalcustomheaderscroll
	 */
	public final void setModalCustomHeaderScroll(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean modalcustomheaderscroll)
	{
		getMendixObject().setValue(context, MemberNames.ModalCustomHeaderScroll.toString(), modalcustomheaderscroll);
	}

	/**
	 * @return value of GalleryNative
	 */
	public final java.lang.Boolean getGalleryNative()
	{
		return getGalleryNative(getContext());
	}

	/**
	 * @param context
	 * @return value of GalleryNative
	 */
	public final java.lang.Boolean getGalleryNative(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.GalleryNative.toString());
	}

	/**
	 * Set value of GalleryNative
	 * @param gallerynative
	 */
	public final void setGalleryNative(java.lang.Boolean gallerynative)
	{
		setGalleryNative(getContext(), gallerynative);
	}

	/**
	 * Set value of GalleryNative
	 * @param context
	 * @param gallerynative
	 */
	public final void setGalleryNative(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean gallerynative)
	{
		getMendixObject().setValue(context, MemberNames.GalleryNative.toString(), gallerynative);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return bottomSheetMendixObject;
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
			final atlas_designsystem.proxies.BottomSheet that = (atlas_designsystem.proxies.BottomSheet) obj;
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