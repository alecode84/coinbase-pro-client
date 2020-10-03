/**
    This file is part of coinbase-pro-client.

    coinbase-pro-client is free software: you can redistribute it and/or modify
    it under the terms of the GNU Lesser General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    Foobar is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU Lesser General Public License for more details.

    You should have received a copy of the GNU Lesser General Public License
    along with coinbase-pro-client.  If not, see <https://www.gnu.org/licenses/>.
 */
package org.erc.coinbase.pro.model;

import java.time.ZonedDateTime;
import java.util.Date;

import lombok.Data;

/**
 * Instantiates a new product candle filter.
 */
@Data
public class ProductCandleFilter {

	private String productId;
	
	/** The start. */
	private ZonedDateTime start;
	
	/** The end. */
	private ZonedDateTime end;
	
	/** The granularity. */
	private Granularity granularity;
}
