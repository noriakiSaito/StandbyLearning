package com.tuyano.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyBootAppApplication {

	public static void main(String[] args) {

		/* List7-8：開始 */
		//SpringApplication.run(MyBootAppApplication.class, args);
		SpringApplication.run(MyBootAppApplication.class, new String[] { "100" });
		/* List7-8：終了 */

	}

}
