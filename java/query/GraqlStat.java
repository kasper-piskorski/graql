/*
 * GRAKN.AI - THE KNOWLEDGE GRAPH
 * Copyright (C) 2019 Grakn Labs Ltd
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */
package graql.lang.query;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

public class GraqlStat extends GraqlQuery {

    private final Set<String> labels;

    public GraqlStat(){
        this.labels = new LinkedHashSet<>();
    }

    public GraqlStat(Set<String> labels) {
        this.labels = labels;
    }

    public GraqlStat in(String label){ return new GraqlStat(Collections.singleton(label));}

    public GraqlStat in(Set<String> labels){
        return new GraqlStat(labels);
    }

    public Set<String> labels(){ return labels;}

    @Override
    public String toString() {
        return null;
    }
}
