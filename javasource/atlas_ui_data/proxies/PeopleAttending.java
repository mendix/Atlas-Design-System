// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package atlas_ui_data.proxies;

public enum PeopleAttending
{
	_1_Guest(new java.lang.String[][] { new java.lang.String[] { "en_US", "1 Person" } }),
	_2_guests(new java.lang.String[][] { new java.lang.String[] { "en_US", "2 People" } }),
	_3_guests(new java.lang.String[][] { new java.lang.String[] { "en_US", "3 People" } }),
	_4_guests(new java.lang.String[][] { new java.lang.String[] { "en_US", "4 People" } }),
	_5_guests(new java.lang.String[][] { new java.lang.String[] { "en_US", "5 People" } });

	private final java.util.Map<java.lang.String, java.lang.String> captions;

	private PeopleAttending(java.lang.String[][] captionStrings)
	{
		this.captions = new java.util.HashMap<>();
		for (java.lang.String[] captionString : captionStrings) {
			captions.put(captionString[0], captionString[1]);
		}
	}

	public java.lang.String getCaption(java.lang.String languageCode)
	{
		return captions.getOrDefault(languageCode, "en_US");
	}

	public java.lang.String getCaption()
	{
		return captions.get("en_US");
	}
}