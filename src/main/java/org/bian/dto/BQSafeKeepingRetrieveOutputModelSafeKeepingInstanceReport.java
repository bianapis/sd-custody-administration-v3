package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQSafeKeepingRetrieveOutputModelSafeKeepingInstanceReport
 */
public class BQSafeKeepingRetrieveOutputModelSafeKeepingInstanceReport   {
  private Object safeKeepingInstanceReportRecord = null;

  private String safeKeepingInstanceReportType = null;

  private String safeKeepingInstanceReportParameters = null;

  private Object safeKeepingInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return safeKeepingInstanceReportRecord
  **/

  public Object getSafeKeepingInstanceReportRecord() {
    return safeKeepingInstanceReportRecord;
  }

  public void setSafeKeepingInstanceReportRecord(Object safeKeepingInstanceReportRecord) {
    this.safeKeepingInstanceReportRecord = safeKeepingInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return safeKeepingInstanceReportType
  **/

  public String getSafeKeepingInstanceReportType() {
    return safeKeepingInstanceReportType;
  }

  public void setSafeKeepingInstanceReportType(String safeKeepingInstanceReportType) {
    this.safeKeepingInstanceReportType = safeKeepingInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return safeKeepingInstanceReportParameters
  **/

  public String getSafeKeepingInstanceReportParameters() {
    return safeKeepingInstanceReportParameters;
  }

  public void setSafeKeepingInstanceReportParameters(String safeKeepingInstanceReportParameters) {
    this.safeKeepingInstanceReportParameters = safeKeepingInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return safeKeepingInstanceReport
  **/

  public Object getSafeKeepingInstanceReport() {
    return safeKeepingInstanceReport;
  }

  public void setSafeKeepingInstanceReport(Object safeKeepingInstanceReport) {
    this.safeKeepingInstanceReport = safeKeepingInstanceReport;
  }


}

