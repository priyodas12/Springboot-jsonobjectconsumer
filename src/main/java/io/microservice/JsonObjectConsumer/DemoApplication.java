package io.microservice.JsonObjectConsumer;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.microservice.JsonObjectConsumer.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@ComponentScan("io.microservice.JsonObjectConsumer.model")
public class DemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);



		ObjectMapper mapper=new ObjectMapper();
		mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);

		InputStream inputStream= null;
		try {
			inputStream = new FileInputStream(new File("C:\\Users\\Priyo\\Desktop\\Customer.json"));
			TypeReference<List<Customer>> listTypeReference=new TypeReference<List<Customer>>(){};
			List<Customer> customerList=mapper.readValue(inputStream,listTypeReference);
			customerList.parallelStream().forEach(System.out::println);
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFoundException");
			e.printStackTrace();
		}
		catch (JsonParseException e) {
			System.out.println("JsonParseException");
			e.printStackTrace();
		}
		catch (JsonMappingException e) {
			System.out.println("JsonMappingException");
			e.printStackTrace();
		}
		catch (IOException e) {
			System.out.println("IOException");
			e.printStackTrace();
		}




	}

}
