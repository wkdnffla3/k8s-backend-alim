package com.welab.k8s_backend_alim;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class K8sBackendAlimApplication {

	public static void main(String[] args) {
		SpringApplication.run(K8sBackendAlimApplication.class, args);
	}

}
