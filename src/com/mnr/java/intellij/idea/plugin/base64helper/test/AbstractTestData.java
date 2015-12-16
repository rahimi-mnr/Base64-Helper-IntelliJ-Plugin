/*
 * Copyright 2014 Mansour Rahimi
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

package com.mnr.java.intellij.idea.plugin.base64helper.test;

/**
 * @author m.rahimi
 */
public class AbstractTestData {
    public static final String TEST_STRING = "This is a test string!";
    public static final String BASE64_STRING_1 = "VGhpcyBpcyBhIHRlc3Qgc3RyaW5nIQ==";

    public static final String TEST_STRING_WITH_LINE_FEED = "{\n\t\"foo\": \"bar\",\n\n}";
    public static final String BASE64_STRING_2 = "ewoJImZvbyI6ICJiYXIiLAoKfQ==";

    public static final String HEX_TEST_STRING = "bcdefABCDEF";
    public static final String BASE64_STRING_3 = "C83vq83v";
}
