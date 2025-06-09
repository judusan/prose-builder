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
package de.htw_berlin.fb4.ossd.prose.example;

import de.htw_berlin.fb4.ossd.prose.ProseBuilder;
import de.htw_berlin.fb4.ossd.prose.Sentence;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {

        Sentence s1 = () -> "Haste mal ne Mark?";

        ProseBuilder builder = new ProseBuilder();
        builder.register(s1);
        builder.register(new ExampleSentence());
        String result = builder.get();
        System.out.println( result);
    }
}
