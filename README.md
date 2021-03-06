# ProdriversCommons for Bukkit

ProdriversCommons is a common set of tools for Bukkit plugins, designed to fulfil all Prodrivers plugin needs.

This repository holds the common API that all implementations should follow, with its documentation.

The 1.0 API and reference implementation are currently considered stable and in maintenance mode. No significant features will be developped for them.

Work has been transfered on the next version which is a new, incompatible API designed from tehe results and lessons learned in developping the first version.

## Usage

This API is available on a Maven repository.

Documentation is available on [Prodrivers Sources](http://commons.sources.prodrivers.fr).

```
<repositories>
	<repository>
    	<id>prodrivers-repo</id>
    	<url>https://repo.prodrivers.fr/</url>
    </repository>
</repositories>
<dependencies>
	<dependency>
		<groupId>fr.prodrivers.bukkit</groupId>
		<artifactId>prodrivers-commons</artifactId>
		<version>1.0-SNAPSHOT</version>
		<scope>provided</scope>
	</dependency>
</dependencies>
```

## License

ProdriversCommons API and its reference implementation is distributed under the LGPL version 3 license. A copy of the license is provided in LICENSE.md.