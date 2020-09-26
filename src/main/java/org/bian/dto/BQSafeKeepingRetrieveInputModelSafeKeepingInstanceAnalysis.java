package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQSafeKeepingRetrieveInputModelSafeKeepingInstanceAnalysis
 */
public class BQSafeKeepingRetrieveInputModelSafeKeepingInstanceAnalysis   {
  private String safeKeepingInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return safeKeepingInstanceAnalysisReference
  **/

  public String getSafeKeepingInstanceAnalysisReference() {
    return safeKeepingInstanceAnalysisReference;
  }

  public void setSafeKeepingInstanceAnalysisReference(String safeKeepingInstanceAnalysisReference) {
    this.safeKeepingInstanceAnalysisReference = safeKeepingInstanceAnalysisReference;
  }


}

