package orm_learn;


import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import orm_learn.model.Country;
import orm_learn.service.CountryService;


@SpringBootApplication
public class OrmLearnApplication {


private static CountryService service;


public static void main(String[] args) {


ApplicationContext context =
SpringApplication.run(OrmLearnApplication.class,args);



service =
context.getBean(CountryService.class);



List<Country> countries =
service.getAllCountries();



System.out.println(countries);


}

}