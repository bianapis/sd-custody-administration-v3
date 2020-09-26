package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQSecuritiesReportingRetrieveInputModelSecuritiesReportingInstanceAnalysis
 */
public class BQSecuritiesReportingRetrieveInputModelSecuritiesReportingInstanceAnalysis   {
  private String securitiesReportingInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return securitiesReportingInstanceAnalysisReference
  **/

  public String getSecuritiesReportingInstanceAnalysisReference() {
    return securitiesReportingInstanceAnalysisReference;
  }

  public void setSecuritiesReportingInstanceAnalysisReference(String securitiesReportingInstanceAnalysisReference) {
    this.securitiesReportingInstanceAnalysisReference = securitiesReportingInstanceAnalysisReference;
  }


}

