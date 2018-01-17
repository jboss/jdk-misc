/*
 * JBoss, Home of Professional Open Source.
 * Copyright 2018 Red Hat, Inc., and individual contributors
 * as indicated by the @author tags.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package sun.misc;

import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.security.ProtectionDomain;

/**
 */
public class Unsafe {
    private Unsafe() {
    }

    private static final Unsafe theUnsafe = new Unsafe();

    public static Unsafe getUnsafe() {
        return theUnsafe;
    }

    // prevent these constants from getting inlined

    public static final int INVALID_FIELD_OFFSET = theUnsafe.getInt(null, 0L);
    public static final int ARRAY_BOOLEAN_BASE_OFFSET = theUnsafe.getInt(null, 0L);
    public static final int ARRAY_BYTE_BASE_OFFSET = theUnsafe.getInt(null, 0L);
    public static final int ARRAY_SHORT_BASE_OFFSET = theUnsafe.getInt(null, 0L);
    public static final int ARRAY_CHAR_BASE_OFFSET = theUnsafe.getInt(null, 0L);
    public static final int ARRAY_INT_BASE_OFFSET = theUnsafe.getInt(null, 0L);
    public static final int ARRAY_LONG_BASE_OFFSET = theUnsafe.getInt(null, 0L);
    public static final int ARRAY_FLOAT_BASE_OFFSET = theUnsafe.getInt(null, 0L);
    public static final int ARRAY_DOUBLE_BASE_OFFSET = theUnsafe.getInt(null, 0L);
    public static final int ARRAY_OBJECT_BASE_OFFSET = theUnsafe.getInt(null, 0L);
    public static final int ARRAY_BOOLEAN_INDEX_SCALE = theUnsafe.getInt(null, 0L);
    public static final int ARRAY_BYTE_INDEX_SCALE = theUnsafe.getInt(null, 0L);
    public static final int ARRAY_SHORT_INDEX_SCALE = theUnsafe.getInt(null, 0L);
    public static final int ARRAY_CHAR_INDEX_SCALE = theUnsafe.getInt(null, 0L);
    public static final int ARRAY_INT_INDEX_SCALE = theUnsafe.getInt(null, 0L);
    public static final int ARRAY_LONG_INDEX_SCALE = theUnsafe.getInt(null, 0L);
    public static final int ARRAY_FLOAT_INDEX_SCALE = theUnsafe.getInt(null, 0L);
    public static final int ARRAY_DOUBLE_INDEX_SCALE = theUnsafe.getInt(null, 0L);
    public static final int ARRAY_OBJECT_INDEX_SCALE = theUnsafe.getInt(null, 0L);
    public static final int ADDRESS_SIZE = theUnsafe.getInt(null, 0L);

    public native int getInt(Object o, long offset);
    public native void putInt(Object o, long offset, int x);
    public native Object getObject(Object o, long offset);
    public native void putObject(Object o, long offset, Object x);
    public native boolean getBoolean(Object o, long offset);
    public native void putBoolean(Object o, long offset, boolean x);
    public native byte getByte(Object o, long offset);
    public native void putByte(Object o, long offset, byte x);
    public native short getShort(Object o, long offset);
    public native void putShort(Object o, long offset, short x);
    public native char getChar(Object o, long offset);
    public native void putChar(Object o, long offset, char x);
    public native long getLong(Object o, long offset);
    public native void putLong(Object o, long offset, long x);
    public native float getFloat(Object o, long offset);
    public native void putFloat(Object o, long offset, float x);
    public native double getDouble(Object o, long offset);
    public native void putDouble(Object o, long offset, double x);
    public native byte getByte(long address);
    public native void putByte(long address, byte x);
    public native short getShort(long address);
    public native void putShort(long address, short x);
    public native char getChar(long address);
    public native void putChar(long address, char x);
    public native int getInt(long address);
    public native void putInt(long address, int x);
    public native long getLong(long address);
    public native void putLong(long address, long x);
    public native float getFloat(long address);
    public native void putFloat(long address, float x);
    public native double getDouble(long address);
    public native void putDouble(long address, double x);
    public native long getAddress(long address);
    public native void putAddress(long address, long x);
    public native long allocateMemory(long bytes);
    public native long reallocateMemory(long address, long bytes);
    public native void setMemory(Object o, long offset, long bytes, byte value);
    public native void setMemory(long address, long bytes, byte value);
    public native void copyMemory(Object srcBase, long srcOffset, Object destBase, long destOffset, long bytes);
    public native void copyMemory(long srcAddress, long destAddress, long bytes);
    public native void freeMemory(long address);
    public native long objectFieldOffset(Field f);
    public native long staticFieldOffset(Field f);
    public native Object staticFieldBase(Field f);
    public native boolean shouldBeInitialized(Class<?> c);
    public native void ensureClassInitialized(Class<?> c);
    public native int arrayBaseOffset(Class<?> arrayClass);
    public native int arrayIndexScale(Class<?> arrayClass);
    public native int addressSize();
    public native int pageSize();
    @Deprecated
    public native Class<?> defineClass(String name, byte[] b, int off, int len, ClassLoader loader, ProtectionDomain protectionDomain);
    public native Class<?> defineAnonymousClass(Class<?> hostClass, byte[] data, Object[] cpPatches);
    public native Object allocateInstance(Class<?> cls) throws InstantiationException;
    public native void throwException(Throwable ee);
    public native final boolean compareAndSwapObject(Object o, long offset, Object expected, Object x);
    public native final boolean compareAndSwapInt(Object o, long offset, int expected, int x);
    public native final boolean compareAndSwapLong(Object o, long offset, long expected, long x);
    public native Object getObjectVolatile(Object o, long offset);
    public native void putObjectVolatile(Object o, long offset, Object x);
    public native int getIntVolatile(Object o, long offset);
    public native void putIntVolatile(Object o, long offset, int x);
    public native boolean getBooleanVolatile(Object o, long offset);
    public native void putBooleanVolatile(Object o, long offset, boolean x);
    public native byte getByteVolatile(Object o, long offset);
    public native void putByteVolatile(Object o, long offset, byte x);
    public native short getShortVolatile(Object o, long offset);
    public native void putShortVolatile(Object o, long offset, short x);
    public native char getCharVolatile(Object o, long offset);
    public native void putCharVolatile(Object o, long offset, char x);
    public native long getLongVolatile(Object o, long offset);
    public native void putLongVolatile(Object o, long offset, long x);
    public native float getFloatVolatile(Object o, long offset);
    public native void putFloatVolatile(Object o, long offset, float x);
    public native double getDoubleVolatile(Object o, long offset);
    public native void putDoubleVolatile(Object o, long offset, double x);
    public native void putOrderedObject(Object o, long offset, Object x);
    public native void putOrderedInt(Object o, long offset, int x);
    public native void putOrderedLong(Object o, long offset, long x);
    public native void unpark(Object thread);
    public native void park(boolean isAbsolute, long time);
    public native int getLoadAverage(double[] loadavg, int nelems);
    public native final int getAndAddInt(Object o, long offset, int delta);
    public native final long getAndAddLong(Object o, long offset, long delta);
    public native final int getAndSetInt(Object o, long offset, int newValue);
    public native final long getAndSetLong(Object o, long offset, long newValue);
    public native final Object getAndSetObject(Object o, long offset, Object newValue);
    public native void loadFence();
    public native void storeFence();
    public native void fullFence();
    public native void invokeCleaner(ByteBuffer directBuffer);
}
