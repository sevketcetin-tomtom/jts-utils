// Copyright 2015 Sebastian Kuerten
//
// This file is part of jts-utils.
//
// jts-utils is free software: you can redistribute it and/or modify
// it under the terms of the GNU Lesser General Public License as published by
// the Free Software Foundation, either version 3 of the License, or
// (at your option) any later version.
//
// jts-utils is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
// GNU Lesser General Public License for more details.
//
// You should have received a copy of the GNU Lesser General Public License
// along with jts-utils. If not, see <http://www.gnu.org/licenses/>.

package de.topobyte.jts.utils;

import java.util.List;
import java.util.Set;

import com.vividsolutions.jts.geom.LineSegment;

/**
 * @author Sebastian Kuerten (sebastian@topobyte.de)
 */
class RepairResult
{

	private boolean intersectionFound;
	private Set<List<LineSegment>> results;

	public RepairResult(boolean intersectionFound,
			Set<List<LineSegment>> results)
	{
		this.intersectionFound = intersectionFound;
		this.results = results;
	}

	public boolean isIntersectionFound()
	{
		return intersectionFound;
	}

	public Set<List<LineSegment>> getResults()
	{
		return results;
	}

}
