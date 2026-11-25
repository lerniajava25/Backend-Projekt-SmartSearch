import com.example.smartSearch.SmartSearchApplication;
import org.jspecify.annotations.NullMarked;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@NullMarked
public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(SmartSearchApplication.class);
	}

}
