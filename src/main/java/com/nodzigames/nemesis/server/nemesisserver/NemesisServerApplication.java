package com.nodzigames.nemesis.server.nemesisserver;

import com.nodzigames.nemesis.server.nemesisserver.client.Client;
import com.nodzigames.nemesis.server.nemesisserver.client.ClientDatabase;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NemesisServerApplication {

	public static ClientDatabase clientDatabase;

	public static void main(String[] args) {
		SpringApplication.run(NemesisServerApplication.class, args);

		clientDatabase = new ClientDatabase();
	}

}
