/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.imebra;

public class PatientName {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected PatientName(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(PatientName obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        imebraJNI.delete_PatientName(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public PatientName(PatientName source) {
    this(imebraJNI.new_PatientName__SWIG_0(PatientName.getCPtr(source), source), true);
  }

  public PatientName(String alphabeticRepresentation, String ideographicRepresentation, String phoneticRepresentation) {
    this(imebraJNI.new_PatientName__SWIG_1(alphabeticRepresentation, ideographicRepresentation, phoneticRepresentation), true);
  }

  public String getAlphabeticRepresentation() {
    return imebraJNI.PatientName_getAlphabeticRepresentation(swigCPtr, this);
  }

  public String getIdeographicRepresentation() {
    return imebraJNI.PatientName_getIdeographicRepresentation(swigCPtr, this);
  }

  public String getPhoneticRepresentation() {
    return imebraJNI.PatientName_getPhoneticRepresentation(swigCPtr, this);
  }

}
