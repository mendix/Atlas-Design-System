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
import com.mendix.systemwideinterfaces.core.UserAction;

/**
 * Retrieve a document from an URL using a HTTP GET request. 
 * - url : the URL to retrieve 
 * - document: the document to store the data into
 * - filename: the filename to store it under. Only for internal use, so it can be an arbitrary filename. 
 * 
 * Example URL: 'http://www.mendix.com/wordpress/wp-content/themes/mendix_new/images/mendix.png'
 * 
 * NOTE: For images, no thumbnail will be generated.
 */
public class storeURLToFileDocument extends UserAction<java.lang.Boolean>
{
	private final java.lang.String url;
	/** @deprecated use document.getMendixObject() instead. */
	@java.lang.Deprecated(forRemoval = true)
	private final IMendixObject __document;
	private final system.proxies.FileDocument document;
	private final java.lang.String filename;

	public storeURLToFileDocument(
		IContext context,
		java.lang.String _url,
		IMendixObject _document,
		java.lang.String _filename
	)
	{
		super(context);
		this.url = _url;
		this.__document = _document;
		this.document = _document == null ? null : system.proxies.FileDocument.initialize(getContext(), _document);
		this.filename = _filename;
	}

	@java.lang.Override
	public java.lang.Boolean executeAction() throws Exception
	{
		// BEGIN USER CODE
		return Misc.storeURLToFileDocument(this.getContext(), url, document.getMendixObject(), filename);
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 * @return a string representation of this action
	 */
	@java.lang.Override
	public java.lang.String toString()
	{
		return "storeURLToFileDocument";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
