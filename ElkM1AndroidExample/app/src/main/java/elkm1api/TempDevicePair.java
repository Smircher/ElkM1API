/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package elkm1api;

public class TempDevicePair {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected TempDevicePair(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(TempDevicePair obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ElkM1APIJNI.delete_TempDevicePair(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public TempDevicePair() {
    this(ElkM1APIJNI.new_TempDevicePair__SWIG_0(), true);
  }

  public TempDevicePair(int first, TemperatureDevice second) {
    this(ElkM1APIJNI.new_TempDevicePair__SWIG_1(first, second.swigValue()), true);
  }

  public TempDevicePair(TempDevicePair p) {
    this(ElkM1APIJNI.new_TempDevicePair__SWIG_2(TempDevicePair.getCPtr(p), p), true);
  }

  public void setFirst(int value) {
    ElkM1APIJNI.TempDevicePair_first_set(swigCPtr, this, value);
  }

  public int getFirst() {
    return ElkM1APIJNI.TempDevicePair_first_get(swigCPtr, this);
  }

  public void setSecond(TemperatureDevice value) {
    ElkM1APIJNI.TempDevicePair_second_set(swigCPtr, this, value.swigValue());
  }

  public TemperatureDevice getSecond() {
    return TemperatureDevice.swigToEnum(ElkM1APIJNI.TempDevicePair_second_get(swigCPtr, this));
  }

}
