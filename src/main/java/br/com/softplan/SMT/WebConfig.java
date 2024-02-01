package br.com.softplan.SMT;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

  @Override
  public void addCorsMappings(CorsRegistry registry) {
    registry.addMapping("/**") // Isto aplicará a política CORS a todas as rotas da sua aplicação
        .allowedOrigins("http://localhost:3000") // Aqui você coloca a origem do seu cliente
        .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS") // Métodos HTTP permitidos
        .allowedHeaders("*") // Permite todos os cabeçalhos
        .allowCredentials(true); // Se você precisar enviar credenciais como cookies ou cabeçalhos de
                                 // autenticação
  }
}
