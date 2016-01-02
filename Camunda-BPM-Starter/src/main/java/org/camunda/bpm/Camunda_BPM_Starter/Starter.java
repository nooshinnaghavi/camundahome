package org.camunda.bpm.Camunda_BPM_Starter;

import org.camunda.bpm.engine.RuntimeService;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;

public class Starter implements InitializingBean{
	

    @Autowired
    private RuntimeService runtimeService;

	@Override
	public void afterPropertiesSet() throws Exception {
		runtimeService.startProcessInstanceByKey("Camunda-BPM-Starter");
	}
	
	public void setRuntimeService(RuntimeService runtimeService) {
	    this.runtimeService = runtimeService;
	}
}
