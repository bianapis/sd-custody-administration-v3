/**
 * @author Virtusa
 */
package org.bian.controller;

import java.util.List;
import org.bian.annotation.BianRestController;
import org.bian.annotation.BQ;
import org.bian.dto.BianRequest;
import org.bian.dto.BianResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.bian.dto.*;
import org.bian.service.*;
import org.bian.annotation.functionalpattern.Fulfill;

@BianRestController
public class CustodyAdministrationApiController {

	@Autowired
	CustodyAdministrationApiService service;
	
	@Fulfill.Activate
	public BianResponse<SDCustodyAdministrationActivateOutputModel> activate(@RequestBody BianRequest<SDCustodyAdministrationActivateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.activate(bianRequest.getData()));
	}
	
	@Fulfill.Configure
	public BianResponse<SDCustodyAdministrationConfigureOutputModel> configure(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDCustodyAdministrationConfigureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.configure(sdReferenceId, bianRequest.getData()));
	}
	
	@BQ("safekeeping")
	@Fulfill.Control
	public BianResponse<BQSafeKeepingControlOutputModel> controlSafekeeping(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQSafeKeepingControlInputModel> bianRequest) {
		return BianResponse.forSuccess(service.controlSafekeeping(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Fulfill.Control
	public BianResponse<CRCustodyArrangementControlOutputModel> control(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRCustodyArrangementControlInputModel> bianRequest) {
		return BianResponse.forSuccess(service.control(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("fees")
	@Fulfill.Exchange
	public BianResponse<BQFeesExchangeOutputModel> exchangeFees(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQFeesExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchangeFees(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Fulfill.Exchange
	public BianResponse<CRCustodyArrangementExchangeOutputModel> exchange(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRCustodyArrangementExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchange(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("securitiesreporting")
	@Fulfill.Execute
	public BianResponse<BQSecuritiesReportingExecuteOutputModel> executeSecuritiesreporting(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQSecuritiesReportingExecuteInputModel> bianRequest) {
		return BianResponse.forSuccess(service.executeSecuritiesreporting(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("settlement")
	@Fulfill.Execute
	public BianResponse<BQSettlementExecuteOutputModel> executeSettlement(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQSettlementExecuteInputModel> bianRequest) {
		return BianResponse.forSuccess(service.executeSettlement(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Fulfill.Execute
	public BianResponse<CRCustodyArrangementExecuteOutputModel> execute(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRCustodyArrangementExecuteInputModel> bianRequest) {
		return BianResponse.forSuccess(service.execute(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Fulfill.Feedback
	public BianResponse<SDCustodyAdministrationFeedbackOutputModel> feedback(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDCustodyAdministrationFeedbackInputModel> bianRequest) {
		return BianResponse.forSuccess(service.feedback(sdReferenceId, bianRequest.getData()));
	}
	
	@Fulfill.Initiate
	public BianResponse<CRCustodyArrangementInitiateOutputModel> initiate(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<CRCustodyArrangementInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiate(sdReferenceId, bianRequest.getData()));
	}
	
	@BQ("dividendsandinterest")
	@Fulfill.Initiate
	public BianResponse<BQDividendsandInterestInitiateOutputModel> initiateDividendsandinterest(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQDividendsandInterestInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiateDividendsandinterest(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("fees")
	@Fulfill.Initiate
	public BianResponse<BQFeesInitiateOutputModel> initiateFees(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQFeesInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiateFees(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("securitiesreporting")
	@Fulfill.Initiate
	public BianResponse<BQSecuritiesReportingInitiateOutputModel> initiateSecuritiesreporting(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQSecuritiesReportingInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiateSecuritiesreporting(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("settlement")
	@Fulfill.Initiate
	public BianResponse<BQSettlementInitiateOutputModel> initiateSettlement(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQSettlementInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiateSettlement(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("safekeeping")
	@Fulfill.Request
	public BianResponse<BQSafeKeepingRequestOutputModel> requestSafekeeping(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQSafeKeepingRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.requestSafekeeping(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("securitiesreporting")
	@Fulfill.Request
	public BianResponse<BQSecuritiesReportingRequestOutputModel> requestSecuritiesreporting(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQSecuritiesReportingRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.requestSecuritiesreporting(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("settlement")
	@Fulfill.Request
	public BianResponse<BQSettlementRequestOutputModel> requestSettlement(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQSettlementRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.requestSettlement(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Fulfill.Request
	public BianResponse<CRCustodyArrangementRequestOutputModel> request(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRCustodyArrangementRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.request(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Fulfill.Retrieve
	public BianResponse<CRCustodyArrangementRetrieveOutputModel> retrieve(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(sdReferenceId, crReferenceId));
	}
	
	@Fulfill.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(sdReferenceId, crReferenceId, behaviorQualifier));
	}
	
	@Fulfill.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@Fulfill.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveRefIds(sdReferenceId));
	}
	
	@BQ("dividendsandinterest")
	@Fulfill.Retrieve
	public BianResponse<BQDividendsandInterestRetrieveOutputModel> retrieveDividendsandinterest(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveDividendsandinterest(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("fees")
	@Fulfill.Retrieve
	public BianResponse<BQFeesRetrieveOutputModel> retrieveFees(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveFees(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("safekeeping")
	@Fulfill.Retrieve
	public BianResponse<BQSafeKeepingRetrieveOutputModel> retrieveSafekeeping(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveSafekeeping(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("securitiesreporting")
	@Fulfill.Retrieve
	public BianResponse<BQSecuritiesReportingRetrieveOutputModel> retrieveSecuritiesreporting(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveSecuritiesreporting(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("settlement")
	@Fulfill.Retrieve
	public BianResponse<BQSettlementRetrieveOutputModel> retrieveSettlement(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveSettlement(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@Fulfill.RetrieveSD
	public BianResponse<SDCustodyAdministrationRetrieveOutputModel> retrieveSD(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveSD(sdReferenceId));
	}
	
	@Fulfill.Update
	public BianResponse<CRCustodyArrangementUpdateOutputModel> update(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRCustodyArrangementUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.update(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("fees")
	@Fulfill.Update
	public BianResponse<BQFeesUpdateOutputModel> updateFees(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQFeesUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateFees(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("safekeeping")
	@Fulfill.Update
	public BianResponse<BQSafeKeepingUpdateOutputModel> updateSafekeeping(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQSafeKeepingUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateSafekeeping(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("settlement")
	@Fulfill.Update
	public BianResponse<BQSettlementUpdateOutputModel> updateSettlement(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQSettlementUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateSettlement(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
}
