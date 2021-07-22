// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package system.proxies;

public class WorkflowTaskInstance
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject workflowTaskInstanceMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "System.WorkflowTaskInstance";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Outcome("Outcome"),
		StartTime("StartTime"),
		EndTime("EndTime"),
		State("State"),
		Reason("Reason"),
		TaskInstance_WorkflowInstance("System.TaskInstance_WorkflowInstance"),
		TaskInstance_TaskDefinition("System.TaskInstance_TaskDefinition");

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

	public WorkflowTaskInstance(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "System.WorkflowTaskInstance"));
	}

	protected WorkflowTaskInstance(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject workflowTaskInstanceMendixObject)
	{
		if (workflowTaskInstanceMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("System.WorkflowTaskInstance", workflowTaskInstanceMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a System.WorkflowTaskInstance");

		this.workflowTaskInstanceMendixObject = workflowTaskInstanceMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'WorkflowTaskInstance.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static system.proxies.WorkflowTaskInstance initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return system.proxies.WorkflowTaskInstance.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static system.proxies.WorkflowTaskInstance initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		if (com.mendix.core.Core.isSubClassOf("System.WorkflowSystemTask", mendixObject.getType()))
			return system.proxies.WorkflowSystemTask.initialize(context, mendixObject);

		if (com.mendix.core.Core.isSubClassOf("System.WorkflowUserTask", mendixObject.getType()))
			return system.proxies.WorkflowUserTask.initialize(context, mendixObject);

		return new system.proxies.WorkflowTaskInstance(context, mendixObject);
	}

	public static system.proxies.WorkflowTaskInstance load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return system.proxies.WorkflowTaskInstance.initialize(context, mendixObject);
	}

	public static java.util.List<? extends system.proxies.WorkflowTaskInstance> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<system.proxies.WorkflowTaskInstance> result = new java.util.ArrayList<system.proxies.WorkflowTaskInstance>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//System.WorkflowTaskInstance" + xpathConstraint))
			result.add(system.proxies.WorkflowTaskInstance.initialize(context, obj));
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
	 * @return value of Outcome
	 */
	public final java.lang.String getOutcome()
	{
		return getOutcome(getContext());
	}

	/**
	 * @param context
	 * @return value of Outcome
	 */
	public final java.lang.String getOutcome(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Outcome.toString());
	}

	/**
	 * Set value of Outcome
	 * @param outcome
	 */
	public final void setOutcome(java.lang.String outcome)
	{
		setOutcome(getContext(), outcome);
	}

	/**
	 * Set value of Outcome
	 * @param context
	 * @param outcome
	 */
	public final void setOutcome(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String outcome)
	{
		getMendixObject().setValue(context, MemberNames.Outcome.toString(), outcome);
	}

	/**
	 * @return value of StartTime
	 */
	public final java.util.Date getStartTime()
	{
		return getStartTime(getContext());
	}

	/**
	 * @param context
	 * @return value of StartTime
	 */
	public final java.util.Date getStartTime(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.StartTime.toString());
	}

	/**
	 * Set value of StartTime
	 * @param starttime
	 */
	public final void setStartTime(java.util.Date starttime)
	{
		setStartTime(getContext(), starttime);
	}

	/**
	 * Set value of StartTime
	 * @param context
	 * @param starttime
	 */
	public final void setStartTime(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date starttime)
	{
		getMendixObject().setValue(context, MemberNames.StartTime.toString(), starttime);
	}

	/**
	 * @return value of EndTime
	 */
	public final java.util.Date getEndTime()
	{
		return getEndTime(getContext());
	}

	/**
	 * @param context
	 * @return value of EndTime
	 */
	public final java.util.Date getEndTime(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.EndTime.toString());
	}

	/**
	 * Set value of EndTime
	 * @param endtime
	 */
	public final void setEndTime(java.util.Date endtime)
	{
		setEndTime(getContext(), endtime);
	}

	/**
	 * Set value of EndTime
	 * @param context
	 * @param endtime
	 */
	public final void setEndTime(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date endtime)
	{
		getMendixObject().setValue(context, MemberNames.EndTime.toString(), endtime);
	}

	/**
	 * Set value of State
	 * @param state
	 */
	public final system.proxies.WorkflowTaskState getState()
	{
		return getState(getContext());
	}

	/**
	 * @param context
	 * @return value of State
	 */
	public final system.proxies.WorkflowTaskState getState(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.State.toString());
		if (obj == null)
			return null;

		return system.proxies.WorkflowTaskState.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of State
	 * @param state
	 */
	public final void setState(system.proxies.WorkflowTaskState state)
	{
		setState(getContext(), state);
	}

	/**
	 * Set value of State
	 * @param context
	 * @param state
	 */
	public final void setState(com.mendix.systemwideinterfaces.core.IContext context, system.proxies.WorkflowTaskState state)
	{
		if (state != null)
			getMendixObject().setValue(context, MemberNames.State.toString(), state.toString());
		else
			getMendixObject().setValue(context, MemberNames.State.toString(), null);
	}

	/**
	 * @return value of Reason
	 */
	public final java.lang.String getReason()
	{
		return getReason(getContext());
	}

	/**
	 * @param context
	 * @return value of Reason
	 */
	public final java.lang.String getReason(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Reason.toString());
	}

	/**
	 * Set value of Reason
	 * @param reason
	 */
	public final void setReason(java.lang.String reason)
	{
		setReason(getContext(), reason);
	}

	/**
	 * Set value of Reason
	 * @param context
	 * @param reason
	 */
	public final void setReason(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String reason)
	{
		getMendixObject().setValue(context, MemberNames.Reason.toString(), reason);
	}

	/**
	 * @return value of TaskInstance_WorkflowInstance
	 */
	public final system.proxies.WorkflowInstance getTaskInstance_WorkflowInstance() throws com.mendix.core.CoreException
	{
		return getTaskInstance_WorkflowInstance(getContext());
	}

	/**
	 * @param context
	 * @return value of TaskInstance_WorkflowInstance
	 */
	public final system.proxies.WorkflowInstance getTaskInstance_WorkflowInstance(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		system.proxies.WorkflowInstance result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.TaskInstance_WorkflowInstance.toString());
		if (identifier != null)
			result = system.proxies.WorkflowInstance.load(context, identifier);
		return result;
	}

	/**
	 * Set value of TaskInstance_WorkflowInstance
	 * @param taskinstance_workflowinstance
	 */
	public final void setTaskInstance_WorkflowInstance(system.proxies.WorkflowInstance taskinstance_workflowinstance)
	{
		setTaskInstance_WorkflowInstance(getContext(), taskinstance_workflowinstance);
	}

	/**
	 * Set value of TaskInstance_WorkflowInstance
	 * @param context
	 * @param taskinstance_workflowinstance
	 */
	public final void setTaskInstance_WorkflowInstance(com.mendix.systemwideinterfaces.core.IContext context, system.proxies.WorkflowInstance taskinstance_workflowinstance)
	{
		if (taskinstance_workflowinstance == null)
			getMendixObject().setValue(context, MemberNames.TaskInstance_WorkflowInstance.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.TaskInstance_WorkflowInstance.toString(), taskinstance_workflowinstance.getMendixObject().getId());
	}

	/**
	 * @return value of TaskInstance_TaskDefinition
	 */
	public final system.proxies.WorkflowTaskDefinition getTaskInstance_TaskDefinition() throws com.mendix.core.CoreException
	{
		return getTaskInstance_TaskDefinition(getContext());
	}

	/**
	 * @param context
	 * @return value of TaskInstance_TaskDefinition
	 */
	public final system.proxies.WorkflowTaskDefinition getTaskInstance_TaskDefinition(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		system.proxies.WorkflowTaskDefinition result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.TaskInstance_TaskDefinition.toString());
		if (identifier != null)
			result = system.proxies.WorkflowTaskDefinition.load(context, identifier);
		return result;
	}

	/**
	 * Set value of TaskInstance_TaskDefinition
	 * @param taskinstance_taskdefinition
	 */
	public final void setTaskInstance_TaskDefinition(system.proxies.WorkflowTaskDefinition taskinstance_taskdefinition)
	{
		setTaskInstance_TaskDefinition(getContext(), taskinstance_taskdefinition);
	}

	/**
	 * Set value of TaskInstance_TaskDefinition
	 * @param context
	 * @param taskinstance_taskdefinition
	 */
	public final void setTaskInstance_TaskDefinition(com.mendix.systemwideinterfaces.core.IContext context, system.proxies.WorkflowTaskDefinition taskinstance_taskdefinition)
	{
		if (taskinstance_taskdefinition == null)
			getMendixObject().setValue(context, MemberNames.TaskInstance_TaskDefinition.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.TaskInstance_TaskDefinition.toString(), taskinstance_taskdefinition.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return workflowTaskInstanceMendixObject;
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
			final system.proxies.WorkflowTaskInstance that = (system.proxies.WorkflowTaskInstance) obj;
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
		return "System.WorkflowTaskInstance";
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
