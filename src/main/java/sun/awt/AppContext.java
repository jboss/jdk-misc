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

package sun.awt;

import java.beans.PropertyChangeListener;
import java.util.Set;
import java.util.function.Supplier;

/**
 */
public class AppContext {
    /*
     * The key to put()/get() the Java EventQueue into/from the AppContext.
     */
    public static final Object EVENT_QUEUE_KEY = new StringBuffer("EventQueue");

    /*
     * The keys to store EventQueue push/pop lock and condition.
     */
    public static final Object EVENT_QUEUE_LOCK_KEY = new StringBuilder("EventQueue.Lock");
    public static final Object EVENT_QUEUE_COND_KEY = new StringBuilder("EventQueue.Condition");
    /**
     * Returns a set containing all {@code AppContext}s.
     */
    public native static Set<AppContext> getAppContexts();

    public static final String DISPOSED_PROPERTY_NAME = "disposed";
    public static final String GUI_DISPOSED = "guidisposed";

    public native boolean isDisposed();

    public static native AppContext getAppContext();

    public static native boolean isMainContext(AppContext ctx);

    public native void dispose() throws IllegalThreadStateException;

    public native Object get(Object key);

    public native Object put(Object key, Object value);

    public native Object remove(Object key);

    public native ThreadGroup getThreadGroup();

    public native ClassLoader getContextClassLoader();

    public native PropertyChangeListener[] getPropertyChangeListeners();

    public native void addPropertyChangeListener(String propertyName, PropertyChangeListener listener);

    public native void removePropertyChangeListener(String propertyName, PropertyChangeListener listener);

    public native PropertyChangeListener[] getPropertyChangeListeners(String propertyName);

    public native static <T> T getSoftReferenceValue(Object key, Supplier<T> supplier);
}
