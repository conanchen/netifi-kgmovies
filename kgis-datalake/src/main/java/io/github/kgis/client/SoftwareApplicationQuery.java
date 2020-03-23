// Generated from graphql_java_gen gem

package io.github.kgis.client;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Error;
import com.shopify.graphql.support.Query;
import com.shopify.graphql.support.SchemaViolationError;
import com.shopify.graphql.support.TopLevelResponse;
import com.shopify.graphql.support.Input;

import com.shopify.graphql.support.ID;

import java.math.BigDecimal;

import org.joda.time.DateTime;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
* https://schema.org/SoftwareApplication A software application.
*/
public class SoftwareApplicationQuery extends Query<SoftwareApplicationQuery> {
    SoftwareApplicationQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    public class NamespacesArguments extends Arguments {
        NamespacesArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public NamespacesArguments filter(NamespaceFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public NamespacesArguments order(NamespaceOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public NamespacesArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public NamespacesArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface NamespacesArgumentsDefinition {
        void define(NamespacesArguments args);
    }

    /**
    * 
    */
    public SoftwareApplicationQuery namespaces(NamespaceQueryDefinition queryDef) {
        return namespaces(args -> {}, queryDef);
    }

    /**
    * 
    */
    public SoftwareApplicationQuery namespaces(NamespacesArgumentsDefinition argsDef, NamespaceQueryDefinition queryDef) {
        startField("namespaces");

        NamespacesArguments args = new NamespacesArguments(_queryBuilder);
        argsDef.define(args);
        NamespacesArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new NamespaceQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public SoftwareApplicationQuery identifier() {
        startField("identifier");

        return this;
    }

    /**
    * 
    */
    public SoftwareApplicationQuery name() {
        startField("name");

        return this;
    }

    /**
    * 
    */
    public SoftwareApplicationQuery alternateName() {
        startField("alternateName");

        return this;
    }

    /**
    * 
    */
    public SoftwareApplicationQuery description() {
        startField("description");

        return this;
    }

    /**
    * 
    */
    public SoftwareApplicationQuery id() {
        startField("id");

        return this;
    }

    /**
    *     applicationSuite	Text 	The name of the application suite to which the application belongs (e.g.
    * Excel belongs to Office).    
    */
    public SoftwareApplicationQuery applicationSuite() {
        startField("applicationSuite");

        return this;
    }

    /**
    *     availableOnDevice	Text 	Device required to run the application. Used in cases where a specific
    * make/model is required to run the application. Supersedes device.    countriesNotSupported	Text 
    * Countries for which the application is not supported. You can also provide the two-letter ISO 3166-1
    * alpha-2 country code.    countriesSupported	Text 	Countries for which the application is supported.
    * You can also provide the two-letter ISO 3166-1 alpha-2 country code.    downloadUrl	URL 	If the file
    * can be downloaded, URL to download the binary.    
    */
    public SoftwareApplicationQuery downloadUrl() {
        startField("downloadUrl");

        return this;
    }

    /**
    *     featureList	Text  or URL 	Features or modules provided by this application (and possibly
    * required by other applications).    
    */
    public SoftwareApplicationQuery featureList() {
        startField("featureList");

        return this;
    }

    /**
    *     fileSize	Text 	Size of the application / package (e.g. 18MB). In the absence of a unit (MB, KB
    * etc.), KB will be assumed.    installUrl	URL 	URL at which the app may be installed, if different
    * from the URL of the item.    
    */
    public SoftwareApplicationQuery installUrl() {
        startField("installUrl");

        return this;
    }

    /**
    *     memoryRequirements	Text  or URL 	Minimum memory requirements.    operatingSystem	Text 	Operating
    * systems supported (Windows 7, OSX 10.6, Android 1.6).    permissions	Text 	Permission(s) required to
    * run the app (for example, a mobile app may require full internet access or may run only on wifi).   
    * processorRequirements	Text 	Processor architecture required to run the application (e.g. IA64).   
    * releaseNotes	Text  or URL 	Description of what changed in this version.    
    */
    public SoftwareApplicationQuery releaseNotes() {
        startField("releaseNotes");

        return this;
    }

    /**
    *     screenshot	ImageObject  or URL 	A link to a screenshot image of the app.    
    */
    public SoftwareApplicationQuery screenshot() {
        startField("screenshot");

        return this;
    }

    /**
    *     softwareAddOn	SoftwareApplication 	Additional content for a software application.   
    * softwareHelp	CreativeWork 	Software application help.    softwareRequirements	Text  or URL 
    * Component dependency requirements for application. This includes runtime environments and shared
    * libraries that are not included in the application distribution package, but required to run the
    * application (Examples: DirectX, Java or .NET runtime). Supersedes requirements.    softwareVersion
    * Text 	Version of the software instance.    storageRequirements	Text  or URL 	Storage requirements
    * (free space required).    supportingData	DataFeed 	Supporting data for a SoftwareApplication.    
    */
    public SoftwareApplicationQuery softwareVersion() {
        startField("softwareVersion");

        return this;
    }
}
