package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustodyArrangementRetrieveInputModelCustodyArrangementInstanceAnalysis;
import org.bian.dto.CRCustodyArrangementRetrieveInputModelCustodyArrangementInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRCustodyArrangementRetrieveInputModel
 */
public class CRCustodyArrangementRetrieveInputModel   {
  private Object custodyArrangementRetrieveActionTaskRecord = null;

  private String custodyArrangementRetrieveActionRequest = null;

  private CRCustodyArrangementRetrieveInputModelCustodyArrangementInstanceReportRecord custodyArrangementInstanceReportRecord = null;

  private CRCustodyArrangementRetrieveInputModelCustodyArrangementInstanceAnalysis custodyArrangementInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return custodyArrangementRetrieveActionTaskRecord
  **/

  public Object getCustodyArrangementRetrieveActionTaskRecord() {
    return custodyArrangementRetrieveActionTaskRecord;
  }

  public void setCustodyArrangementRetrieveActionTaskRecord(Object custodyArrangementRetrieveActionTaskRecord) {
    this.custodyArrangementRetrieveActionTaskRecord = custodyArrangementRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return custodyArrangementRetrieveActionRequest
  **/

  public String getCustodyArrangementRetrieveActionRequest() {
    return custodyArrangementRetrieveActionRequest;
  }

  public void setCustodyArrangementRetrieveActionRequest(String custodyArrangementRetrieveActionRequest) {
    this.custodyArrangementRetrieveActionRequest = custodyArrangementRetrieveActionRequest;
  }


  /**
   * Get custodyArrangementInstanceReportRecord
   * @return custodyArrangementInstanceReportRecord
  **/

  public CRCustodyArrangementRetrieveInputModelCustodyArrangementInstanceReportRecord getCustodyArrangementInstanceReportRecord() {
    return custodyArrangementInstanceReportRecord;
  }

  public void setCustodyArrangementInstanceReportRecord(CRCustodyArrangementRetrieveInputModelCustodyArrangementInstanceReportRecord custodyArrangementInstanceReportRecord) {
    this.custodyArrangementInstanceReportRecord = custodyArrangementInstanceReportRecord;
  }


  /**
   * Get custodyArrangementInstanceAnalysis
   * @return custodyArrangementInstanceAnalysis
  **/

  public CRCustodyArrangementRetrieveInputModelCustodyArrangementInstanceAnalysis getCustodyArrangementInstanceAnalysis() {
    return custodyArrangementInstanceAnalysis;
  }

  public void setCustodyArrangementInstanceAnalysis(CRCustodyArrangementRetrieveInputModelCustodyArrangementInstanceAnalysis custodyArrangementInstanceAnalysis) {
    this.custodyArrangementInstanceAnalysis = custodyArrangementInstanceAnalysis;
  }


}

