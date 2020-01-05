/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.imebra;

public class CFindResponse extends DimseResponse {
  private transient long swigCPtr;

  protected CFindResponse(long cPtr, boolean cMemoryOwn) {
    super(imebraJNI.CFindResponse_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CFindResponse obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        imebraJNI.delete_CFindResponse(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public CFindResponse(CFindCommand receivedCommand, DataSet identifier) {
    this(imebraJNI.new_CFindResponse__SWIG_0(CFindCommand.getCPtr(receivedCommand), receivedCommand, DataSet.getCPtr(identifier), identifier), true);
  }

  public CFindResponse(CFindCommand receivedCommand, dimseStatusCode_t responseCode) {
    this(imebraJNI.new_CFindResponse__SWIG_1(CFindCommand.getCPtr(receivedCommand), receivedCommand, responseCode.swigValue()), true);
  }

  public CFindResponse(CFindResponse source) {
    this(imebraJNI.new_CFindResponse__SWIG_2(CFindResponse.getCPtr(source), source), true);
  }

}
