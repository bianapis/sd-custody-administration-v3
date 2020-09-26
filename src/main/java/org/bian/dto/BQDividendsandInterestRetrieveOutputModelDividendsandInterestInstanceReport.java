package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQDividendsandInterestRetrieveOutputModelDividendsandInterestInstanceReport
 */
public class BQDividendsandInterestRetrieveOutputModelDividendsandInterestInstanceReport   {
  private Object dividendsandInterestInstanceReportRecord = null;

  private String dividendsandInterestInstanceReportType = null;

  private String dividendsandInterestInstanceReportParameters = null;

  private Object dividendsandInterestInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return dividendsandInterestInstanceReportRecord
  **/

  public Object getDividendsandInterestInstanceReportRecord() {
    return dividendsandInterestInstanceReportRecord;
  }

  public void setDividendsandInterestInstanceReportRecord(Object dividendsandInterestInstanceReportRecord) {
    this.dividendsandInterestInstanceReportRecord = dividendsandInterestInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return dividendsandInterestInstanceReportType
  **/

  public String getDividendsandInterestInstanceReportType() {
    return dividendsandInterestInstanceReportType;
  }

  public void setDividendsandInterestInstanceReportType(String dividendsandInterestInstanceReportType) {
    this.dividendsandInterestInstanceReportType = dividendsandInterestInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return dividendsandInterestInstanceReportParameters
  **/

  public String getDividendsandInterestInstanceReportParameters() {
    return dividendsandInterestInstanceReportParameters;
  }

  public void setDividendsandInterestInstanceReportParameters(String dividendsandInterestInstanceReportParameters) {
    this.dividendsandInterestInstanceReportParameters = dividendsandInterestInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return dividendsandInterestInstanceReport
  **/

  public Object getDividendsandInterestInstanceReport() {
    return dividendsandInterestInstanceReport;
  }

  public void setDividendsandInterestInstanceReport(Object dividendsandInterestInstanceReport) {
    this.dividendsandInterestInstanceReport = dividendsandInterestInstanceReport;
  }


}

