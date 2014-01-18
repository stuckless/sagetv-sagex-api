package sagex.plugin;

/**
 * A property validator can be set on a property and it will be called immediately BEFORE setting the new value 
 * into the configuration.  If you need to validate a value BEFORE it is set, then you can do it here.
 * 
 * @author seans
 */
public interface IPropertyValidator {
	/**
	 * validate that the given property value is correct.  Thrown an exception with a message if it's wrong.
	 * 
	 * @param setting  configuration setting
	 * @param value configuration value to be set
	 * @throws Exception
	 */
	public void validate(String setting, String value) throws Exception;
}
