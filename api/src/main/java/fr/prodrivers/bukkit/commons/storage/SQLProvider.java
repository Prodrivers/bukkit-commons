package fr.prodrivers.bukkit.commons.storage;

import java.sql.Connection;

/**
 * SQL Database provider for Prodrivers plugins.
 *
 * While StorageProvider offers a solid way to efficiently store persistent data across servers, some plugins may need the power of a more traditional, relational database.
 * SQLProvider fills the need by offering access to a JDBC-compliant database instance.
 * While SQLProvider exists, it is strongly encouraged to use StorageProvider if possible.
 *
 * SQLProvider is an optional part of the plugin, meaning that the result of its methods, on top of the underlying SQL database internal quirks and wrong queries, is not guaranteed to be correct.
 * One must check against null each results returned by SQLProvider.
 */
public class SQLProvider {
	/**
	 * Gets the database connection.
	 * @return Connection or null
	 */
	public static Connection getConnection() {
		throw new UnsupportedOperationException();
	}
}
