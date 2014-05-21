/**
 * Copyright (c) 2002-2014 "Neo Technology,"
 * Network Engine for Objects in Lund AB [http://neotechnology.com]
 *
 * This file is part of Neo4j.
 *
 * Neo4j is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.neo4j.io.pagecache.impl.standard;

import java.nio.ByteBuffer;

import org.neo4j.io.fs.StoreChannel;

public class StandardPageIO implements PageTable.PageIO
{
    private final StoreChannel channel;

    public StandardPageIO( StoreChannel channel )
    {
        this.channel = channel;
    }

    @Override
    public void read( long pageId, ByteBuffer into )
    {

    }

    @Override
    public void write( long pageId, ByteBuffer from )
    {

    }

    @Override
    public boolean equals( Object o )
    {
        if ( this == o )
        {
            return true;
        }
        if ( o == null || getClass() != o.getClass() )
        {
            return false;
        }

        StandardPageIO that = (StandardPageIO) o;

        if ( channel != null ? !channel.equals( that.channel ) : that.channel != null )
        {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode()
    {
        return channel != null ? channel.hashCode() : 0;
    }
}