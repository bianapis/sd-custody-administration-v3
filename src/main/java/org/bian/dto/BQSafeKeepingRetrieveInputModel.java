package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQSafeKeepingRetrieveInputModelSafeKeepingInstanceAnalysis;
import org.bian.dto.BQSafeKeepingRetrieveInputModelSafeKeepingInstanceReport;

import javax.validation.Valid;
  
/**
 * BQSafeKeepingRetrieveInputModel
 */
public class BQSafeKeepingRetrieveInputModel   {
  private Object safeKeepingRetrieveActionTaskRecord = null;

  private String safeKeepingRetrieveActionRequest = null;

  private BQSafeKeepingRetrieveInputModelSafeKeepingInstanceReport safeKeepingInstanceReport = null;

  private BQSafeKeepingRetrieveInputModelSafeKeepingInstanceAnalysis safeKeepingInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return safeKeepingRetrieveActionTaskRecord
  **/

  public Object getSafeKeepingRetrieveActionTaskRecord() {
    return safeKeepingRetrieveActionTaskRecord;
  }

  public void setSafeKeepingRetrieveActionTaskRecord(Object safeKeepingRetrieveActionTaskRecord) {
    this.safeKeepingRetrieveActionTaskRecord = safeKeepingRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return safeKeepingRetrieveActionRequest
  **/

  public String getSafeKeepingRetrieveActionRequest() {
    return safeKeepingRetrieveActionRequest;
  }

  public void setSafeKeepingRetrieveActionRequest(String safeKeepingRetrieveActionRequest) {
    this.safeKeepingRetrieveActionRequest = safeKeepingRetrieveActionRequest;
  }


  /**
   * Get safeKeepingInstanceReport
   * @return safeKeepingInstanceReport
  **/

  public BQSafeKeepingRetrieveInputModelSafeKeepingInstanceReport getSafeKeepingInstanceReport() {
    return safeKeepingInstanceReport;
  }

  public void setSafeKeepingInstanceReport(BQSafeKeepingRetrieveInputModelSafeKeepingInstanceReport safeKeepingInstanceReport) {
    this.safeKeepingInstanceReport = safeKeepingInstanceReport;
  }


  /**
   * Get safeKeepingInstanceAnalysis
   * @return safeKeepingInstanceAnalysis
  **/

  public BQSafeKeepingRetrieveInputModelSafeKeepingInstanceAnalysis getSafeKeepingInstanceAnalysis() {
    return safeKeepingInstanceAnalysis;
  }

  public void setSafeKeepingInstanceAnalysis(BQSafeKeepingRetrieveInputModelSafeKeepingInstanceAnalysis safeKeepingInstanceAnalysis) {
    this.safeKeepingInstanceAnalysis = safeKeepingInstanceAnalysis;
  }


}

