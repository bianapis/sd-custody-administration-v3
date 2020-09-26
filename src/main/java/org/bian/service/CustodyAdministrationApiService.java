/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface CustodyAdministrationApiService {

	SDCustodyAdministrationActivateOutputModel activate(SDCustodyAdministrationActivateInputModel request);
	
	SDCustodyAdministrationConfigureOutputModel configure(String sdReferenceId, SDCustodyAdministrationConfigureInputModel request);
	
	BQSafeKeepingControlOutputModel controlSafekeeping(String sdReferenceId, String crReferenceId, String bqReferenceId, BQSafeKeepingControlInputModel request);
	
	CRCustodyArrangementControlOutputModel control(String sdReferenceId, String crReferenceId, CRCustodyArrangementControlInputModel request);
	
	BQFeesExchangeOutputModel exchangeFees(String sdReferenceId, String crReferenceId, String bqReferenceId, BQFeesExchangeInputModel request);
	
	CRCustodyArrangementExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRCustodyArrangementExchangeInputModel request);
	
	BQSecuritiesReportingExecuteOutputModel executeSecuritiesreporting(String sdReferenceId, String crReferenceId, String bqReferenceId, BQSecuritiesReportingExecuteInputModel request);
	
	BQSettlementExecuteOutputModel executeSettlement(String sdReferenceId, String crReferenceId, String bqReferenceId, BQSettlementExecuteInputModel request);
	
	CRCustodyArrangementExecuteOutputModel execute(String sdReferenceId, String crReferenceId, CRCustodyArrangementExecuteInputModel request);
	
	SDCustodyAdministrationFeedbackOutputModel feedback(String sdReferenceId, SDCustodyAdministrationFeedbackInputModel request);
	
	CRCustodyArrangementInitiateOutputModel initiate(String sdReferenceId, CRCustodyArrangementInitiateInputModel request);
	
	BQDividendsandInterestInitiateOutputModel initiateDividendsandinterest(String sdReferenceId, String crReferenceId, BQDividendsandInterestInitiateInputModel request);
	
	BQFeesInitiateOutputModel initiateFees(String sdReferenceId, String crReferenceId, BQFeesInitiateInputModel request);
	
	BQSecuritiesReportingInitiateOutputModel initiateSecuritiesreporting(String sdReferenceId, String crReferenceId, BQSecuritiesReportingInitiateInputModel request);
	
	BQSettlementInitiateOutputModel initiateSettlement(String sdReferenceId, String crReferenceId, BQSettlementInitiateInputModel request);
	
	BQSafeKeepingRequestOutputModel requestSafekeeping(String sdReferenceId, String crReferenceId, String bqReferenceId, BQSafeKeepingRequestInputModel request);
	
	BQSecuritiesReportingRequestOutputModel requestSecuritiesreporting(String sdReferenceId, String crReferenceId, String bqReferenceId, BQSecuritiesReportingRequestInputModel request);
	
	BQSettlementRequestOutputModel requestSettlement(String sdReferenceId, String crReferenceId, String bqReferenceId, BQSettlementRequestInputModel request);
	
	CRCustodyArrangementRequestOutputModel request(String sdReferenceId, String crReferenceId, CRCustodyArrangementRequestInputModel request);
	
	CRCustodyArrangementRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	BQDividendsandInterestRetrieveOutputModel retrieveDividendsandinterest(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQFeesRetrieveOutputModel retrieveFees(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQSafeKeepingRetrieveOutputModel retrieveSafekeeping(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQSecuritiesReportingRetrieveOutputModel retrieveSecuritiesreporting(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQSettlementRetrieveOutputModel retrieveSettlement(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	SDCustodyAdministrationRetrieveOutputModel retrieveSD(String sdReferenceId);
	
	CRCustodyArrangementUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRCustodyArrangementUpdateInputModel request);
	
	BQFeesUpdateOutputModel updateFees(String sdReferenceId, String crReferenceId, String bqReferenceId, BQFeesUpdateInputModel request);
	
	BQSafeKeepingUpdateOutputModel updateSafekeeping(String sdReferenceId, String crReferenceId, String bqReferenceId, BQSafeKeepingUpdateInputModel request);
	
	BQSettlementUpdateOutputModel updateSettlement(String sdReferenceId, String crReferenceId, String bqReferenceId, BQSettlementUpdateInputModel request);
	
}
