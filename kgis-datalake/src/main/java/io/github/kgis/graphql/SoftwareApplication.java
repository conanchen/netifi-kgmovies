// Generated from graphql_java_gen gem

package io.github.kgis.graphql;

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
public class SoftwareApplication extends AbstractResponse<SoftwareApplication> implements Node, Thing {
    public SoftwareApplication() {
    }

    public SoftwareApplication(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "namespaces": {
                    List<Namespace> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<Namespace> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            list1.add(new Namespace(jsonAsObject(element1, key)));
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "identifier": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "name": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "alternateName": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "description": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "applicationSuite": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "downloadUrl": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "featureList": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "installUrl": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "releaseNotes": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "screenshot": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "softwareVersion": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "__typename": {
                    responseData.put(key, jsonAsString(field.getValue(), key));
                    break;
                }
                default: {
                    throw new SchemaViolationError(this, key, field.getValue());
                }
            }
        }
    }

    public SoftwareApplication(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "SoftwareApplication";
    }

    /**
    * 
    */

    public ID getId() {
        return (ID) get("id");
    }

    /**
    * 
    */

    public List<Namespace> getNamespaces() {
        return (List<Namespace>) get("namespaces");
    }

    public SoftwareApplication setNamespaces(List<Namespace> arg) {
        optimisticData.put(getKey("namespaces"), arg);
        return this;
    }

    /**
    * 
    */

    public String getIdentifier() {
        return (String) get("identifier");
    }

    public SoftwareApplication setIdentifier(String arg) {
        optimisticData.put(getKey("identifier"), arg);
        return this;
    }

    /**
    * 
    */

    public String getName() {
        return (String) get("name");
    }

    public SoftwareApplication setName(String arg) {
        optimisticData.put(getKey("name"), arg);
        return this;
    }

    /**
    * 
    */

    public String getAlternateName() {
        return (String) get("alternateName");
    }

    public SoftwareApplication setAlternateName(String arg) {
        optimisticData.put(getKey("alternateName"), arg);
        return this;
    }

    /**
    * 
    */

    public String getDescription() {
        return (String) get("description");
    }

    public SoftwareApplication setDescription(String arg) {
        optimisticData.put(getKey("description"), arg);
        return this;
    }

    /**
    * applicationSuite    Text    The name of the application suite to which the application belongs (e.g.
    * Excel belongs to Office).
    */

    public String getApplicationSuite() {
        return (String) get("applicationSuite");
    }

    public SoftwareApplication setApplicationSuite(String arg) {
        optimisticData.put(getKey("applicationSuite"), arg);
        return this;
    }

    /**
    * availableOnDevice    Text    Device required to run the application. Used in cases where a specific
    * make/model is required to run the application. Supersedes device.
    * countriesNotSupported    Text    Countries for which the application is not supported. You can also
    * provide the two-letter ISO 3166-1 alpha-2 country code.
    * countriesSupported    Text    Countries for which the application is supported. You can also provide
    * the two-letter ISO 3166-1 alpha-2 country code.
    * downloadUrl    URL    If the file can be downloaded, URL to download the binary.
    */

    public String getDownloadUrl() {
        return (String) get("downloadUrl");
    }

    public SoftwareApplication setDownloadUrl(String arg) {
        optimisticData.put(getKey("downloadUrl"), arg);
        return this;
    }

    /**
    * featureList    Text  or URL    Features or modules provided by this application (and possibly
    * required by other applications).
    */

    public String getFeatureList() {
        return (String) get("featureList");
    }

    public SoftwareApplication setFeatureList(String arg) {
        optimisticData.put(getKey("featureList"), arg);
        return this;
    }

    /**
    * fileSize    Text    Size of the application / package (e.g. 18MB). In the absence of a unit (MB, KB
    * etc.), KB will be assumed.
    * installUrl    URL    URL at which the app may be installed, if different from the URL of the item.
    */

    public String getInstallUrl() {
        return (String) get("installUrl");
    }

    public SoftwareApplication setInstallUrl(String arg) {
        optimisticData.put(getKey("installUrl"), arg);
        return this;
    }

    /**
    * memoryRequirements    Text  or URL    Minimum memory requirements.
    * operatingSystem    Text    Operating systems supported (Windows 7, OSX 10.6, Android 1.6).
    * permissions    Text    Permission(s) required to run the app (for example, a mobile app may require
    * full internet access or may run only on wifi).
    * processorRequirements    Text    Processor architecture required to run the application (e.g. IA64).
    * releaseNotes    Text  or URL    Description of what changed in this version.
    */

    public String getReleaseNotes() {
        return (String) get("releaseNotes");
    }

    public SoftwareApplication setReleaseNotes(String arg) {
        optimisticData.put(getKey("releaseNotes"), arg);
        return this;
    }

    /**
    * screenshot    ImageObject  or URL    A link to a screenshot image of the app.
    */

    public String getScreenshot() {
        return (String) get("screenshot");
    }

    public SoftwareApplication setScreenshot(String arg) {
        optimisticData.put(getKey("screenshot"), arg);
        return this;
    }

    /**
    * softwareAddOn    SoftwareApplication    Additional content for a software application.
    * softwareHelp    CreativeWork    Software application help.
    * softwareRequirements    Text  or URL    Component dependency requirements for application. This
    * includes runtime environments and shared libraries that are not included in the application
    * distribution package, but required to run the application (Examples: DirectX, Java or .NET runtime).
    * Supersedes requirements.
    * softwareVersion    Text    Version of the software instance.
    * storageRequirements    Text  or URL    Storage requirements (free space required).
    * supportingData    DataFeed    Supporting data for a SoftwareApplication.
    */

    public String getSoftwareVersion() {
        return (String) get("softwareVersion");
    }

    public SoftwareApplication setSoftwareVersion(String arg) {
        optimisticData.put(getKey("softwareVersion"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "id": return false;

            case "namespaces": return true;

            case "identifier": return false;

            case "name": return false;

            case "alternateName": return false;

            case "description": return false;

            case "applicationSuite": return false;

            case "downloadUrl": return false;

            case "featureList": return false;

            case "installUrl": return false;

            case "releaseNotes": return false;

            case "screenshot": return false;

            case "softwareVersion": return false;

            default: return false;
        }
    }
}

