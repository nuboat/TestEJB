/*
 * Attribution
 * CC BY
 * This license lets others distribute, remix, tweak,
 * and build upon your work, even commercially,
 * as long as they credit you for the original creation.
 * This is the most accommodating of licenses offered.
 * Recommended for maximum dissemination and use of licensed materials.
 *
 * http://creativecommons.org/licenses/by/3.0/
 * http://creativecommons.org/licenses/by/3.0/legalcode
 */
package com.thjug;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author @nuboat
 */
public abstract class Log {

	private static final Logger LOG = Logger.getLogger("Log");

	public static void info(final String info) {
		LOG.log(Level.INFO, info);
	}

}
