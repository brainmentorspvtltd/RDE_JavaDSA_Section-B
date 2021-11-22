import java.text.NumberFormat;
import java.util.Locale;

public class CommonUtils {
	
	public String getProperName(String name) {
		String names[] = name.split(" ");
		String properName = "";
		for(String n : names) {
			properName += String.valueOf(n.charAt(0)).toUpperCase() + 
					n.substring(1).toLowerCase() + " ";
		}
		return properName;
	}
	
	public String getSalaryFormat(double salary) {
		Locale locale = new Locale("en", "IN");
		NumberFormat nf = NumberFormat.getCurrencyInstance(locale);
		String formatSalary = nf.format(salary);
		return formatSalary;
	}

}
