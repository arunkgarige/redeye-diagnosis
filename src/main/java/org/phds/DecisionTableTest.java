package org.phds;

import org.drools.decisiontable.InputType;
import org.drools.decisiontable.SpreadsheetCompiler;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.phds.schema.Patient;
import org.phds.schema.constants.EyeLidStatus;
import org.phds.schema.constants.MedicalHistory;

public class DecisionTableTest {

	public void processRedEye() {

		KieServices ks = KieServices.Factory.get();
		KieContainer kContainer = ks.getKieClasspathContainer();
		KieSession kSession = kContainer
				.newKieSession("PersonalHealthDiagnosys-RedEye");
		Patient patient = new Patient("1");
		Patient patient2 = new Patient("1");

		patient.setEyeLidStatus(EyeLidStatus.NORMAL);
		patient2.setEyeLidStatus(EyeLidStatus.AB_NORMAL);
		//patient.set
		patient.setHistory(MedicalHistory.TRAUMA);
		patient2.setHistory(MedicalHistory.SURGERY);

		kSession.insert(patient);
		kSession.insert(patient2);
		kSession.fireAllRules();

		SpreadsheetCompiler compiler = new SpreadsheetCompiler();
		String drl = compiler
				.compile(
						DecisionTableTest.class
								.getResourceAsStream("/org/phds/dtables/PersonalHealthDiagnosys.xls"),
						InputType.XLS);
		System.out.println(drl);
	}

	public static final void main(String[] args) throws Exception {
		DecisionTableTest decisionTableTest = new DecisionTableTest();
		decisionTableTest.processRedEye();
	}

}
