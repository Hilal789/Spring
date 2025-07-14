package com.nit.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Launcher {

	@Autowired
	private Rocket rocket;
	
	
    //@Autowired
	public Launcher(Rocket rocket) {
		super();
		this.rocket = rocket;
		System.out.println("Launcher.Launcher(-)");
	}

	public Launcher() {
		super();
		System.out.println("Constructor :: Launcher");
	}

	//@Autowired
	public void setRocket(Rocket rocket) {
		this.rocket = rocket;
		System.out.println("Setter Injection");
	}

	public void launch() {
		rocket.ignite("full");

	}

}
