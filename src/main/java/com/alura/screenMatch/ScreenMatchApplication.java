package com.alura.screenMatch;

import com.alura.screenMatch.models.SeriesData;
import com.alura.screenMatch.services.ConvertData;
import com.alura.screenMatch.services.consumeAPI;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenMatchApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreenMatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		var consumeApi = new consumeAPI();
		var json = consumeApi.getData("https://www.omdbapi.com/?t=gilmore+girls&apikey=b12a8783");
		System.out.println(json);

		ConvertData convert = new ConvertData();
		SeriesData dados = convert.getDatas(json, SeriesData.class);
		System.out.println(dados);
	}
}
