import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Rex {
	private Pattern nonValidPattern;

	public Pattern getNonValidPattern() {
		return nonValidPattern;
	}

	public void setNonValidPattern(Pattern nonValidPattern) {
		this.nonValidPattern = nonValidPattern;
	}
	
	public void RexInfo(String str){
		
		Matcher matcher = nonValidPattern.matcher(str);
		
		List<String> result = new ArrayList<String>();
		//System.out.println(matcher.find());
		while (matcher.find()) {
			result.add(matcher.group(2));
		}
		
		for(String s : result)
			System.out.println("Result => " + s);
		
	}
}
