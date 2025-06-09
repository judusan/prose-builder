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

public class AnotherExampleSentence implements Sentence {
    @Override
    public String get() {
        return "Die Zukunft gehört denen, die an die Schönheit ihrer Träume glauben."; // (Eleanor Roosevelt);
    }
}
