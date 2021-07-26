// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package atlas_ui_data.proxies;

public enum DefaultEnumeration
{
	Option_1(new java.lang.String[][] { new java.lang.String[] { "en_US", "Option 1" } }),
	Option_2(new java.lang.String[][] { new java.lang.String[] { "en_US", "Option 2" } }),
	Option_3(new java.lang.String[][] { new java.lang.String[] { "en_US", "Option 3" } }),
	Option_4(new java.lang.String[][] { new java.lang.String[] { "en_US", "Option 4" } }),
	Option_5(new java.lang.String[][] { new java.lang.String[] { "en_US", "Option 5" } }),
	Option_6(new java.lang.String[][] { new java.lang.String[] { "en_US", "Option 6" } });

	private java.util.Map<java.lang.String, java.lang.String> captions;

	private DefaultEnumeration(java.lang.String[][] captionStrings)
	{
		this.captions = new java.util.HashMap<java.lang.String, java.lang.String>();
		for (java.lang.String[] captionString : captionStrings)
			captions.put(captionString[0], captionString[1]);
	}

	public java.lang.String getCaption(java.lang.String languageCode)
	{
		if (captions.containsKey(languageCode))
			return captions.get(languageCode);
		return captions.get("en_US");
	}

	public java.lang.String getCaption()
	{
		return captions.get("en_US");
	}
}