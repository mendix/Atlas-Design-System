// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package atlas_ui_data.proxies;

public class AtlasPeople extends system.proxies.Image
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "Atlas_UI_Data.AtlasPeople";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		FirstName("FirstName"),
		LastName("LastName"),
		Phonenumber("Phonenumber"),
		Email("Email"),
		Birthday("Birthday"),
		Bio("Bio"),
		Task("Task"),
		JobTitle("JobTitle"),
		Department("Department"),
		CardNumber("CardNumber"),
		CardExpiryMonth("CardExpiryMonth"),
		CardExpiryYear("CardExpiryYear"),
		CCV("CCV"),
		Country("Country"),
		City("City"),
		Address("Address"),
		Zipcode("Zipcode"),
		Status("Status"),
		PublicThumbnailPath("PublicThumbnailPath"),
		FileID("FileID"),
		Name("Name"),
		DeleteAfterDownload("DeleteAfterDownload"),
		Contents("Contents"),
		HasContents("HasContents"),
		Size("Size");

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

	public AtlasPeople(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "Atlas_UI_Data.AtlasPeople"));
	}

	protected AtlasPeople(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject atlasPeopleMendixObject)
	{
		super(context, atlasPeopleMendixObject);
		if (!com.mendix.core.Core.isSubClassOf("Atlas_UI_Data.AtlasPeople", atlasPeopleMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a Atlas_UI_Data.AtlasPeople");
	}

	/**
	 * @deprecated Use 'AtlasPeople.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static atlas_ui_data.proxies.AtlasPeople initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return atlas_ui_data.proxies.AtlasPeople.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static atlas_ui_data.proxies.AtlasPeople initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new atlas_ui_data.proxies.AtlasPeople(context, mendixObject);
	}

	public static atlas_ui_data.proxies.AtlasPeople load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return atlas_ui_data.proxies.AtlasPeople.initialize(context, mendixObject);
	}

	public static java.util.List<atlas_ui_data.proxies.AtlasPeople> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<atlas_ui_data.proxies.AtlasPeople> result = new java.util.ArrayList<atlas_ui_data.proxies.AtlasPeople>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//Atlas_UI_Data.AtlasPeople" + xpathConstraint))
			result.add(atlas_ui_data.proxies.AtlasPeople.initialize(context, obj));
		return result;
	}

	/**
	 * @return value of FirstName
	 */
	public final java.lang.String getFirstName()
	{
		return getFirstName(getContext());
	}

	/**
	 * @param context
	 * @return value of FirstName
	 */
	public final java.lang.String getFirstName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.FirstName.toString());
	}

	/**
	 * Set value of FirstName
	 * @param firstname
	 */
	public final void setFirstName(java.lang.String firstname)
	{
		setFirstName(getContext(), firstname);
	}

	/**
	 * Set value of FirstName
	 * @param context
	 * @param firstname
	 */
	public final void setFirstName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String firstname)
	{
		getMendixObject().setValue(context, MemberNames.FirstName.toString(), firstname);
	}

	/**
	 * @return value of LastName
	 */
	public final java.lang.String getLastName()
	{
		return getLastName(getContext());
	}

	/**
	 * @param context
	 * @return value of LastName
	 */
	public final java.lang.String getLastName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.LastName.toString());
	}

	/**
	 * Set value of LastName
	 * @param lastname
	 */
	public final void setLastName(java.lang.String lastname)
	{
		setLastName(getContext(), lastname);
	}

	/**
	 * Set value of LastName
	 * @param context
	 * @param lastname
	 */
	public final void setLastName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String lastname)
	{
		getMendixObject().setValue(context, MemberNames.LastName.toString(), lastname);
	}

	/**
	 * @return value of Phonenumber
	 */
	public final java.lang.String getPhonenumber()
	{
		return getPhonenumber(getContext());
	}

	/**
	 * @param context
	 * @return value of Phonenumber
	 */
	public final java.lang.String getPhonenumber(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Phonenumber.toString());
	}

	/**
	 * Set value of Phonenumber
	 * @param phonenumber
	 */
	public final void setPhonenumber(java.lang.String phonenumber)
	{
		setPhonenumber(getContext(), phonenumber);
	}

	/**
	 * Set value of Phonenumber
	 * @param context
	 * @param phonenumber
	 */
	public final void setPhonenumber(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String phonenumber)
	{
		getMendixObject().setValue(context, MemberNames.Phonenumber.toString(), phonenumber);
	}

	/**
	 * @return value of Email
	 */
	public final java.lang.String getEmail()
	{
		return getEmail(getContext());
	}

	/**
	 * @param context
	 * @return value of Email
	 */
	public final java.lang.String getEmail(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Email.toString());
	}

	/**
	 * Set value of Email
	 * @param email
	 */
	public final void setEmail(java.lang.String email)
	{
		setEmail(getContext(), email);
	}

	/**
	 * Set value of Email
	 * @param context
	 * @param email
	 */
	public final void setEmail(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String email)
	{
		getMendixObject().setValue(context, MemberNames.Email.toString(), email);
	}

	/**
	 * @return value of Birthday
	 */
	public final java.util.Date getBirthday()
	{
		return getBirthday(getContext());
	}

	/**
	 * @param context
	 * @return value of Birthday
	 */
	public final java.util.Date getBirthday(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.Birthday.toString());
	}

	/**
	 * Set value of Birthday
	 * @param birthday
	 */
	public final void setBirthday(java.util.Date birthday)
	{
		setBirthday(getContext(), birthday);
	}

	/**
	 * Set value of Birthday
	 * @param context
	 * @param birthday
	 */
	public final void setBirthday(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date birthday)
	{
		getMendixObject().setValue(context, MemberNames.Birthday.toString(), birthday);
	}

	/**
	 * @return value of Bio
	 */
	public final java.lang.String getBio()
	{
		return getBio(getContext());
	}

	/**
	 * @param context
	 * @return value of Bio
	 */
	public final java.lang.String getBio(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Bio.toString());
	}

	/**
	 * Set value of Bio
	 * @param bio
	 */
	public final void setBio(java.lang.String bio)
	{
		setBio(getContext(), bio);
	}

	/**
	 * Set value of Bio
	 * @param context
	 * @param bio
	 */
	public final void setBio(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String bio)
	{
		getMendixObject().setValue(context, MemberNames.Bio.toString(), bio);
	}

	/**
	 * @return value of Task
	 */
	public final java.lang.Boolean getTask()
	{
		return getTask(getContext());
	}

	/**
	 * @param context
	 * @return value of Task
	 */
	public final java.lang.Boolean getTask(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.Task.toString());
	}

	/**
	 * Set value of Task
	 * @param task
	 */
	public final void setTask(java.lang.Boolean task)
	{
		setTask(getContext(), task);
	}

	/**
	 * Set value of Task
	 * @param context
	 * @param task
	 */
	public final void setTask(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean task)
	{
		getMendixObject().setValue(context, MemberNames.Task.toString(), task);
	}

	/**
	 * @return value of JobTitle
	 */
	public final java.lang.String getJobTitle()
	{
		return getJobTitle(getContext());
	}

	/**
	 * @param context
	 * @return value of JobTitle
	 */
	public final java.lang.String getJobTitle(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.JobTitle.toString());
	}

	/**
	 * Set value of JobTitle
	 * @param jobtitle
	 */
	public final void setJobTitle(java.lang.String jobtitle)
	{
		setJobTitle(getContext(), jobtitle);
	}

	/**
	 * Set value of JobTitle
	 * @param context
	 * @param jobtitle
	 */
	public final void setJobTitle(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String jobtitle)
	{
		getMendixObject().setValue(context, MemberNames.JobTitle.toString(), jobtitle);
	}

	/**
	 * Set value of Department
	 * @param department
	 */
	public final atlas_ui_data.proxies.Departments getDepartment()
	{
		return getDepartment(getContext());
	}

	/**
	 * @param context
	 * @return value of Department
	 */
	public final atlas_ui_data.proxies.Departments getDepartment(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.Department.toString());
		if (obj == null)
			return null;

		return atlas_ui_data.proxies.Departments.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of Department
	 * @param department
	 */
	public final void setDepartment(atlas_ui_data.proxies.Departments department)
	{
		setDepartment(getContext(), department);
	}

	/**
	 * Set value of Department
	 * @param context
	 * @param department
	 */
	public final void setDepartment(com.mendix.systemwideinterfaces.core.IContext context, atlas_ui_data.proxies.Departments department)
	{
		if (department != null)
			getMendixObject().setValue(context, MemberNames.Department.toString(), department.toString());
		else
			getMendixObject().setValue(context, MemberNames.Department.toString(), null);
	}

	/**
	 * @return value of CardNumber
	 */
	public final java.lang.String getCardNumber()
	{
		return getCardNumber(getContext());
	}

	/**
	 * @param context
	 * @return value of CardNumber
	 */
	public final java.lang.String getCardNumber(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.CardNumber.toString());
	}

	/**
	 * Set value of CardNumber
	 * @param cardnumber
	 */
	public final void setCardNumber(java.lang.String cardnumber)
	{
		setCardNumber(getContext(), cardnumber);
	}

	/**
	 * Set value of CardNumber
	 * @param context
	 * @param cardnumber
	 */
	public final void setCardNumber(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String cardnumber)
	{
		getMendixObject().setValue(context, MemberNames.CardNumber.toString(), cardnumber);
	}

	/**
	 * @return value of CardExpiryMonth
	 */
	public final java.lang.String getCardExpiryMonth()
	{
		return getCardExpiryMonth(getContext());
	}

	/**
	 * @param context
	 * @return value of CardExpiryMonth
	 */
	public final java.lang.String getCardExpiryMonth(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.CardExpiryMonth.toString());
	}

	/**
	 * Set value of CardExpiryMonth
	 * @param cardexpirymonth
	 */
	public final void setCardExpiryMonth(java.lang.String cardexpirymonth)
	{
		setCardExpiryMonth(getContext(), cardexpirymonth);
	}

	/**
	 * Set value of CardExpiryMonth
	 * @param context
	 * @param cardexpirymonth
	 */
	public final void setCardExpiryMonth(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String cardexpirymonth)
	{
		getMendixObject().setValue(context, MemberNames.CardExpiryMonth.toString(), cardexpirymonth);
	}

	/**
	 * @return value of CardExpiryYear
	 */
	public final java.lang.String getCardExpiryYear()
	{
		return getCardExpiryYear(getContext());
	}

	/**
	 * @param context
	 * @return value of CardExpiryYear
	 */
	public final java.lang.String getCardExpiryYear(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.CardExpiryYear.toString());
	}

	/**
	 * Set value of CardExpiryYear
	 * @param cardexpiryyear
	 */
	public final void setCardExpiryYear(java.lang.String cardexpiryyear)
	{
		setCardExpiryYear(getContext(), cardexpiryyear);
	}

	/**
	 * Set value of CardExpiryYear
	 * @param context
	 * @param cardexpiryyear
	 */
	public final void setCardExpiryYear(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String cardexpiryyear)
	{
		getMendixObject().setValue(context, MemberNames.CardExpiryYear.toString(), cardexpiryyear);
	}

	/**
	 * @return value of CCV
	 */
	public final java.lang.String getCCV()
	{
		return getCCV(getContext());
	}

	/**
	 * @param context
	 * @return value of CCV
	 */
	public final java.lang.String getCCV(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.CCV.toString());
	}

	/**
	 * Set value of CCV
	 * @param ccv
	 */
	public final void setCCV(java.lang.String ccv)
	{
		setCCV(getContext(), ccv);
	}

	/**
	 * Set value of CCV
	 * @param context
	 * @param ccv
	 */
	public final void setCCV(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String ccv)
	{
		getMendixObject().setValue(context, MemberNames.CCV.toString(), ccv);
	}

	/**
	 * @return value of Country
	 */
	public final java.lang.String getCountry()
	{
		return getCountry(getContext());
	}

	/**
	 * @param context
	 * @return value of Country
	 */
	public final java.lang.String getCountry(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Country.toString());
	}

	/**
	 * Set value of Country
	 * @param country
	 */
	public final void setCountry(java.lang.String country)
	{
		setCountry(getContext(), country);
	}

	/**
	 * Set value of Country
	 * @param context
	 * @param country
	 */
	public final void setCountry(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String country)
	{
		getMendixObject().setValue(context, MemberNames.Country.toString(), country);
	}

	/**
	 * @return value of City
	 */
	public final java.lang.String getCity()
	{
		return getCity(getContext());
	}

	/**
	 * @param context
	 * @return value of City
	 */
	public final java.lang.String getCity(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.City.toString());
	}

	/**
	 * Set value of City
	 * @param city
	 */
	public final void setCity(java.lang.String city)
	{
		setCity(getContext(), city);
	}

	/**
	 * Set value of City
	 * @param context
	 * @param city
	 */
	public final void setCity(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String city)
	{
		getMendixObject().setValue(context, MemberNames.City.toString(), city);
	}

	/**
	 * @return value of Address
	 */
	public final java.lang.String getAddress()
	{
		return getAddress(getContext());
	}

	/**
	 * @param context
	 * @return value of Address
	 */
	public final java.lang.String getAddress(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Address.toString());
	}

	/**
	 * Set value of Address
	 * @param address
	 */
	public final void setAddress(java.lang.String address)
	{
		setAddress(getContext(), address);
	}

	/**
	 * Set value of Address
	 * @param context
	 * @param address
	 */
	public final void setAddress(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String address)
	{
		getMendixObject().setValue(context, MemberNames.Address.toString(), address);
	}

	/**
	 * @return value of Zipcode
	 */
	public final java.lang.String getZipcode()
	{
		return getZipcode(getContext());
	}

	/**
	 * @param context
	 * @return value of Zipcode
	 */
	public final java.lang.String getZipcode(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Zipcode.toString());
	}

	/**
	 * Set value of Zipcode
	 * @param zipcode
	 */
	public final void setZipcode(java.lang.String zipcode)
	{
		setZipcode(getContext(), zipcode);
	}

	/**
	 * Set value of Zipcode
	 * @param context
	 * @param zipcode
	 */
	public final void setZipcode(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String zipcode)
	{
		getMendixObject().setValue(context, MemberNames.Zipcode.toString(), zipcode);
	}

	/**
	 * Set value of Status
	 * @param status
	 */
	public final atlas_ui_data.proxies.Status getStatus()
	{
		return getStatus(getContext());
	}

	/**
	 * @param context
	 * @return value of Status
	 */
	public final atlas_ui_data.proxies.Status getStatus(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.Status.toString());
		if (obj == null)
			return null;

		return atlas_ui_data.proxies.Status.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of Status
	 * @param status
	 */
	public final void setStatus(atlas_ui_data.proxies.Status status)
	{
		setStatus(getContext(), status);
	}

	/**
	 * Set value of Status
	 * @param context
	 * @param status
	 */
	public final void setStatus(com.mendix.systemwideinterfaces.core.IContext context, atlas_ui_data.proxies.Status status)
	{
		if (status != null)
			getMendixObject().setValue(context, MemberNames.Status.toString(), status.toString());
		else
			getMendixObject().setValue(context, MemberNames.Status.toString(), null);
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final atlas_ui_data.proxies.AtlasPeople that = (atlas_ui_data.proxies.AtlasPeople) obj;
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
		return "Atlas_UI_Data.AtlasPeople";
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
