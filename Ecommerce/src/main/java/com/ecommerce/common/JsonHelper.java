package com.ecommerce.common;

import java.util.List;

import org.codehaus.jackson.map.ObjectMapper;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.ecommerce.persistence.ProductBean;

public class JsonHelper {

	ObjectMapper mapper = new ObjectMapper();
	JSONObject json = new JSONObject();
	JSONArray jsonArray = new JSONArray();
	JSONObject userJson = null;

	public JSONArray getAddtoCartOperationsArray(boolean bflag) {

		userJson = new JSONObject();

		try {
			if (bflag) {
				userJson.put("cartOperation", "success");
			} else {
				userJson.put("cartOperation", "failure");
			}
			jsonArray.put(userJson);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return jsonArray;

	}

	public JSONArray getProductJsonArray(List<ProductBean> listOfPojos) {

		for (ProductBean productBean : listOfPojos) {

			try {

				userJson = new JSONObject();

				userJson.put("productId", productBean.getProductId());
				userJson.put("productImage", productBean.getProductImage());
				userJson.put("productType", productBean.getProductType());
				userJson.put("productPrice", productBean.getProductPrice());
				userJson.put("productColor", productBean.getProductColor());
				userJson.put("productDescription",
						productBean.getProductDescription());

				jsonArray.put(userJson);

			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		return jsonArray;
	}
}
