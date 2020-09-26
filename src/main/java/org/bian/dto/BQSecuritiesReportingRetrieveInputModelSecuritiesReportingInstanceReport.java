package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQSecuritiesReportingRetrieveInputModelSecuritiesReportingInstanceReport
 */
public class BQSecuritiesReportingRetrieveInputModelSecuritiesReportingInstanceReport   {
  private String securitiesReportingInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return securitiesReportingInstanceReportReference
  **/

  public String getSecuritiesReportingInstanceReportReference() {
    return securitiesReportingInstanceReportReference;
  }

  public void setSecuritiesReportingInstanceReportReference(String securitiesReportingInstanceReportReference) {
    this.securitiesReportingInstanceReportReference = securitiesReportingInstanceReportReference;
  }


}

