package com.rama.EmpDetailsConfig;

import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpConfigController implements EnvironmentAware{

	private String name;
	
	@Override
	public void setEnvironment(Environment environment) {
		this.name = environment.getProperty("emp_name");
	}

    @RequestMapping("/")
    public String greet() {
        return "Hello " + name + " !!";
    }

}
