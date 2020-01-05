/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.imebra;

public class BaseStreamInput {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected BaseStreamInput(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(BaseStreamInput obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        imebraJNI.delete_BaseStreamInput(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public BaseStreamInput(BaseStreamInput source) {
    this(imebraJNI.new_BaseStreamInput(BaseStreamInput.getCPtr(source), source), true);
  }

}
