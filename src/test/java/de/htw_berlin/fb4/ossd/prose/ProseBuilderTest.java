/*
 * Based on original work:
 * Copyright (C) 2023 Johannes Kristan
 * SPDX-License-Identifier: MIT
 *
 * Modifications Copyright (C) 2025 Julia Dusan
 * SPDX-License-Identifier: GPL-3.0-only
 *
 * This file includes modifications licensed under the GNU General Public License v3.0.
 * See LICENSE and NOTICE for details.
 */
package de.htw_berlin.fb4.ossd.prose;

import junit.framework.Assert;
import junit.framework.TestCase;

public class ProseBuilderTest extends TestCase {

    public void testRegister() {

        ProseBuilder proseBuilder = new ProseBuilder();
        Sentence sentence1 = () -> "Test1";
        Sentence sentence2 = () -> "Test2";

        proseBuilder.register(sentence1);
        String result1 = proseBuilder.get();
        Assert.assertEquals("Test1\n", result1);

        proseBuilder.register(sentence2);
        String result2 = proseBuilder.get();
        Assert.assertEquals("Test1\nTest2\n", result2);
    }
}