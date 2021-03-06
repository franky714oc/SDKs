
/**
 * Auto generated code
 */

package com.paypal.svcs.types.ap;

import com.paypal.core.NVPUtil;
import com.paypal.svcs.types.common.AccountIdentifier;
import java.io.UnsupportedEncodingException;
import java.util.Map;


/**
 * The sender identifier type contains information
 * to identify a PayPal account.
 */
public class ReceiverIdentifier extends AccountIdentifier{


	public ReceiverIdentifier() {
	}

	public String toNVPString() throws UnsupportedEncodingException {
		return toNVPString("");
	}

	public String toNVPString(String prefix) throws UnsupportedEncodingException {
		StringBuilder sb = new StringBuilder();
sb.append(super.toNVPString(prefix));
		return sb.toString();
	}

	public ReceiverIdentifier(Map<String, String> map, String prefix) {
		 super(map,prefix); 
	}
}
