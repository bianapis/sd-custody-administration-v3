package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQDividendsandInterestRetrieveInputModelDividendsandInterestInstanceAnalysis;
import org.bian.dto.BQDividendsandInterestRetrieveInputModelDividendsandInterestInstanceReport;

import javax.validation.Valid;
  
/**
 * BQDividendsandInterestRetrieveInputModel
 */
public class BQDividendsandInterestRetrieveInputModel   {
  private Object dividendsandInterestRetrieveActionTaskRecord = null;

  private String dividendsandInterestRetrieveActionRequest = null;

  private BQDividendsandInterestRetrieveInputModelDividendsandInterestInstanceReport dividendsandInterestInstanceReport = null;

  private BQDividendsandInterestRetrieveInputModelDividendsandInterestInstanceAnalysis dividendsandInterestInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return dividendsandInterestRetrieveActionTaskRecord
  **/

  public Object getDividendsandInterestRetrieveActionTaskRecord() {
    return dividendsandInterestRetrieveActionTaskRecord;
  }

  public void setDividendsandInterestRetrieveActionTaskRecord(Object dividendsandInterestRetrieveActionTaskRecord) {
    this.dividendsandInterestRetrieveActionTaskRecord = dividendsandInterestRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return dividendsandInterestRetrieveActionRequest
  **/

  public String getDividendsandInterestRetrieveActionRequest() {
    return dividendsandInterestRetrieveActionRequest;
  }

  public void setDividendsandInterestRetrieveActionRequest(String dividendsandInterestRetrieveActionRequest) {
    this.dividendsandInterestRetrieveActionRequest = dividendsandInterestRetrieveActionRequest;
  }


  /**
   * Get dividendsandInterestInstanceReport
   * @return dividendsandInterestInstanceReport
  **/

  public BQDividendsandInterestRetrieveInputModelDividendsandInterestInstanceReport getDividendsandInterestInstanceReport() {
    return dividendsandInterestInstanceReport;
  }

  public void setDividendsandInterestInstanceReport(BQDividendsandInterestRetrieveInputModelDividendsandInterestInstanceReport dividendsandInterestInstanceReport) {
    this.dividendsandInterestInstanceReport = dividendsandInterestInstanceReport;
  }


  /**
   * Get dividendsandInterestInstanceAnalysis
   * @return dividendsandInterestInstanceAnalysis
  **/

  public BQDividendsandInterestRetrieveInputModelDividendsandInterestInstanceAnalysis getDividendsandInterestInstanceAnalysis() {
    return dividendsandInterestInstanceAnalysis;
  }

  public void setDividendsandInterestInstanceAnalysis(BQDividendsandInterestRetrieveInputModelDividendsandInterestInstanceAnalysis dividendsandInterestInstanceAnalysis) {
    this.dividendsandInterestInstanceAnalysis = dividendsandInterestInstanceAnalysis;
  }


}

