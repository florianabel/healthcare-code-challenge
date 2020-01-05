/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.imebra;

public class NGetCommand extends DimseCommand {
  private transient long swigCPtr;

  protected NGetCommand(long cPtr, boolean cMemoryOwn) {
    super(imebraJNI.NGetCommand_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(NGetCommand obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        imebraJNI.delete_NGetCommand(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public NGetCommand(String abstractSyntax, int messageID, String requestedSopClassUid, String requestedSopInstanceUid, SWIGTYPE_p_std__vectorT_unsigned_int_t attributeIdentifierList) {
    this(imebraJNI.new_NGetCommand__SWIG_0(abstractSyntax, messageID, requestedSopClassUid, requestedSopInstanceUid, SWIGTYPE_p_std__vectorT_unsigned_int_t.getCPtr(attributeIdentifierList)), true);
  }

  public NGetCommand(NGetCommand source) {
    this(imebraJNI.new_NGetCommand__SWIG_1(NGetCommand.getCPtr(source), source), true);
  }

  public SWIGTYPE_p_std__vectorT_unsigned_int_t getAttributeList() {
    return new SWIGTYPE_p_std__vectorT_unsigned_int_t(imebraJNI.NGetCommand_getAttributeList(swigCPtr, this), true);
  }

}
