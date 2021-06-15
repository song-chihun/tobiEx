import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RexFactory {
	
	@Bean
	public Rex rex(){
		Rex rex = new Rex();
		return rex;
	}
	
}
