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

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
}
