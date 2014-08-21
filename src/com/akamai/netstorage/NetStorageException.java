/*
 * Copyright 2014 Akamai Technologies http://developer.akamai.com.
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
package com.akamai.netstorage;

/**
 * Netstorage Exceptions are intended to differenciate between IO (Networking and File) exceptions
 * 
 * @author colinb@akamai.com (Colin Bendell)
 */
public class NetStorageException extends Exception {

    public NetStorageException(String message) {
        super(message);
    }

    public NetStorageException(String message, Throwable cause) {
        super(message, cause);
    }
}