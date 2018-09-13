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
package org.erc.coinbase.pro;

import java.util.List;

import org.erc.coinbase.pro.exceptions.CoinbaseException;
import org.erc.coinbase.pro.model.Account;

import com.fasterxml.jackson.core.type.TypeReference;

/**
 * The Class Client.
 */
public class Client {

	/** The http. */
	private HTTPRest http;
	
    /**
	 * Instantiates a new client.
	 *
	 * @param publicKey  the public key
	 * @param secretKey  the secret key
	 * @param passphrase the passphrase
	 * @param baseUrl    the base url
	 */
    public Client(String publicKey,String secretKey, String passphrase, String baseUrl) {
		http = new HTTPRest(baseUrl,publicKey,secretKey,passphrase);
    }
	
    /**
	 * Accounts.
	 *
	 * @return the list
	 * @throws CoinbaseException the coinbase exception
	 */
    public List<Account> accounts() throws CoinbaseException{
    	return http.get("/accounts", new TypeReference<List<Account>>() {}, true);	
    }
    
 
}