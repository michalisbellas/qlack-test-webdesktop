package com.eurodyn.qlack.test.webdesktop;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Spring boot application class
 *
 * @author European Dynamics SA.
 */
@SpringBootApplication
@EnableJpaRepositories({"com.eurodyn.qlack.webdesktop.repository"})
@EntityScan({"com.eurodyn.qlack.webdesktop.model"})
@ComponentScan(basePackages = {
        "com.eurodyn.qlack.webdesktop.configuration",
        "com.eurodyn.qlack.webdesktop.mapper",
        "com.eurodyn.qlack.webdesktop.service"
       })
public class QlackTestWebdesktopApplication {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(QlackTestWebdesktopApplication.class);
        app.setBannerMode(Banner.Mode.OFF);
        app.run(args);
    }

}
