import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regularexp {

	public static void main(String[] args) {
		String source = "saritha@gmail.com";
	      String[] tokens = source.split("\\S+|-");  // whitespace(s) or -
	      for (String token : tokens) {
	         System.out.println(token);
	      }

	}

}
