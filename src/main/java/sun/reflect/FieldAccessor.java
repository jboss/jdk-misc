/*
 * JBoss, Home of Professional Open Source.
 * Copyright 2019 Red Hat, Inc., and individual contributors
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

package sun.reflect;

public interface FieldAccessor {
    Object get(Object target);

    boolean getBoolean(Object target);

    byte getByte(Object target);

    char getChar(Object target);

    short getShort(Object target);

    int getInt(Object target);

    long getLong(Object target);

    float getFloat(Object target);

    double getDouble(Object target);

    void set(Object target, Object value) throws IllegalAccessException;

    void setBoolean(Object target, boolean value) throws IllegalAccessException;

    void setByte(Object target, byte value) throws IllegalAccessException;

    void setChar(Object target, char value) throws IllegalAccessException;

    void setShort(Object target, short value) throws IllegalAccessException;

    void setInt(Object target, int value) throws IllegalAccessException;

    void setLong(Object target, long value) throws IllegalAccessException;

    void setFloat(Object target, float value) throws IllegalAccessException;

    void setDouble(Object target, double value) throws IllegalAccessException;
}
