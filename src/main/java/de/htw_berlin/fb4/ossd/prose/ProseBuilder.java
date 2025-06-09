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

import java.util.ArrayList;
import java.util.List;

public class ProseBuilder implements Prose {

    private final List<Sentence> sentences;

    public ProseBuilder(){
        sentences = new ArrayList<>();
    }
    public void register(Sentence sentence){
        sentences.add(sentence);
    }

    public String build(){
        StringBuilder builder = new StringBuilder();
        sentences.forEach(x -> {builder.append(x.get()); builder.append("\n");});
        return builder.toString();
    }

    @Override
    public String get() {
        return build();
    }
}
