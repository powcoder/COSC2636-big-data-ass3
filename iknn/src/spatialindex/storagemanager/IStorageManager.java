https://powcoder.com
代写代考加微信 powcoder
Assignment Project Exam Help
Add WeChat powcoder
// Spatial Index Library
//
// Copyright (C) 2002  Navel Ltd.
//
// This library is free software; you can redistribute it and/or
// modify it under the terms of the GNU Lesser General Public
// License as published by the Free Software Foundation; either
// version 2.1 of the License, or (at your option) any later version.
//
// This library is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
// Lesser General Public License for more details.
//
// You should have received a copy of the GNU Lesser General Public
// License along with this library; if not, write to the Free Software
// Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
//
// Contact information:
//  Mailing address:
//    Marios Hadjieleftheriou
//    University of California, Riverside
//    Department of Computer Science
//    Surge Building, Room 310
//    Riverside, CA 92521
//
//  Email:
//    marioh@cs.ucr.edu

package spatialindex.storagemanager;

public interface IStorageManager
{
	public static final int NewPage = -1;

	public void flush();
	public byte[] loadByteArray(final int id);
	public int storeByteArray(final int id, final byte[] data);
	public void deleteByteArray(final int id);
	public int getIO();
} // IStorageManager
