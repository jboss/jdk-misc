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

package sun.reflect;

import java.io.OptionalDataException;
import java.lang.invoke.MethodHandle;
import java.lang.reflect.Constructor;
import java.lang.reflect.Executable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.PrivilegedAction;

/**
 */
public class ReflectionFactory {

    private static final ReflectionFactory soleInstance = new ReflectionFactory();

    private ReflectionFactory() {
    }

    public static ReflectionFactory getReflectionFactory() {
        return soleInstance;
    }

    public native FieldAccessor newFieldAccessor(Field var1, boolean var2);
    public native MethodAccessor newMethodAccessor(Method var1);
    public native ConstructorAccessor newConstructorAccessor(Constructor<?> var1);
    public native Field newField(Class<?> var1, String var2, Class<?> var3, int var4, int var5, String var6, byte[] var7);
    public native Method newMethod(Class<?> var1, String var2, Class<?>[] var3, Class<?> var4, Class<?>[] var5, int var6, int var7, String var8, byte[] var9, byte[] var10, byte[] var11);
    public native Constructor<?> newConstructor(Class<?> var1, Class<?>[] var2, Class<?>[] var3, int var4, int var5, String var6, byte[] var7, byte[] var8);
    public native MethodAccessor getMethodAccessor(Method var1);
    public native void setMethodAccessor(Method var1, MethodAccessor var2);
    public native ConstructorAccessor getConstructorAccessor(Constructor<?> var1);
    public native void setConstructorAccessor(Constructor<?> var1, ConstructorAccessor var2);
    public native Method copyMethod(Method var1);
    public native Field copyField(Field var1);
    public native <T> Constructor<T> copyConstructor(Constructor<T> var1);
    public native byte[] getExecutableTypeAnnotationBytes(Executable var1);
    public native Constructor<?> newConstructorForSerialization(Class<?> var1, Constructor<?> var2);
    public native final Constructor<?> newConstructorForSerialization(Class<?> var1);
    public native final Constructor<?> newConstructorForExternalization(Class<?> var1);
    public native final MethodHandle readObjectForSerialization(Class<?> var1);
    public native final MethodHandle readObjectNoDataForSerialization(Class<?> var1);
    public native final MethodHandle writeObjectForSerialization(Class<?> var1);
    public native final MethodHandle readResolveForSerialization(Class<?> var1);
    public native final MethodHandle writeReplaceForSerialization(Class<?> var1);
    public native final boolean hasStaticInitializerForSerialization(Class<?> var1);
    public native final OptionalDataException newOptionalDataExceptionForSerialization(boolean var1);

    public static final class GetReflectionFactoryAction implements PrivilegedAction<ReflectionFactory> {
        public GetReflectionFactoryAction() {
        }

        public ReflectionFactory run() {
            return ReflectionFactory.getReflectionFactory();
        }
    }
}
