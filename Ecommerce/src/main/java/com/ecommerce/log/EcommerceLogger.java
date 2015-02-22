package com.ecommerce.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EcommerceLogger {

	private static volatile EcommerceLogger obj = null;
	private static final Logger logger = LoggerFactory
			.getLogger(EcommerceLogger.class);

	private EcommerceLogger() {

	}

	public static EcommerceLogger getInstance() {

		if (obj == null) {

			synchronized (EcommerceLogger.class) {

				if (obj == null) {

					obj = new EcommerceLogger();
				} else {
					return obj;
				}
			}
		}
		return obj;
	}

	public static void logFile(String string) {
		logger.debug(string);
	}

}
