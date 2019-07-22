import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration

public class BookBeanConfig {
	@Bean
    @Scope("prototype")
		public Book getBookBean(){
			return new Book();
		}
	@Bean
	public Author getAuthorBean(){
		return new Author();
	}
	
	}


