package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQSecuritiesReportingRetrieveOutputModelSecuritiesReportingInstanceReport
 */
public class BQSecuritiesReportingRetrieveOutputModelSecuritiesReportingInstanceReport   {
  private Object securitiesReportingInstanceReportRecord = null;

  private String securitiesReportingInstanceReportType = null;

  private String securitiesReportingInstanceReportParameters = null;

  private Object securitiesReportingInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return securitiesReportingInstanceReportRecord
  **/

  public Object getSecuritiesReportingInstanceReportRecord() {
    return securitiesReportingInstanceReportRecord;
  }

  public void setSecuritiesReportingInstanceReportRecord(Object securitiesReportingInstanceReportRecord) {
    this.securitiesReportingInstanceReportRecord = securitiesReportingInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return securitiesReportingInstanceReportType
  **/

  public String getSecuritiesReportingInstanceReportType() {
    return securitiesReportingInstanceReportType;
  }

  public void setSecuritiesReportingInstanceReportType(String securitiesReportingInstanceReportType) {
    this.securitiesReportingInstanceReportType = securitiesReportingInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return securitiesReportingInstanceReportParameters
  **/

  public String getSecuritiesReportingInstanceReportParameters() {
    return securitiesReportingInstanceReportParameters;
  }

  public void setSecuritiesReportingInstanceReportParameters(String securitiesReportingInstanceReportParameters) {
    this.securitiesReportingInstanceReportParameters = securitiesReportingInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return securitiesReportingInstanceReport
  **/

  public Object getSecuritiesReportingInstanceReport() {
    return securitiesReportingInstanceReport;
  }

  public void setSecuritiesReportingInstanceReport(Object securitiesReportingInstanceReport) {
    this.securitiesReportingInstanceReport = securitiesReportingInstanceReport;
  }


}

