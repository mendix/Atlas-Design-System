// This file was generated by Mendix Studio Pro.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package communitycommons.actions;

import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;
import communitycommons.StringUtils;

/**
 * Returns a random strong password containing a specified minimum number of digits, uppercase and special characters.
 * 
 * Note:Minimumlength should be equal or larger than NrOfCapitalizedCharacters, NrOfDigits and NrOfSpecialCharacters
 */
public class RandomStrongPassword extends CustomJavaAction<java.lang.String>
{
	private final java.lang.Long MinLength;
	private final java.lang.Long MaxLength;
	private final java.lang.Long NrOfCapitalizedCharacters;
	private final java.lang.Long NrOfDigits;
	private final java.lang.Long NrOfSpecialCharacters;

	public RandomStrongPassword(
		IContext context,
		java.lang.Long _minLength,
		java.lang.Long _maxLength,
		java.lang.Long _nrOfCapitalizedCharacters,
		java.lang.Long _nrOfDigits,
		java.lang.Long _nrOfSpecialCharacters
	)
	{
		super(context);
		this.MinLength = _minLength;
		this.MaxLength = _maxLength;
		this.NrOfCapitalizedCharacters = _nrOfCapitalizedCharacters;
		this.NrOfDigits = _nrOfDigits;
		this.NrOfSpecialCharacters = _nrOfSpecialCharacters;
	}

	@java.lang.Override
	public java.lang.String executeAction() throws Exception
	{
		// BEGIN USER CODE
		return StringUtils.randomStrongPassword(safeLongToInt(this.MinLength), safeLongToInt(this.MaxLength), safeLongToInt(this.NrOfCapitalizedCharacters), safeLongToInt(NrOfDigits), safeLongToInt(NrOfSpecialCharacters));
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 * @return a string representation of this action
	 */
	@java.lang.Override
	public java.lang.String toString()
	{
		return "RandomStrongPassword";
	}

	// BEGIN EXTRA CODE
	public static int safeLongToInt(long l) {
		if (l < Integer.MIN_VALUE || l > Integer.MAX_VALUE) {
			throw new IllegalArgumentException(l + " cannot be cast to int without changing its value.");
		}
		return (int) l;
	}
	// END EXTRA CODE
}
