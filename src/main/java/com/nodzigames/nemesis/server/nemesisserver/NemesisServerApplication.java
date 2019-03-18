package com.nodzigames.nemesis.server.nemesisserver;

import com.nodzigames.nemesis.server.nemesisserver.client.Client;
import com.nodzigames.nemesis.server.nemesisserver.client.ClientDatabase;
import com.nodzigames.nemesis.server.nemesisserver.logic.TickerMinute;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Timer;

@SpringBootApplication
public class NemesisServerApplication {

	public static ClientDatabase clientDatabase;

	public static void main(String[] args) {
		SpringApplication.run(NemesisServerApplication.class, args);

		clientDatabase = new ClientDatabase();

		Timer timer = new Timer();
		timer.schedule(new TickerMinute(clientDatabase), 0, 60000);
	}

}
