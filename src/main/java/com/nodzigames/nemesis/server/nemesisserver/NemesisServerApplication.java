package com.nodzigames.nemesis.server.nemesisserver;

import com.nodzigames.nemesis.server.nemesisserver.algorithms.PoolNameGenerator;
import com.nodzigames.nemesis.server.nemesisserver.client.Client;
import com.nodzigames.nemesis.server.nemesisserver.client.ClientDatabase;
import com.nodzigames.nemesis.server.nemesisserver.logic.TickerHour;
import com.nodzigames.nemesis.server.nemesisserver.logic.TickerMinute;
import com.nodzigames.nemesis.server.nemesisserver.pool.PoolDatabase;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Timer;

@SpringBootApplication
public class NemesisServerApplication {

	public static ClientDatabase clientDatabase;
	public static PoolDatabase poolDatabase;

	public static void main(String[] args) {
		SpringApplication.run(NemesisServerApplication.class, args);

		clientDatabase = new ClientDatabase();
		poolDatabase = new PoolDatabase();


		Timer timer = new Timer();
		timer.schedule(new TickerMinute(clientDatabase), 0, 60000);
		timer.schedule(new TickerHour(poolDatabase), 0, 3600000);
	}

}
