/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.imebra;

public class TCPListener {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected TCPListener(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(TCPListener obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        imebraJNI.delete_TCPListener(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public TCPListener(TCPPassiveAddress address) {
    this(imebraJNI.new_TCPListener__SWIG_0(TCPPassiveAddress.getCPtr(address), address), true);
  }

  public TCPListener(TCPListener source) {
    this(imebraJNI.new_TCPListener__SWIG_1(TCPListener.getCPtr(source), source), true);
  }

  public TCPStream waitForConnection() {
    return new TCPStream(imebraJNI.TCPListener_waitForConnection(swigCPtr, this), true);
  }

  public void terminate() {
    imebraJNI.TCPListener_terminate(swigCPtr, this);
  }

}
