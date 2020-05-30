package com.qcl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import javax.sound.midi.Soundbank;

@SpringBootApplication
@EnableJpaAuditing
public class DianCanApplication {

	public static void main(String[] args) {
		System.out.println("点餐后台开始启动。。。");
		SpringApplication.run(DianCanApplication.class, args);
	}
}
