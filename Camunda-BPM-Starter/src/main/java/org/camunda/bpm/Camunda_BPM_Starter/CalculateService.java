package org.camunda.bpm.Camunda_BPM_Starter;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class CalculateService implements JavaDelegate {

	@Override
	public void execute(DelegateExecution arg0) throws Exception {
		
		System.out.println("Spring Bean invoked.");
		
	}

}
