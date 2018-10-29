/*
 * Copyright 2016-2017 the original author or authors.
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

package org.springframework.credhub.support;

import java.util.concurrent.TimeUnit;

/**
 * Client options for CredHub connectivity.
 *
 * @author Mark Paluch
 * @author Scott Frederick
 */
public class ClientOptions {
	private Integer connectionTimeout;

	private Integer readTimeout;

	private String[] caCertFiles;

	/**
	 * Create new {@link ClientOptions} with default values.
	 */
	public ClientOptions() {
		this.connectionTimeout = null;
		this.readTimeout = null;
		this.caCertFiles = null;
	}

	/**
	 * Create a {@link ClientOptions} with the provided values.
	 *
	 * @param connectionTimeout    connection timeout in {@link TimeUnit#MILLISECONDS}, must
	 *                             be greater {@literal 0}
	 * @param readTimeout          read timeout in {@link TimeUnit#MILLISECONDS}, must be greater
	 *                             {@literal 0}
	 * @param caCertFiles          one or more CA certificate files to use when connecting
	 */
	public ClientOptions(int connectionTimeout, int readTimeout, String[] caCertFiles) {
		this.connectionTimeout = connectionTimeout;
		this.readTimeout = readTimeout;
		this.caCertFiles = caCertFiles;
	}

	/**
	 * Get the connection timeout in {@link TimeUnit#MILLISECONDS}.
	 *
	 * @return the connection timeout; can be {@literal null if not explicitly set}
	 */
	public Integer getConnectionTimeout() {
		return this.connectionTimeout;
	}

	public void setConnectionTimeout(Integer connectionTimeout) {
		this.connectionTimeout = connectionTimeout;
	}

	/**
	 * Get the read timeout in {@link TimeUnit#MILLISECONDS}.
	 *
	 * @return the read timeout; can be {@literal null if not explicitly set}
	 */
	public Integer getReadTimeout() {
		return this.readTimeout;
	}

	public void setReadTimeout(Integer readTimeout) {
		this.readTimeout = readTimeout;
	}

	public String[] getCaCertFiles() {
		return caCertFiles;
	}

	public void setCaCertFiles(String[] caCertFiles) {
		this.caCertFiles = caCertFiles;
	}
}