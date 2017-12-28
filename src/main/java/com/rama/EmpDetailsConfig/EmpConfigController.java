package com.rama.EmpDetailsConfig;

import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpConfigController implements EnvironmentAware{

	static final String EMP_NAME = "emp_name";
	private String name;
	
	@Override
	public void setEnvironment(Environment environment) {
		this.name = environment.getProperty(EMP_NAME);
	}

    @RequestMapping("/")
    public String greet() {
        return "Hello " + name + " !!";
    }

}
