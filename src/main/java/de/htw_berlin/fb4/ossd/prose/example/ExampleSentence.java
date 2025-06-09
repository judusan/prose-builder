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

import de.htw_berlin.fb4.ossd.prose.Sentence;

public class ExampleSentence implements Sentence {
    @Override
    public String get() {
        return "Es steckt oft mehr Geist und Scharfsinn in einem Irrtum als in einer Entdeckung."; // (Joseph Joubert);
    }
}
