/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class CustodyAdministrationApiServiceImpl implements CustodyAdministrationApiService {

	public SDCustodyAdministrationActivateOutputModel activate(SDCustodyAdministrationActivateInputModel request){
		return JsonReader.read("activate-SDCustodyAdministrationActivateOutputModel.json",new TypeReference<SDCustodyAdministrationActivateOutputModel>(){});
	}
	
	public SDCustodyAdministrationConfigureOutputModel configure(String sdReferenceId, SDCustodyAdministrationConfigureInputModel request){
		return JsonReader.read("configure-SDCustodyAdministrationConfigureOutputModel.json",new TypeReference<SDCustodyAdministrationConfigureOutputModel>(){});
	}
	
	public BQSafeKeepingControlOutputModel controlSafekeeping(String sdReferenceId, String crReferenceId, String bqReferenceId, BQSafeKeepingControlInputModel request){
		return JsonReader.read("control-BQSafeKeepingControlOutputModel.json",new TypeReference<BQSafeKeepingControlOutputModel>(){});
	}
	
	public CRCustodyArrangementControlOutputModel control(String sdReferenceId, String crReferenceId, CRCustodyArrangementControlInputModel request){
		return JsonReader.read("control-CRCustodyArrangementControlOutputModel.json",new TypeReference<CRCustodyArrangementControlOutputModel>(){});
	}
	
	public BQFeesExchangeOutputModel exchangeFees(String sdReferenceId, String crReferenceId, String bqReferenceId, BQFeesExchangeInputModel request){
		return JsonReader.read("exchange-BQFeesExchangeOutputModel.json",new TypeReference<BQFeesExchangeOutputModel>(){});
	}
	
	public CRCustodyArrangementExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRCustodyArrangementExchangeInputModel request){
		return JsonReader.read("exchange-CRCustodyArrangementExchangeOutputModel.json",new TypeReference<CRCustodyArrangementExchangeOutputModel>(){});
	}
	
	public BQSecuritiesReportingExecuteOutputModel executeSecuritiesreporting(String sdReferenceId, String crReferenceId, String bqReferenceId, BQSecuritiesReportingExecuteInputModel request){
		return JsonReader.read("execute-BQSecuritiesReportingExecuteOutputModel.json",new TypeReference<BQSecuritiesReportingExecuteOutputModel>(){});
	}
	
	public BQSettlementExecuteOutputModel executeSettlement(String sdReferenceId, String crReferenceId, String bqReferenceId, BQSettlementExecuteInputModel request){
		return JsonReader.read("execute-BQSettlementExecuteOutputModel.json",new TypeReference<BQSettlementExecuteOutputModel>(){});
	}
	
	public CRCustodyArrangementExecuteOutputModel execute(String sdReferenceId, String crReferenceId, CRCustodyArrangementExecuteInputModel request){
		return JsonReader.read("execute-CRCustodyArrangementExecuteOutputModel.json",new TypeReference<CRCustodyArrangementExecuteOutputModel>(){});
	}
	
	public SDCustodyAdministrationFeedbackOutputModel feedback(String sdReferenceId, SDCustodyAdministrationFeedbackInputModel request){
		return JsonReader.read("feedback-SDCustodyAdministrationFeedbackOutputModel.json",new TypeReference<SDCustodyAdministrationFeedbackOutputModel>(){});
	}
	
	public CRCustodyArrangementInitiateOutputModel initiate(String sdReferenceId, CRCustodyArrangementInitiateInputModel request){
		return JsonReader.read("initiate-CRCustodyArrangementInitiateOutputModel.json",new TypeReference<CRCustodyArrangementInitiateOutputModel>(){});
	}
	
	public BQDividendsandInterestInitiateOutputModel initiateDividendsandinterest(String sdReferenceId, String crReferenceId, BQDividendsandInterestInitiateInputModel request){
		return JsonReader.read("initiate-BQDividendsandInterestInitiateOutputModel.json",new TypeReference<BQDividendsandInterestInitiateOutputModel>(){});
	}
	
	public BQFeesInitiateOutputModel initiateFees(String sdReferenceId, String crReferenceId, BQFeesInitiateInputModel request){
		return JsonReader.read("initiate-BQFeesInitiateOutputModel.json",new TypeReference<BQFeesInitiateOutputModel>(){});
	}
	
	public BQSecuritiesReportingInitiateOutputModel initiateSecuritiesreporting(String sdReferenceId, String crReferenceId, BQSecuritiesReportingInitiateInputModel request){
		return JsonReader.read("initiate-BQSecuritiesReportingInitiateOutputModel.json",new TypeReference<BQSecuritiesReportingInitiateOutputModel>(){});
	}
	
	public BQSettlementInitiateOutputModel initiateSettlement(String sdReferenceId, String crReferenceId, BQSettlementInitiateInputModel request){
		return JsonReader.read("initiate-BQSettlementInitiateOutputModel.json",new TypeReference<BQSettlementInitiateOutputModel>(){});
	}
	
	public BQSafeKeepingRequestOutputModel requestSafekeeping(String sdReferenceId, String crReferenceId, String bqReferenceId, BQSafeKeepingRequestInputModel request){
		return JsonReader.read("request-BQSafeKeepingRequestOutputModel.json",new TypeReference<BQSafeKeepingRequestOutputModel>(){});
	}
	
	public BQSecuritiesReportingRequestOutputModel requestSecuritiesreporting(String sdReferenceId, String crReferenceId, String bqReferenceId, BQSecuritiesReportingRequestInputModel request){
		return JsonReader.read("request-BQSecuritiesReportingRequestOutputModel.json",new TypeReference<BQSecuritiesReportingRequestOutputModel>(){});
	}
	
	public BQSettlementRequestOutputModel requestSettlement(String sdReferenceId, String crReferenceId, String bqReferenceId, BQSettlementRequestInputModel request){
		return JsonReader.read("request-BQSettlementRequestOutputModel.json",new TypeReference<BQSettlementRequestOutputModel>(){});
	}
	
	public CRCustodyArrangementRequestOutputModel request(String sdReferenceId, String crReferenceId, CRCustodyArrangementRequestInputModel request){
		return JsonReader.read("request-CRCustodyArrangementRequestOutputModel.json",new TypeReference<CRCustodyArrangementRequestOutputModel>(){});
	}
	
	public CRCustodyArrangementRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRCustodyArrangementRetrieveOutputModel.json",new TypeReference<CRCustodyArrangementRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveRefIds(String sdReferenceId){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public BQDividendsandInterestRetrieveOutputModel retrieveDividendsandinterest(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQDividendsandInterestRetrieveOutputModel.json",new TypeReference<BQDividendsandInterestRetrieveOutputModel>(){});
	}
	
	public BQFeesRetrieveOutputModel retrieveFees(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQFeesRetrieveOutputModel.json",new TypeReference<BQFeesRetrieveOutputModel>(){});
	}
	
	public BQSafeKeepingRetrieveOutputModel retrieveSafekeeping(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQSafeKeepingRetrieveOutputModel.json",new TypeReference<BQSafeKeepingRetrieveOutputModel>(){});
	}
	
	public BQSecuritiesReportingRetrieveOutputModel retrieveSecuritiesreporting(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQSecuritiesReportingRetrieveOutputModel.json",new TypeReference<BQSecuritiesReportingRetrieveOutputModel>(){});
	}
	
	public BQSettlementRetrieveOutputModel retrieveSettlement(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQSettlementRetrieveOutputModel.json",new TypeReference<BQSettlementRetrieveOutputModel>(){});
	}
	
	public SDCustodyAdministrationRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDCustodyAdministrationRetrieveOutputModel.json",new TypeReference<SDCustodyAdministrationRetrieveOutputModel>(){});
	}
	
	public CRCustodyArrangementUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRCustodyArrangementUpdateInputModel request){
		return JsonReader.read("update-CRCustodyArrangementUpdateOutputModel.json",new TypeReference<CRCustodyArrangementUpdateOutputModel>(){});
	}
	
	public BQFeesUpdateOutputModel updateFees(String sdReferenceId, String crReferenceId, String bqReferenceId, BQFeesUpdateInputModel request){
		return JsonReader.read("update-BQFeesUpdateOutputModel.json",new TypeReference<BQFeesUpdateOutputModel>(){});
	}
	
	public BQSafeKeepingUpdateOutputModel updateSafekeeping(String sdReferenceId, String crReferenceId, String bqReferenceId, BQSafeKeepingUpdateInputModel request){
		return JsonReader.read("update-BQSafeKeepingUpdateOutputModel.json",new TypeReference<BQSafeKeepingUpdateOutputModel>(){});
	}
	
	public BQSettlementUpdateOutputModel updateSettlement(String sdReferenceId, String crReferenceId, String bqReferenceId, BQSettlementUpdateInputModel request){
		return JsonReader.read("update-BQSettlementUpdateOutputModel.json",new TypeReference<BQSettlementUpdateOutputModel>(){});
	}
	
}
