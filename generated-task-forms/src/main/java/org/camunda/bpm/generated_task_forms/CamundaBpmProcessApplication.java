package org.camunda.bpm.generated_task_forms;

import java.util.HashMap;
import java.util.Map;

import org.camunda.bpm.application.PostDeploy;
import org.camunda.bpm.application.ProcessApplication;
import org.camunda.bpm.application.impl.ServletProcessApplication;
import org.camunda.bpm.engine.ProcessEngine;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Process Application exposing this application's resources the process engine. 
 */
@ProcessApplication
public class CamundaBpmProcessApplication extends ServletProcessApplication {

  private static final String PROCESS_DEFINITION_KEY = "generated-task-forms";

  /**
   * In a @PostDeploy Hook you can interact with the process engine and access 
   * the processes the application has deployed. 
   */
  @PostDeploy
  public void onDeploymentFinished(ProcessEngine processEngine) {
	  
	  ApplicationContext context = 
	             new ClassPathXmlApplicationContext("Beans.xml");

    // start an initial process instance
//    Map<String, Object> variables = new HashMap<String, Object>();
//    variables.put("name", "John");
//    
//    processEngine.getRuntimeService().startProcessInstanceByKey(PROCESS_DEFINITION_KEY, variables);
  }

}
