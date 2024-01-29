// This file was generated by Mendix Studio Pro.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package communitycommons.actions;

import com.mendix.systemwideinterfaces.core.IMendixObject;
import communitycommons.Misc;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;

/**
 * Clones the contents of one image document into another, and generates a thumbnail as well. 
 * - fileToClone : the source file
 * - cloneTarget : an initialized file document, in which the file will be stored.
 * 
 * Returns true if copied, returns file if the source had no contents, throws exception in any other case.
 * Pre condition: HasContents of the 'fileToClone' need to be set to true, otherwise the action will not copy anything.
 */
public class DuplicateImageDocument extends CustomJavaAction<java.lang.Boolean>
{
	/** @deprecated use fileToClone.getMendixObject() instead. */
	@java.lang.Deprecated(forRemoval = true)
	private final IMendixObject __fileToClone;
	private final system.proxies.Image fileToClone;
	/** @deprecated use cloneTarget.getMendixObject() instead. */
	@java.lang.Deprecated(forRemoval = true)
	private final IMendixObject __cloneTarget;
	private final system.proxies.Image cloneTarget;
	private final java.lang.Long thumbWidth;
	private final java.lang.Long thumbHeight;

	public DuplicateImageDocument(
		IContext context,
		IMendixObject _fileToClone,
		IMendixObject _cloneTarget,
		java.lang.Long _thumbWidth,
		java.lang.Long _thumbHeight
	)
	{
		super(context);
		this.__fileToClone = _fileToClone;
		this.fileToClone = _fileToClone == null ? null : system.proxies.Image.initialize(getContext(), _fileToClone);
		this.__cloneTarget = _cloneTarget;
		this.cloneTarget = _cloneTarget == null ? null : system.proxies.Image.initialize(getContext(), _cloneTarget);
		this.thumbWidth = _thumbWidth;
		this.thumbHeight = _thumbHeight;
	}

	@java.lang.Override
	public java.lang.Boolean executeAction() throws Exception
	{
		// BEGIN USER CODE
		return Misc.duplicateImage(this.getContext(), fileToClone.getMendixObject(), cloneTarget.getMendixObject(), thumbWidth.intValue(), thumbHeight.intValue());
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 * @return a string representation of this action
	 */
	@java.lang.Override
	public java.lang.String toString()
	{
		return "DuplicateImageDocument";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
