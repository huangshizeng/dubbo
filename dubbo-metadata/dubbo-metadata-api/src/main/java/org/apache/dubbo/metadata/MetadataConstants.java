/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.dubbo.metadata;

import static org.apache.dubbo.common.utils.ClassUtils.getClassLoader;
import static org.apache.dubbo.common.utils.ClassUtils.resolveClass;

public interface MetadataConstants {
    String KEY_SEPARATOR = ":";
    String DEFAULT_PATH_TAG = "metadata";
    String KEY_REVISON_PREFIX = "revision";
    String META_DATA_STORE_TAG = ".metaData";
    String SERVICE_META_DATA_STORE_TAG = ".smd";
    String CONSUMER_META_DATA_STORE_TAG = ".cmd";
    String METADATA_PUBLISH_DELAY_KEY = "dubbo.application.metadata.publish.delay";
    int DEFAULT_METADATA_PUBLISH_DELAY = 1000;
    String METADATA_PROXY_TIMEOUT_KEY = "dubbo.application.metadata.proxy.delay";
    int DEFAULT_METADATA_TIMEOUT_VALUE = 5000;
    String REPORT_CONSUMER_URL_KEY = "report-consumer-definition";
    String JAVAX_SERVLET_REQ_CLASS_NAME = "javax.servlet.ServletRequest";
    Class JAVAX_SERVLET_REQ_CLASS = resolveClass(JAVAX_SERVLET_REQ_CLASS_NAME, getClassLoader());
    String JAVAX_SERVLET_RES_CLASS_NAME = "javax.servlet.ServletResponse";
    Class JAVAX_SERVLET_RES_CLASS = resolveClass(JAVAX_SERVLET_RES_CLASS_NAME, getClassLoader());
    String JAKARTA_SERVLET_REQ_CLASS_NAME = "jakarta.servlet.ServletRequest";
    Class JAKARTA_SERVLET_REQ_CLASS = resolveClass(JAKARTA_SERVLET_REQ_CLASS_NAME, getClassLoader());
    String JAKARTA_SERVLET_RES_CLASS_NAME = "jakarta.servlet.ServletResponse";
    Class JAKARTA_SERVLET_RES_CLASS = resolveClass(JAKARTA_SERVLET_RES_CLASS_NAME, getClassLoader());
    String PATH_SEPARATOR = "/";
    String APPLICATION_FORM_URLENCODED_VALUE = "application/x-www-form-urlencoded";
    String APPLICATION_JSON_VALUE = "application/json";
}
