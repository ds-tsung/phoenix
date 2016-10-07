/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you maynot use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicablelaw or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.phoenix.end2end;

import org.apache.hadoop.hbase.HConstants;
import org.apache.phoenix.query.BaseTest;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.experimental.categories.Category;

@Category(NeedsOwnMiniClusterTest.class)
public class BaseOwnClusterIT extends BaseTest {
    @AfterClass
    public static void doTeardown() throws Exception {
        tearDownMiniCluster();
    }

    @After
    public void cleanUpAfterTest() throws Exception {
        deletePriorMetaData(HConstants.LATEST_TIMESTAMP, getOldUrl());
    }
}
