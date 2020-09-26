package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQSecuritiesReportingRetrieveInputModelSecuritiesReportingInstanceAnalysis;
import org.bian.dto.BQSecuritiesReportingRetrieveInputModelSecuritiesReportingInstanceReport;

import javax.validation.Valid;
  
/**
 * BQSecuritiesReportingRetrieveInputModel
 */
public class BQSecuritiesReportingRetrieveInputModel   {
  private Object securitiesReportingRetrieveActionTaskRecord = null;

  private String securitiesReportingRetrieveActionRequest = null;

  private BQSecuritiesReportingRetrieveInputModelSecuritiesReportingInstanceReport securitiesReportingInstanceReport = null;

  private BQSecuritiesReportingRetrieveInputModelSecuritiesReportingInstanceAnalysis securitiesReportingInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return securitiesReportingRetrieveActionTaskRecord
  **/

  public Object getSecuritiesReportingRetrieveActionTaskRecord() {
    return securitiesReportingRetrieveActionTaskRecord;
  }

  public void setSecuritiesReportingRetrieveActionTaskRecord(Object securitiesReportingRetrieveActionTaskRecord) {
    this.securitiesReportingRetrieveActionTaskRecord = securitiesReportingRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return securitiesReportingRetrieveActionRequest
  **/

  public String getSecuritiesReportingRetrieveActionRequest() {
    return securitiesReportingRetrieveActionRequest;
  }

  public void setSecuritiesReportingRetrieveActionRequest(String securitiesReportingRetrieveActionRequest) {
    this.securitiesReportingRetrieveActionRequest = securitiesReportingRetrieveActionRequest;
  }


  /**
   * Get securitiesReportingInstanceReport
   * @return securitiesReportingInstanceReport
  **/

  public BQSecuritiesReportingRetrieveInputModelSecuritiesReportingInstanceReport getSecuritiesReportingInstanceReport() {
    return securitiesReportingInstanceReport;
  }

  public void setSecuritiesReportingInstanceReport(BQSecuritiesReportingRetrieveInputModelSecuritiesReportingInstanceReport securitiesReportingInstanceReport) {
    this.securitiesReportingInstanceReport = securitiesReportingInstanceReport;
  }


  /**
   * Get securitiesReportingInstanceAnalysis
   * @return securitiesReportingInstanceAnalysis
  **/

  public BQSecuritiesReportingRetrieveInputModelSecuritiesReportingInstanceAnalysis getSecuritiesReportingInstanceAnalysis() {
    return securitiesReportingInstanceAnalysis;
  }

  public void setSecuritiesReportingInstanceAnalysis(BQSecuritiesReportingRetrieveInputModelSecuritiesReportingInstanceAnalysis securitiesReportingInstanceAnalysis) {
    this.securitiesReportingInstanceAnalysis = securitiesReportingInstanceAnalysis;
  }


}

