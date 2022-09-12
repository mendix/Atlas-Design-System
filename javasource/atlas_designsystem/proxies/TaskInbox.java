// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package atlas_designsystem.proxies;

public class TaskInbox
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject taskInboxMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "Atlas_DesignSystem.TaskInbox";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Base64("Base64"),
		Title("Title"),
		Subtitle("Subtitle"),
		TaskInbox_TaskInboxImage("Atlas_DesignSystem.TaskInbox_TaskInboxImage");

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

	public TaskInbox(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, entityName));
	}

	protected TaskInbox(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject taskInboxMendixObject)
	{
		if (taskInboxMendixObject == null) {
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		}
		if (!com.mendix.core.Core.isSubClassOf(entityName, taskInboxMendixObject.getType())) {
			throw new java.lang.IllegalArgumentException(String.format("The given object is not a %s", entityName));
		}	

		this.taskInboxMendixObject = taskInboxMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'TaskInbox.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static atlas_designsystem.proxies.TaskInbox initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return atlas_designsystem.proxies.TaskInbox.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 * @param context The context to be used
	 * @param mendixObject The Mendix object for the new instance
	 * @return a new instance of this proxy class
	 */
	public static atlas_designsystem.proxies.TaskInbox initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new atlas_designsystem.proxies.TaskInbox(context, mendixObject);
	}

	public static atlas_designsystem.proxies.TaskInbox load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return atlas_designsystem.proxies.TaskInbox.initialize(context, mendixObject);
	}

	public static java.util.List<atlas_designsystem.proxies.TaskInbox> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		return com.mendix.core.Core.createXPathQuery(String.format("//%1$s%2$s", entityName, xpathConstraint))
			.execute(context)
			.stream()
			.map(obj -> atlas_designsystem.proxies.TaskInbox.initialize(context, obj))
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
	 * @return value of Title
	 */
	public final java.lang.String getTitle()
	{
		return getTitle(getContext());
	}

	/**
	 * @param context
	 * @return value of Title
	 */
	public final java.lang.String getTitle(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Title.toString());
	}

	/**
	 * Set value of Title
	 * @param title
	 */
	public final void setTitle(java.lang.String title)
	{
		setTitle(getContext(), title);
	}

	/**
	 * Set value of Title
	 * @param context
	 * @param title
	 */
	public final void setTitle(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String title)
	{
		getMendixObject().setValue(context, MemberNames.Title.toString(), title);
	}

	/**
	 * @return value of Subtitle
	 */
	public final java.lang.String getSubtitle()
	{
		return getSubtitle(getContext());
	}

	/**
	 * @param context
	 * @return value of Subtitle
	 */
	public final java.lang.String getSubtitle(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Subtitle.toString());
	}

	/**
	 * Set value of Subtitle
	 * @param subtitle
	 */
	public final void setSubtitle(java.lang.String subtitle)
	{
		setSubtitle(getContext(), subtitle);
	}

	/**
	 * Set value of Subtitle
	 * @param context
	 * @param subtitle
	 */
	public final void setSubtitle(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String subtitle)
	{
		getMendixObject().setValue(context, MemberNames.Subtitle.toString(), subtitle);
	}

	/**
	 * @throws com.mendix.core.CoreException
	 * @return value of TaskInbox_TaskInboxImage
	 */
	public final atlas_designsystem.proxies.TaskInboxImage getTaskInbox_TaskInboxImage() throws com.mendix.core.CoreException
	{
		return getTaskInbox_TaskInboxImage(getContext());
	}

	/**
	 * @param context
	 * @return value of TaskInbox_TaskInboxImage
	 * @throws com.mendix.core.CoreException
	 */
	public final atlas_designsystem.proxies.TaskInboxImage getTaskInbox_TaskInboxImage(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		atlas_designsystem.proxies.TaskInboxImage result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.TaskInbox_TaskInboxImage.toString());
		if (identifier != null) {
			result = atlas_designsystem.proxies.TaskInboxImage.load(context, identifier);
		}
		return result;
	}

	/**
	 * Set value of TaskInbox_TaskInboxImage
	 * @param taskinbox_taskinboximage
	 */
	public final void setTaskInbox_TaskInboxImage(atlas_designsystem.proxies.TaskInboxImage taskinbox_taskinboximage)
	{
		setTaskInbox_TaskInboxImage(getContext(), taskinbox_taskinboximage);
	}

	/**
	 * Set value of TaskInbox_TaskInboxImage
	 * @param context
	 * @param taskinbox_taskinboximage
	 */
	public final void setTaskInbox_TaskInboxImage(com.mendix.systemwideinterfaces.core.IContext context, atlas_designsystem.proxies.TaskInboxImage taskinbox_taskinboximage)
	{
		if (taskinbox_taskinboximage == null) {
			getMendixObject().setValue(context, MemberNames.TaskInbox_TaskInboxImage.toString(), null);
		} else {
			getMendixObject().setValue(context, MemberNames.TaskInbox_TaskInboxImage.toString(), taskinbox_taskinboximage.getMendixObject().getId());
		}
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return taskInboxMendixObject;
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
			final atlas_designsystem.proxies.TaskInbox that = (atlas_designsystem.proxies.TaskInbox) obj;
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
